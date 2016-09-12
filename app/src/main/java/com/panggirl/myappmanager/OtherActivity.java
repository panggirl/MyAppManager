package com.panggirl.myappmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

/**
 * Created by dabo on 16/9/12.
 */
public class OtherActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        findViewById(R.id.other).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext,SplashActivity.class));
                AppManager.getAppManager().AppExit();
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        Log.w("other",   "Finish other");
    }
}
