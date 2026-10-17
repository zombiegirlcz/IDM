package com.revolut.core.ui_kit.internal.drawables;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import au0.b5;
import au0.l5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rim.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/CrossfadeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrossfadeDrawable extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f55944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f55945c;
    public ValueAnimator d;
    public float e;
    public int f;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.drawables.CrossfadeDrawable$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CrossfadeDrawable() {
        this(0);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = null;
        Drawable drawable = this.f55944b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f55944b = null;
        Drawable drawable2 = this.f55945c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f55945c = null;
    }

    public final void b(Drawable drawable, boolean z) {
        Drawable drawable2;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        if (this.f55944b == drawableMutate) {
            return;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        drawableMutate.setCallback(this);
        drawableMutate.setBounds(getBounds());
        if (!z || (drawable2 = this.f55944b) == null) {
            Drawable drawable3 = this.f55945c;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            this.f55945c = null;
            this.f55944b = drawableMutate;
            this.e = 1.0f;
            invalidateSelf();
            return;
        }
        this.f55945c = drawable2;
        this.f55944b = drawableMutate;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f55943a);
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 8));
        valueAnimatorOfFloat.addListener(new l5(this, 3));
        valueAnimatorOfFloat.start();
        this.d = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = this.f55945c;
        if (drawable == null || drawable.getAlpha() == 0 || ((drawable instanceof ColorDrawable) && Color.alpha(((ColorDrawable) drawable).getColor()) == 0)) {
            Drawable drawable2 = this.f55944b;
            if (drawable2 != null) {
                int alpha = drawable2.getAlpha();
                drawable2.setAlpha(d.c((this.f / 255.0f) * alpha * this.e));
                drawable2.draw(canvas);
                drawable2.setAlpha(alpha);
                return;
            }
            return;
        }
        Drawable drawable3 = this.f55944b;
        if (drawable3 != null) {
            int alpha2 = drawable3.getAlpha();
            drawable3.setAlpha(d.c((this.f / 255.0f) * alpha2));
            drawable3.draw(canvas);
            drawable3.setAlpha(alpha2);
        }
        Drawable drawable4 = this.f55945c;
        if (drawable4 != null) {
            int alpha3 = drawable4.getAlpha();
            drawable4.setAlpha(d.c((1.0f - this.e) * (this.f / 255.0f) * alpha3));
            drawable4.draw(canvas);
            drawable4.setAlpha(alpha3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable drawable = this.f55944b;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        Drawable drawable2 = this.f55945c;
        if (drawable2 != null) {
            drawable2.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable who, Runnable what, long j2) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        scheduleSelf(what, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f55944b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f55945c;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z3) {
        ValueAnimator valueAnimator;
        if (!z && (valueAnimator = this.d) != null) {
            valueAnimator.end();
        }
        return super.setVisible(z, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable who, Runnable what) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        unscheduleSelf(what);
    }

    public CrossfadeDrawable(long j2) {
        this.f55943a = j2;
        this.e = 1.0f;
        this.f = 255;
    }

    public /* synthetic */ CrossfadeDrawable(int i) {
        this(300L);
    }
}
