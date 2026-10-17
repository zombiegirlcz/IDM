package com.google.android.material.math;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static float dist(float f, float f4, float f5, float f6) {
        return (float) Math.hypot(f5 - f, f6 - f4);
    }

    public static float distanceToFurthestCorner(float f, float f4, float f5, float f6, float f32, float f35) {
        return max(dist(f, f4, f5, f6), dist(f, f4, f32, f6), dist(f, f4, f32, f35), dist(f, f4, f5, f35));
    }

    public static float floorMod(float f, int i) {
        float f4 = i;
        int i2 = (int) (f / f4);
        if (Math.signum(f) * f4 < BitmapDescriptorFactory.HUE_RED && i2 * i != f) {
            i2--;
        }
        return f - (i2 * i);
    }

    public static boolean geq(float f, float f4, float f5) {
        return f + f5 >= f4;
    }

    public static float lerp(float f, float f4, float f5) {
        return (f5 * f4) + ((1.0f - f5) * f);
    }

    private static float max(float f, float f4, float f5, float f6) {
        return (f <= f4 || f <= f5 || f <= f6) ? (f4 <= f5 || f4 <= f6) ? f5 > f6 ? f5 : f6 : f4 : f;
    }

    public static int floorMod(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }
}
