package com.revolut.core.ui_kit_core.displayers.image.drawables;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/drawables/CircularDrawable;", "Landroid/graphics/drawable/DrawableWrapper;", "ui_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircularDrawable extends DrawableWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f59819a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularDrawable(Drawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f59819a = new Path();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullExpressionValue(getBounds(), "getBounds(...)");
        float fWidth = r0.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        Path path = this.f59819a;
        path.addCircle(r0.left + fWidth, r0.top + fWidth, fWidth, direction);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
        path.reset();
    }
}
