package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.PieChartView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e10;
import ip0.f10;
import ip0.g10;
import ip0.h10;
import ip0.tz;
import ip0.ws;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PieChartVerticalLegendDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/e10;", "Lip0/h10;", "<init>", "()V", "ip0/g10", "ip0/f10", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PieChartVerticalLegendDelegate extends BaseRecyclerViewDelegate<e10, h10> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52923c;

    public PieChartVerticalLegendDelegate() {
        super(R$layout.internal_delegate_pie_chart_with_legend, new tz(11));
        this.f52923c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new h10(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_pie_chart_with_legend));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(h10 holder, e10 data, int i, List payloads) {
        e10 e10Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zIsEmpty = payloads.isEmpty();
        boolean zIsEmpty2 = payloads.isEmpty();
        boolean zIsEmpty3 = payloads.isEmpty();
        for (Object obj2 : payloads) {
            if (!(obj2 instanceof f10)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            f10 f10Var = (f10) obj2;
            zIsEmpty |= f10Var.f164183c;
            boolean z = f10Var.f164181a;
            zIsEmpty2 |= z;
            zIsEmpty3 |= z;
        }
        if (zIsEmpty2) {
            PieChartView pieChartView = holder.f;
            List<g10> list = data.f164001a;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (g10 g10Var : list) {
                arrayList.add(new ts0.k0(g10Var.f164325a, g10Var.f164326b));
            }
            pieChartView.setSlices(arrayList);
        }
        if (zIsEmpty3) {
            holder.f164491g.setModel(data.f164002b);
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            e10Var = data;
            or0.b.c(this, e10Var, itemView, false, null, 28);
        } else {
            e10Var = data;
        }
        holder.itemView.setOnClickListener(new ws(this, e10Var, 7));
    }
}
