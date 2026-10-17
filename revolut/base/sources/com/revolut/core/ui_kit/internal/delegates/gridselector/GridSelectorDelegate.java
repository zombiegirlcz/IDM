package com.revolut.core.ui_kit.internal.delegates.gridselector;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import efm.r;
import java.util.Collection;
import java.util.List;
import koi.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.b;
import tq0.j;
import tq0.k;
import tq0.l;
import tq0.m;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/gridselector/GridSelectorDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Ltq0/k;", "Ltq0/m;", "<init>", "()V", "tq0/l", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GridSelectorDelegate extends BaseRecyclerViewDelegate<k, m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GridCellDelegate f55869c;

    public GridSelectorDelegate() {
        super(R$layout.internal_delegate_grid_selector, new j(0));
        this.f55869c = new GridCellDelegate();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        m mVar = new m(s.r(parent, R$layout.internal_delegate_grid_selector));
        z4l.j jVar = new z4l.j(new c(u.c(this.f55869c)), false, 14);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mVar.itemView.getContext(), 1);
        RecyclerView recyclerView = mVar.f;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        return mVar;
    }

    public final r p() {
        r rVarHide = this.f55869c.f55868c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(m holder, k data, int i, List payloads) {
        k kVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        RecyclerView recyclerView = holder.f;
        List list = payloads;
        if (list.isEmpty()) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
            ((z4l.j) adapter).c(data.f273469b);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            ((GridLayoutManager) layoutManager).setSpanCount(data.f273470c);
        } else {
            for (Object obj2 : payloads) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.delegates.gridselector.GridSelectorDelegate.Payload");
                l lVar = (l) obj2;
                if (lVar.f273476a) {
                    RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                    Intrinsics.i(adapter2, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
                    ((z4l.j) adapter2).c(data.f273469b);
                }
                if (lVar.f273477b) {
                    RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                    Intrinsics.i(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    ((GridLayoutManager) layoutManager2).setSpanCount(data.f273470c);
                }
            }
        }
        if (list.isEmpty()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            kVar = data;
            b.c(this, kVar, itemView, false, null, 28);
            break;
        }
        List list2 = payloads;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Object obj3 : list2) {
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.delegates.gridselector.GridSelectorDelegate.Payload");
                if (((l) obj3).f273478c) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    kVar = data;
                    b.c(this, kVar, itemView2, false, null, 28);
                    break;
                }
            }
        }
        kVar = data;
        Integer num = kVar.d;
        if (num != null) {
            int iIntValue = num.intValue();
            View view = holder.itemView;
            view.setBackground(ContextCompat.getDrawable(view.getContext(), iIntValue));
        }
    }
}
