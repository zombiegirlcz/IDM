package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.tz;
import ip0.u20;
import ip0.v20;
import ip0.w20;
import ip0.x20;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProductSelectionLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/u20;", "Lip0/x20;", "<init>", "()V", "ip0/w20", "ip0/v20", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductSelectionLoadingDelegate extends BaseRecyclerViewDelegate<u20, x20> {
    public ProductSelectionLoadingDelegate() {
        super(R$layout.internal_delegate_product_selection_loading, new tz(22));
    }

    public static void q(x20 x20Var, w20 w20Var) {
        x20Var.f.setVisibility(w20Var == w20.ICON_60DP ? 0 : 8);
        x20Var.f167088g.setVisibility(w20Var == w20.PICTURE_80DP ? 0 : 8);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new x20(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_product_selection_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(x20 holder, u20 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        if (payloads.isEmpty()) {
            q(holder, data.f166579b);
            ifk.b.r(holder.i);
            ifk.b.r(holder.f167089h);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            return;
        }
        List list = payloads;
        ArrayList<v20> arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Object obj2 : list) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate.Payload");
            arrayList.add((v20) obj2);
        }
        for (v20 v20Var : arrayList) {
            if (v20Var.f166758a) {
                q(holder, data.f166579b);
            }
            if (v20Var.f166759b) {
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.b.c(this, data, itemView2, false, null, 28);
            }
        }
    }
}
