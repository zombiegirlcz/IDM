package com.revolut.core.ui_kit.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/LoadingMapGridDrawable;", "Landroid/graphics/drawable/Drawable;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoadingMapGridDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f55777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f55779c;
    public final float d;

    public LoadingMapGridDrawable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paintC = a.c(true);
        paintC.setColor(kli.a.s(R$attr.uikit_colorGreyTone5, context));
        paintC.setStyle(Paint.Style.STROKE);
        this.f55777a = paintC;
        this.f55778b = kli.a.l(context, 16.0f);
        this.f55779c = kli.a.l(context, 0.5f);
        this.d = kli.a.l(context, 1.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f4;
        Paint paint;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f5 = this.f55778b;
        float f6 = f5 * 0.5f;
        int i = 7;
        while (true) {
            f = this.f55779c;
            f4 = this.d;
            paint = this.f55777a;
            if (f6 > fWidth) {
                break;
            }
            if (i % 8 == 0) {
                f = f4;
            }
            paint.setStrokeWidth(f);
            canvas.drawLine(f6, BitmapDescriptorFactory.HUE_RED, f6, fHeight, paint);
            f6 += f5;
            i++;
        }
        Canvas canvas2 = canvas;
        int i2 = 7;
        float f32 = 0.5f * f5;
        while (f32 <= fHeight) {
            paint.setStrokeWidth(i2 % 8 == 0 ? f4 : f);
            Canvas canvas3 = canvas2;
            canvas3.drawLine(BitmapDescriptorFactory.HUE_RED, f32, fWidth, f32, paint);
            f32 += f5;
            i2++;
            canvas2 = canvas3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55777a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55777a.setColorFilter(colorFilter);
    }
}
