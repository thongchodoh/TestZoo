package sdu.cs58.wipawee.testzoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnhorse,btnelephant,btnlion,btngo, btncall;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnhorse = findViewById(R.id.btnhorse);
        btnelephant = findViewById(R.id.btnelephant);
        btnlion = findViewById(R.id.btnlion);
    }
    public void  clickSound (View view){
        if (mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.horse);
        mediaPlayer.start();
    }

    public void  clickEle (View view){
        if (mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.elephant);
        mediaPlayer.start();
    }

    public void  clickLion (View view){
        if (mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lion);
        mediaPlayer.start();
    }

    public void clickMobile(View view){
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("Tel:0835368563"));
        startActivity(mobileIntent);
    }
    public void clickMap(View view){
        String lat = "13.218045";
        String lng = "101.056719";
        String label = "Khao Kheow Open Zoo";

        Uri location = Uri.parse("https://www.google.co.th/maps?q=%E0%B8%AA%E0%B8%A7%E0%B8%99%E0%B8%AA%E0%B8%B1%E0%B8%95%E0%B8%A7%E0%B9%8C%E0%B9%80%E0%B8%82%E0%B8%B2%E0%B9%80%E0%B8%82%E0%B8%B5%E0%B8%A2%E0%B8%A7&rlz=1C1CAFA_enTH778TH778&um=1&ie=UTF-8&sa=X&ved=0ahUKEwi0qPqbu9TaAhWILI8KHcOUCxAQ_AUICigB" + lat + "," + lng + "(" + label + ")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

}
