package com.mtech.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // LottieAnimationView রেফারেন্স ইনিশিয়ালাইজ করা
        lottieAnimationView = findViewById(R.id.lottieAnimationView);

        // এনিমেশন শুরু করা
        lottieAnimationView.playAnimation();

        // এনিমেশন বন্ধ করা (pause)
        findViewById(R.id.stopButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lottieAnimationView.pauseAnimation(); // এনিমেশন বিরতি দেয়া
            }
        });

        // এনিমেশন আবার চালানো
        findViewById(R.id.startButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lottieAnimationView.playAnimation(); // এনিমেশন পুনরায় চালানো
            }
        });
    }
}
