package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/WalletWidgetFooterBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletWidgetFooterBackgroundDrawable extends Drawable {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56026c;
    public final float d;
    public final Paint e;
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f56027g;

    public static final class a {
        private a() {
        }
    }

    public WalletWidgetFooterBackgroundDrawable(int i, float f, float f4, float f5, float f6) {
        this.f56024a = f;
        this.f56025b = f4;
        this.f56026c = f5;
        this.d = f6;
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        this.e = paint;
        this.f = new Path();
        this.f56027g = new RectF();
    }

    public final void a(Path path, float f, float f4, float f5, double d, double d5, boolean z) {
        float f6 = f - f5;
        float f32 = f4 - f5;
        float f35 = f + f5;
        float f36 = f4 + f5;
        RectF rectF = this.f56027g;
        rectF.set(f6, f32, f35, f36);
        double d6 = d5 - d;
        if (z && d6 < 0.0d) {
            d6 += 360.0d;
        }
        if (!z && d6 > 0.0d) {
            d6 -= 360.0d;
        }
        path.arcTo(rectF, (float) d, (float) d6, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getBounds().isEmpty()) {
            return;
        }
        canvas.drawPath(this.f, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        if (fWidth <= BitmapDescriptorFactory.HUE_RED || fHeight <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f = fWidth / 2.0f;
        float f4 = this.f56026c;
        float f5 = this.f56025b;
        float f6 = -(f5 - f4);
        float f32 = this.d;
        float f35 = f32 - f6;
        float f36 = f5 + f32;
        float fSqrt = (float) Math.sqrt((f36 * f36) - (f35 * f35));
        Path path = this.f;
        path.reset();
        float f37 = this.f56024a;
        path.moveTo(BitmapDescriptorFactory.HUE_RED, f37);
        a(path, f37, f37, f37, 180.0d, 270.0d, true);
        float f41 = f - fSqrt;
        path.lineTo(f41, BitmapDescriptorFactory.HUE_RED);
        double d = -f35;
        double d5 = fSqrt;
        double degrees = Math.toDegrees((float) Math.atan2(d, d5));
        float f42 = this.d;
        a(path, f41, f42, f42, -90.0d, degrees, true);
        double d6 = f35;
        double d10 = -fSqrt;
        a(path, f, f6, this.f56025b, Math.toDegrees((float) Math.atan2(d6, d10)), Math.toDegrees((float) Math.atan2(d6, d5)), false);
        double degrees2 = Math.toDegrees((float) Math.atan2(d, d10));
        float f57 = this.d;
        a(path, f + fSqrt, f57, f57, degrees2, -90.0d, true);
        float f69 = fWidth - f37;
        path.lineTo(f69, BitmapDescriptorFactory.HUE_RED);
        a(path, f69, f37, f37, -90.0d, 0.0d, true);
        float f75 = fHeight - f37;
        a(path, f69, f75, f37, 0.0d, 90.0d, true);
        a(path, f37, f75, f37, 90.0d, 180.0d, true);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
