package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/BottomAnchoredGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BottomAnchoredGradientDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GradientDrawable.Orientation f55936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f55937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f55938c;
    public int[] d;
    public final float[] e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55939g;

    public BottomAnchoredGradientDrawable(float[] fArr, int[] gradientColors) {
        GradientDrawable.Orientation gradientOrientation = GradientDrawable.Orientation.TOP_BOTTOM;
        Intrinsics.checkNotNullParameter(gradientColors, "gradientColors");
        Intrinsics.checkNotNullParameter(gradientOrientation, "gradientOrientation");
        this.f55936a = gradientOrientation;
        this.f55937b = new Paint(1);
        this.f55938c = new Rect();
        int[] iArrCopyOf = Arrays.copyOf(gradientColors, gradientColors.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.d = iArrCopyOf;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        this.e = fArrCopyOf;
    }

    public final void a(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (this.f == i && this.f55939g == i2) {
            return;
        }
        this.f = i;
        this.f55939g = i2;
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        b(bounds, true);
        invalidateSelf();
    }

    public final void b(Rect rect, boolean z) {
        int i;
        boolean zIsEmpty = rect.isEmpty();
        Paint paint = this.f55937b;
        Rect rect2 = this.f55938c;
        if (zIsEmpty || (i = this.f) == 0) {
            rect2.setEmpty();
            paint.setShader(null);
            return;
        }
        int i2 = rect.bottom - this.f55939g;
        int i3 = i2 - i;
        if (!z && paint.getShader() != null && rect2.left == rect.left && rect2.top == i3 && rect2.right == rect.right && rect2.bottom == i2) {
            return;
        }
        rect2.set(rect.left, i3, rect.right, i2);
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        GradientDrawable.Orientation orientation = this.f55936a;
        Intrinsics.checkNotNullParameter(orientation, "<this>");
        bq0.a aVarV = ta6.a.V(orientation, iWidth, iHeight);
        float f = rect2.left;
        float f4 = f + aVarV.f17660a;
        float f5 = rect2.top;
        paint.setShader(new LinearGradient(f4, f5 + aVarV.f17661b, f + aVarV.f17662c, f5 + aVarV.d, this.d, this.e, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.f55937b;
        if (paint.getShader() != null) {
            Rect rect = this.f55938c;
            if (rect.isEmpty()) {
                return;
            }
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        b(bounds, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55937b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55937b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
