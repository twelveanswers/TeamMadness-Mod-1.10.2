package com.github.escapemc.teammadnessmod.client.gui;


import com.github.escapemc.teammadnessmod.tileentity.TileEntityMadnessChest;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;

public class gui_madness_chest extends GuiContainer {
	
	private TileEntityMadnessChest te;
	private static ResourceLocation MADNESS_CHEST_GUI_TEXTURE;


	public gui_madness_chest(Container inventorySlotsIn, TileEntityMadnessChest te) {
		super(inventorySlotsIn);
		this.te = te;
		MADNESS_CHEST_GUI_TEXTURE = new ResourceLocation("tmm:textures/gui/container/madness_chest.png");
		this.ySize = 195;
		this.xSize = 176;
	}

	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(new TextComponentTranslation("container.madness_chest", new Object[0]).getUnformattedText(), 8, 3, 4210752);
		this.fontRendererObj.drawString(new TextComponentTranslation("container.inventory", new Object[0]).getUnformattedText(), 8, 103, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

		this.mc.getTextureManager().bindTexture(MADNESS_CHEST_GUI_TEXTURE);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
		
	}
}