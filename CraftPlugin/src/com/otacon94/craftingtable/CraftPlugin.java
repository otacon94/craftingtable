package com.otacon94.craftingtable;

import org.bukkit.plugin.java.JavaPlugin;

import com.otacon94.listeners.CraftingListener;


public class CraftPlugin extends JavaPlugin{

	private static final String COMMAND1 = "wb";
	
	@Override
	public void onEnable() {
		getLogger().info("OtaconCraftPlugin is now enabled");
		getCommand(COMMAND1).setExecutor(new CraftingListener());
	}
	
	
	@Override
	public void onDisable() {
		getLogger().info("OtaconCraftPlugin is now disabled");
	}

}
