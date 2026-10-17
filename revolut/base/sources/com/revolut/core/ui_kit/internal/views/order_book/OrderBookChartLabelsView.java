package com.revolut.core.ui_kit.internal.views.order_book;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import jb3.l;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ty0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/order_book/OrderBookChartLabelsView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/revolut/core/ui_kit/models/Clause;", "labels", "", "setLabels", "(Ljava/util/List;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderBookChartLabelsView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f57429a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderBookChartLabelsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        if (this.f57429a.isEmpty()) {
            return;
        }
        int width = getWidth();
        int size = this.f57429a.size();
        if (size == 1) {
            View childAt = getChildAt(0);
            int measuredWidth = (width - childAt.getMeasuredWidth()) / 2;
            childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight());
            return;
        }
        boolean z3 = getLayoutDirection() == 1;
        View childAt2 = z3 ? getChildAt(size - 1) : getChildAt(0);
        View childAt3 = z3 ? getChildAt(0) : getChildAt(size - 1);
        childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
        childAt3.layout(width - childAt3.getMeasuredWidth(), 0, width, childAt3.getMeasuredHeight());
        if (size > 2) {
            int iMax = Math.max(childAt2.getMeasuredWidth(), childAt3.getMeasuredWidth());
            int i6 = size - 1;
            int i21 = (width - iMax) / i6;
            for (int i22 = 1; i22 < i6; i22++) {
                int i32 = (i21 * i22) + (iMax / 2);
                View childAt4 = z3 ? getChildAt(i6 - i22) : getChildAt(i22);
                int measuredWidth2 = i32 - (childAt4.getMeasuredWidth() / 2);
                childAt4.layout(measuredWidth2, 0, childAt4.getMeasuredWidth() + measuredWidth2, childAt4.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f57429a.isEmpty()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size / this.f57429a.size(), Integer.MIN_VALUE);
        int size2 = this.f57429a.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            View childAt = getChildAt(i3);
            measureChild(childAt, iMakeMeasureSpec, i2);
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(size, iMax);
    }

    public final void setLabels(@NotNull List<? extends Clause> labels) {
        f fVar;
        Intrinsics.checkNotNullParameter(labels, "labels");
        if (Intrinsics.f(this.f57429a, labels)) {
            return;
        }
        this.f57429a = labels;
        int iMin = Math.min(labels.size(), getChildCount());
        int i = 0;
        while (true) {
            fVar = f.f275450a;
            if (i >= iMin) {
                break;
            }
            View childAt = getChildAt(i);
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setVisibility(0);
                a.b(textView, labels.get(i), fVar);
            }
            i++;
        }
        int size = labels.size();
        while (iMin < size) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
            l.e(uIKitTextView, R$attr.internal_textAppearanceBody2);
            Context context2 = uIKitTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            uIKitTextView.setTextColor(a.s(R$attr.uikit_colorGreyTone50, context2));
            uIKitTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            uIKitTextView.setMaxLines(1);
            uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
            addView(uIKitTextView);
            a.b(uIKitTextView, labels.get(iMin), fVar);
            iMin++;
        }
        int childCount = getChildCount();
        for (int size2 = labels.size(); size2 < childCount; size2++) {
            View childAt2 = getChildAt(size2);
            Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
            childAt2.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderBookChartLabelsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBookChartLabelsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57429a = f0.f322471a;
    }

    public /* synthetic */ OrderBookChartLabelsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
