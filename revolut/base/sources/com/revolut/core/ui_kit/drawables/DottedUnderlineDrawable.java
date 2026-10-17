package com.revolut.core.ui_kit.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/DottedUnderlineDrawable;", "Landroid/graphics/drawable/Drawable;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DottedUnderlineDrawable extends Drawable {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f55763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f55765c;

    public static final class a {
        private a() {
        }
    }

    public DottedUnderlineDrawable(Context context) {
        int iS = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        Intrinsics.checkNotNullParameter(context, "context");
        float fL = kli.a.l(context, 1.5f);
        this.f55763a = fL;
        float fL2 = kli.a.l(context, 2.0f);
        this.f55764b = (int) kli.a.l(context, 2.0f);
        Paint paint = new Paint(1);
        paint.setColor(iS);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fL);
        float f = fL / 2.0f;
        Path path = new Path();
        path.addCircle(f, BitmapDescriptorFactory.HUE_RED, f, Path.Direction.CCW);
        paint.setPathEffect(new PathDashPathEffect(path, fL + fL2, BitmapDescriptorFactory.HUE_RED, PathDashPathEffect.Style.TRANSLATE));
        this.f55765c = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float fHeight = getBounds().height() / 2.0f;
        canvas.drawLine(this.f55763a / 2.0f, fHeight, getBounds().width(), fHeight, this.f55765c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f55764b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55765c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55765c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
