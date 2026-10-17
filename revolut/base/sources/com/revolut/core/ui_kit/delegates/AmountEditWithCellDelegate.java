package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004:\u0002\u0002\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AmountEditWithCellDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/w;", "Lip0/u0;", "", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountEditWithCellDelegate extends BaseRecyclerViewDelegate<w, ip0.u0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f51638c;
    public final RowLoadingDelegate d;
    public final AmountEditDelegate e;

    public AmountEditWithCellDelegate(Function2 function2) {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
        AmountEditDelegate amountEditDelegate = new AmountEditDelegate(function2);
        super(R$layout.internal_delegate_amount_edit_with_cell, new ip0.c(11));
        this.f51638c = rowDelegate;
        this.d = rowLoadingDelegate;
        this.e = amountEditDelegate;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.u0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_amount_edit_with_cell), this.f51638c, this.d, this.e);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((ip0.u0) viewHolder, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((ip0.u0) bVar, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ip0.u0 u0Var = (ip0.u0) holder;
        this.f51638c.onViewRecycled(u0Var.f);
        this.e.onViewRecycled(u0Var.f166573g);
    }

    public final void p(ip0.u0 holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        if (payloads.isEmpty()) {
            throw null;
        }
        List list = payloads;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Intrinsics.i(it8.next(), "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.AmountEditWithCellDelegate.Payload");
            throw new ClassCastException();
        }
        Iterator it9 = arrayList.iterator();
        if (it9.hasNext()) {
            throw v0.a.e(it9);
        }
    }
}
