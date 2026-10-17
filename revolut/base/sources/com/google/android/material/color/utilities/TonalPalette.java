package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;

    /* JADX INFO: renamed from: hue, reason: collision with root package name */
    double f49075hue;
    Hct keyColor;

    private TonalPalette(double d, double d5, Hct hct) {
        this.f49075hue = d;
        this.chroma = d5;
        this.keyColor = hct;
    }

    private static Hct createKeyColor(double d, double d5) {
        Hct hctFrom = Hct.from(d, d5, 50.0d);
        double dAbs = Math.abs(hctFrom.getChroma() - d5);
        for (double d6 = 1.0d; d6 < 50.0d && Math.round(d5) != Math.round(hctFrom.getChroma()); d6 += 1.0d) {
            Hct hctFrom2 = Hct.from(d, d5, 50.0d + d6);
            double dAbs2 = Math.abs(hctFrom2.getChroma() - d5);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                hctFrom = hctFrom2;
            }
            Hct hctFrom3 = Hct.from(d, d5, 50.0d - d6);
            double dAbs3 = Math.abs(hctFrom3.getChroma() - d5);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                hctFrom = hctFrom3;
            }
        }
        return hctFrom;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d, double d5) {
        return new TonalPalette(d, d5, createKeyColor(d, d5));
    }

    public static TonalPalette fromInt(int i) {
        return fromHct(Hct.fromInt(i));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d) {
        return Hct.from(this.f49075hue, this.chroma, d);
    }

    public double getHue() {
        return this.f49075hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i) {
        Integer numValueOf = this.cache.get(Integer.valueOf(i));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Hct.from(this.f49075hue, this.chroma, i).toInt());
            this.cache.put(Integer.valueOf(i), numValueOf);
        }
        return numValueOf.intValue();
    }
}
