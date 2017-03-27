package com.bawei.Erweima.utils;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Created by 1 on 2017/3/27.
 */
public class MyApplication extends Application
{
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
    }
}
