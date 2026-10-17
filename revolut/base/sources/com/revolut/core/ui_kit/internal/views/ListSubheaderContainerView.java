package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ListSubheaderContainerView;", "Lcom/facebook/shimmer/ShimmerConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "align", "", "setAlignWithGridBoxDelegate", "(Z)V", "color", "setBottomDividerColor", "(Ljava/lang/Integer;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListSubheaderContainerView extends ShimmerConstraintLayout {
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f56261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f56262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f56263n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListSubheaderContainerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f56261l) {
            canvas.drawRect(getPaddingLeft(), getHeight() - this.f56262m, getWidth() - getPaddingRight(), getHeight(), this.f56263n);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.k) {
            super.onMeasure(i, i2);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            findViewById(R$id.listSubheader_startContainer).setPadding((getMeasuredWidth() - (kli.a.k(context, 60.0f) * 4)) / 8, 0, 0, 0);
        } else {
            findViewById(R$id.listSubheader_startContainer).setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i, i2);
    }

    public final void setAlignWithGridBoxDelegate(boolean align) {
        this.k = align;
        requestLayout();
    }

    public final void setBottomDividerColor(Integer color) {
        this.f56261l = color != null;
        if (color != null) {
            this.f56263n.setColor(color.intValue());
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListSubheaderContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSubheaderContainerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56262m = kli.a.w(R$attr.uikit_dp1, context);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f56263n = paint;
    }

    public /* synthetic */ ListSubheaderContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
