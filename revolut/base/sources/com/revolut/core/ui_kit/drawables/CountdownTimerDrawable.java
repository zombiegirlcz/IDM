package com.revolut.core.ui_kit.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import ez0.d;
import java.time.Clock;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import sp0.g;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/CountdownTimerDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Ljava/lang/Runnable;", "sp0/f", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountdownTimerDrawable extends Drawable implements Animatable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f55755c;
    public final d d;
    public final float e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clock f55756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f55757h;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f55758j;
    public final RectF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f55759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f55760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f55761n;
    public final Handler o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f55762p;

    public CountdownTimerDrawable(long j2, long j3, int i, float f, d textFormat, int i2, float f4, ArrayList progressCycles, Clock clock, Context context) {
        Intrinsics.checkNotNullParameter(textFormat, "textFormat");
        Intrinsics.checkNotNullParameter(progressCycles, "progressCycles");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55753a = j2;
        this.f55754b = j3;
        this.f55755c = f;
        this.d = textFormat;
        this.e = f4;
        this.f = progressCycles;
        this.f55756g = clock;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f4);
        paint.setColor(i2);
        this.f55757h = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(f4);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.i = paint2;
        Paint paint3 = new Paint(1);
        l.d(paint3, context, R$attr.internal_textAppearanceEmphasis1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(i);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f55758j = paint3;
        this.k = new RectF();
        this.f55759l = "";
        this.f55760m = 1.0f;
        this.o = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        float fB = b();
        if (fB > BitmapDescriptorFactory.HUE_RED) {
            invalidateSelf();
            this.o.postDelayed(this, 1000L);
        } else if (fB == BitmapDescriptorFactory.HUE_RED) {
            invalidateSelf();
        }
    }

    public final float b() {
        String strV;
        long jI = f.i(this.f55753a - this.f55756g.millis(), 1L, this.f55754b);
        float f = jI / this.f55754b;
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < BitmapDescriptorFactory.HUE_RED && this.f55760m > BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.f55760m = f;
            ArrayList arrayList = this.f;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                sp0.f fVar = (sp0.f) listIterator.previous();
                if (f <= fVar.f264865a) {
                    this.i.setColor(fVar.f264866b);
                    long j2 = jI / ((long) 1000);
                    long j3 = 60;
                    long j5 = j2 / j3;
                    long j16 = j2 % j3;
                    int i = g.f264867a[this.d.ordinal()];
                    if (i == 1) {
                        strV = a0.d.v(new Object[]{Long.valueOf(j5), Long.valueOf(j16)}, 2, "%02d:%02d", "format(...)");
                    } else if (i == 2) {
                        strV = a0.d.v(new Object[]{Long.valueOf(j5), Long.valueOf(j16)}, 2, "%d:%02d", "format(...)");
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        strV = String.valueOf(j2);
                    }
                    this.f55759l = strV;
                }
            }
            throw new NoSuchElementException("List contains no element matching the predicate.");
        }
        this.f55762p = true;
        return f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.f55762p) {
            b();
        }
        float f = 360 * this.f55760m;
        Paint paint = this.f55757h;
        RectF rectF = this.k;
        canvas.drawArc(rectF, -90.0f, 360.0f, false, paint);
        canvas.drawArc(rectF, -90.0f, f, false, this.i);
        Paint paint2 = this.f55758j;
        canvas.drawText(this.f55759l, rectF.centerX(), rectF.centerY() - ((paint2.ascent() + paint2.descent()) / 2), paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.i.getAlpha() == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f55761n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        String str;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        float f = this.f55755c;
        float f4 = this.e;
        float f5 = 2;
        float fWidth = getBounds().width() - ((f + f4) * f5);
        float f6 = fWidth * fWidth;
        int i = g.f264867a[this.d.ordinal()];
        if (i == 1 || i == 2) {
            str = "00:00";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "000";
        }
        Paint paint = new Paint();
        float textSize = BitmapDescriptorFactory.HUE_RED;
        while (textSize < fWidth - 1) {
            paint.setTextSize((textSize + fWidth) / f5);
            float fMeasureText = paint.measureText(str);
            float fDescent = paint.descent() - paint.ascent();
            if ((fDescent * fDescent) + (fMeasureText * fMeasureText) <= f6) {
                textSize = paint.getTextSize();
            } else {
                fWidth = paint.getTextSize();
            }
        }
        this.f55758j.setTextSize(textSize);
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > iHeight) {
            iWidth = iHeight;
        }
        float f32 = (iWidth - f4) / 2.0f;
        RectF rectF = this.k;
        rectF.left = fCenterX - f32;
        rectF.top = fCenterY - f32;
        rectF.right = fCenterX + f32;
        rectF.bottom = fCenterY + f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.i.setAlpha(i);
        this.f55758j.setAlpha(i);
        this.f55757h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
        this.f55758j.setColorFilter(colorFilter);
        this.f55757h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z3) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f55761n) {
            return;
        }
        this.f55761n = true;
        a();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f55761n) {
            this.o.removeCallbacksAndMessages(null);
            this.f55761n = false;
        }
    }
}
