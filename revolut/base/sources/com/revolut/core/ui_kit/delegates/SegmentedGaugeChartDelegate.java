package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.ChartButtonHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.InternalLegendView;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dd0;
import ip0.e30;
import ip0.ed0;
import ip0.fd0;
import ip0.gd0;
import ip0.t90;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SegmentedGaugeChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ed0;", "Lip0/gd0;", "<init>", "()V", "ip0/fd0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentedGaugeChartDelegate extends BaseRecyclerViewDelegate<ed0, gd0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53302c;
    public final e01.a d;
    public final e01.a e;

    public SegmentedGaugeChartDelegate() {
        super(R$layout.internal_delegate_segmented_gauge_chart, new t90(23));
        this.f53302c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new gd0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(gd0 holder, ed0 data, int i, List list) {
        SegmentedGaugeChartDelegate segmentedGaugeChartDelegate;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        InternalLegendView internalLegendView = holder.f164401h;
        ChartButtonHeaderView chartButtonHeaderView = holder.f164400g;
        SegmentedGaugeChartView segmentedGaugeChartView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof fd0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (int i3 = 0; i3 < size2; i3++) {
            fd0 fd0Var = (fd0) payloads.get(i3);
            zIsEmpty = zIsEmpty || fd0Var.f164243c;
            z = z || fd0Var.f164241a;
            z3 = z3 || fd0Var.f164242b;
        }
        if (zIsEmpty) {
            segmentedGaugeChartView.setDataChangeAnimationRequest(data.f164071m);
        }
        if (z) {
            com.revolut.core.ui_kit.models.h hVar = data.f164065b;
            if (hVar instanceof com.revolut.core.ui_kit.models.g) {
                chartButtonHeaderView.setVisibility(8);
                segmentedGaugeChartView.setMiniStyle(false);
                internalLegendView.setVisibility(0);
                internalLegendView.setData((com.revolut.core.ui_kit.models.g) hVar);
            } else if (hVar instanceof com.revolut.core.ui_kit.models.f) {
                internalLegendView.setVisibility(8);
                aw0.j1 j1Var = ((com.revolut.core.ui_kit.models.f) hVar).d;
                if (j1Var != null) {
                    chartButtonHeaderView.setVisibility(0);
                    chartButtonHeaderView.setChartHeader(j1Var, null);
                } else {
                    chartButtonHeaderView.setVisibility(8);
                }
                segmentedGaugeChartView.setMiniStyle(j1Var == null);
            } else {
                if (!(hVar instanceof aw0.g4)) {
                    throw new NoWhenBranchMatchedException();
                }
                internalLegendView.setVisibility(8);
                segmentedGaugeChartView.setMiniStyle(false);
                aw0.g4 g4Var = (aw0.g4) hVar;
                aw0.j1 j1Var2 = g4Var.d;
                if (j1Var2 != null) {
                    MoneyClause moneyClause = new MoneyClause(new dj0.d(g4Var.f10320b, g4Var.f10321c), new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12);
                    chartButtonHeaderView.setVisibility(0);
                    chartButtonHeaderView.setChartHeader(j1Var2, moneyClause);
                } else {
                    chartButtonHeaderView.setVisibility(8);
                }
            }
            segmentedGaugeChartView.setData(data.f164065b);
        }
        if (z3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            segmentedGaugeChartDelegate = this;
            or0.b.c(segmentedGaugeChartDelegate, data, itemView, false, null, 28);
        } else {
            segmentedGaugeChartDelegate = this;
        }
        segmentedGaugeChartDelegate.f53302c.a(segmentedGaugeChartView.C, holder);
        efm.r map = chartButtonHeaderView.b().map(new e30(new dd0(data, 0), 23));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        segmentedGaugeChartDelegate.d.a(map, holder);
        efm.r map2 = chartButtonHeaderView.c().map(new e30(new dd0(data, 1), 24));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        segmentedGaugeChartDelegate.e.a(map2, holder);
    }
}
