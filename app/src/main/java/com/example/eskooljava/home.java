package com.example.eskooljava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class home extends AppCompatActivity {

    Button profile;
    ImageButton math,drawer;
    DrawerLayout drar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        math=findViewById(R.id.math);
        profile=findViewById(R.id.profile);
        drar=findViewById(R.id.drar);
        drawer=findViewById(R.id.drawer);


        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,math_home.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,profile.class);
                startActivity(intent);
            }
        });


        drawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(drar.isDrawerOpen(Gravity.LEFT)){
                    drar.closeDrawer(Gravity.LEFT);
                }
                else{
                    drar.openDrawer(Gravity.LEFT);
                }

            }
        });
    }
}