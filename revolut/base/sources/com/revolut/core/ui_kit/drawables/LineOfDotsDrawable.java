package com.revolut.core.ui_kit.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import sp0.k;
import sp0.l;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/LineOfDotsDrawable;", "Landroid/graphics/drawable/Drawable;", "sp0/l", "sp0/k", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LineOfDotsDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f55773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f55774c;
    public final int d;
    public final int e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f55775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f55776h;

    public LineOfDotsDrawable(Context context, int i, l type, k orientation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f55772a = i;
        this.f55773b = type;
        this.f55774c = orientation;
        this.d = a.s(R$attr.uikit_colorGreyTone10, context);
        this.e = a.s(R$attr.uikit_colorForeground, context);
        this.f = new Paint(1);
        this.f55775g = a.l(context, 2.0f);
        this.f55776h = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.f55776h, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f.getAlpha() == 255 ? -1 : -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBoundsChange(android.graphics.Rect r23) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.drawables.LineOfDotsDrawable.onBoundsChange(android.graphics.Rect):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    public /* synthetic */ LineOfDotsDrawable(Context context, l lVar, k kVar) {
        this(context, 8, lVar, kVar);
    }
}
