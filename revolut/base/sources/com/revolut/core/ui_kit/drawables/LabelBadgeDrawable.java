package com.revolut.core.ui_kit.drawables;

import a0.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$dimen;
import jb3.l;
import kli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import sp0.h;
import sp0.i;
import sp0.j;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/LabelBadgeDrawable;", "Landroid/graphics/drawable/Drawable;", "Companion", "sp0/h", "sp0/j", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LabelBadgeDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f55769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f55770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f55771c;
    public final RectF d;
    public final float e;
    public final String f;

    public LabelBadgeDrawable(Context context, h type, j widthMode, String text) {
        int i;
        int i2;
        int i3;
        int i5;
        int i6;
        int i21;
        int i22;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(text, "text");
        TextPaint textPaint = new TextPaint();
        int[] iArr = i.f264869b;
        int i32 = iArr[type.ordinal()];
        if (i32 == 1) {
            i = R$attr.internal_textAppearanceEmphasis4;
        } else if (i32 == 2) {
            i = R$attr.internal_textAppearanceBody3;
        } else {
            if (i32 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceEmphasis4;
        }
        l.d(textPaint, context, i);
        int i33 = iArr[type.ordinal()];
        if (i33 == 1 || i33 == 2) {
            i2 = R$attr.uikit_colorBackground;
        } else {
            if (i33 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$attr.uikit_colorGreyTone50;
        }
        textPaint.setColor(a.s(i2, context));
        textPaint.setAntiAlias(true);
        this.f55769a = textPaint;
        Paint paint = new Paint();
        int i43 = iArr[type.ordinal()];
        if (i43 == 1 || i43 == 2) {
            i3 = R$attr.uikit_colorForeground_80;
        } else {
            if (i43 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R$attr.uikit_colorGreyTone8;
        }
        paint.setColor(a.s(i3, context));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f55770b = paint;
        Rect rect = new Rect();
        this.f55771c = rect;
        this.d = new RectF();
        Resources resources = context.getResources();
        int i59 = iArr[type.ordinal()];
        if (i59 == 1 || i59 == 2) {
            i5 = R$dimen.internal_label_badge_background_corner_radius_default;
        } else {
            if (i59 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = R$dimen.internal_label_badge_background_corner_radius_inline;
        }
        this.e = resources.getDimensionPixelSize(i5);
        int i66 = i.f264868a[widthMode.ordinal()];
        if (i66 == 1) {
            i6 = 6;
        } else {
            if (i66 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i6 = 16;
        }
        text = text.length() > i6 ? d.r(f0.U0(i6, text), "…") : text;
        this.f = text;
        int i74 = iArr[type.ordinal()];
        if (i74 == 1) {
            i21 = R$attr.uikit_dp2;
        } else if (i74 == 2) {
            i21 = R$attr.uikit_dp8;
        } else {
            if (i74 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i21 = R$attr.uikit_dp4;
        }
        int iW = a.w(i21, context);
        int i92 = iArr[type.ordinal()];
        if (i92 == 1) {
            i22 = R$attr.uikit_dp1;
        } else if (i92 == 2) {
            i22 = R$attr.uikit_dp4;
        } else {
            if (i92 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i22 = R$attr.uikit_dp2;
        }
        int iW2 = a.w(i22, context);
        textPaint.getTextBounds(text, 0, text.length(), rect);
        int iWidth = (iW * 2) + rect.width();
        int iHeight = (iW2 * 2) + rect.height();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.internal_label_badge_min_size);
        setBounds(0, 0, Math.max(iWidth, dimensionPixelSize), Math.max(iHeight, dimensionPixelSize));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        float f = bounds.left;
        float f4 = bounds.top;
        float f5 = bounds.right;
        float f6 = bounds.bottom;
        RectF rectF = this.d;
        rectF.set(f, f4, f5, f6);
        float f32 = this.e;
        canvas.drawRoundRect(rectF, f32, f32, this.f55770b);
        float fWidth = ((bounds.width() - this.f55771c.width()) / 2.0f) + bounds.left;
        float fCenterY = bounds.centerY();
        TextPaint textPaint = this.f55769a;
        canvas.drawText(this.f, fWidth, fCenterY - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55769a.setAlpha(i);
        this.f55770b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55769a.setColorFilter(colorFilter);
        this.f55770b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
