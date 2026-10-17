package rzl;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private b() {
    }

    public static float a(PointF p0, PointF p17, float f) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        float f4 = p17.x - p0.x;
        float f5 = p17.y - p0.y;
        return ((float) Math.pow((f5 * f5) + (f4 * f4), 0.5f / 2)) + f;
    }
}
