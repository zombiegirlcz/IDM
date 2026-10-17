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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DetailGridItemLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ce;", "Lip0/ee;", "<init>", "()V", "ip0/de", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DetailGridItemLoadingDelegate extends BaseRecyclerViewDelegate<ip0.ce, ip0.ee> {
    public DetailGridItemLoadingDelegate() {
        super(R$layout.internal_delegate_detail_grid_item_loading, new ip0.lb(17));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.ee eeVar = new ip0.ee(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_detail_grid_item_loading));
        ifk.b.r(eeVar.f);
        ifk.b.r(eeVar.f164072g);
        ifk.b.r(eeVar.f164073h);
        return eeVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.ee holder, ip0.ce data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof qv0.b)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zIsEmpty = zIsEmpty || ((qv0.b) payloads.get(i3)).a();
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 24);
        }
    }
}
