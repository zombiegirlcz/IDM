package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import ct0.c0;
import ct0.u;
import ct0.w;
import ct0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.f5;
import ms0.i5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0002\u000b\u0011B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ToleranceLevelCompactView;", "Landroid/view/View;", "Lts0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lms0/i5;", "model", "", "setModel", "(Lms0/i5;)V", "Lct0/c0;", "a", "Lct0/c0;", "getChartDrawer", "()Lct0/c0;", "chartDrawer", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ToleranceLevelCompactView extends View implements ts0.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final c0 chartDrawer;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f56459c;
    public final RectF d;
    public final RectF e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f56460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f56461h;
    public final float[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f56462j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f56463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f56464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RectF f56465n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i5 f56466p;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToleranceLevelCompactView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        boolean z = this.o;
        RectF rectF = this.e;
        RectF rectF2 = this.d;
        Paint paint = this.f56462j;
        RectF rectF3 = this.f56459c;
        Paint paint2 = this.f56464m;
        RectF rectF4 = this.f56465n;
        if (z && z) {
            rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            float f4 = rectF4.bottom;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, this.f56461h, this.i, tileMode));
            paint2.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectF4.bottom, this.f56463l, this.i, tileMode));
            if (rectF4.width() <= BitmapDescriptorFactory.HUE_RED || rectF4.height() <= BitmapDescriptorFactory.HUE_RED || this.f56466p.f208293b <= BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            } else {
                float fHeight = rectF4.height();
                float f5 = this.f56458b;
                float f6 = fHeight - (2 * f5);
                float f32 = (f6 - (kotlin.ranges.f.f(this.f56466p.f208293b, BitmapDescriptorFactory.HUE_RED, 1.0f) * f6)) / 2.0f;
                float f35 = rectF4.left + f5;
                float f36 = this.k;
                f = 0.0f;
                rectF3.set(f35 + f36, rectF4.top + f32 + f5, (rectF4.right - f5) - f36, (rectF4.bottom - f32) - f5);
                if (this.f56466p.f208293b < 1.0f) {
                    rectF2.set(rectF4.left + f5 + f36, rectF4.top + f5, (rectF4.right - f5) - f36, f32 - f5);
                    float f37 = rectF4.left + f5 + f36;
                    float f41 = rectF4.bottom;
                    rectF.set(f37, (f41 - f32) + f5, (rectF4.right - f5) - f36, f41 - f5);
                }
            }
            this.o = false;
        } else {
            f = 0.0f;
        }
        if (rectF4.width() <= f || rectF4.height() <= f) {
            return;
        }
        canvas.drawRect(rectF4, paint);
        float f42 = rectF4.left;
        canvas.drawLine(f42, rectF4.top, f42, rectF4.bottom, paint2);
        float f57 = rectF4.right;
        canvas.drawLine(f57, rectF4.top, f57, rectF4.bottom, paint2);
        if (this.f56466p.f208293b <= f) {
            return;
        }
        c0 c0VarM3746getChartDrawer = m3746getChartDrawer();
        if (!rectF3.isEmpty()) {
            z.b(c0VarM3746getChartDrawer, canvas, rectF3, this.f, null, w.BODY, null, 52);
        }
        if (this.f56466p.f208293b >= 1.0f) {
            return;
        }
        u uVar = u.UP;
        w wVar = w.BODY;
        c0VarM3746getChartDrawer.f(canvas, rectF2, this.f56460g, uVar, wVar);
        c0VarM3746getChartDrawer.f(canvas, rectF, this.f56460g, u.DOWN, wVar);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.o = true;
    }

    public final void setModel(@NotNull i5 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f56466p, model)) {
            return;
        }
        this.f56466p = model;
        this.o = true;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f = kli.a.s(this.f56466p.f208292a.a(), context);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToleranceLevelCompactView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getChartDrawer, reason: from getter and merged with bridge method [inline-methods] */
    public c0 m3746getChartDrawer() {
        return this.chartDrawer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToleranceLevelCompactView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chartDrawer = new c0(context, this);
        this.f56458b = kli.a.k(context, 2.0f);
        this.f56459c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f56460g = io0.a.d(0.1f, kli.a.s(R$attr.uikit_colorForeground, context));
        int iD = io0.a.d(0.05f, kli.a.s(R$attr.uikit_colorForeground, context));
        int iS = kli.a.s(R$attr.uikit_colorTransparent, context);
        this.f56461h = new int[]{iS, iD, iS};
        this.i = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f56462j = paint;
        float fK = kli.a.k(context, 2.0f);
        this.k = fK;
        this.f56463l = new int[]{iS, kli.a.s(R$attr.uikit_colorForeground_20, context), iS};
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fK);
        this.f56464m = paint2;
        this.f56465n = new RectF();
        this.o = true;
        this.f56466p = new i5(f5.f208252a, BitmapDescriptorFactory.HUE_RED);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f = kli.a.s(this.f56466p.f208292a.a(), context2);
    }

    public /* synthetic */ ToleranceLevelCompactView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
