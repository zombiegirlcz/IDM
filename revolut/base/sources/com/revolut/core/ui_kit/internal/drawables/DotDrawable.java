package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/DotDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DotDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55957c;
    public final Paint d;

    public DotDrawable(int i, int i2, int i3, int i5) {
        this.f55955a = i;
        this.f55956b = i2;
        this.f55957c = i3;
        Paint paint = new Paint();
        paint.setColor(i5);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.d = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), this.f55957c / 2.0f, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f55956b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f55955a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
