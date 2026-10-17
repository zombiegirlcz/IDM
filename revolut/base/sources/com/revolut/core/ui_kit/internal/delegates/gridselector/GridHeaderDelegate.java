package com.revolut.core.ui_kit.internal.delegates.gridselector;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.gridselector.GridHeaderView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.b;
import tj9.d;
import tq0.g;
import tq0.h;
import tq0.i;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/gridselector/GridHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Ltq0/g;", "Ltq0/i;", "<init>", "()V", "tq0/h", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GridHeaderDelegate extends BaseRecyclerViewDelegate<g, i> {
    public GridHeaderDelegate() {
        super(R$layout.internal_delegate_grid_header, new d(29));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new i(s.r(parent, R$layout.internal_delegate_grid_header));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(i holder, g data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        GridHeaderView gridHeaderView = holder.f;
        if (payloads.isEmpty()) {
            gridHeaderView.setTitle(data.f273459b);
            gridHeaderView.setNavigationArrowsVisible(false);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            b.c(this, data, itemView, false, null, 28);
            return;
        }
        ArrayList<h> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof h) {
                arrayList.add(obj2);
            }
        }
        for (h hVar : arrayList) {
            if (hVar.f273464a) {
                gridHeaderView.setTitle(data.f273459b);
            }
            if (hVar.f273466c) {
                data.getClass();
                gridHeaderView.setNavigationArrowsVisible(false);
            }
            if (hVar.f273465b) {
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                b.c(this, data, itemView2, false, null, 28);
            }
        }
    }
}
