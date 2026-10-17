package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.graphics.ColorUtils;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.i1;
import jq0.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.l3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0002\u000f\u0014B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ProgressPagingIndicatorView;", "Landroid/view/View;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tintColor", "", "setTintColorInt", "(I)V", "Lms0/l3;", "model", "setModel", "(Lms0/l3;)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressPagingIndicatorView extends View implements ur0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f56316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56318c;
    public long d;
    public int e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f56319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f56320h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f56321j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f56322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f56323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f56324n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f56325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f56326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f56327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Interpolator f56328s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressPagingIndicatorView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        long j2;
        float f4;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        long j3 = this.f;
        long j5 = 0;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        float f6 = 1.0f;
        if (j3 != -1 && this.f56319g == 0) {
            f = 1.0f;
        } else if (j3 == -1 || this.f56319g == -1) {
            f = 0.0f;
        } else {
            if (this.f56316a) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j16 = jElapsedRealtime - this.f56320h;
                this.f56320h = jElapsedRealtime;
                this.f += j16;
            }
            long j22 = this.f;
            long j42 = this.f56319g;
            if (j22 > j42) {
                j22 = j42;
            }
            f = j22 / j42;
        }
        float fElapsedRealtime = this.d == 0 ? 1.0f : (SystemClock.elapsedRealtime() - this.d) / 300.0f;
        float f32 = kotlin.ranges.f.f(fElapsedRealtime, BitmapDescriptorFactory.HUE_RED, 1.0f);
        Interpolator interpolator = this.f56328s;
        float interpolation = interpolator.getInterpolation(f32);
        if (fElapsedRealtime >= 1.0f && this.e >= 0) {
            this.e = -1;
            this.d = 0L;
        }
        int i = this.f56318c;
        int i2 = 0;
        float f35 = 0.0f;
        while (i2 < i) {
            RectF rectF = this.f56327r;
            gj7.b.d(rectF);
            float f36 = i2 == this.f56317b ? interpolation : i2 == this.e ? f6 - interpolation : f5;
            int iBlendARGB = ColorUtils.blendARGB(this.f56324n, this.o, f36);
            float f37 = this.k;
            float f41 = f5;
            float f42 = this.i;
            rectF.right = i1.b(f42, f37, f36);
            rectF.bottom = i1.b(f42, this.f56322l, f36);
            Paint paint = this.f56326q;
            paint.setColor(iBlendARGB);
            float f57 = 2;
            rectF.offset((this.f56321j * (i2 <= 1 ? i2 : 1)) + f35, (getHeight() - rectF.bottom) / f57);
            float fHeight = rectF.height() / f57;
            canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
            float f69 = rectF.right;
            if (f36 <= f41) {
                j2 = j5;
                f4 = f6;
            } else {
                j2 = j5;
                float f75 = f57 * fHeight;
                float fWidth = rectF.width() * (i2 == this.f56317b ? f : f6);
                int iB = this.f56325p;
                f4 = f6;
                float f77 = fWidth / f75;
                if (f77 < f4) {
                    iB = io0.a.b(interpolator.getInterpolation(f77), iB);
                }
                if (f36 < f4) {
                    iB = io0.a.b(f36, iB);
                }
                paint.setColor(iB);
                float f81 = rectF.left;
                if (fWidth >= f75) {
                    f75 = fWidth;
                }
                rectF.right = f81 + f75;
                canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
            }
            i2++;
            f35 = f69;
            f5 = f41;
            j5 = j2;
            f6 = f4;
        }
        long j46 = j5;
        if ((!this.f56316a || this.f >= this.f56319g) && this.d <= j46) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f56318c;
        float f = this.i;
        int iC = rim.d.c(((i3 - 1) * this.f56321j) + ((i3 - 1) * f) + this.k);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            iC = Math.min(View.MeasureSpec.getSize(i), iC);
        } else if (mode == 1073741824) {
            iC = View.MeasureSpec.getSize(i);
        }
        int iC2 = rim.d.c(Math.max(f, this.f56322l));
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            iC2 = Math.min(View.MeasureSpec.getSize(i2), iC2);
        } else if (mode2 == 1073741824) {
            iC2 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(iC, iC2);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        setTintColorInt(i);
    }

    public final void setModel(@NotNull l3 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z = this.f56316a;
        boolean z3 = model.f208330a;
        long j2 = model.e;
        long j3 = model.d;
        int i = model.f208331b;
        if (z != z3 || this.f56317b != i || this.f != j3 || this.f56319g != j2) {
            int i2 = this.f56317b;
            this.f56316a = z3;
            this.f56317b = i;
            this.f = j3;
            this.f56319g = j2;
            this.f56320h = SystemClock.elapsedRealtime();
            if (i2 != this.f56317b) {
                this.e = i2;
                this.d = SystemClock.elapsedRealtime();
            }
            invalidate();
        }
        int i3 = this.f56318c;
        int i5 = model.f208332c;
        if (i3 != i5) {
            this.f56318c = i5;
            requestLayout();
        }
    }

    public final void setTintColorInt(int tintColor) {
        this.f56325p = tintColor;
        this.f56324n = io0.a.b(0.7f, tintColor);
        this.o = io0.a.b(0.4f, tintColor);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressPagingIndicatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressPagingIndicatorView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = -1;
        this.f = -1L;
        this.f56319g = -1L;
        float fL = kli.a.l(context, 4.0f);
        this.i = fL;
        this.f56321j = fL;
        this.k = kli.a.l(context, 24.0f);
        this.f56322l = kli.a.l(context, 6.0f);
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f56323m = iS;
        this.f56324n = io0.a.d(0.7f, iS);
        this.o = io0.a.d(0.4f, iS);
        this.f56325p = iS;
        this.f56326q = new Paint(1);
        this.f56327r = new RectF();
        Interpolator interpolator = r.f177392a;
        this.f56328s = r.f177392a;
    }

    public /* synthetic */ ProgressPagingIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
