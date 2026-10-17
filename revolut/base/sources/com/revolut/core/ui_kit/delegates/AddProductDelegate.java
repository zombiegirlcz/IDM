package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AddProductDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/e0;", "Lip0/f0;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class AddProductDelegate extends BaseRecyclerViewDelegate<ip0.e0, ip0.f0> {
    public AddProductDelegate() {
        super(R$layout.internal_delegate_add_product, new ip0.c(8));
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_add_product);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ip0.f0 f0Var = new ip0.f0(itemView);
        View viewFindViewById = itemView.findViewById(R$id.addProduct_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.addProduct_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = itemView.findViewById(R$id.addProduct_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = itemView.findViewById(R$id.addProduct_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        return f0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((ip0.f0) viewHolder, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((ip0.f0) bVar, i, list);
    }

    public final void p(ip0.f0 holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        if (payloads.isEmpty()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.u.k(itemView).Q();
            throw null;
        }
        List list = payloads;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Intrinsics.i(it8.next(), "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.AddProductDelegate.Payload");
            throw new ClassCastException();
        }
        Iterator it9 = arrayList.iterator();
        if (it9.hasNext()) {
            throw v0.a.e(it9);
        }
    }
}
