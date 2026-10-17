package com.revolut.core.ui_kit.internal.drawing.ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import au0.b5;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.drawables.RevolutDrawableWrapper;
import foh.i;
import fr0.f;
import g8i.h;
import ir0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawing/ai/AiBorderDrawableDecorator;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "Lfr0/f;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AiBorderDrawableDecorator extends RevolutDrawableWrapper implements f {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f56030n = i.j(1);
    public static final float o = i.j(4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f56031p = {Color.parseColor("#00BE90"), Color.parseColor("#008FE1"), Color.parseColor("#00BE90")};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f56033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f56034c;
    public final float d;
    public final long e;
    public SweepGradient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ValueAnimator f56035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f56036h;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f56037j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Outline f56038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f56039m;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBorderDrawableDecorator(Context context, Drawable drawable, int[] borderColors, float f, long j2) {
        super(drawable);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(borderColors, "borderColors");
        this.f56032a = context;
        this.f56033b = drawable;
        this.f56034c = borderColors;
        this.d = f;
        this.e = j2;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        this.i = paint;
        this.f56037j = new Matrix();
        this.f56038l = new Outline();
        this.f56039m = w.y0(new h(this, 25));
    }

    @Override // fr0.f
    public final void a(v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Object obj2 = this.f56033b;
        f fVar = obj2 instanceof f ? (f) obj2 : null;
        if (fVar != null) {
            fVar.a(colorScheme);
        }
        invalidateSelf();
    }

    public final void c() {
        this.k = false;
        ValueAnimator valueAnimator = this.f56035g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f56035g = null;
        invalidateSelf();
    }

    public final void d() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f56035g;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.k = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 360.0f);
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 14));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(this.e);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        this.f56035g = valueAnimatorOfFloat;
        this.f56033b.getOutline(this.f56038l);
        if (!isVisible() || (valueAnimator = this.f56035g) == null) {
            return;
        }
        valueAnimator.start();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ?? r06 = this.f56039m;
        boolean zN = ((g) r06.getValue()).n();
        Outline outline = this.f56038l;
        if (zN) {
            ((g) r06.getValue()).k(canvas, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getBounds().width(), getBounds().height(), outline.getRadius(), outline.getRadius());
        }
        super.draw(canvas);
        if (this.k) {
            float fWidth = getBounds().width() / 2.0f;
            float fHeight = getBounds().height() / 2.0f;
            float f = this.d / 2.0f;
            SweepGradient sweepGradient = this.f;
            if (sweepGradient == null) {
                sweepGradient = new SweepGradient(fWidth, fHeight, this.f56034c, (float[]) null);
            }
            if (this.f == null) {
                this.f = sweepGradient;
            }
            float f4 = this.f56036h;
            Matrix matrix = this.f56037j;
            matrix.setRotate(f4, fWidth, fHeight);
            sweepGradient.setLocalMatrix(matrix);
            Paint paint = this.i;
            paint.setShader(sweepGradient);
            canvas.drawRoundRect(f, f, getBounds().width() - f, getBounds().height() - f, outline.getRadius(), outline.getRadius(), paint);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        if (this.f != null) {
            this.f = new SweepGradient(bounds.width() / 2.0f, bounds.height() / 2.0f, this.f56034c, (float[]) null);
        }
        this.f56033b.getOutline(this.f56038l);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z3) {
        if (z) {
            ValueAnimator valueAnimator = this.f56035g;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        } else {
            ValueAnimator valueAnimator2 = this.f56035g;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.f56035g = null;
        }
        return super.setVisible(z, z3);
    }
}
