package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import com.revolut.core.ui_kit.internal.views.fanchart.FanChartView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FanChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/rh;", "Lip0/th;", "<init>", "()V", "ip0/sh", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FanChartDelegate extends BaseRecyclerViewDelegate<ip0.rh, ip0.th> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52308c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52309g;

    public FanChartDelegate() {
        super(R$layout.internal_delegate_fan_chart, new ip0.zf(13));
        this.f52308c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
        this.f52309g = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.th(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.th holder, ip0.rh data, int i, List payloads) {
        aw0.r3 r3Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        FanChartView fanChartView = holder.f166518g;
        ChartHeaderView chartHeaderView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.sh)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z = list == null || list.isEmpty();
        boolean z3 = list == null || list.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ip0.sh shVar = (ip0.sh) payloads.get(i3);
                z = z || shVar.f166355a;
                z3 = z3 || shVar.f166356b;
            }
        }
        if (z) {
            chartHeaderView.setVisibility(data.f166185b != null ? 0 : 8);
            aw0.k1 k1Var = data.f166185b;
            if (k1Var != null) {
                ChartHeaderView.setChartHeader$default(chartHeaderView, k1Var, false, 2, null);
            }
        }
        if (z3) {
            aw0.s3 s3Var = data.f166186c;
            if (s3Var.getCurrent().f10583a > s3Var.g().f10583a) {
                aw0.r3.Companion.getClass();
                r3Var = aw0.r3.e;
            } else if (s3Var.getCurrent().f10583a < s3Var.g().f10583a) {
                aw0.r3.Companion.getClass();
                r3Var = aw0.r3.d;
            } else {
                aw0.r3.Companion.getClass();
                r3Var = aw0.r3.f;
            }
            fanChartView.setData(s3Var, r3Var);
        }
        efm.r map = chartHeaderView.a().map(new ip0.a9(new ip0.ph(data, 0), 29));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52308c.a(map, holder);
        efm.r rVarHide = chartHeaderView.f56610c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r map2 = rVarHide.map(new ip0.qh(0, new ip0.ph(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        efm.r map3 = chartHeaderView.d.map(new ip0.qh(1, new ip0.ph(data, 2)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.e.a(map3, holder);
        this.f.a(chartHeaderView.e, holder);
        efm.r map4 = fanChartView.f56963a.map(new ip0.qh(2, new ip0.ph(data, 3)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        this.f52309g.a(map4, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
