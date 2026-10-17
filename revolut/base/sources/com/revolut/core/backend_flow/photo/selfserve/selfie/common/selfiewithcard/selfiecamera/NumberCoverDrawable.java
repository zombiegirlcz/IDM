package com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/backend_flow/photo/selfserve/selfie/common/selfiewithcard/selfiecamera/NumberCoverDrawable;", "Landroid/graphics/drawable/Drawable;", "core_backend_flow_photo_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NumberCoverDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f51298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f51299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f51300c;

    public NumberCoverDrawable(float f) {
        this.f51298a = f;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setMaskFilter(new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL));
        this.f51300c = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.f51299b;
        if (bitmap == null) {
            throw new IllegalStateException("shadow bitmap is null, but number covering is mandatory");
        }
        float f = getBounds().left;
        float f4 = this.f51298a;
        canvas.drawBitmap(bitmap, f - f4, getBounds().top - f4, (Paint) null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Bitmap bitmap = this.f51299b;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f51299b = null;
        int iWidth = bounds.width();
        float f = this.f51298a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((((int) f) * 2) + iWidth, (((int) f) * 2) + bounds.height(), Bitmap.Config.ARGB_8888);
        this.f51299b = bitmapCreateBitmap;
        new Canvas(bitmapCreateBitmap).drawRect(new RectF(f, f, bounds.width(), bounds.height()), this.f51300c);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
