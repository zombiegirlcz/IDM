package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes16.dex */
public class DynamicScheme {
    public final double contrastLevel;
    public final TonalPalette errorPalette = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    public final boolean isDark;
    public final TonalPalette neutralPalette;
    public final TonalPalette neutralVariantPalette;
    public final TonalPalette primaryPalette;
    public final TonalPalette secondaryPalette;
    public final int sourceColorArgb;
    public final Hct sourceColorHct;
    public final TonalPalette tertiaryPalette;
    public final Variant variant;

    public DynamicScheme(Hct hct, Variant variant, boolean z, double d, TonalPalette tonalPalette, TonalPalette tonalPalette2, TonalPalette tonalPalette3, TonalPalette tonalPalette4, TonalPalette tonalPalette5) {
        this.sourceColorArgb = hct.toInt();
        this.sourceColorHct = hct;
        this.variant = variant;
        this.isDark = z;
        this.contrastLevel = d;
        this.primaryPalette = tonalPalette;
        this.secondaryPalette = tonalPalette2;
        this.tertiaryPalette = tonalPalette3;
        this.neutralPalette = tonalPalette4;
        this.neutralVariantPalette = tonalPalette5;
    }

    public static double getRotatedHue(Hct hct, double[] dArr, double[] dArr2) {
        double hue2 = hct.getHue();
        int i = 0;
        if (dArr2.length == 1) {
            return MathUtils.sanitizeDegreesDouble(hue2 + dArr2[0]);
        }
        int length = dArr.length;
        while (i <= length - 2) {
            double d = dArr[i];
            int i2 = i + 1;
            double d5 = dArr[i2];
            if (d < hue2 && hue2 < d5) {
                return MathUtils.sanitizeDegreesDouble(hue2 + dArr2[i]);
            }
            i = i2;
        }
        return hue2;
    }
}
