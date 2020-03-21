package com.emergence.labs.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.emergence.labs.GameLifeCycle;

public class DesktopLauncher {

	private static final String TITLE_USED_AT_WINDOW_TOP_BAR = "Bye World!";
	private static final int WINDOW_WIDTH = 480;
	private static final int WINDOW_HEIGHT = 320;

	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle(TITLE_USED_AT_WINDOW_TOP_BAR);
		config.setWindowedMode(WINDOW_WIDTH, WINDOW_HEIGHT);

		new Lwjgl3Application(new GameLifeCycle(), config);
	}

}
