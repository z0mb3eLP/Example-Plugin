package me.z0mb3eLP.example;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;



public class Example extends JavaPlugin {

	// This one is fired if the Plugin is turned off
	
	@Override
	public void onDisable() {
		
		// This will give out in the console: "[Example] Plugin disabled!"
		
		System.out.println("[Example] Plugin Disabled!");
	}

	
	
	// This one is fired if the Plugin is turned on
	
	@Override
	public void onEnable() {
		
		// This will give out in the console: "[Example] Plugin Enabled!"
		
		System.out.println("[Example] Plugin Enabled!");
	}



	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		// 
		if(command.getName().equalsIgnoreCase("example")) { // This is the command.
		
			Player p = (Player)sender; // The Variable "p" is only the player. The command can't be used by console!
			
			// This will check if there are no arguments given
			if(args.length == 0) {
				
				// Send the Player a Message in the color "AQUA" (ChatColor.AQUA). 
				p.sendMessage(ChatColor.AQUA + "This is the Example Plugin!");
				
			}
			// This will check if there are 1 or more Arguments given
			if(args.length > 0) {
				
				// Send the Player a Message in the color "GREEN" (ChatColor.GREEN) and some parts in "BOLD" (ChatColor.BOLD). 
				p.sendMessage(ChatColor.GREEN + "This is the Example Plugin, but there are " + ChatColor.BOLD + "Arguments " + ChatColor.GREEN + "given!");
				
			}
		}
		
		
		
		
		return true;
	}
	
	
	
	
}
