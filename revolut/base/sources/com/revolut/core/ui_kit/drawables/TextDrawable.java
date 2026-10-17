package com.revolut.core.ui_kit.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sp0.o;
import sp0.p;
import yy0.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/TextDrawable;", "Landroid/graphics/drawable/Drawable;", "Lyy0/m;", "Companion", "sp0/o", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TextDrawable extends Drawable implements m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static Typeface o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Typeface f55786p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f55787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f55789c;
    public final int d;
    public boolean e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55791h;
    public int i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f55793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextPaint f55794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f55795n;
    public boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55790g = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o f55792j = o.CIRCLE;
    public final RectF k = new RectF();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.drawables.TextDrawable$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TextDrawable(Context context, CharSequence charSequence, int i, float f, float f4, int i2) {
        this.f55787a = charSequence;
        this.f55788b = f;
        this.f55789c = f4;
        this.d = i2;
        this.f55793l = a.l(context, 8.0f);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(i);
        textPaint.setFakeBoldText(this.e);
        this.f55794m = textPaint;
        this.f55795n = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
    }

    public static void c(TextDrawable textDrawable, int i) {
        o backgroundType = o.CIRCLE;
        textDrawable.getClass();
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        if (textDrawable.i == i && textDrawable.f55792j == backgroundType) {
            return;
        }
        textDrawable.i = i;
        textDrawable.f55792j = backgroundType;
        textDrawable.invalidateSelf();
    }

    @Override // yy0.m
    public final void a(int i) {
        TextPaint textPaint = this.f55794m;
        if (textPaint.getColor() != i) {
            textPaint.setColor(i);
            invalidateSelf();
        }
    }

    public final float b() {
        float f;
        int iMin = Math.min(getBounds().height(), getBounds().width());
        float f4 = this.f55789c;
        if (f4 >= BitmapDescriptorFactory.HUE_RED) {
            f = iMin;
        } else {
            int i = this.d;
            if (i == 0) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            f = (iMin * 1.0f) / i;
            f4 = this.f55788b;
        }
        return f * f4;
    }

    public final void d() {
        Typeface typefaceCreate;
        if (this.f) {
            if (this.e) {
                typefaceCreate = f55786p;
                if (typefaceCreate == null) {
                    typefaceCreate = Typeface.create("sans-serif-medium", 0);
                    f55786p = typefaceCreate;
                }
            } else {
                typefaceCreate = o;
                if (typefaceCreate == null) {
                    typefaceCreate = Typeface.create(Typeface.DEFAULT, 0);
                    o = typefaceCreate;
                }
            }
            this.f55794m.setTypeface(typefaceCreate);
            this.f = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iMin = Math.min(getBounds().height(), getBounds().width());
        d();
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f55795n;
        paint.setStyle(style);
        paint.setColor(this.i);
        if (this.i != 0) {
            int i = p.f264873a[this.f55792j.ordinal()];
            if (i == 1) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), iMin / 2.0f, paint);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                RectF rectF = this.k;
                float f = this.f55793l;
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        }
        float fB = b();
        TextPaint textPaint = this.f55794m;
        textPaint.setTextSize(fB);
        CharSequence charSequence = this.f55787a;
        if (charSequence.length() > 0) {
            float fAscent = (textPaint.ascent() + textPaint.descent()) / 2;
            int length = charSequence.length();
            float fExactCenterX = getBounds().exactCenterX();
            float fExactCenterY = getBounds().exactCenterY() - fAscent;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, length, fExactCenterX, fExactCenterY, textPaint);
        } else {
            canvas2 = canvas;
        }
        if (this.f55791h == 0 || this.f55790g == 0) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f55791h);
        int i2 = this.f55790g;
        paint.setStrokeWidth(i2 > 0 ? i2 : iMin * 0.05f);
        canvas2.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), (iMin / 2.0f) - (paint.getStrokeWidth() / 2.0f), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.f55789c >= BitmapDescriptorFactory.HUE_RED) {
            return -1;
        }
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.f55789c >= BitmapDescriptorFactory.HUE_RED) {
            return -1;
        }
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.k.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55794m.setAlpha(i);
        this.f55795n.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55794m.setColorFilter(colorFilter);
        this.f55795n.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
