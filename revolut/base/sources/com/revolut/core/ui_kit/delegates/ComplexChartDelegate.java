package com.revolut.core.ui_kit.delegates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ComplexChartDelegate;", "Lqv0/i;", "M", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ub;", "Lip0/vb;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComplexChartDelegate<M extends qv0.i, VH extends RecyclerView.ViewHolder> extends BaseRecyclerViewDelegate<ip0.ub, ip0.vb> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleLineChartDelegate f52115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplexChartDelegate(SimpleLineChartDelegate innerDelegate) {
        super(innerDelegate.f98535a, new ip0.lb(innerDelegate));
        Intrinsics.checkNotNullParameter(innerDelegate, "innerDelegate");
        this.f52115c = innerDelegate;
        new e01.a();
        new e01.a();
        new e01.a();
        new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.internal_delegate_complex_chart, parent, false);
        RecyclerView.ViewHolder viewHolderG = this.f52115c.g(parent);
        Intrinsics.h(viewInflate);
        ip0.vb vbVar = new ip0.vb(viewInflate, viewHolderG);
        vbVar.f166803g.addView(viewHolderG.itemView);
        return vbVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((ip0.vb) viewHolder, i, list);
        throw null;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((ip0.vb) bVar, i, list);
        throw null;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public final void p(ip0.vb holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            it8.next();
        }
        if (arrayList.isEmpty()) {
            throw null;
        }
        Iterator it9 = arrayList.iterator();
        if (it9.hasNext()) {
            throw v0.a.e(it9);
        }
        nkm.y.J(nkm.y.z(zhm.d0.Q(arrayList), new ip0.za(1)));
        throw null;
    }
}
