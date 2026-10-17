package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperAssetOverlayDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/BackgroundGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackgroundGradientDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f55935c = new Paint(1);
    public final int[] d;

    public BackgroundGradientDrawable(int i, float f) {
        this.f55933a = i;
        this.f55934b = f;
        WallpaperAssetOverlayDrawable.INSTANCE.getClass();
        this.d = new int[16];
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.f55935c;
        if (paint.getShader() == null) {
            return;
        }
        canvas.drawRect(getBounds().left, getBounds().bottom - (getBounds().height() * this.f55934b), getBounds().right, getBounds().bottom, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        float fHeight = getBounds().bottom - (getBounds().height() * this.f55934b);
        int i = getBounds().bottom;
        float fExactCenterX = getBounds().exactCenterX();
        float f = i;
        float fExactCenterX2 = getBounds().exactCenterX();
        int[] iArr = this.d;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            WallpaperAssetOverlayDrawable.INSTANCE.getClass();
            iArr[i2] = io0.a.b(WallpaperAssetOverlayDrawable.o[i2], this.f55933a);
        }
        WallpaperAssetOverlayDrawable.INSTANCE.getClass();
        this.f55935c.setShader(new LinearGradient(fExactCenterX, f, fExactCenterX2, fHeight, iArr, WallpaperAssetOverlayDrawable.f57367p, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55935c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55935c.setColorFilter(colorFilter);
    }
}
