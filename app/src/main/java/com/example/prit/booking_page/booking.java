package com.example.prit.booking_page;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class booking extends AppCompatActivity {

    TextView tvS,tvD,tvfs,tvfd;
    String source,dest,sourceFull,destFull;
    public static Context context;
    int s=0,d=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        context=booking.this;

        tvS = (TextView)findViewById(R.id.tvSource);
        tvD = (TextView)findViewById(R.id.tvDest);
        tvfs = (TextView)findViewById(R.id.tvSname);
        tvfd = (TextView)findViewById(R.id.tvDname);



        tvS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s++;
                startActivity(new Intent(booking.this,flight_selection.class));

            }
        });

        try
        {
            tvS.setText(flight_selection.source.toString());
            tvfs.setText(flight_selection.fullSo.toString());

        }

        catch (Exception e)
        { }

        tvD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d++;
                startActivity(new Intent(booking.this,flight_selection.class));
            }
        });
        try{
            tvD.setText(flight_selection.dest.toString());
            tvfd.setText(flight_selection.fullDest.toString());
        }
        catch (Exception e){

        }


    }
}
