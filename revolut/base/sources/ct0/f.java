package ct0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.AccelerateDecelerateInterpolator;
import au0.b5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht0.k f108587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ht0.b0 f108588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f108589c;
    public final float d;
    public final float e;
    public Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f108590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f108591h;
    public final ValueAnimator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f108592j;

    public f(Context context, ht0.k dotIndicatorPaint, ht0.b0 invalidateView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dotIndicatorPaint, "dotIndicatorPaint");
        Intrinsics.checkNotNullParameter(invalidateView, "invalidateView");
        this.f108587a = dotIndicatorPaint;
        this.f108588b = invalidateView;
        this.f108589c = kli.a.k(context, 3.0f);
        float fK = kli.a.k(context, 6.0f);
        this.d = fK;
        float fK2 = kli.a.k(context, 15.0f);
        this.e = fK2;
        if (fK2 != this.f108592j) {
            invalidateView.invoke();
            this.f108592j = fK2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fK, fK2);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 6));
        valueAnimatorOfFloat.addListener(new e());
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.i = valueAnimatorOfFloat;
    }

    public final void a(Canvas canvas, float f, float f4, int i, ht0.a chartStyle) {
        Paint paint;
        Paint paint2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        float f5 = this.f108592j;
        float f6 = this.d;
        float f32 = 1.0f - ((f5 - f6) / (this.e - f6));
        if (chartStyle == ht0.a.REV_10_REFRESH) {
            this.f108587a.c(canvas, f, f4, f32, i);
            return;
        }
        Paint paint3 = this.f;
        if (paint3 == null || (paint = this.f108590g) == null || (paint2 = this.f108591h) == null) {
            return;
        }
        paint.setColor(i);
        paint3.setColor(i);
        paint3.setAlpha((int) (f32 * 0.6f * 255));
        canvas.drawCircle(f, f4, this.f108592j, paint3);
        canvas.drawCircle(f, f4, f6, paint);
        canvas.drawCircle(f, f4, this.f108589c, paint2);
    }
}
