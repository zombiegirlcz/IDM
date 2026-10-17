package up0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.i1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x {
    private x() {
    }

    public static float a(long j2, o0 spring) {
        Intrinsics.checkNotNullParameter(spring, "spring");
        long j3 = spring.f281753c;
        float f = spring.f281752b;
        float f4 = kotlin.ranges.f.f((float) (j2 / j3), BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (f4 == BitmapDescriptorFactory.HUE_RED || f4 == 1.0f) {
            return f4;
        }
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return i1.d(f4);
        }
        float fMax = 6.2831855f / Math.max(0.03f, 1.0f - f);
        double d = f4 * fMax;
        return 1.0f - ((((((f * (-2.5f)) + 8.2f) / fMax) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-r8) * f4)));
    }
}
