package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import aw0.b6;
import aw0.c6;
import aw0.l0;
import aw0.m0;
import aw0.n1;
import aw0.o1;
import aw0.o6;
import aw0.p6;
import aw0.q1;
import com.google.android.material.internal.FlowLayout;
import ct0.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ts0.a0;
import ts0.v;
import ts0.x;
import ts0.y;
import ts0.z;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/HorizontalChartLegendView;", "Lcom/google/android/material/internal/FlowLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/l0;", "legend", "", "setModel", "(Law0/l0;)V", "ts0/y", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HorizontalChartLegendView extends FlowLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f56696a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalChartLegendView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i, y yVar) {
        View xVar;
        if (this.f56696a != yVar) {
            removeAllViews();
            this.f56696a = yVar;
        }
        if (getChildCount() == i) {
            return;
        }
        int iAbs = Math.abs(i - getChildCount());
        int i2 = 0;
        for (int i3 = 0; i3 < iAbs; i3++) {
            if (getChildCount() > i) {
                removeView((View) nkm.y.v(ViewGroupKt.getChildren(this)));
            } else {
                int i5 = z.f273919a[yVar.ordinal()];
                int i6 = 6;
                AttributeSet attributeSet = null;
                if (i5 == 1) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    xVar = new x(context, attributeSet, i6, i2);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    xVar = new a0(context2, attributeSet, i6, i2);
                }
                xVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                addView(xVar);
            }
        }
    }

    public final void setModel(l0 legend) {
        p6 p6Var;
        if (!(legend instanceof o1)) {
            if (!(legend instanceof b6)) {
                if (legend != null) {
                    throw new NoWhenBranchMatchedException();
                }
                a(0, y.DEFAULT);
                return;
            }
            List list = ((b6) legend).f10248a;
            a(list.size(), y.SINGLE_LINE);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                c6 c6Var = (c6) list.get(i);
                View childAt = getChildAt(i);
                Intrinsics.i(childAt, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.chart.HorizontalSingleLineChartLegendItemView");
                ((a0) childAt).setModel(c6Var);
            }
            return;
        }
        o1 o1Var = (o1) legend;
        List list2 = o1Var.f10449a;
        a(list2.size(), y.DEFAULT);
        n1 n1Var = o1Var.f10450b;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            q1 q1Var = (q1) list2.get(i2);
            View childAt2 = getChildAt(i2);
            Intrinsics.i(childAt2, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.chart.HorizontalChartLegendItemView");
            x xVar = (x) childAt2;
            List list3 = q1Var.f10481a;
            ArrayList arrayList = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                o6 o6Var = (o6) list3.get(i3);
                if (o6Var instanceof p6) {
                    p6Var = (p6) o6Var;
                } else {
                    if (!Intrinsics.f(o6Var, m0.f10417a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iA = t.BASIC.a(i2);
                    p6Var = new p6(iA, Integer.valueOf(iA));
                }
                arrayList.add(p6Var);
            }
            xVar.setModel(new v(arrayList, q1Var.f10482b, n1Var));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalChartLegendView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalChartLegendView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setItemSpacing(kli.a.k(context, 32.0f));
        setLineSpacing(kli.a.k(context, 16.0f));
    }

    public /* synthetic */ HorizontalChartLegendView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
