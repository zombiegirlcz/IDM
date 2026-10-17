package ix0;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r0 {
    private r0() {
    }

    public static void a(RectF bounds, Path into) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(into, "into");
        into.reset();
        float fMin = Math.min(bounds.width(), bounds.height());
        float f = 0.125f * fMin;
        float fCenterX = bounds.centerX();
        float fCenterY = bounds.centerY();
        double d = 1.0471975511965976d;
        double d5 = f;
        float fCos = (float) ((((double) (fMin + f)) - (Math.cos(1.0471975511965976d) * d5)) / 2.0d);
        double d6 = fCos - f;
        double d10 = 0.0d;
        into.moveTo(((float) (Math.cos(0.0d) * d6)) + fCenterX + ((float) (Math.cos(1.0471975511965976d) * d5)), ((float) (Math.sin(0.0d) * d6)) + fCenterY + ((float) (Math.sin(1.0471975511965976d) * d5)));
        int i = 0;
        while (i < 6) {
            d10 += d;
            double dCos = Math.cos(d10);
            double dSin = Math.sin(d10);
            double d15 = d;
            float f4 = ((float) (d6 * dCos)) + fCenterX;
            float f5 = fCenterY;
            int i2 = i;
            float f6 = f5 + ((float) (d6 * dSin));
            double d41 = fCos;
            double d51 = d10 - d15;
            float f32 = fCenterX;
            float fCos2 = ((float) (Math.cos(d51) * d5)) + f4;
            float fSin = f6 + ((float) (Math.sin(d51) * d5));
            double d68 = d10 + d15;
            double d81 = d6;
            float fCos3 = f4 + ((float) (Math.cos(d68) * d5));
            float fSin2 = f6 + ((float) (Math.sin(d68) * d5));
            into.lineTo(fCos2, fSin);
            into.quadTo(((float) (dCos * d41)) + fCenterX, f5 + ((float) (d41 * dSin)), fCos3, fSin2);
            i = i2 + 1;
            fCenterY = f5;
            fCenterX = f32;
            d = d15;
            d6 = d81;
        }
        into.close();
    }
}
