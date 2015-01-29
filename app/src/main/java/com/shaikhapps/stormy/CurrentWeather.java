package com.shaikhapps.stormy;

/**
 * Created by Shariq on 1/29/2015.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mTemperature;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getPercipChance() {
        return mPercipChance;
    }

    public void setPercipChance(double percipChance) {
        mPercipChance = percipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    private double mPercipChance;
    private String mSummary;
}
