package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.ChartButtonHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FlexibleBarChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ui;", "Lip0/xi;", "<init>", "()V", "ip0/wi", "ip0/vi", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlexibleBarChartDelegate extends BaseRecyclerViewDelegate<ip0.ui, ip0.xi> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52353c;
    public final e01.a d;

    public FlexibleBarChartDelegate() {
        super(R$layout.internal_delegate_flexible_bar_chart, new ip0.zf(21));
        this.f52353c = new e01.a();
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.xi xiVar = new ip0.xi(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_flexible_bar_chart));
        xiVar.f.setBackgroundEnabled(true);
        return xiVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.xi holder, ip0.ui data, int i, List list) {
        FlexibleBarChartDelegate flexibleBarChartDelegate;
        List<ip0.vi> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        ChartButtonHeaderView chartButtonHeaderView = holder.f167176g;
        HistogramView histogramView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.vi)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list2 = payloads;
        boolean z = list2 == null || list2.isEmpty();
        boolean z3 = list2 == null || list2.isEmpty();
        boolean z4 = list2 == null || list2.isEmpty();
        boolean z6 = list2 == null || list2.isEmpty();
        boolean z11 = list2 == null || list2.isEmpty();
        boolean z12 = list2 == null || list2.isEmpty();
        boolean z29 = list2 == null || list2.isEmpty();
        boolean z31 = list2 == null || list2.isEmpty();
        boolean z41 = list2 == null || list2.isEmpty();
        boolean z49 = list2 == null || list2.isEmpty();
        boolean z54 = list2 == null || list2.isEmpty();
        boolean z74 = list2 == null || list2.isEmpty();
        boolean z83 = list2 == null || list2.isEmpty();
        boolean z89 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            for (ip0.vi viVar : payloads) {
                z = z || viVar.e;
                z3 = z3 || viVar.f166815a;
                z4 = z4 || viVar.f166816b;
                z6 = z6 || viVar.f166817c;
                z11 = z11 || viVar.f;
                z12 = z12 || viVar.f166818g;
                z29 = z29 || viVar.f166819h;
                z31 = z31 || viVar.i;
                z41 = z41 || viVar.d;
                z49 = z49 || viVar.f166820j;
                z54 = z54 || viVar.k;
                z74 = z74 || viVar.f166821l;
                z83 = z83 || viVar.f166822m;
                z89 = z89 || viVar.f166823n;
            }
        }
        if (z54) {
            histogramView.setDataChangeAnimationRequest(data.f166681t);
        }
        if (z74) {
            hx7.b.v(histogramView, data.f166674l);
        }
        if (z31) {
            chartButtonHeaderView.setAlignment(data.i ? ts0.b.START : ts0.b.CENTER);
        }
        if (z) {
            if (data.d != null) {
                chartButtonHeaderView.setVisibility(0);
                chartButtonHeaderView.setChartHeader(data.d, null);
            } else {
                chartButtonHeaderView.setVisibility(8);
            }
        }
        if (z3) {
            histogramView.setItems(data.f166669b);
        }
        if (z4) {
            histogramView.setYAxis(data.f);
        }
        if (z6) {
            histogramView.setMaxValueOverride(data.f166671g);
        }
        if (z41) {
            histogramView.d(data.u);
        }
        if (z11) {
            histogramView.setSelectedPosition(zhm.d0.g0(data.e, data.f166669b));
        }
        if (z12) {
            histogramView.setHeightMode(data.k);
        }
        if (z49) {
            histogramView.setTooltip(data.f166673j);
        }
        if (z83) {
            histogramView.setContentDescription(data.f166675m);
        }
        if (z89) {
            histogramView.setGesturesEnabled(data.f166676n);
        }
        if (z29) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            flexibleBarChartDelegate = this;
            or0.b.c(flexibleBarChartDelegate, data, itemView, false, null, 28);
        } else {
            flexibleBarChartDelegate = this;
        }
        efm.r rVarHide = histogramView.f56682r0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r map = rVarHide.map(new ip0.qh(7, new ip0.ti(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        flexibleBarChartDelegate.f52353c.a(map, holder);
        efm.r map2 = chartButtonHeaderView.b().map(new ip0.qh(8, new ip0.ti(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        flexibleBarChartDelegate.d.a(map2, holder);
    }
}
