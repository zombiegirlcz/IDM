package ir0;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f167946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f167947b;

    public k(Paint basePaint) {
        Intrinsics.checkNotNullParameter(basePaint, "basePaint");
        this.f167946a = basePaint;
    }

    @Override // ir0.g
    public final float a() {
        return this.f167947b;
    }

    @Override // ir0.g
    public final void b(Canvas canvas, RectF oval, float f, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(oval, "oval");
        canvas.drawArc(oval, f, f4, false, this.f167946a);
    }

    @Override // ir0.g
    public final void c(float f, float f4, Canvas canvas, float f5) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawCircle(f, f4, f5, this.f167946a);
    }

    @Override // ir0.g
    public final void d(int i) {
        this.f167946a.setColor(i);
    }

    @Override // ir0.g
    public final void e(Canvas canvas, Path path, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(path, "path");
        if (z3) {
            canvas.drawPath(path, this.f167946a);
        }
    }

    @Override // ir0.g
    public final void f(Paint.Cap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f167946a.setStrokeCap(value);
    }

    @Override // ir0.g
    public final void g(int i) {
    }

    @Override // ir0.g
    public final PathEffect getPathEffect() {
        return this.f167946a.getPathEffect();
    }

    @Override // ir0.g
    public final Shader getShader() {
        return this.f167946a.getShader();
    }

    @Override // ir0.g
    public final void h(float f) {
        this.f167947b = f;
    }

    @Override // ir0.g
    public final void i(boolean z) {
    }

    @Override // ir0.g
    public final void j(Paint.Style value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f167946a.setStyle(value);
    }

    @Override // ir0.g
    public final void k(Canvas canvas, float f, float f4, float f5, float f6, float f32, float f35) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRoundRect(f, f4, f5, f6, f32, f35, this.f167946a);
    }

    @Override // ir0.g
    public final void l(Canvas canvas, RectF rectF, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        if (z3) {
            canvas.drawRect(rectF, this.f167946a);
        }
    }

    @Override // ir0.g
    public final boolean m() {
        return false;
    }

    @Override // ir0.g
    public final boolean n() {
        return false;
    }

    @Override // ir0.g
    public final boolean o() {
        return false;
    }

    @Override // ir0.g
    public final int p() {
        return this.f167946a.getColor();
    }

    @Override // ir0.g
    public final void q(float f) {
    }

    @Override // ir0.g
    public final void r(float f) {
        this.f167946a.setStrokeWidth(f);
    }

    @Override // ir0.g
    public final void s(PathEffect pathEffect) {
        this.f167946a.setPathEffect(pathEffect);
    }

    @Override // ir0.g
    public final void setShader(Shader shader) {
        this.f167946a.setShader(shader);
    }

    @Override // ir0.g
    public final float t() {
        return this.f167946a.getStrokeWidth();
    }

    @Override // ir0.g
    public final ValueAnimator u() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setDuration(0L);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }
}
