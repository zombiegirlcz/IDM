package com.revolut.core.ui_kit.internal.views.gaugechart;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import aw0.o4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pt0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.gaugechart.a$a, reason: collision with other inner class name */
    public static final class C0435a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0435a f57160a = new C0435a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RectF f57161b = new RectF();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f57162c = new RectF();
        public final PointF d = new PointF();
        public final PointF e = new PointF();
        public final PointF f = new PointF();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PointF f57163g = new PointF();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PointF f57164h = new PointF();
        public final PointF i = new PointF();
    }

    private a() {
    }

    public static void a(Path path, RectF bounds, float f, float f4, float f5, float f6, b scratch, boolean z) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(scratch, "scratch");
        path.reset();
        C0435a out = scratch.f57160a;
        RectF rectF = scratch.f57162c;
        RectF rectF2 = scratch.f57161b;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(out, "out");
        float fMin = Math.min(bounds.right - bounds.left, bounds.bottom - bounds.top) / 2.0f;
        float f32 = (bounds.left + bounds.right) / 2.0f;
        float f35 = (bounds.top + bounds.bottom) / 2.0f;
        float f36 = fMin - f5;
        if (z && Math.abs(f4) >= 360.0f) {
            Path.Direction direction = f4 >= BitmapDescriptorFactory.HUE_RED ? Path.Direction.CW : Path.Direction.CCW;
            Path.Direction direction2 = f4 >= BitmapDescriptorFactory.HUE_RED ? Path.Direction.CCW : Path.Direction.CW;
            path.addCircle(f32, f35, fMin, direction);
            path.addCircle(f32, f35, f36, direction2);
            return;
        }
        double radians = Math.toRadians(f);
        float f37 = f + f4;
        double radians2 = Math.toRadians(f37);
        float fCos = (((float) Math.cos(radians2)) * fMin) + f32;
        float fSin = (((float) Math.sin(radians2)) * fMin) + f35;
        float fCos2 = (((float) Math.cos(radians)) * fMin) + f32;
        float fSin2 = (((float) Math.sin(radians)) * fMin) + f35;
        float fCos3 = (((float) Math.cos(radians2)) * f36) + f32;
        float fSin3 = (((float) Math.sin(radians2)) * f36) + f35;
        float fCos4 = (((float) Math.cos(radians)) * f36) + f32;
        float fSin4 = (((float) Math.sin(radians)) * f36) + f35;
        float fSqrt = (float) Math.sqrt((r20 * r20) + (r13 * r13));
        float f41 = (fCos - fCos3) / fSqrt;
        float f42 = (fSin - fSin3) / fSqrt;
        float f57 = fCos2 - fCos4;
        float fSqrt2 = (float) Math.sqrt((r2 * r2) + (f57 * f57));
        float f69 = f57 / fSqrt2;
        float f75 = (fSin2 - fSin4) / fSqrt2;
        PointF pointF = scratch.d;
        float f77 = f41 * f6;
        float f81 = f42 * f6;
        pointF.set(fCos - f77, fSin - f81);
        PointF pointF2 = scratch.e;
        pointF2.set(f77 + fCos3, fSin3 + f81);
        PointF pointF3 = scratch.f;
        pointF3.set((((float) Math.sin(radians2)) * f6) + fCos3, fSin3 - (((float) Math.cos(radians2)) * f6));
        PointF pointF4 = scratch.f57163g;
        float f82 = f69 * f6;
        float f93 = f75 * f6;
        pointF4.set(fCos4 + f82, fSin4 + f93);
        PointF pointF5 = scratch.f57164h;
        pointF5.set(fCos2 - f82, fSin2 - f93);
        PointF pointF6 = scratch.i;
        pointF6.set(fCos2 - (((float) Math.sin(radians)) * f6), (((float) Math.cos(radians)) * f6) + fSin2);
        rectF2.set(f32 - fMin, f35 - fMin, f32 + fMin, f35 + fMin);
        double d = f6 / fMin;
        float f94 = 2;
        path.arcTo(rectF2, f + ((float) Math.toDegrees(d)), f4 - (((float) Math.toDegrees(d)) * f94), false);
        path.quadTo(fCos, fSin, pointF.x, pointF.y);
        path.lineTo(pointF2.x, pointF2.y);
        path.quadTo(fCos3, fSin3, pointF3.x, pointF3.y);
        rectF.set(f32 - f36, f35 - f36, f32 + f36, f35 + f36);
        double d5 = f6 / f36;
        path.arcTo(rectF, f37 - ((float) Math.toDegrees(d5)), -(f4 - (f94 * ((float) Math.toDegrees(d5)))), false);
        path.quadTo(fCos4, fSin4, pointF4.x, pointF4.y);
        path.lineTo(pointF5.x, pointF5.y);
        path.quadTo(fCos2, fSin2, pointF6.x, pointF6.y);
    }

    public static float b(o4 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i = c.f239573c[style.ordinal()];
        if (i == 1) {
            return 630.0f;
        }
        if (i == 2) {
            return 405.0f;
        }
        if (i == 3) {
            return 360.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static float c(o4 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i = c.f239573c[style.ordinal()];
        if (i == 1) {
            return 270.0f;
        }
        if (i == 2) {
            return 135.0f;
        }
        if (i == 3) {
            return 180.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static float d(o4 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i = c.f239573c[style.ordinal()];
        if (i == 1) {
            return 360.0f;
        }
        if (i == 2) {
            return 270.0f;
        }
        if (i == 3) {
            return 180.0f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
