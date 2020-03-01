package com.mygdx.mapeditor.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.mapeditor.mapeditor;

import java.awt.Dimension;
import java.awt.Toolkit;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = getApplicationConfiguration("Bolber",1024,768, false, false);

		new LwjglApplication(new mapeditor(), config);
	}

	public static LwjglApplicationConfiguration getApplicationConfiguration(String name, int gameWidth, int gameHeight,
																			boolean fullscreen, boolean resizable) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = name;
		cfg.width = gameWidth;
		cfg.height = gameHeight;
		cfg.resizable = resizable;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		cfg.y = screenSize.height / 2 - cfg.height / 2 - 32;
		int i = 1;
		if (fullscreen) {
			double width = screenSize.getWidth();
			double height = screenSize.getHeight();
			cfg.fullscreen = true;
			cfg.width = (int) Math.round(width);
			cfg.height = (int) Math.round(height);
			cfg.resizable = false;
		}
		return cfg;
	}
}
