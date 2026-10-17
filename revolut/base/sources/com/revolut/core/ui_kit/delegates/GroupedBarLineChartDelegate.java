package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.gl;
import ip0.hl;
import ip0.il;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0002\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/GroupedBarLineChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/gl;", "Lip0/il;", "<init>", "()V", "ip0/dl", "ip0/fl", "ip0/hl", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupedBarLineChartDelegate extends BaseRecyclerViewDelegate<gl, il> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52391c;

    public GroupedBarLineChartDelegate() {
        super(R$layout.internal_delegate_grouped_bar_line_chart, new dk(6));
        this.f52391c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        il ilVar = new il(kotlin.jvm.internal.s.r(parent, this.f98535a));
        ip0.d3 d3Var = new ip0.d3(ip0.c3.SPREAD_WITH_DYNAMIC_PADDINGS);
        BarChartView barChartView = ilVar.f;
        barChartView.setStyle(d3Var);
        barChartView.setBackgroundEnabled(true);
        return ilVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(il holder, gl data, int i, List payloads) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        BarChartView barChartView = holder.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof hl) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zIsEmpty2 = arrayList.isEmpty();
        Iterator it8 = arrayList.iterator();
        while (true) {
            i2 = 0;
            if (!it8.hasNext()) {
                break;
            }
            hl hlVar = (hl) it8.next();
            zIsEmpty = zIsEmpty || hlVar.f164572a;
            zIsEmpty2 = zIsEmpty2 || hlVar.f164573b;
        }
        if (zIsEmpty) {
            barChartView.setDataset(data.f164435b);
        }
        if (zIsEmpty2) {
            List list = data.f164435b.f163917a.f165762a;
            ip0.i3 i3Var = data.f164436c;
            int i3 = -1;
            if (i3Var != null) {
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    if (((ip0.h3) it9.next()).f164499a.equals(i3Var)) {
                        i3 = i2;
                        break;
                    }
                    i2++;
                }
            }
            barChartView.setSelectedPosition(i3);
        }
        efm.r map = barChartView.v.map(new ip0.qh(15, new ip0.ad(data, 11)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52391c.a(map, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
