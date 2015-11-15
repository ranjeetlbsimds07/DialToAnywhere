package com.dailtoanywhere;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by faisal khan
 */
public class SplashActivity extends Activity {
    private static final long SPLASH_HOLD_TIME =2000 ;// 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    finish();
            }
        }, SPLASH_HOLD_TIME);
    }

}
