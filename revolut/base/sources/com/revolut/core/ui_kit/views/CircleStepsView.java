package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R*\u0010\u0019\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/revolut/core/ui_kit/views/CircleStepsView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "a", "I", "getTotalStepsCount", "()I", "setTotalStepsCount", "(I)V", "totalStepsCount", "b", "getFilledStepsCount", "setFilledStepsCount", "filledStepsCount", "c", "getCircleColor", "setCircleColor", "circleColor", "d", "getFilledCircleTickColor", "setFilledCircleTickColor", "filledCircleTickColor", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleStepsView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int totalStepsCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int filledStepsCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int circleColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int filledCircleTickColor;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f58487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f58488h;
    public final Drawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f58489j;
    public final Paint k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleStepsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static int a(int i) {
        return (int) Math.rint(i * Resources.getSystem().getDisplayMetrics().density);
    }

    public final int getCircleColor() {
        return this.circleColor;
    }

    public final int getFilledCircleTickColor() {
        return this.filledCircleTickColor;
    }

    public final int getFilledStepsCount() {
        return this.filledStepsCount;
    }

    public final int getTotalStepsCount() {
        return this.totalStepsCount;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i2 = this.e;
        float f4 = 0.5f;
        int i3 = this.f;
        float f5 = (i2 * 0.5f) - i3;
        float paddingTop = getPaddingTop() + f5 + i3;
        int i5 = this.circleColor;
        Paint paint = this.f58489j;
        paint.setColor(i5);
        int i6 = this.circleColor;
        Paint paint2 = this.k;
        paint2.setColor(i6);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setTint(this.filledCircleTickColor);
        }
        int i21 = this.totalStepsCount;
        int i22 = 0;
        while (i22 < i21) {
            float paddingLeft = ((this.f58488h + i2) * i22) + f5 + getPaddingLeft() + i3;
            boolean z = i22 < this.filledStepsCount;
            canvas.drawCircle(paddingLeft, paddingTop, f5, z ? paint2 : paint);
            if (!z || drawable == null) {
                f = f4;
                i = i22;
            } else {
                f = f4;
                i = i22;
                int iRint = (int) Math.rint(paddingLeft - (r14 * f));
                int iRint2 = (int) Math.rint(paddingTop - (r15 * f));
                DrawableKt.updateBounds(drawable, iRint, iRint2, drawable.getIntrinsicWidth() + iRint, drawable.getIntrinsicHeight() + iRint2);
                drawable.draw(canvas);
            }
            i22 = i + 1;
            f4 = f;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.totalStepsCount == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.e;
        int i5 = paddingBottom + i3;
        int i6 = this.totalStepsCount;
        int i21 = this.f58487g;
        int iA = ehe.n.a(i6, i3, (i6 - 1) * i21, paddingRight);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iA);
        } else if (mode != 1073741824) {
            size = iA;
        }
        int i22 = this.totalStepsCount;
        if (i22 > 1) {
            this.f58488h = Math.max(0, i21 - Math.max(0, (iA - size) / (i22 - 1)));
        }
        setMeasuredDimension(size, i5);
    }

    public final void setCircleColor(int i) {
        this.circleColor = i;
        invalidate();
    }

    public final void setFilledCircleTickColor(int i) {
        this.filledCircleTickColor = i;
        invalidate();
    }

    public final void setFilledStepsCount(int i) {
        int i2 = this.totalStepsCount;
        int i3 = this.filledStepsCount;
        if (i3 < 0 || i3 > i2) {
            throw new IllegalArgumentException("filledStepsCount must be in range [0,totalStepsCount]");
        }
        this.filledStepsCount = i;
        invalidate();
    }

    public final void setTotalStepsCount(int i) {
        int i2 = this.totalStepsCount;
        if (i2 < 0 || i2 >= 8) {
            throw new IllegalArgumentException("totalStepsCount must be in range [0,7]");
        }
        this.totalStepsCount = i;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleStepsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleStepsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.totalStepsCount = 4;
        this.circleColor = kli.a.s(R$attr.uikit_colorBlack, context);
        this.filledCircleTickColor = kli.a.s(R$attr.uikit_colorWhite, context);
        this.e = a(28);
        int iA = a(1);
        this.f = iA;
        int iA2 = a(8);
        this.f58487g = iA2;
        this.f58488h = iA2;
        Drawable drawable = ContextCompat.getDrawable(context, R$drawable.internal_circle_steps_tick);
        this.i = drawable != null ? drawable.mutate() : null;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        float f = iA;
        paint.setStrokeWidth(f);
        paint.setAntiAlias(true);
        this.f58489j = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setStrokeWidth(f);
        paint2.setAntiAlias(true);
        this.k = paint2;
    }

    public /* synthetic */ CircleStepsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
