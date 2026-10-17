package com.revolut.core.ui_kit_core.displayers.image.drawables;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import bz0.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rim.d;
import yp0.n;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/drawables/StaticVectorDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "ui_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StaticVectorDrawable extends LayerDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f59834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59835b;

    /* JADX WARN: Illegal instructions before constructor call */
    public StaticVectorDrawable(Drawable iconDrawable, int i, n nVar, int i2) {
        Drawable[] drawableArr;
        Intrinsics.checkNotNullParameter(iconDrawable, "iconDrawable");
        if (i == 0) {
            drawableArr = new Drawable[]{iconDrawable};
        } else {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(i);
            Unit unit = Unit.f186387a;
            drawableArr = new Drawable[]{shapeDrawable, iconDrawable};
        }
        super(drawableArr);
        this.f59834a = nVar;
        this.f59835b = i2;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f59835b;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f59835b;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int iMin = Math.min(bounds.height(), bounds.width());
        n nVar = this.f59834a;
        int i = nVar == null ? -1 : a.f19884a[nVar.ordinal()];
        float f = 0.6f;
        if (i != -1) {
            if (i == 1) {
                f = 0.4f;
            } else if (i == 2) {
                f = 0.5f;
            } else if (i != 3) {
                if (i == 4) {
                    f = 0.8f;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 1.0f;
                }
            }
        }
        float f4 = iMin * f;
        int iC = d.c(f4);
        int iC2 = d.c(f4);
        int iWidth = (bounds.width() - iC) / 2;
        int iHeight = (bounds.height() - iC2) / 2;
        setLayerInset(getNumberOfLayers() - 1, iWidth, iHeight, iWidth, iHeight);
        int iWidth2 = (bounds.width() - iMin) / 2;
        int iHeight2 = (bounds.height() - iMin) / 2;
        if (getNumberOfLayers() > 1) {
            setLayerInset(0, iWidth2, iHeight2, iWidth2, iHeight2);
        }
        super.onBoundsChange(bounds);
    }
}
