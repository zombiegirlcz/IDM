package com.revolut.core.ui_kit.internal.drawables;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import au0.b5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dr0.q;
import dr0.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/AnimatedBorderGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnimatedBorderGradientDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f55927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c8g.a f55928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55929c;
    public float d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f55930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f55931h;
    public SweepGradient i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f55932j;
    public final ValueAnimator k;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.drawables.AnimatedBorderGradientDrawable$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AnimatedBorderGradientDrawable(int[] gradientColors, c8g.a shapeType) {
        Intrinsics.checkNotNullParameter(gradientColors, "gradientColors");
        Intrinsics.checkNotNullParameter(shapeType, "shapeType");
        this.f55927a = gradientColors;
        this.f55928b = shapeType;
        this.f55930g = new RectF();
        this.f55931h = new Matrix();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.f55932j = paint;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 360.0f);
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 7));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(3600L);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        this.k = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        RectF rectF = this.f55930g;
        rectF.set(bounds);
        float f = getLayoutDirection() == 1 ? (-this.f) + 180.0f : this.f;
        float f4 = this.d;
        float f5 = this.e;
        Matrix matrix = this.f55931h;
        matrix.preRotate(f, f4, f5);
        SweepGradient sweepGradient = this.i;
        if (sweepGradient != null) {
            sweepGradient.setLocalMatrix(matrix);
        }
        c8g.a aVar = this.f55928b;
        boolean z = aVar instanceof r;
        Paint paint = this.f55932j;
        if (z) {
            r rVar = (r) aVar;
            float f6 = rVar.f117062b / 2;
            rectF.inset(f6, f6);
            paint.setStrokeWidth(rVar.f117062b);
            float f32 = rVar.f117061a;
            canvas.drawRoundRect(rectF, f32, f32, paint);
        } else {
            if (!(aVar instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            q qVar = (q) aVar;
            float f35 = qVar.f117060a / 2;
            rectF.inset(f35, f35);
            paint.setStrokeWidth(qVar.f117060a);
            canvas.drawOval(rectF, paint);
        }
        matrix.reset();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f55929c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.d = bounds.centerX();
        this.e = bounds.centerY();
        SweepGradient sweepGradient = new SweepGradient(this.d, this.e, this.f55927a, (float[]) null);
        this.i = sweepGradient;
        this.f55932j.setShader(sweepGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55932j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55932j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f55929c) {
            return;
        }
        this.f55929c = true;
        this.k.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f55929c) {
            this.f55929c = false;
            this.k.cancel();
        }
    }
}
