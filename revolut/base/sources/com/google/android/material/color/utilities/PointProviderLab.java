package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes16.dex */
public final class PointProviderLab implements PointProvider {
    @Override // com.google.android.material.color.utilities.PointProvider
    public double distance(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d5 = dArr[1] - dArr2[1];
        double d6 = dArr[2] - dArr2[2];
        return (d6 * d6) + (d5 * d5) + (d * d);
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double[] fromInt(int i) {
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(i);
        return new double[]{dArrLabFromArgb[0], dArrLabFromArgb[1], dArrLabFromArgb[2]};
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public int toInt(double[] dArr) {
        return ColorUtils.argbFromLab(dArr[0], dArr[1], dArr[2]);
    }
}
