package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/DashedStrokeRectangleDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DashedStrokeRectangleDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f55952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f55953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f55954c;

    public DashedStrokeRectangleDrawable(float f, float f4, float f5, float f6, int i) {
        this.f55952a = f6;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setPathEffect(new DashPathEffect(new float[]{f4, f5}, BitmapDescriptorFactory.HUE_RED));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.f55953b = paint;
        this.f55954c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        RectF rectF = this.f55954c;
        rectF.set(bounds);
        float f = this.f55952a;
        canvas.drawRoundRect(rectF, f, f, this.f55953b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55953b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55953b.setColorFilter(colorFilter);
    }
}
