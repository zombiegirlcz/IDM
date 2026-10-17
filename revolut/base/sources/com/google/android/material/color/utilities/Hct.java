package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes16.dex */
public final class Hct {
    private int argb;
    private double chroma;

    /* JADX INFO: renamed from: hue, reason: collision with root package name */
    private double f49068hue;
    private double tone;

    private Hct(int i) {
        setInternalState(i);
    }

    public static Hct from(double d, double d5, double d6) {
        return new Hct(HctSolver.solveToInt(d, d5, d6));
    }

    public static Hct fromInt(int i) {
        return new Hct(i);
    }

    private void setInternalState(int i) {
        this.argb = i;
        Cam16 cam16FromInt = Cam16.fromInt(i);
        this.f49068hue = cam16FromInt.getHue();
        this.chroma = cam16FromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.f49068hue;
    }

    public double getTone() {
        return this.tone;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 cam16FromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(cam16FromXyzInViewingConditions.getHue(), cam16FromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(dArrXyzInViewingConditions[1]));
    }

    public void setChroma(double d) {
        setInternalState(HctSolver.solveToInt(this.f49068hue, d, this.tone));
    }

    public void setHue(double d) {
        setInternalState(HctSolver.solveToInt(d, this.chroma, this.tone));
    }

    public void setTone(double d) {
        setInternalState(HctSolver.solveToInt(this.f49068hue, this.chroma, d));
    }

    public int toInt() {
        return this.argb;
    }
}
