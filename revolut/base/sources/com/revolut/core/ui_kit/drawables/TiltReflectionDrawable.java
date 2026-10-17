package com.revolut.core.ui_kit.drawables;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/TiltReflectionDrawable;", "Landroid/graphics/drawable/Drawable;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TiltReflectionDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55796a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f55798c;
    public float d;
    public final Paint e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f55799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f55800h;
    public final Path i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f55801j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f55802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Matrix f55803m;

    public TiltReflectionDrawable(float f, float f4, float f5) {
        this.f55797b = f;
        this.f55798c = f4;
        this.d = f5;
        Paint paint = new Paint(5);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(f, blur));
        this.e = paint;
        float f6 = f / 3;
        this.f = f6;
        Paint paint2 = new Paint(5);
        paint2.setStyle(style);
        paint2.setStrokeWidth(f6);
        paint2.setMaskFilter(new BlurMaskFilter(f6, blur));
        this.f55799g = paint2;
        this.f55800h = new Path();
        this.i = new Path();
        this.k = true;
        this.f55802l = new RectF();
        this.f55803m = new Matrix();
    }

    public final void a(float f) {
        this.f55801j = f.f(f % 360.0f, BitmapDescriptorFactory.HUE_RED, 360.0f);
        this.k = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f = this.f55797b;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        boolean z = this.k;
        Paint paint = this.e;
        Paint paint2 = this.f55799g;
        Path path = this.i;
        Path path2 = this.f55800h;
        if (z) {
            RectF rectF = this.f55802l;
            if (rectF.width() <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
                path2.reset();
                path.reset();
                paint.setShader(null);
                paint2.setShader(null);
            } else {
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                int[] iArr = {0, this.f55796a, 0};
                float f5 = (1.0f - f.f(this.f55798c, 0.01f, 0.99f)) / 2.0f;
                float f6 = 0.5f - f5;
                if (f6 >= BitmapDescriptorFactory.HUE_RED) {
                    f4 = f6;
                }
                float f32 = f5 + 0.5f;
                SweepGradient sweepGradient = new SweepGradient(fCenterX, fCenterY, iArr, new float[]{f4, 0.5f, f32 <= 1.0f ? f32 : 1.0f});
                float f35 = this.f55801j - 180.0f;
                Matrix matrix = this.f55803m;
                matrix.setRotate(f35, fCenterX, fCenterY);
                sweepGradient.setLocalMatrix(matrix);
                paint.setShader(sweepGradient);
                paint2.setShader(sweepGradient);
            }
            this.k = false;
        }
        if (!path2.isEmpty()) {
            canvas.drawPath(path2, paint);
        }
        if (path.isEmpty()) {
            return;
        }
        canvas.drawPath(path, paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        RectF rectF = this.f55802l;
        rectF.set(bounds);
        Path path = this.f55800h;
        path.reset();
        float f = this.f55797b / 2.0f;
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(f, f);
        float f4 = this.d - f;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            f4 = 0.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, f4, f4, direction);
        Path path2 = this.i;
        path2.reset();
        float f6 = this.f / 2.0f;
        RectF rectF3 = new RectF(rectF);
        rectF3.inset(f6, f6);
        float f32 = this.d - f6;
        if (f32 >= BitmapDescriptorFactory.HUE_RED) {
            f5 = f32;
        }
        path2.addRoundRect(rectF3, f5, f5, direction);
        this.k = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
        this.f55799g.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        this.f55799g.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
