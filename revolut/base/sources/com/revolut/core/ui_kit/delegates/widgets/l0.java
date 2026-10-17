package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.ChartDetailsView;
import com.revolut.core.ui_kit.internal.views.chart.ChartGridBackgroundView;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 extends op0.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ComparisonLineChartView f55410j;
    public HistogramView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SegmentedGaugeChartView f55411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public op0.o0 f55412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ResizableTileHeaderView f55413n;
    public final FrameLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ChartDetailsView f55414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ChartGridBackgroundView f55415q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        itemView.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 21));
        View viewFindViewById = itemView.findViewById(R$id.chartWithDetailsWidget_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f55413n = (ResizableTileHeaderView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.chartWithDetailsWidget_slot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.o = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.chartWithDetailsWidget_details);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f55414p = (ChartDetailsView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.chartWithDetailsWidget_gridBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f55415q = (ChartGridBackgroundView) viewFindViewById4;
    }

    public final void H(float f, float f4) {
        FrameLayout frameLayout = this.o;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", f4);
        if (layoutParams2.matchConstraintPercentHeight == f && ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin == iA) {
            return;
        }
        layoutParams2.matchConstraintPercentHeight = f;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iA;
        frameLayout.setLayoutParams(layoutParams2);
    }

    public final void I(View view, ts0.i iVar, float f, float f4, float f5) {
        H(f4, f5);
        int i = 0;
        while (true) {
            FrameLayout frameLayout = this.o;
            if (i >= frameLayout.getChildCount()) {
                break;
            }
            View childAt = frameLayout.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            childAt.setVisibility(8);
            i++;
        }
        view.setVisibility(0);
        this.f55412m = new op0.o0(view, iVar, r6.b.a(this.itemView, "getContext(...)", f));
        this.f55415q.setVisibility(iVar == null ? 8 : 0);
        if (iVar != null) {
            J();
        }
    }

    public final void J() {
        ts0.i iVar;
        op0.o0 o0Var = this.f55412m;
        if (o0Var == null || (iVar = o0Var.f227364b) == null) {
            return;
        }
        View view = o0Var.f227363a;
        float f = o0Var.f227365c;
        int width = view.getWidth();
        ChartGridBackgroundView chartGridBackgroundView = this.f55415q;
        ts0.h hVar = null;
        if (width > 0 && view.getHeight() > 0 && chartGridBackgroundView.getWidth() > 0 && chartGridBackgroundView.getHeight() > 0) {
            FrameLayout frameLayout = this.o;
            float left = ((view.getLeft() + frameLayout.getLeft()) - chartGridBackgroundView.getLeft()) + f;
            float top = ((view.getTop() + frameLayout.getTop()) - chartGridBackgroundView.getTop()) + f;
            float right = ((view.getRight() + frameLayout.getLeft()) - chartGridBackgroundView.getLeft()) - f;
            float bottom = ((view.getBottom() + frameLayout.getTop()) - chartGridBackgroundView.getTop()) - f;
            ts0.h hVar2 = new ts0.h(left, top, right, bottom);
            if (right > left && bottom > top) {
                hVar = hVar2;
            }
        }
        chartGridBackgroundView.setModel(new ts0.j(iVar, hVar != null ? new ts0.e(hVar) : ts0.f.f273866a));
    }
}
