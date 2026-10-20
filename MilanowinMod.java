package com.milanowin;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("milanowin")
@Mod.EventBusSubscriber(modid = "milanowin", value = Dist.CLIENT)
public class MilanowinMod {
	@SubscribeEvent
	public static void onJoin(ClientPlayerNetworkEvent.LoggingIn event) {
		Minecraft mc = Minecraft.getInstance();
		mc.execute(() -> mc.gui.getChat().addMessage(
			Component.literal("Subscribe").withStyle(ChatFormatting.RED)
				.append(Component.literal(" to milanowin's channel").withStyle(ChatFormatting.WHITE))
		));
	}
}
