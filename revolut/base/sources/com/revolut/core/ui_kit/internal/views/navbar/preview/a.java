package com.revolut.core.ui_kit.internal.views.navbar.preview;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$style;
import jh.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a extends View implements ur0.a {

    @NotNull
    public static final bu0.a Companion = new bu0.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f57428c;
    public float d;
    public final Paint e;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context initialContext, AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(initialContext, "initialContext");
        Intrinsics.checkNotNullParameter(initialContext, "<this>");
        Context context = d.g(initialContext) ? initialContext : null;
        super(context == null ? new ContextThemeWrapper(initialContext, R$style.UiKitTheme_TransparentDayNight) : context, attributeSet, i);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f57426a = kli.a.l(context2, 200.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f57427b = kli.a.l(context3, 16.0f);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f57428c = kli.a.l(context4, 16.0f);
        this.d = 1.0f;
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        this.e = paint;
    }

    public abstract float getOriginalHeight();

    public float getScalablePaddingBottom() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getScalablePaddingLeft() {
        return this.f57427b;
    }

    public float getScalablePaddingRight() {
        return this.f57428c;
    }

    public float getScalablePaddingTop() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @NotNull
    public final Paint getSilhouettePaint() {
        return this.e;
    }

    public final float getViewScale() {
        return this.d;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.f57426a;
        int size = View.MeasureSpec.getSize(View.resolveSize(rim.d.c(f), i));
        float f4 = size / f;
        this.d = f4;
        setMeasuredDimension(size, View.resolveSize(rim.d.c((getScalablePaddingBottom() + getOriginalHeight() + getScalablePaddingTop()) * f4), i2));
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Paint paint = this.e;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidate();
        }
    }
}
