package com.revolut.core.ui_kit.drawables;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.c;
import kii.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sp0.n;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/ScaledDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScaledDrawable extends RevolutDrawableWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f55780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55782c;
    public final RectF d;
    public final RectF e;
    public final Matrix f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaledDrawable(Drawable drawable, c scaleType) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f55780a = scaleType;
        this.f55781b = true;
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Matrix();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f55782c) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f);
        try {
            super.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        float fWidth;
        float fHeight;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f55782c = true;
            super.onBoundsChange(bounds);
            return;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        boolean z = intrinsicHeight == -1 || intrinsicWidth == -1;
        this.f55782c = z;
        if (z) {
            super.onBoundsChange(bounds);
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float f = intrinsicWidth;
        float f4 = intrinsicHeight;
        RectF rectF = this.d;
        float fWidth2 = BitmapDescriptorFactory.HUE_RED;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f4);
        RectF rectF2 = this.e;
        rectF2.set(bounds);
        Matrix matrix = this.f;
        matrix.reset();
        int i = n.f264872a[this.f55780a.ordinal()];
        if (i == 1) {
            if (rectF2.height() * rectF.width() > rectF.height() * rectF2.width()) {
                fWidth = rectF2.height() / rectF.height();
                fWidth2 = (rectF2.width() - (rectF.width() * fWidth)) * 0.5f;
                fHeight = 0.0f;
            } else {
                fWidth = rectF2.width() / rectF.width();
                fHeight = (rectF2.height() - (rectF.height() * fWidth)) * 0.5f;
            }
            matrix.setScale(fWidth, fWidth);
            matrix.postTranslate(fWidth2, fHeight);
            return;
        }
        if (i == 2) {
            matrix.setTranslate((rectF2.width() - rectF.width()) * 0.5f, (rectF2.height() - rectF.height()) * 0.5f);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            float fWidth3 = rectF2.width() / f;
            matrix.setScale(fWidth3, fWidth3);
            return;
        }
        float fMin = (f > rectF2.width() || f4 > rectF2.height()) ? Math.min(rectF2.width() / f, rectF2.height() / f4) : 1.0f;
        float fA = e.a(f, fMin, rectF2.width(), 0.5f);
        float fA2 = e.a(f4, fMin, rectF2.height(), 0.5f);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate(fA, fA2);
    }

    @Override // android.graphics.drawable.DrawableWrapper
    public final void setDrawable(Drawable drawable) {
        if (this.f55781b) {
            throw new IllegalStateException();
        }
        super.setDrawable(drawable);
    }
}
