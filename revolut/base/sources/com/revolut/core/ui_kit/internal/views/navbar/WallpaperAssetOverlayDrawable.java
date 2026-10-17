package com.revolut.core.ui_kit.internal.views.navbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import androidx.core.graphics.ColorUtils;
import au0.b5;
import au0.l5;
import aw0.q8;
import aw0.r8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/WallpaperAssetOverlayDrawable;", "Lcom/revolut/core/ui_kit/internal/views/navbar/WallpaperAssetDimmer;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WallpaperAssetOverlayDrawable extends WallpaperAssetDimmer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final float[] o = {1.0f, 0.991615f, 0.967585f, 0.9296f, 0.879348f, 0.818519f, 0.7488f, 0.671881f, 0.589452f, 0.5032f, 0.414815f, 0.325985f, 0.2384f, 0.153748f, 0.0737185f, BitmapDescriptorFactory.HUE_RED};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float[] f57367p = {BitmapDescriptorFactory.HUE_RED, 0.1179f, 0.2138f, 0.2912f, 0.3534f, 0.4037f, 0.4456f, 0.4824f, 0.5176f, 0.5544f, 0.5963f, 0.6466f, 0.7088f, 0.7862f, 0.8821f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57370c;
    public final float[] d;
    public final int[] e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f57371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f57372h;
    public ValueAnimator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f57373j;
    public q8 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q8 f57374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f57375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f57376n;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.navbar.WallpaperAssetOverlayDrawable$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public WallpaperAssetOverlayDrawable(Context context, float f, float f4) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57368a = kli.a.q(context) ? 0.36f : 0.3f;
        this.f57369b = kli.a.k(context, f);
        this.f57370c = kli.a.k(context, f4);
        this.d = new float[]{0.3f, 0.3825f, 0.4497f, 0.5038f, 0.5474f, 0.5826f, 0.6119f, 0.6377f, 0.6623f, 0.6881f, 0.7174f, 0.7526f, 0.7962f, 0.8503f, 0.9175f, 1.0f};
        this.e = new int[16];
        this.f = new Paint();
        this.f57371g = new Paint();
        Paint paint = new Paint(1);
        paint.setColor(0);
        this.f57372h = paint;
    }

    public final void a(r8 r8Var, boolean z) {
        if (Intrinsics.f(this.f57374l, r8Var) || !(r8Var instanceof q8)) {
            return;
        }
        this.k = this.f57374l;
        this.f57374l = (q8) r8Var;
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z || this.k == null || !this.f57376n) {
            b(1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 1));
        valueAnimatorOfFloat.addListener(new l5(this, 0));
        valueAnimatorOfFloat.start();
        this.i = valueAnimatorOfFloat;
    }

    public final void b(float f) {
        float[] fArr;
        q8 q8Var = this.f57374l;
        if (q8Var == null) {
            return;
        }
        float f4 = q8Var.f10497c;
        int iBlendARGB = q8Var.f10495a;
        int iBlendARGB2 = q8Var.f10496b;
        q8 q8Var2 = this.k;
        float f5 = this.f57368a;
        Paint paint = this.f57372h;
        if (q8Var2 == null || f >= 1.0f) {
            paint.setColor(f4 == BitmapDescriptorFactory.HUE_RED ? 0 : io0.a.d(f5 * f4, -16777216));
        } else {
            iBlendARGB2 = ColorUtils.blendARGB(q8Var2.f10496b, iBlendARGB2, f);
            iBlendARGB = ColorUtils.blendARGB(q8Var2.f10495a, iBlendARGB, f);
            float f6 = q8Var2.f10497c;
            float fA = j6.a.a(f4, f6, f, f6);
            paint.setColor(fA == BitmapDescriptorFactory.HUE_RED ? 0 : io0.a.d(f5 * fA, -16777216));
        }
        float fExactCenterX = getBounds().exactCenterX();
        float f32 = getBounds().bottom;
        float fExactCenterX2 = getBounds().exactCenterX();
        float f35 = getBounds().bottom - this.f57370c;
        int[] iArr = this.e;
        int length = iArr.length;
        int i = 0;
        while (true) {
            fArr = o;
            if (i >= length) {
                break;
            }
            iArr[i] = io0.a.d(fArr[i], iBlendARGB2);
            i++;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f57371g.setShader(new LinearGradient(fExactCenterX, f32, fExactCenterX2, f35, iArr, this.d, tileMode));
        float fExactCenterX3 = getBounds().exactCenterX();
        float f36 = getBounds().bottom;
        float fExactCenterX4 = getBounds().exactCenterX();
        float f37 = getBounds().bottom - this.f57369b;
        int length2 = iArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[i2] = io0.a.d(fArr[i2], iBlendARGB);
        }
        this.f.setShader(new LinearGradient(fExactCenterX3, f36, fExactCenterX4, f37, iArr, f57367p, tileMode));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f57376n = true;
        if (this.f57374l == null && this.k == null) {
            return;
        }
        Paint paint = this.f57372h;
        if (paint.getColor() != 0) {
            canvas.drawRect(getBounds(), paint);
        }
        if (this.f57373j) {
            q8 q8Var = this.f57374l;
            if (q8Var == null || !q8Var.d || this.f57375m) {
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, getBounds().bottom - this.f57370c, getBounds().width(), getBounds().bottom, this.f57371g);
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, getBounds().bottom - this.f57369b, getBounds().width(), getBounds().bottom, this.f);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        b(1.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f;
        int alpha = paint.getAlpha();
        Paint paint2 = this.f57371g;
        if (alpha == i && paint2.getAlpha() == i) {
            return;
        }
        paint.setAlpha(i);
        paint2.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
