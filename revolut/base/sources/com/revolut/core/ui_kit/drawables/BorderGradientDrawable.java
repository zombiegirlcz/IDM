package com.revolut.core.ui_kit.drawables;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import bq0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/BorderGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BorderGradientDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f55748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f55750c;
    public final float[] d;
    public final GradientDrawable.Orientation e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f55751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f55752h;
    public final RectF i;

    public BorderGradientDrawable(float f, float f4, int[] gradientColors, int i, float[] fArr, GradientDrawable.Orientation gradientOrientation) {
        Intrinsics.checkNotNullParameter(gradientColors, "gradientColors");
        Intrinsics.checkNotNullParameter(gradientOrientation, "gradientOrientation");
        this.f55748a = f;
        this.f55749b = f4;
        this.f55750c = gradientColors;
        this.d = fArr;
        this.e = gradientOrientation;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(null);
        paint.setColor(i);
        this.f = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f4);
        this.f55751g = paint2;
        this.f55752h = f4 / 2.0f;
        this.i = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        RectF rectF = this.i;
        rectF.set(bounds);
        float f = this.f55752h;
        rectF.inset(f, f);
        float f4 = this.f55748a;
        canvas.drawRoundRect(rectF, f4 - f, f4 - f, this.f55751g);
        rectF.inset(f, f);
        float f5 = this.f55749b;
        canvas.drawRoundRect(rectF, f4 - f5, f4 - f5, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f.getAlpha() == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        LinearGradient linearGradient;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth <= 0 || iHeight <= 0) {
            linearGradient = null;
        } else {
            GradientDrawable.Orientation orientation = this.e;
            Intrinsics.checkNotNullParameter(orientation, "<this>");
            a aVarV = ta6.a.V(orientation, iWidth, iHeight);
            linearGradient = new LinearGradient(aVarV.f17660a, aVarV.f17661b, aVarV.f17662c, aVarV.d, this.f55750c, this.d, Shader.TileMode.CLAMP);
        }
        this.f55751g.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
        this.f55751g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        this.f55751g.setColorFilter(colorFilter);
    }

    public /* synthetic */ BorderGradientDrawable(float f, float f4, int[] iArr, int i) {
        this(f, f4, iArr, i, null, GradientDrawable.Orientation.TL_BR);
    }
}
