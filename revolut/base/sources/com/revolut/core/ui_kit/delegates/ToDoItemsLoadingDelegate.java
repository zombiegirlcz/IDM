package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerLinearLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import ip0.ll0;
import ip0.ml0;
import ip0.ri0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ToDoItemsLoadingDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/ll0;", "Lip0/ml0;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ToDoItemsLoadingDelegate extends BaseBoxRecyclerViewDelegate<ll0, ml0> {
    public ToDoItemsLoadingDelegate() {
        super(R$layout.internal_delegate_to_do_items_loading, true, new ri0(15));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ml0(kotlin.jvm.internal.s.r(parent, this.f58164c));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate, com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        q((ml0) viewHolder, i, list);
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate, com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        q((ml0) bVar, i, list);
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, qv0.i iVar, int i, List list) {
        q((ml0) bVar, i, list);
    }

    public final void q(ml0 holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        ShimmerLinearLayout shimmerLinearLayout = holder.f;
        Intrinsics.checkNotNullParameter(shimmerLinearLayout, "<this>");
        c9.e eVarB = yp0.a0.b();
        shimmerLinearLayout.f26156b.b(eVarB);
        if (eVarB.f22257n) {
            shimmerLinearLayout.setLayerType(2, shimmerLinearLayout.f26155a);
        } else {
            shimmerLinearLayout.setLayerType(0, null);
        }
    }
}
