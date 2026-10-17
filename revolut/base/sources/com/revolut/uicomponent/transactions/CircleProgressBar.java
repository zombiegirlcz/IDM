package com.revolut.uicomponent.transactions;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.uicomponent.R$styleable;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@d
public class CircleProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f107310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f107311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107312c;
    public int d;
    public final int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f107313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f107314h;
    public final Paint i;

    public static abstract class a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public CircleProgressBar(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f107310a = 4.0f;
        this.f107311b = BitmapDescriptorFactory.HUE_RED;
        this.f107312c = 0;
        this.d = 100;
        this.e = -90;
        this.f = -12303292;
        this.f107313g = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CircleProgressBar, 0, 0);
        try {
            this.f107310a = typedArrayObtainStyledAttributes.getDimension(R$styleable.CircleProgressBar_progressBarThickness, this.f107310a);
            this.f107311b = typedArrayObtainStyledAttributes.getFloat(R$styleable.CircleProgressBar_progress, this.f107311b);
            this.f = typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressBar_progressbarColor, this.f);
            this.f107312c = typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressBar_min, this.f107312c);
            this.d = typedArrayObtainStyledAttributes.getInt(R$styleable.CircleProgressBar_max, this.d);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.f107314h = paint;
            int i = this.f;
            paint.setColor(Color.argb(Math.round(Color.alpha(i) * 0.3f), Color.red(i), Color.green(i), Color.blue(i)));
            Paint paint2 = this.f107314h;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.f107314h.setStrokeWidth(this.f107310a);
            Paint paint3 = new Paint(1);
            this.i = paint3;
            paint3.setColor(this.f);
            this.i.setStyle(style);
            this.i.setStrokeWidth(this.f107310a);
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes.recycle();
            throw th10;
        }
    }

    public int getColor() {
        return this.f;
    }

    public int getMax() {
        return this.d;
    }

    public int getMin() {
        return this.f107312c;
    }

    public float getProgress() {
        return this.f107311b;
    }

    public float getStrokeWidth() {
        return this.f107310a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f107313g, this.f107314h);
        canvas.drawArc(this.f107313g, this.e, (this.f107311b * 360.0f) / this.d, false, this.i);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(iMin, iMin);
        float f = this.f107310a;
        float f4 = iMin;
        this.f107313g.set((f / 2.0f) + BitmapDescriptorFactory.HUE_RED, (f / 2.0f) + BitmapDescriptorFactory.HUE_RED, f4 - (f / 2.0f), f4 - (f / 2.0f));
    }

    public void setColor(int i) {
        this.f = i;
        this.f107314h.setColor(Color.argb(Math.round(Color.alpha(i) * 0.3f), Color.red(i), Color.green(i), Color.blue(i)));
        this.i.setColor(i);
        invalidate();
        requestLayout();
    }

    public void setMax(int i) {
        this.d = i;
        invalidate();
    }

    public void setMin(int i) {
        this.f107312c = i;
        invalidate();
    }

    @Keep
    public void setProgress(float f) {
        this.f107311b = f;
        invalidate();
    }

    public void setProgressWithAnimation(float f) {
        setProgressWithAnimation(f, 1500L);
    }

    public void setStrokeWidth(float f) {
        this.f107310a = f;
        this.f107314h.setStrokeWidth(f);
        this.i.setStrokeWidth(f);
        invalidate();
        requestLayout();
    }

    public void setProgressWithAnimation(float f, long j2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", f);
        objectAnimatorOfFloat.setDuration(j2);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    public void setProgressWithAnimation(float f, long j2, a aVar) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", f);
        objectAnimatorOfFloat.setDuration(j2);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addListener(aVar);
        objectAnimatorOfFloat.start();
    }
}
