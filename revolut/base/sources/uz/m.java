package uz;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends c {

    @NotNull
    public static final l Companion = new l();
    public ValueAnimator A;
    public ValueAnimator B;
    public final ValueAnimator C;
    public int D;
    public int E;
    public float F;
    public Path G;
    public final Paint H;
    public final Paint I;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f284535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final sz.c f284536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public sz.a f284537y;
    public final DashPathEffect z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d view, sz.c config) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f284535w = view;
        this.f284536x = config;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fG = jb3.l.g(context, 2.0f);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{fG, jb3.l.g(context2, 10.0f)}, BitmapDescriptorFactory.HUE_RED);
        this.z = dashPathEffect;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "ofFloat(...)");
        this.C = valueAnimatorOfFloat;
        this.D = -1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setPathEffect(dashPathEffect);
        this.H = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.I = paint2;
    }

    @Override // uz.c
    public final int a(int i) {
        sz.a aVar;
        d dVar = this.f284535w;
        if (dVar.getMeasuredWidth() == 0 || dVar.getMeasuredHeight() == 0 || (aVar = this.f284537y) == null) {
            return 0;
        }
        Path pathB = ((sz.b) aVar).b();
        RectF rectF = new RectF();
        this.G = pathB;
        pathB.computeBounds(rectF, false);
        float f = 2;
        float fMax = Math.max(rectF.height() / dVar.getMeasuredHeight(), rectF.width() / (dVar.getMeasuredWidth() - (c((int) rectF.width()) * f)));
        float fHeight = rectF.height() / fMax;
        float fWidth = rectF.width() / fMax;
        float fC = c((int) fWidth);
        RectF rectF2 = this.f284479c;
        rectF2.left = fC;
        float f4 = this.f / f;
        rectF2.top = f4;
        rectF2.right = fC + fWidth;
        rectF2.bottom = fHeight - f4;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.CENTER;
        Matrix matrix = this.d;
        matrix.setRectToRect(rectF, rectF2, scaleToFit);
        pathB.transform(matrix);
        return (int) ((this.f284482j / f) + fHeight);
    }

    @Override // uz.c
    public final void f(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.G;
        if (path == null) {
            return;
        }
        int i = this.D;
        Paint paint = this.H;
        paint.setColor(i);
        canvas.drawPath(path, paint);
        paint.setPathEffect(null);
        paint.setColor(this.E);
        canvas.drawPath(path, paint);
        paint.setPathEffect(this.z);
        if (this.k) {
            canvas.save();
            Path path2 = new Path();
            path2.addRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight(), Path.Direction.CW);
            path2.op(path, Path.Op.DIFFERENCE);
            canvas.drawPath(path2, this.I);
            canvas.restore();
        }
        if (this.u) {
            RectF rectF = this.f284479c;
            float f = rectF.top;
            float f4 = ((rectF.bottom - f) * this.F) + f;
            canvas.save();
            float f5 = rectF.left;
            float f6 = rectF.top;
            float f32 = rectF.right;
            RectF rectF2 = this.f284483l;
            rectF2.set(f5, f6, f32, f4);
            canvas.clipPath(path);
            canvas.drawRect(rectF2, this.f284485n);
            canvas.restore();
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f4, this.f284535w.getWidth(), f4, this.f284484m);
        }
    }

    @Override // uz.c
    public final void g() {
        this.C.cancel();
        r();
    }

    @Override // uz.c
    public final void i(boolean z) {
        boolean z3 = this.i;
        super.i(z);
        if (z == z3) {
            return;
        }
        r();
    }

    @Override // uz.c
    public final void m(long j2) {
        boolean z = this.u;
        if (this.f284536x.f266713a) {
            RectF rectF = this.f284479c;
            l(rectF.top, rectF.bottom);
            if (!z) {
                this.F = BitmapDescriptorFactory.HUE_RED;
                ValueAnimator valueAnimator = this.C;
                valueAnimator.cancel();
                valueAnimator.setDuration(j2);
                valueAnimator.setInterpolator(new LinearInterpolator());
                valueAnimator.addUpdateListener(new k(this, 2));
                valueAnimator.start();
            }
        }
        r();
    }

    @Override // uz.c
    public final void n() {
    }

    @Override // uz.c
    public final void p() {
    }

    public final void r() {
        int alphaComponent;
        int i = this.D;
        int i2 = this.f284480g;
        int i3 = this.f284481h;
        boolean z = this.u;
        int alphaComponent2 = 0;
        int i5 = this.o;
        if (z) {
            alphaComponent = i5;
        } else {
            boolean z3 = this.i;
            alphaComponent = (!z3 || i3 == 0) ? (z3 || i2 == 0) ? 0 : ColorUtils.setAlphaComponent(i2, 128) : ColorUtils.setAlphaComponent(i3, 255);
        }
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.B;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(i, alphaComponent);
        valueAnimatorOfArgb.setInterpolator(new LinearInterpolator());
        valueAnimatorOfArgb.setDuration(100L);
        valueAnimatorOfArgb.addUpdateListener(new k(this, 0));
        valueAnimatorOfArgb.start();
        this.A = valueAnimatorOfArgb;
        int i6 = this.E;
        int i21 = this.f284480g;
        int i22 = this.f284481h;
        if (this.u) {
            alphaComponent2 = i5;
        } else {
            boolean z4 = this.i;
            if (z4 && i22 != 0) {
                alphaComponent2 = ColorUtils.setAlphaComponent(i22, 255);
            } else if (!z4 && i21 != 0) {
                alphaComponent2 = ColorUtils.setAlphaComponent(i21, 0);
            }
        }
        ValueAnimator valueAnimator3 = this.B;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(i6, alphaComponent2);
        valueAnimatorOfArgb2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfArgb2.setDuration(100L);
        valueAnimatorOfArgb2.addUpdateListener(new k(this, 1));
        valueAnimatorOfArgb2.start();
        this.B = valueAnimatorOfArgb2;
    }
}
