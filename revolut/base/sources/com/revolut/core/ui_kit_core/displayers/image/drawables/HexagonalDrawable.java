package com.revolut.core.ui_kit_core.displayers.image.drawables;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import ix0.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/drawables/HexagonalDrawable;", "Landroid/graphics/drawable/DrawableWrapper;", "ui_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HexagonalDrawable extends DrawableWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f59823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f59824b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HexagonalDrawable(Drawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f59823a = new Path();
        this.f59824b = new RectF();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f = getBounds().left;
        float f4 = getBounds().top;
        float f5 = getBounds().right;
        float f6 = getBounds().bottom;
        RectF rectF = this.f59824b;
        rectF.set(f, f4, f5, f6);
        Path path = this.f59823a;
        r0.a(rectF, path);
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.draw(canvas);
            canvas.restoreToCount(iSave);
            path.reset();
        } catch (Throwable th10) {
            canvas.restoreToCount(iSave);
            throw th10;
        }
    }
}
