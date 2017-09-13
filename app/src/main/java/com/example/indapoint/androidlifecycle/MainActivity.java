package com.example.indapoint.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static android.R.attr.tag;

public class MainActivity extends AppCompatActivity {
    String tag = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "onCreate()");
    }
    public void onStart()
    {
        super.onStart();
        Log.d(tag,"onStart()");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag,"onRestart()");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag,"onResume()");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag," onPause()");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag," onStop()");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag," onDestroy()");
    }
}
