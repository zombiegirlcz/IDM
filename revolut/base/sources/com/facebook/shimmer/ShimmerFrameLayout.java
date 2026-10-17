package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c9.a;
import c9.b;
import c9.d;
import c9.e;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f26152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShimmerDrawable f26153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26154c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.f26152a = new Paint();
        this.f26153b = new ShimmerDrawable();
        this.f26154c = true;
        b(context, null);
    }

    public final void a() {
        if (this.f26154c) {
            f();
            this.f26154c = false;
            invalidate();
        }
    }

    public final void b(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.f26153b.setCallback(this);
        if (attributeSet == null) {
            d(new b().c());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f22246a, 0, 0);
        try {
            d(((typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) ? new d() : new b()).d(typedArrayObtainStyledAttributes).c());
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes.recycle();
            throw th10;
        }
    }

    public final void d(e eVar) {
        this.f26153b.b(eVar);
        if (eVar == null || !eVar.f22257n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f26152a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f26154c) {
            this.f26153b.draw(canvas);
        }
    }

    public final void e() {
        ShimmerDrawable shimmerDrawable = this.f26153b;
        ValueAnimator valueAnimator = shimmerDrawable.e;
        if (valueAnimator == null || valueAnimator.isStarted() || shimmerDrawable.getCallback() == null) {
            return;
        }
        shimmerDrawable.e.start();
    }

    public void f() {
        this.f26153b.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26153b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        this.f26153b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f26153b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26152a = new Paint();
        this.f26153b = new ShimmerDrawable();
        this.f26154c = true;
        b(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26152a = new Paint();
        this.f26153b = new ShimmerDrawable();
        this.f26154c = true;
        b(context, attributeSet);
    }
}
