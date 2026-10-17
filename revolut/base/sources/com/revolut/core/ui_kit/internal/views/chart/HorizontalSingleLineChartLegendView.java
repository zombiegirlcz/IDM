package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import aw0.b6;
import aw0.c6;
import com.google.android.material.internal.FlowLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import ts0.a0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/HorizontalSingleLineChartLegendView;", "Lcom/google/android/material/internal/FlowLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/b6;", "legend", "", "setModel", "(Law0/b6;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HorizontalSingleLineChartLegendView extends FlowLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalSingleLineChartLegendView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setModel(@NotNull b6 legend) {
        Intrinsics.checkNotNullParameter(legend, "legend");
        int size = legend.f10248a.size();
        AttributeSet attributeSet = null;
        int i = 0;
        if (getChildCount() != size) {
            int iAbs = Math.abs(size - getChildCount());
            for (int i2 = 0; i2 < iAbs; i2++) {
                if (getChildCount() > size) {
                    removeView((View) y.v(ViewGroupKt.getChildren(this)));
                } else {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    a0 a0Var = new a0(context, attributeSet, 6, i);
                    a0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    addView(a0Var);
                }
            }
        }
        for (Object obj2 : legend.f10248a) {
            int i3 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            View childAt = getChildAt(i);
            Intrinsics.i(childAt, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.chart.HorizontalSingleLineChartLegendItemView");
            ((a0) childAt).setModel((c6) obj2);
            i = i3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalSingleLineChartLegendView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSingleLineChartLegendView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setItemSpacing(kli.a.k(context, 12.0f));
        setLineSpacing(kli.a.k(context, 16.0f));
    }

    public /* synthetic */ HorizontalSingleLineChartLegendView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
