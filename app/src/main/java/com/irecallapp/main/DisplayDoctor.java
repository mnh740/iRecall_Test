package com.irecallapp.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Research Admin on 12/26/2015.
 */
public class DisplayDoctor extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaydoctor);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView) findViewById(R.id.doctoruname);
        tv.setText(username);
    }
}
