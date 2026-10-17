package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.FiltersView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FiltersDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ji;", "Lip0/li;", "<init>", "()V", "ip0/ki", "ip0/ii", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FiltersDelegate extends BaseRecyclerViewDelegate<ip0.ji, ip0.li> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52338c;

    public FiltersDelegate() {
        super(R$layout.internal_delegate_filters, new ip0.zf(18));
        this.f52338c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.li(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_filters));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.li holder, ip0.ji data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        FiltersView filtersView = holder.f;
        if (payloads.isEmpty()) {
            filtersView.setItems(data.f164839b);
        } else {
            List list = payloads;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.FiltersDelegate.Payload");
                arrayList.add((ip0.ki) obj2);
            }
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (((ip0.ki) it8.next()).f165022a) {
                    filtersView.setItems(data.f164839b);
                }
            }
        }
        efm.r map = filtersView.d.f58548c.map(new ip0.qh(3, new ip0.ad(data, 9)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52338c.a(map, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
