package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import aw0.eb;
import aw0.fb;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import ts0.q0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/VerticalChartLegendView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/eb;", "legend", "", "setModel", "(Law0/eb;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VerticalChartLegendView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56757a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalChartLegendView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setModel(eb legend) {
        List list;
        AttributeSet attributeSet = null;
        List list2 = legend != null ? legend.f10302a : null;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        int size = list2.size();
        int i = 0;
        if (getChildCount() != size) {
            int iAbs = Math.abs(size - getChildCount());
            if (getChildCount() > size) {
                removeViews(size, iAbs);
            } else {
                for (int i2 = 0; i2 < iAbs; i2++) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    q0 q0Var = new q0(context, attributeSet, 6, i);
                    q0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    addView(q0Var);
                }
            }
        }
        if (legend == null || (list = legend.f10302a) == null) {
            return;
        }
        List<View> listJ = y.J(ViewGroupKt.getChildren(this));
        ArrayList arrayList = new ArrayList(w.t(listJ, 10));
        for (View view : listJ) {
            Intrinsics.i(view, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.chart.VerticalChartLegendItemView");
            arrayList.add((q0) view);
        }
        int i3 = 0;
        for (Object obj2 : list) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            fb fbVar = (fb) obj2;
            q0 q0Var2 = (q0) arrayList.get(i3);
            q0Var2.setIcon(fbVar.f10312a);
            q0Var2.setTitle(fbVar.f10313b);
            int i6 = i3 != arrayList.size() + (-1) ? this.f56757a : 0;
            ViewGroup.LayoutParams layoutParams = q0Var2.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, i6);
            i3 = i5;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalChartLegendView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalChartLegendView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56757a = kli.a.k(context, 12.0f);
        setOrientation(1);
    }

    public /* synthetic */ VerticalChartLegendView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
