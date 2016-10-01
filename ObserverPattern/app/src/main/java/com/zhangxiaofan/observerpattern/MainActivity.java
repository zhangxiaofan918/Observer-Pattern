package com.zhangxiaofan.observerpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAction();
    }

    /**
     * 通过setOnClickListener方法注册了一个观察者,tv就是目标对象。
     * new的OnClickListener就是实际的观察者,当textview被点击时就会通过onClick方法
     * 来通知观察者发生了变化。
     *
     */
    private void setAction() {
        TextView tv = (TextView) findViewById(R.id.tv_main_describe);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("zxf", "this is text");
            }
        });
    }

}


