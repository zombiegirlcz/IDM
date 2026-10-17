package fci;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f133822a = new x();

    private x() {
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double d = 100.0f;
        float fSqrt = (float) Math.sqrt(d);
        float fSqrt2 = 15.0f / (((float) Math.sqrt(d)) * 2.0f);
        float fSqrt3 = ((float) Math.sqrt(1.0f - (fSqrt2 * fSqrt2))) * fSqrt;
        double d5 = ((f * 800) / 1000.0f) * fSqrt3;
        return 1.0f - (((((fSqrt2 * fSqrt) / fSqrt3) * ((float) Math.sin(d5))) + ((float) Math.cos(d5))) * ((float) Math.exp(((-fSqrt2) * fSqrt) * r10)));
    }
}
