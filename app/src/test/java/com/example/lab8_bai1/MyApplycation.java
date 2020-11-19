package com.example.lab8_bai1;

import android.app.Application;

class MyApplication extends Application {


    public static boolean activityVisible;

    public static boolean isActivityVisible() {
        return activityVisible;
    }

    public static void activityResumed() {
        activityVisible = true;

    }

    public static void activityPaused() {
        activityVisible = false;

    }

}
