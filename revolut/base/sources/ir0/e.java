package ir0;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.view.View;
import au0.b5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jq0.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f167934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f167935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f167936c;
    public final ValueAnimator d;
    public float[] e;
    public Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PathMeasure f167937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f167938h;

    public e(View hostView, g glowableElement) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(glowableElement, "glowableElement");
        this.f167934a = hostView;
        this.f167935b = glowableElement;
        this.f167936c = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setStartDelay(300L);
        valueAnimatorOfFloat.setInterpolator(r.f177392a);
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 16));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.d = valueAnimatorOfFloat;
        this.f167938h = r6.b.a(hostView, "getContext(...)", 32.0f);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        valueAnimator.start();
        this.f167936c = 1.0f;
        this.f167934a.invalidate();
    }

    public final void b(Canvas canvas, Path path, Float f) {
        float f4;
        float f5;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(path, "path");
        g gVar = this.f167935b;
        if (!gVar.m() || f == null) {
            gVar.e(canvas, path, true, true);
            return;
        }
        boolean zN = gVar.n();
        int iP = gVar.p();
        PathEffect pathEffect = gVar.getPathEffect();
        char c2 = 0;
        gVar.i(false);
        gVar.d(io0.a.d(0.3f, iP));
        gVar.e(canvas, path, true, true);
        float fFloatValue = f.floatValue();
        int i = 2;
        float f6 = this.f167938h / 2;
        float f32 = fFloatValue - f6;
        float fFloatValue2 = f.floatValue() + f6;
        Path path2 = this.f;
        if (path2 == null) {
            path2 = new Path();
            this.f = path2;
        }
        gVar.i(true);
        gVar.d(iP);
        float[] fArr = null;
        gVar.s(null);
        PathMeasure pathMeasure = this.f167937g;
        if (pathMeasure == null) {
            pathMeasure = new PathMeasure();
            this.f167937g = pathMeasure;
        }
        PathMeasure pathMeasure2 = pathMeasure;
        float[] fArr2 = this.e;
        if (fArr2 == null) {
            fArr2 = new float[2];
            this.e = fArr2;
        }
        pathMeasure2.setPath(path, false);
        while (true) {
            float fFloatValue3 = BitmapDescriptorFactory.HUE_RED;
            pathMeasure2.getPosTan(BitmapDescriptorFactory.HUE_RED, fArr2, fArr);
            float f35 = fArr2[c2];
            char c3 = c2;
            pathMeasure2.getPosTan(pathMeasure2.getLength(), fArr2, fArr);
            float f36 = fArr2[c3];
            or0.d dVar = f35 <= f36 ? or0.d.LEFT_TO_RIGHT : or0.d.RIGHT_TO_LEFT;
            int i2 = d.f167933a[dVar.ordinal()];
            if (i2 == 1) {
                f4 = f32;
                f5 = fFloatValue2;
            } else {
                if (i2 != i) {
                    throw new NoWhenBranchMatchedException();
                }
                f35 = f36;
                f36 = f35;
                f5 = f32;
                f4 = fFloatValue2;
            }
            path2.reset();
            if (f4 <= f35 && f36 <= f5) {
                pathMeasure2.getSegment(BitmapDescriptorFactory.HUE_RED, pathMeasure2.getLength(), path2, true);
                gVar.e(canvas, path2, true, true);
            }
            if ((f35 > f4 || f4 > f36) && (f35 > f5 || f5 > f36)) {
                i = 2;
            } else {
                float length = pathMeasure2.getLength();
                float[] fArr3 = this.e;
                i = 2;
                if (fArr3 == null) {
                    fArr3 = new float[2];
                    this.e = fArr3;
                }
                Float fD = c8g.a.d(pathMeasure2, fArr3, BitmapDescriptorFactory.HUE_RED, length, f4, dVar);
                float[] fArr4 = this.e;
                if (fArr4 == null) {
                    fArr4 = new float[2];
                    this.e = fArr4;
                }
                Float fD2 = c8g.a.d(pathMeasure2, fArr4, fD != null ? fD.floatValue() : 0.0f, length, f5, dVar);
                if (fD != null || fD2 != null) {
                    if (fD != null) {
                        fFloatValue3 = fD.floatValue();
                    }
                    if (fD2 != null) {
                        length = fD2.floatValue();
                    }
                    pathMeasure2.getSegment(fFloatValue3, length, path2, true);
                }
                gVar.e(canvas, path2, true, true);
            }
            if (!pathMeasure2.nextContour()) {
                gVar.i(zN);
                gVar.s(pathEffect);
                return;
            } else {
                c2 = c3;
                fArr = null;
            }
        }
    }
}
