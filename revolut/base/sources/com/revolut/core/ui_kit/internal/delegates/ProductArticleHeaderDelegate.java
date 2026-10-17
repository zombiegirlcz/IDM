package com.revolut.core.ui_kit.internal.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import pof.e;
import pq0.c;
import ty0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/ProductArticleHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lpq0/a;", "Lpq0/c;", "<init>", "()V", "pq0/b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductArticleHeaderDelegate extends BaseRecyclerViewDelegate<pq0.a, c> {
    public ProductArticleHeaderDelegate() {
        super(R$id.internal_product_article_header_delegate_id, new e(4));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ConstraintLayout constraintLayout = new ConstraintLayout(parent.getContext());
        constraintLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new c(constraintLayout);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(c holder, pq0.a data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        List list = payloads;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (it8.hasNext()) {
                    if (!(it8.next() instanceof pq0.b)) {
                        payloads = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.internal.delegates.ProductArticleHeaderDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        for (pq0.b bVar : payloads) {
            zIsEmpty = zIsEmpty || bVar.f238631a;
            z = z || bVar.f238632b;
        }
        if (zIsEmpty) {
            kli.a.b(holder.i, data.f238630b, f.f275450a);
        }
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ((jz0.b) u.k(itemView).a0()).b(data.f238629a, holder.f, null);
            holder.F();
        }
    }
}
