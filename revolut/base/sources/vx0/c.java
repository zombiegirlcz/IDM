package vx0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private c() {
    }

    public static float a(float f) {
        float f4 = 1.0f - f;
        if (f4 <= 0.08f) {
            return 1.0f;
        }
        return f4 <= 0.64f ? 1.0f - ((f4 - 0.08f) / 0.56f) : BitmapDescriptorFactory.HUE_RED;
    }
}
