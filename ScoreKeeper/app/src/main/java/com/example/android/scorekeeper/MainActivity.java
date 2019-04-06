package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreFff = 0;
    int scoreHns = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForFff(0);
        displayForHns(0);
    }

    public void addGoalForFff(View view) {
        scoreFff = scoreFff + 1;
        displayForFff(scoreFff);
    }


    public void addFoulForFff(View view) {
        scoreFff = scoreFff + 1;
        displayForFff(scoreFff);
    }



    public void addGoalForHns(View view) {
        scoreHns = scoreHns + 1;
        displayForHns(scoreHns);
    }

    public void addFoulForHns(View view) {
        scoreHns = scoreHns + 1;
        displayForHns(scoreHns);
    }

    public void newScore(View view) {
        scoreHns = 0;
        scoreFff = 0;
        displayForHns(scoreHns);
        displayForFff(scoreFff);
    }


    /**
     * Displays the given score for Fff.
     */
    public void displayForFff(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fff_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Hns.
     */
    public void displayForHns(int score) {
        TextView scoreView = (TextView) findViewById(R.id.hns_score);
        scoreView.setText(String.valueOf(score));
    }

}
