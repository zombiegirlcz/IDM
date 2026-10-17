package ir0;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.animation.AnimatorKt;
import au0.b5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.revolut.core.ui.models.Color;
import ip0.wk;
import jq0.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements g {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f167940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f167941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f167942c;
    public boolean d;
    public final Paint e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f167943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArgbEvaluatorCompat f167944h;
    public final ValueAnimator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f167945j;
    public int k;

    public j(h host, Paint basePaint) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(basePaint, "basePaint");
        this.f167940a = host;
        this.f167941b = basePaint;
        this.f167942c = kli.a.l(host.i(), 8.0f);
        Paint paint = new Paint(basePaint);
        paint.setStyle(Paint.Style.STROKE);
        this.e = paint;
        this.f = new Paint(basePaint);
        Color.Companion companion = Color.INSTANCE;
        int color = basePaint.getColor();
        companion.getClass();
        this.f167943g = Color.Companion.a(color);
        this.f167944h = new ArgbEvaluatorCompat();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "ofFloat(...)");
        this.i = valueAnimatorOfFloat;
        this.f167945j = 1.0f;
        this.k = 255;
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(r.f177392a);
        paint.setMaskFilter(new BlurMaskFilter(kli.a.l(host.i(), 12.0f), BlurMaskFilter.Blur.NORMAL));
        paint.setStrokeWidth(this.f167942c);
        AnimatorKt.doOnResume(valueAnimatorOfFloat, new wk(this, valueAnimatorOfFloat, 20));
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 17));
    }

    @Override // ir0.g
    public final float a() {
        return this.f167945j;
    }

    @Override // ir0.g
    public final void b(Canvas canvas, RectF oval, float f, float f4) {
        Canvas canvas2;
        RectF rectF;
        float f5;
        float f6;
        Paint paint;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(oval, "oval");
        this.d = false;
        float f32 = this.f167945j;
        if (f32 > BitmapDescriptorFactory.HUE_RED) {
            Paint paint2 = this.e;
            paint2.setAlpha((int) (f32 * this.k));
            canvas2 = canvas;
            rectF = oval;
            f5 = f;
            f6 = f4;
            canvas2.drawArc(rectF, f5, f6, false, paint2);
            Integer numEvaluate = this.f167944h.evaluate(this.f167945j, Integer.valueOf(this.f167941b.getColor()), Integer.valueOf(this.f167943g));
            Intrinsics.checkNotNullExpressionValue(numEvaluate, "evaluate(...)");
            int iIntValue = numEvaluate.intValue();
            paint = this.f;
            paint.setColor(iIntValue);
        } else {
            canvas2 = canvas;
            rectF = oval;
            f5 = f;
            f6 = f4;
            paint = this.f167941b;
        }
        canvas2.drawArc(rectF, f5, f6, false, paint);
    }

    @Override // ir0.g
    public final void c(float f, float f4, Canvas canvas, float f5) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.d = false;
        float f6 = this.f167945j;
        Paint paint = this.f167941b;
        if (f6 <= BitmapDescriptorFactory.HUE_RED) {
            canvas.drawCircle(f, f4, f5, paint);
            return;
        }
        Paint paint2 = this.e;
        paint2.setAlpha((int) (f6 * this.k));
        canvas.drawCircle(f, f4, f5, paint2);
        Integer numEvaluate = this.f167944h.evaluate(this.f167945j, Integer.valueOf(paint.getColor()), Integer.valueOf(this.f167943g));
        Intrinsics.checkNotNullExpressionValue(numEvaluate, "evaluate(...)");
        int iIntValue = numEvaluate.intValue();
        Paint paint3 = this.f;
        paint3.setColor(iIntValue);
        canvas.drawCircle(f, f4, f5, paint3);
    }

    @Override // ir0.g
    public final void d(int i) {
        Paint paint = this.f167941b;
        paint.setColor(i);
        Color.Companion companion = Color.INSTANCE;
        int color = paint.getColor();
        companion.getClass();
        this.f167943g = Color.Companion.a(color);
        this.e.setColor(i);
    }

    @Override // ir0.g
    public final void e(Canvas canvas, Path path, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(path, "path");
        this.d = false;
        float f = this.f167945j;
        Paint paint = this.f167941b;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            if (z3) {
                canvas.drawPath(path, paint);
                return;
            }
            return;
        }
        if (z) {
            int i = (int) (f * this.k);
            Paint paint2 = this.e;
            paint2.setAlpha(i);
            canvas.drawPath(path, paint2);
        }
        if (z3) {
            Integer numEvaluate = this.f167944h.evaluate(this.f167945j, Integer.valueOf(paint.getColor()), Integer.valueOf(this.f167943g));
            Intrinsics.checkNotNullExpressionValue(numEvaluate, "evaluate(...)");
            int iIntValue = numEvaluate.intValue();
            Paint paint3 = this.f;
            paint3.setColor(iIntValue);
            canvas.drawPath(path, paint3);
        }
    }

    @Override // ir0.g
    public final void f(Paint.Cap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f167941b.setStrokeCap(value);
        this.f.setStrokeCap(value);
    }

    @Override // ir0.g
    public final void g(int i) {
        this.k = i;
    }

    @Override // ir0.g
    public final PathEffect getPathEffect() {
        return this.f167941b.getPathEffect();
    }

    @Override // ir0.g
    public final Shader getShader() {
        return this.f167941b.getShader();
    }

    @Override // ir0.g
    public final void h(float f) {
        this.d = true;
        this.f167945j = f;
    }

    @Override // ir0.g
    public final void i(boolean z) {
        if (!z) {
            this.i.cancel();
        }
        h(z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
    }

    @Override // ir0.g
    public final void j(Paint.Style value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f167941b.setStyle(value);
        this.f.setStyle(value);
    }

    @Override // ir0.g
    public final void k(Canvas canvas, float f, float f4, float f5, float f6, float f32, float f35) {
        Paint paint;
        Canvas canvas2;
        float f36;
        float f37;
        float f41;
        float f42;
        float f57;
        float f69;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.d = false;
        float f75 = this.f167945j;
        if (f75 > BitmapDescriptorFactory.HUE_RED) {
            Paint paint2 = this.e;
            paint2.setAlpha((int) (f75 * this.k));
            f41 = f5;
            f42 = f6;
            f57 = f32;
            f69 = f35;
            canvas.drawRoundRect(f, f4, f41, f42, f57, f69, paint2);
            Integer numEvaluate = this.f167944h.evaluate(this.f167945j, Integer.valueOf(this.f167941b.getColor()), Integer.valueOf(this.f167943g));
            Intrinsics.checkNotNullExpressionValue(numEvaluate, "evaluate(...)");
            int iIntValue = numEvaluate.intValue();
            paint = this.f;
            paint.setColor(iIntValue);
            canvas2 = canvas;
            f36 = f;
            f37 = f4;
        } else {
            paint = this.f167941b;
            canvas2 = canvas;
            f36 = f;
            f37 = f4;
            f41 = f5;
            f42 = f6;
            f57 = f32;
            f69 = f35;
        }
        canvas2.drawRoundRect(f36, f37, f41, f42, f57, f69, paint);
    }

    @Override // ir0.g
    public final void l(Canvas canvas, RectF rectF, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        this.d = false;
        float f = this.f167945j;
        Paint paint = this.f167941b;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            if (z3) {
                canvas.drawRect(rectF, paint);
                return;
            }
            return;
        }
        if (z) {
            int i = (int) (f * this.k);
            Paint paint2 = this.e;
            paint2.setAlpha(i);
            canvas.drawRect(rectF, paint2);
        }
        if (z3) {
            Integer numEvaluate = this.f167944h.evaluate(this.f167945j, Integer.valueOf(paint.getColor()), Integer.valueOf(this.f167943g));
            Intrinsics.checkNotNullExpressionValue(numEvaluate, "evaluate(...)");
            int iIntValue = numEvaluate.intValue();
            Paint paint3 = this.f;
            paint3.setColor(iIntValue);
            canvas.drawRect(rectF, paint3);
        }
    }

    @Override // ir0.g
    public final boolean m() {
        return true;
    }

    @Override // ir0.g
    public final boolean n() {
        return this.f167945j > BitmapDescriptorFactory.HUE_RED;
    }

    @Override // ir0.g
    public final boolean o() {
        return this.d;
    }

    @Override // ir0.g
    public final int p() {
        return this.f167941b.getColor();
    }

    @Override // ir0.g
    public final void q(float f) {
        this.e.setStrokeWidth(f);
        this.f167942c = f;
    }

    @Override // ir0.g
    public final void r(float f) {
        this.f167941b.setStrokeWidth(f);
        this.f.setStrokeWidth(f);
    }

    @Override // ir0.g
    public final void s(PathEffect pathEffect) {
        this.f167941b.setPathEffect(pathEffect);
        this.f.setPathEffect(pathEffect);
    }

    @Override // ir0.g
    public final void setShader(Shader shader) {
        this.f167941b.setShader(shader);
        this.f.setShader(shader);
        this.e.setShader(shader);
    }

    @Override // ir0.g
    public final float t() {
        return this.f167941b.getStrokeWidth();
    }

    @Override // ir0.g
    public final ValueAnimator u() {
        return this.i;
    }
}
