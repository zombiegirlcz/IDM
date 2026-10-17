package ix0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class i1 {
    private i1() {
    }

    public static float a(float f, float f4, float f5) {
        return f4 <= f ? BitmapDescriptorFactory.HUE_RED : kotlin.ranges.f.f((f5 - f) / (f4 - f), BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public static float b(float f, float f4, float f5) {
        return j6.a.a(f4, f, f5, f);
    }

    public static float c(float f, int i, int i2) {
        return (f * (i2 - i)) + i;
    }

    public static float d(float f) {
        float f4 = kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        return ((((6.0f * f4) - 15.0f) * f4) + 10.0f) * f4 * f4 * f4;
    }
}
