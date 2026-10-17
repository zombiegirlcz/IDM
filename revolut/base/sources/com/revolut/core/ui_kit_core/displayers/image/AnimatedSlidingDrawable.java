package com.revolut.core.ui_kit_core.displayers.image;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import au0.s4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.drawables.TextDrawable;
import com.revolut.core.ui_kit_core.displayers.image.AnimatedSlidingDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rim.d;
import yy0.m;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/AnimatedSlidingDrawable;", "Landroid/graphics/drawable/Drawable;", "Lyy0/m;", "Companion", "a", "ui_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnimatedSlidingDrawable extends Drawable implements m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextDrawable f59782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f59783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f59784c;
    public final Paint d;
    public final Path e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f59785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f59786h;
    public AnimatorSet i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59787j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f59788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f59789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f59790n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f59791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f59792q;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit_core.displayers.image.AnimatedSlidingDrawable$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AnimatedSlidingDrawable(TextDrawable primaryDrawable, Drawable secondaryDrawable, int i, float f) {
        Intrinsics.checkNotNullParameter(primaryDrawable, "primaryDrawable");
        Intrinsics.checkNotNullParameter(secondaryDrawable, "secondaryDrawable");
        this.f59782a = primaryDrawable;
        this.f59783b = secondaryDrawable;
        this.f59784c = f;
        Paint paint = new Paint();
        paint.setColor(i);
        this.d = paint;
        this.e = new Path();
        this.f59786h = 1.0f;
    }

    @Override // yy0.m
    public final void a(int i) {
        TextDrawable textDrawable = this.f59782a;
        if (textDrawable == null) {
            textDrawable = null;
        }
        if (textDrawable != null) {
            textDrawable.a(i);
        }
        this.f59783b.setTint(i);
        invalidateSelf();
    }

    public final Drawable b() {
        return this.f59782a;
    }

    public final void c() {
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null) {
            animatorSet.resume();
            return;
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(2.0f);
        final int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        final int i2 = 0;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: yy0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnimatedSlidingDrawable f317744b;

            {
                this.f317744b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i2;
                AnimatedSlidingDrawable animatedSlidingDrawable = this.f317744b;
                switch (i3) {
                    case 0:
                        AnimatedSlidingDrawable.Companion companion = AnimatedSlidingDrawable.INSTANCE;
                        animatedSlidingDrawable.f59785g = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        animatedSlidingDrawable.invalidateSelf();
                        break;
                    case 1:
                        AnimatedSlidingDrawable.Companion companion2 = AnimatedSlidingDrawable.INSTANCE;
                        animatedSlidingDrawable.f59786h = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        animatedSlidingDrawable.invalidateSelf();
                        break;
                    default:
                        AnimatedSlidingDrawable.Companion companion3 = AnimatedSlidingDrawable.INSTANCE;
                        animatedSlidingDrawable.f59785g = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        animatedSlidingDrawable.invalidateSelf();
                        break;
                }
            }
        });
        valueAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        valueAnimatorOfFloat.setStartDelay(2000L);
        valueAnimatorOfFloat.setDuration(500L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 1.25f, 1.0f);
        final int i3 = 1;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: yy0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnimatedSlidingDrawable f317744b;

            {
                this.f317744b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i3;
                AnimatedSlidingDrawable animatedSlidingDrawable = this.f317744b;
                switch (i32) {
                    case 0:
                        AnimatedSlidingDrawable.Companion companion = AnimatedSlidingDrawable.INSTANCE;
                        animatedSlidingDrawable.f59785g = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        animatedSlidingDrawable.invalidateSelf();
                        break;
                    case 1:
                        AnimatedSlidingDrawable.Companion companion2 = AnimatedSlidingDrawable.INSTANCE;
                        animatedSlidingDrawable.f59786h = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        animatedSlidingDrawable.invalidateSelf();
                        break;
                    default:
                        AnimatedSlidingDrawable.Companion companion3 = AnimatedSlidingDrawable.INSTANCE;
                        animatedSlidingDrawable.f59785g = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        animatedSlidingDrawable.invalidateSelf();
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.setStartDelay(300L);
        valueAnimatorOfFloat2.setDuration(300L);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 2.0f);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: yy0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnimatedSlidingDrawable f317744b;

            {
                this.f317744b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i;
                AnimatedSlidingDrawable animatedSlidingDrawable = this.f317744b;
                switch (i32) {
                    case 0:
                        AnimatedSlidingDrawable.Companion companion = AnimatedSlidingDrawable.INSTANCE;
                        animatedSlidingDrawable.f59785g = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        animatedSlidingDrawable.invalidateSelf();
                        break;
                    case 1:
                        AnimatedSlidingDrawable.Companion companion2 = AnimatedSlidingDrawable.INSTANCE;
                        animatedSlidingDrawable.f59786h = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        animatedSlidingDrawable.invalidateSelf();
                        break;
                    default:
                        AnimatedSlidingDrawable.Companion companion3 = AnimatedSlidingDrawable.INSTANCE;
                        animatedSlidingDrawable.f59785g = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        animatedSlidingDrawable.invalidateSelf();
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.setInterpolator(decelerateInterpolator);
        valueAnimatorOfFloat3.setStartDelay(1000L);
        valueAnimatorOfFloat3.setDuration(500L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        animatorSet2.addListener(new s4(this, 5));
        animatorSet2.start();
        this.f++;
        this.i = animatorSet2;
    }

    public final void d(int i, int i2) {
        this.d.setColor(i);
        a(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        int iWidth = getBounds().width();
        float f = this.f59785g;
        float f4 = f <= 1.0f ? (-iWidth) * f : (-iWidth) * (f - 1);
        Paint paint = this.d;
        Path path = this.e;
        canvas.drawPath(path, paint);
        float f5 = this.f59785g;
        Drawable drawable = this.f59783b;
        TextDrawable textDrawable = this.f59782a;
        if (f5 <= 1.0f) {
            int i = this.f59790n;
            int i2 = this.f59791p;
            textDrawable.setBounds(i, i2, this.f59787j + i, this.k + i2);
            int i3 = this.o + iWidth;
            int i5 = this.f59792q;
            drawable.setBounds(i3, i5, this.f59788l + i3, this.f59789m + i5);
        } else {
            int i6 = this.f59790n + iWidth;
            int i21 = this.f59791p;
            textDrawable.setBounds(i6, i21, this.f59787j + i6, this.k + i21);
            int i22 = this.o;
            int i32 = this.f59792q;
            drawable.setBounds(i22, i32, this.f59788l + i22, this.f59789m + i32);
        }
        canvas.clipPath(path);
        float f6 = this.f59786h;
        canvas.scale(f6, f6, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
        canvas.translate(f4, BitmapDescriptorFactory.HUE_RED);
        textDrawable.draw(canvas);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        Path path = this.e;
        path.rewind();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f = iWidth;
        float f4 = f / 2.0f;
        float f5 = iHeight;
        path.addCircle(bounds.left + f4, (f5 / 2.0f) + bounds.top, f4, Path.Direction.CW);
        TextDrawable textDrawable = this.f59782a;
        int intrinsicWidth = textDrawable.getIntrinsicWidth();
        Integer numValueOf = Integer.valueOf(intrinsicWidth);
        if (intrinsicWidth <= 0) {
            numValueOf = null;
        }
        this.f59787j = numValueOf != null ? numValueOf.intValue() : iWidth;
        int intrinsicHeight = textDrawable.getIntrinsicHeight();
        Integer numValueOf2 = Integer.valueOf(intrinsicHeight);
        if (intrinsicHeight <= 0) {
            numValueOf2 = null;
        }
        this.k = numValueOf2 != null ? numValueOf2.intValue() : iHeight;
        float f6 = this.f59784c;
        if (f6 > BitmapDescriptorFactory.HUE_RED) {
            this.f59788l = d.c(f * f6);
            this.f59789m = d.c(f5 * f6);
        } else {
            Drawable drawable = this.f59783b;
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            Integer numValueOf3 = Integer.valueOf(intrinsicWidth2);
            if (intrinsicWidth2 <= 0) {
                numValueOf3 = null;
            }
            this.f59788l = numValueOf3 != null ? numValueOf3.intValue() : iWidth;
            int intrinsicHeight2 = drawable.getIntrinsicHeight();
            Integer numValueOf4 = intrinsicHeight2 > 0 ? Integer.valueOf(intrinsicHeight2) : null;
            this.f59789m = numValueOf4 != null ? numValueOf4.intValue() : iHeight;
        }
        int i = (iWidth / 2) + bounds.left;
        this.f59790n = i - (this.f59787j / 2);
        int i2 = (iHeight / 2) + bounds.top;
        this.f59791p = i2 - (this.k / 2);
        this.o = i - (this.f59788l / 2);
        this.f59792q = i2 - (this.f59789m / 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z3) {
        boolean visible = super.setVisible(z, z3);
        if (visible) {
            if (z) {
                c();
                return visible;
            }
            AnimatorSet animatorSet = this.i;
            if (animatorSet != null) {
                animatorSet.pause();
                return visible;
            }
        } else if (z && this.i == null) {
            c();
        }
        return visible;
    }
}
