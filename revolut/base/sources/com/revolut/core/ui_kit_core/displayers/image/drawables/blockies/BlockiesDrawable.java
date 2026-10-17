package com.revolut.core.ui_kit_core.displayers.image.drawables.blockies;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import cz0.c;
import cz0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/drawables/blockies/BlockiesDrawable;", "Landroid/graphics/drawable/ShapeDrawable;", "ui_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockiesDrawable extends ShapeDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f59836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f59837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockiesDrawable(c blockies) {
        super(new OvalShape());
        Intrinsics.checkNotNullParameter(blockies, "blockies");
        this.f59836a = blockies;
        this.f59837b = new d();
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        d dVar = this.f59837b;
        dVar.getClass();
        float fMin = Math.min(fHeight, fWidth);
        dVar.f110137b = fMin;
        dVar.f110138c = fWidth - fMin;
        dVar.d = fHeight - fMin;
        Path path = dVar.e;
        path.reset();
        float f = dVar.f110138c;
        float f4 = dVar.f110137b / 2;
        path.addCircle(f + f4, dVar.d + f4, f4, Path.Direction.CCW);
        path.close();
        dVar.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        c blockies = this.f59836a;
        Intrinsics.checkNotNullParameter(blockies, "blockies");
        canvas.save();
        canvas.clipPath(dVar.e);
        Paint paint = dVar.f110136a;
        paint.setColor(blockies.f110134b);
        float f5 = dVar.f110138c;
        float f6 = dVar.d;
        float f32 = dVar.f110137b;
        canvas.drawRect(f5, f6, f5 + f32, f6 + f32, paint);
        float f35 = dVar.f110137b / 8;
        int i = blockies.f110133a;
        int i2 = blockies.f110135c;
        double[] dArr = blockies.d;
        int length = dArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i5 = i3 % 8;
            int i6 = i3 / 8;
            paint.setColor(dArr[i3] == 1.0d ? i : i2);
            if (dArr[i3] > 0.0d) {
                float f36 = dVar.f110138c;
                float f37 = i5 * f35;
                float f41 = dVar.d;
                float f42 = i6 * f35;
                canvas.drawRect(f36 + f37, f41 + f42, f36 + f37 + f35, f42 + f35 + f41, paint);
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }
}
