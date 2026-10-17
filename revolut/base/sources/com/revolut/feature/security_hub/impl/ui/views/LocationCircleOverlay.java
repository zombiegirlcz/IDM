package com.revolut.feature.security_hub.impl.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mwc.a;
import mwc.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/views/LocationCircleOverlay;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmwc/a;", "state", "", "setState", "(Lmwc/a;)V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocationCircleOverlay extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f85771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f85772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f85773c;
    public final Paint d;
    public final Paint e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationCircleOverlay(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.f85771a;
        float fMin = (Math.min(getWidth(), getHeight()) / 2.0f) - (2 * f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawCircle(width, height, fMin, this.f85772b);
        canvas.drawCircle(width, height, fMin, this.e);
        float f4 = 4;
        canvas.drawCircle(width, height, f4 * f, this.f85773c);
        canvas.drawCircle(width, height, f4 * f, this.d);
    }

    public final void setState(@NotNull a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = b.f209422a[state.ordinal()];
        Paint paint = this.d;
        Paint paint2 = this.e;
        Paint paint3 = this.f85773c;
        Paint paint4 = this.f85772b;
        if (i == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            paint4.setColor(kli.a.s(R$attr.uikit_colorStatusSuccess_10, context));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            paint3.setColor(kli.a.s(R$attr.uikit_colorStatusSuccess, context2));
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            paint2.setColor(kli.a.s(R$attr.uikit_colorGreyTone10, context3));
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            paint.setColor(kli.a.s(R$attr.uikit_colorForeground, context4));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            paint4.setColor(kli.a.s(R$attr.uikit_colorStatusWarning_10, context5));
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            paint3.setColor(kli.a.s(R$attr.uikit_colorStatusWarning, context6));
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            paint2.setColor(kli.a.s(R$attr.uikit_colorGreyTone10, context7));
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            paint.setColor(kli.a.s(R$attr.uikit_colorForeground, context8));
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationCircleOverlay(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationCircleOverlay(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float f = context.getResources().getDisplayMetrics().density;
        this.f85771a = f;
        float f4 = f * 2;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f85772b = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.f85773c = paint2;
        Paint paint3 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        paint3.setStrokeWidth(f4);
        this.d = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style2);
        paint4.setStrokeWidth(f4);
        this.e = paint4;
        setState(a.ACCEPTABLE);
    }

    public /* synthetic */ LocationCircleOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
