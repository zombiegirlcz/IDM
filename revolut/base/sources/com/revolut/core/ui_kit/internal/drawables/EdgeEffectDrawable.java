package com.revolut.core.ui_kit.internal.drawables;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/EdgeEffectDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EdgeEffectDrawable extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f55958m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f55960b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearGradient f55961c;
    public final LinearGradient d;
    public ValueAnimator e;
    public ValueAnimator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55963h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f55964j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f55965l;

    public EdgeEffectDrawable(int i, int i2) {
        this.f55959a = i;
        float f = i;
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f55961c = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, new int[]{i2, 0}, fArr, tileMode);
        this.d = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, new int[]{0, i2}, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, tileMode);
        this.f55965l = new Paint();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f55962g == 0 && this.f55963h == 0) {
            return;
        }
        int iHeight = getBounds().height();
        Rect rect = this.f55960b;
        int i = this.f55959a;
        rect.set(0, 0, i, iHeight);
        int i2 = this.f55962g;
        Paint paint = this.f55965l;
        if (i2 != 0) {
            paint.setAlpha(i2);
            paint.setShader(this.f55961c);
            canvas.drawRect(rect, paint);
        }
        if (this.f55963h != 0) {
            float fWidth = getBounds().width() - i;
            int iSave = canvas.save();
            canvas.translate(fWidth, BitmapDescriptorFactory.HUE_RED);
            try {
                paint.setAlpha(this.f55963h);
                paint.setShader(this.d);
                canvas.drawRect(rect, paint);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55965l.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55965l.setColorFilter(colorFilter);
    }
}
