package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsTotalDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/n8;", "Lip0/p8;", "<init>", "()V", "ip0/o8", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsTotalDelegate extends BaseRecyclerViewDelegate<ip0.n8, ip0.p8> {
    public CellDetailsTotalDelegate() {
        super(R$layout.internal_delegate_cell_details_total, new ip0.h8(4));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.p8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_total));
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.p8 holder, ip0.n8 n8Var, int i, List payloads) {
        ip0.n8 n8Var2;
        ip0.n8 data = n8Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, n8Var, i, payloads);
        if (payloads.isEmpty()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            n8Var2 = n8Var;
            or0.b.c(this, n8Var2, itemView, false, null, 28);
            View view = holder.itemView;
            ty0.c.b(h30.l.x(view, "itemView", view), n8Var2.f165465b, holder.f, null, null, 12);
            View view2 = holder.itemView;
            ty0.c.b(h30.l.x(view2, "itemView", view2), n8Var2.f165466c, holder.f165782g, null, null, 12);
        } else {
            for (ip0.o8 o8Var : zhm.c0.N(payloads, ip0.o8.class)) {
                if (o8Var.f165634a) {
                    View view3 = holder.itemView;
                    ty0.c.b(h30.l.x(view3, "itemView", view3), data.f165465b, holder.f, null, null, 12);
                }
                if (o8Var.f165635b) {
                    View view4 = holder.itemView;
                    ty0.c.b(h30.l.x(view4, "itemView", view4), data.f165466c, holder.f165782g, null, null, 12);
                }
                if (o8Var.f165636c) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
                data = n8Var;
            }
            n8Var2 = n8Var;
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        gq0.d[] elements = {hx7.b.f(n8Var2.f165465b), hx7.b.f(n8Var2.f165466c)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView3);
    }
}
