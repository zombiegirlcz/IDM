package com.revolut.core.ui_kit.internal.drawables;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/TransitionColorDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransitionColorDrawable extends Drawable {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f56022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f56023c;

    public TransitionColorDrawable(int i) {
        this.f56021a = i;
        Paint paint = new Paint(1);
        this.f56022b = paint;
        paint.setColor(this.f56021a);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawColor(this.f56022b.getColor());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return Color.alpha(this.f56021a) == 255 ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f56022b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f56022b.setColorFilter(colorFilter);
    }
}
