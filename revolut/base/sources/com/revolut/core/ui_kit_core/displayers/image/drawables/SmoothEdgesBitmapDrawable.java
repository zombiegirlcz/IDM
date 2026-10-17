package com.revolut.core.ui_kit_core.displayers.image.drawables;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yy0.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/drawables/SmoothEdgesBitmapDrawable;", "Landroid/graphics/drawable/Drawable;", "Lyy0/c;", "ui_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmoothEdgesBitmapDrawable extends Drawable implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f59829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f59830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f59831c;
    public final RectF d;
    public final Matrix e;
    public Bitmap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f59832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f59833h;
    public final float i;

    public SmoothEdgesBitmapDrawable(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f59829a = bitmap;
        this.f59830b = new Paint(3);
        this.f59831c = new Path();
        this.d = new RectF();
        this.e = new Matrix();
        this.f59832g = new Paint(1);
        this.i = 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.f59831c;
        if (path.isEmpty()) {
            return;
        }
        canvas.drawPath(path, this.f59830b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        float fWidth;
        float fA;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        if (bounds.isEmpty()) {
            return;
        }
        RectF rectF = this.d;
        rectF.set(bounds);
        Path path = this.f59831c;
        path.reset();
        float f = this.f59833h;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f = null;
        int iWidth = (int) rectF.width();
        int iHeight = (int) rectF.height();
        if (iWidth > 0 && iHeight > 0) {
            this.f = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ALPHA_8);
            Bitmap bitmap2 = this.f;
            Intrinsics.h(bitmap2);
            Canvas canvas = new Canvas(bitmap2);
            Paint paint = this.f59832g;
            paint.setXfermode(null);
            paint.setShader(null);
            paint.setColor(-16777216);
            float f4 = iWidth;
            float f5 = iHeight;
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, f5, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            float fMin = Math.min(iWidth, iHeight) / 2.0f;
            float f6 = this.i;
            float f32 = f6 > fMin ? fMin : f6;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f35 = f32;
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f35, 0, -16777216, tileMode));
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, f35, paint);
            float f36 = f5 - f35;
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, f36, BitmapDescriptorFactory.HUE_RED, f5, -16777216, 0, tileMode));
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f36, f4, f5, paint);
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f35, BitmapDescriptorFactory.HUE_RED, 0, -16777216, tileMode));
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f35, f5, paint);
            float f37 = f4 - f35;
            paint.setShader(new LinearGradient(f37, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, -16777216, 0, tileMode));
            canvas.drawRect(f37, BitmapDescriptorFactory.HUE_RED, f4, f5, paint);
        }
        float fWidth2 = rectF.width();
        float f41 = BitmapDescriptorFactory.HUE_RED;
        Paint paint2 = this.f59830b;
        if (fWidth2 <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
            paint2.setShader(null);
            return;
        }
        Bitmap bitmap3 = this.f;
        if (bitmap3 == null) {
            return;
        }
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(this.f59829a, tileMode2, tileMode2);
        if (rectF.height() * r7.getWidth() > rectF.width() * r7.getHeight()) {
            fWidth = rectF.height() / r7.getHeight();
            float fA2 = e.a(r7.getWidth(), fWidth, rectF.width(), 0.5f);
            fA = 0.0f;
            f41 = fA2;
        } else {
            fWidth = rectF.width() / r7.getWidth();
            fA = e.a(r7.getHeight(), fWidth, rectF.height(), 0.5f);
        }
        Matrix matrix = this.e;
        matrix.setScale(fWidth, fWidth);
        matrix.postTranslate(f41 + rectF.left, fA + rectF.top);
        bitmapShader.setLocalMatrix(matrix);
        paint2.setShader(new ComposeShader(bitmapShader, new BitmapShader(bitmap3, tileMode2, tileMode2), PorterDuff.Mode.DST_IN));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f59830b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f59830b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
