package com.territorio.th;


import android.os.Bundle;
import org.apache.cordova.*;

public class Main extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        //super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.loadUrl(Config.getStartUrl(), 30000);
        //super.loadUrl("file:///android_asset/www/index.html")
    }
  
}