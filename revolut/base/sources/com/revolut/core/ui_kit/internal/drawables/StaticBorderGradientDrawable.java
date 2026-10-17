package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import dr0.q;
import dr0.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/StaticBorderGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StaticBorderGradientDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8g.a f56014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f56015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f56016c;
    public final GradientDrawable.Orientation d;
    public final RectF e;
    public final Paint f;

    public StaticBorderGradientDrawable(c8g.a shapeType, int[] gradientColors, float[] fArr, GradientDrawable.Orientation gradientOrientation) {
        Intrinsics.checkNotNullParameter(shapeType, "shapeType");
        Intrinsics.checkNotNullParameter(gradientColors, "gradientColors");
        Intrinsics.checkNotNullParameter(gradientOrientation, "gradientOrientation");
        this.f56014a = shapeType;
        this.f56015b = gradientColors;
        this.f56016c = fArr;
        this.d = gradientOrientation;
        this.e = new RectF();
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(shapeType.s());
        this.f = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        c8g.a aVar = this.f56014a;
        boolean z = aVar instanceof r;
        Paint paint = this.f;
        RectF rectF = this.e;
        if (z) {
            float f = ((r) aVar).f117061a;
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            if (!(aVar instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            canvas.drawOval(rectF, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        RectF rectF = this.e;
        rectF.set(bounds);
        c8g.a aVar = this.f56014a;
        float f = 2;
        rectF.inset(aVar.s() / f, aVar.s() / f);
        bq0.a aVarV = ta6.a.V(this.d, rectF.width(), rectF.height());
        this.f.setShader(new LinearGradient(aVarV.f17660a, aVarV.f17661b, aVarV.f17662c, aVarV.d, this.f56015b, this.f56016c, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }
}
