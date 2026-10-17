package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.t90;
import ip0.tb0;
import ip0.ub0;
import ip0.vb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowPlaceholderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/tb0;", "Lip0/vb0;", "<init>", "()V", "ip0/ub0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RowPlaceholderDelegate extends BaseRecyclerViewDelegate<tb0, vb0> {
    public RowPlaceholderDelegate() {
        super(R$layout.internal_delegate_row_placeholder, new t90(16));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new vb0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(vb0 holder, tb0 data, int i, List payloads) {
        int iD;
        tb0 tb0Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            it8.next();
        }
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            ub0 ub0Var = (ub0) it9.next();
            if (zN) {
                zN = true;
            } else {
                ub0Var.getClass();
                zN = false;
            }
            if (zN2) {
                zN2 = true;
            } else {
                ub0Var.getClass();
                zN2 = false;
            }
            if (zN3) {
                zN3 = true;
            } else {
                ub0Var.getClass();
                zN3 = false;
            }
        }
        if (zN2) {
            data.getClass();
            ViewGroup viewGroup = holder.f;
            Intrinsics.checkNotNullExpressionValue(viewGroup, "<get-root>(...)");
            int childCount = viewGroup.getChildCount();
            for (iD = 0; iD < childCount; iD = m72.b.d(viewGroup, iD, BitmapDescriptorFactory.HUE_RED, iD, 1)) {
            }
        }
        if (zN) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            tb0Var = data;
            or0.b.c(this, tb0Var, itemView, false, null, 28);
        } else {
            tb0Var = data;
        }
        if (zN3) {
            tb0Var.getClass();
            LineChartView chart = holder.f166804g;
            Intrinsics.checkNotNullExpressionValue(chart, "chart");
            chart.setVisibility(8);
        }
    }
}
