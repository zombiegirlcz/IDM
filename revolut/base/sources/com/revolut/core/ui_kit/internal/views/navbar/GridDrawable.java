package com.revolut.core.ui_kit.internal.views.navbar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/GridDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GridDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f57258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f57259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f57260c;
    public final Drawable d;
    public final boolean e;

    public GridDrawable(Drawable topStart, Drawable topEnd, Drawable drawable, Drawable drawable2, boolean z) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        this.f57258a = topStart;
        this.f57259b = topEnd;
        this.f57260c = drawable;
        this.d = drawable2;
        this.e = z;
    }

    public static void a(Canvas canvas, Drawable drawable) {
        int iSave = canvas.save();
        try {
            canvas.clipRect(drawable.getBounds());
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        a(canvas, this.f57258a);
        a(canvas, this.f57259b);
        Drawable drawable = this.f57260c;
        if (drawable != null) {
            a(canvas, drawable);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            a(canvas, drawable2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int iWidth = bounds.width() / 2;
        int iHeight = bounds.height() / 2;
        boolean z = this.e;
        int i = z ? iWidth : 0;
        int iWidth2 = z ? bounds.width() : iWidth;
        int i2 = z ? 0 : iWidth;
        if (!z) {
            iWidth = bounds.width();
        }
        Drawable drawable = this.f57260c;
        this.f57258a.setBounds(i, 0, iWidth2, drawable != null ? iHeight : bounds.height());
        Drawable drawable2 = this.d;
        this.f57259b.setBounds(i2, 0, iWidth, drawable2 != null ? iHeight : bounds.height());
        if (drawable != null) {
            drawable.setBounds(i, iHeight, iWidth2, bounds.height());
        }
        if (drawable2 != null) {
            drawable2.setBounds(i2, iHeight, iWidth, bounds.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
