package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import ix0.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/WallpaperProjectionOverlayDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WallpaperProjectionOverlayDrawable extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f57377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f57379c;
    public int d;
    public float e;
    public float f;

    public WallpaperProjectionOverlayDrawable(Context context, Drawable baseDrawable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseDrawable, "baseDrawable");
        this.f57377a = baseDrawable;
        this.f57378b = kli.a.q(context);
        this.f57379c = new Paint();
        this.d = 255;
        this.e = 1.0f;
        baseDrawable.setCallback(this);
        a();
    }

    public final void a() {
        this.f57379c.setColor(io0.a.b(this.d / 255.0f, this.f57378b ? io0.a.d(i1.b(0.48f, 0.76f, this.f), -16777216) : ColorUtils.compositeColors(io0.a.d(i1.b(0.32f, 0.76f, this.f), -1), io0.a.d(0.1f, -16777216))));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.d == 0) {
            return;
        }
        Drawable drawable = this.f57377a;
        int alpha = drawable.getAlpha();
        int iC = rim.d.c(alpha * this.e);
        if (alpha != iC) {
            drawable.setAlpha(iC);
        }
        drawable.draw(canvas);
        if (alpha != iC) {
            drawable.setAlpha(alpha);
        }
        canvas.drawRect(getBounds(), this.f57379c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f57377a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f57377a.getIntrinsicWidth();
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
        super.onBoundsChange(bounds);
        this.f57377a.setBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable who, Runnable what, long j2) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        scheduleSelf(what, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int iG = kotlin.ranges.f.g(i, 0, 255);
        if (this.d != iG) {
            this.d = iG;
            this.e = iG / 255.0f;
            a();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f57377a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable who, Runnable what) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        unscheduleSelf(what);
    }
}
