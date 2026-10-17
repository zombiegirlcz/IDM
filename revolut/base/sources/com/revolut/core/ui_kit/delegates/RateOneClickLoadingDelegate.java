package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.l40;
import ip0.l90;
import ip0.m90;
import ip0.n90;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RateOneClickLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/l90;", "Lip0/n90;", "<init>", "()V", "ip0/m90", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RateOneClickLoadingDelegate extends BaseRecyclerViewDelegate<l90, n90> {
    public RateOneClickLoadingDelegate() {
        super(R$layout.internal_delegate_rate_one_click_loading, new l40(28));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new n90(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(n90 holder, l90 data, int i, List payloads) {
        boolean z;
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
            if (!(payloads.get(i2) instanceof m90)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z3 = list == null || list.isEmpty();
        if (payloads != null) {
            Iterator it8 = payloads.iterator();
            z = z3;
            while (it8.hasNext()) {
                z |= ((m90) it8.next()).f165339a;
            }
        } else {
            z = z3;
        }
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        if (z3) {
            io3.h.s(holder.f);
        }
    }
}
