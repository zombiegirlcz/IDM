package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/LinearTrackingProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconResId", "", "setIcon", "(I)V", "progressColorAttr", "trackColorAttr", "iconColorAttr", "setColors", "(III)V", "", "value", "h", "F", "getProgress", "()F", "setProgress", "(F)V", "progress", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinearTrackingProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56253c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f56254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float progress;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f56256j;
    public final Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f56257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f56258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f56259n;
    public Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f56260p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearTrackingProgressBar(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(float f, float f4, Canvas canvas, float f5) {
        float f6 = (f4 - f) - this.f56251a;
        if (f6 < BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f32 = (f6 % this.f56254g) / 2.0f;
        canvas.drawLine(f + f32, f5, f4 - f32, f5, this.i);
    }

    public final void b(Canvas canvas, float f, float f4) {
        Drawable drawable = this.f56260p;
        if (drawable != null) {
            float f5 = this.f56253c;
            drawable.setBounds(rim.d.c(f - f5), rim.d.c(f4 - f5), rim.d.c(f + f5), rim.d.c(f4 + f5));
            drawable.draw(canvas);
        }
    }

    public final void c(float f, float f4, Canvas canvas, float f5) {
        float f6 = f4 - f;
        float f32 = this.f56251a;
        if (f6 < f32) {
            return;
        }
        float f35 = f32 / 2.0f;
        canvas.drawLine(f + f35, f5, f4 - f35, f5, this.f56256j);
    }

    public final float getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        boolean z = getParent().getLayoutDirection() == 1;
        float height = getHeight() / 2.0f;
        float f = this.f56252b;
        float f4 = this.d;
        float f5 = f + f4;
        float f6 = this.e;
        float f32 = f + f6;
        float f35 = this.f56253c;
        float width = z ? getWidth() - f35 : f35;
        float width2 = z ? f35 : getWidth() - f35;
        float f36 = this.progress;
        Paint paint = this.f56258m;
        Paint paint2 = this.f56259n;
        float f37 = this.f;
        if (f36 == BitmapDescriptorFactory.HUE_RED) {
            b(canvas, width, height);
            a(f32, getWidth() - f32, canvas, height);
            canvas.drawCircle(width2, height, f35, paint2);
            canvas.drawCircle(width2, height, f37, paint);
            return;
        }
        Paint paint3 = this.k;
        boolean z3 = z;
        Paint paint4 = this.f56257l;
        if (f36 == 1.0f) {
            canvas.drawCircle(width, height, f35, paint4);
            canvas.drawCircle(width, height, f37, paint3);
            c(f5, getWidth() - f5, canvas, height);
            b(canvas, width2, height);
            return;
        }
        canvas.drawCircle(width, height, f35, paint4);
        canvas.drawCircle(width, height, f37, paint3);
        float width3 = ((getWidth() - (2 * f5)) * (z3 ? 1.0f - this.progress : this.progress)) + f5;
        if (z3) {
            c(width3 + f35 + f4, getWidth() - f5, canvas, height);
        } else {
            c(f5, (width3 - f35) - f4, canvas, height);
        }
        b(canvas, width3, height);
        if (z3) {
            a(f32, (width3 - f35) - f6, canvas, height);
        } else {
            a(width3 + f35 + f6, getWidth() - f32, canvas, height);
        }
        canvas.drawCircle(width2, height, f35, paint2);
        canvas.drawCircle(width2, height, f37, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iC = rim.d.c((3 * this.f56252b) + (this.d * 2));
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            iC = Math.min(View.MeasureSpec.getSize(i), iC);
        } else if (mode == 1073741824) {
            iC = View.MeasureSpec.getSize(i);
        }
        int iCeil = (int) Math.ceil(r2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            iCeil = Math.min(View.MeasureSpec.getSize(i2), iCeil);
        } else if (mode2 == 1073741824) {
            iCeil = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(iC, iCeil);
    }

    public final void setColors(int progressColorAttr, int trackColorAttr, int iconColorAttr) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(progressColorAttr, context);
        this.f56256j.setColor(iS);
        this.k.setColor(iS);
        Paint paint = this.f56257l;
        paint.setColor(iS);
        paint.setAlpha(25);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS2 = kli.a.s(trackColorAttr, context2);
        this.i.setColor(iS2);
        this.f56258m.setColor(iS2);
        Paint paint2 = this.f56259n;
        paint2.setColor(iS2);
        paint2.setAlpha(25);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iS3 = kli.a.s(iconColorAttr, context3);
        Drawable drawable = this.f56260p;
        if (drawable != null) {
            drawable.setTint(iS3);
        }
        this.o = Integer.valueOf(iS3);
        invalidate();
    }

    public final void setIcon(int iconResId) {
        Drawable drawableMutate;
        Drawable drawable = getContext().getDrawable(iconResId);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            drawableMutate = null;
        } else {
            Integer num = this.o;
            if (num != null) {
                drawableMutate.setTint(num.intValue());
            }
        }
        this.f56260p = drawableMutate;
        invalidate();
    }

    public final void setProgress(float f) {
        this.progress = kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearTrackingProgressBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearTrackingProgressBar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float fL = kli.a.l(context, 4.0f);
        this.f56251a = fL;
        this.f56252b = kli.a.l(context, 16.0f);
        this.f56253c = kli.a.l(context, 8.0f);
        this.d = kli.a.l(context, 8.0f);
        this.e = kli.a.l(context, 6.0f);
        this.f = kli.a.l(context, 4.0f);
        float f = fL * 2.0f;
        this.f56254g = f;
        Paint paint = new Paint(1);
        float f4 = fL / 2.0f;
        Path path = new Path();
        path.addCircle(f4, BitmapDescriptorFactory.HUE_RED, f4, Path.Direction.CCW);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(fL);
        paint.setPathEffect(new PathDashPathEffect(path, f, BitmapDescriptorFactory.HUE_RED, PathDashPathEffect.Style.TRANSLATE));
        this.i = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(fL);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.f56256j = paint2;
        this.k = new Paint(1);
        this.f56257l = new Paint(1);
        this.f56258m = new Paint(1);
        this.f56259n = new Paint(1);
    }

    public /* synthetic */ LinearTrackingProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
