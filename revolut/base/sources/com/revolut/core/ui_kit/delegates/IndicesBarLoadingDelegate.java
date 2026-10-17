package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.IndicesBarView$IndexBarDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.fq;
import ip0.gq;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IndicesBarLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/fq;", "Lip0/gq;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndicesBarLoadingDelegate extends BaseRecyclerViewDelegate<fq, gq> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IndicesBarView$IndexBarDelegate f52517c;

    public IndicesBarLoadingDelegate() {
        super(R$id.internal_indices_bar_loading_delegate_view_type, new dk(29));
        this.f52517c = new IndicesBarView$IndexBarDelegate();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ms0.i1 i1Var = new ms0.i1(context, this.f52517c);
        i1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new gq(i1Var);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List payloads) {
        gq holder = (gq) viewHolder;
        koi.j data = (fq) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ms0.i1 i1Var = holder.f;
        data.getClass();
        i1Var.setLoadingItems(3);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final void p(koi.b bVar, koi.j jVar, int i, List payloads) {
        gq holder = (gq) bVar;
        koi.j data = (fq) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ms0.i1 i1Var = holder.f;
        data.getClass();
        i1Var.setLoadingItems(3);
    }
}
