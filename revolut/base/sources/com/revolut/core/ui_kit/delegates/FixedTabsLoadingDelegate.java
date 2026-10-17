package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FixedTabsLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/qi;", "Lip0/si;", "<init>", "()V", "ip0/ri", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FixedTabsLoadingDelegate extends BaseRecyclerViewDelegate<ip0.qi, ip0.si> {
    public FixedTabsLoadingDelegate() {
        super(R$layout.internal_delegate_fixed_tabs_loading, new ip0.zf(20));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.si siVar = new ip0.si(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_fixed_tabs_loading));
        siVar.f166358g.d(((c9.b) ((c9.b) ((c9.b) ((c9.b) new c9.b().i(true)).k(1000L)).j(1.0f)).l(0.5f)).c());
        return siVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.si holder, ip0.qi data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        FixedTabs fixedTabs = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.ri)) {
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
            ip0.ri riVar = (ip0.ri) payloads.get(i3);
            zIsEmpty = zIsEmpty || riVar.f166192a || riVar.f166193b;
        }
        if (zIsEmpty) {
            int i5 = data.f165981b;
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(new FixedTabs.Item(String.valueOf(i6), new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), (AnalyticsContext) null, 12));
            }
            fixedTabs.setItems(arrayList, data.f165981b > 0 ? String.valueOf(0) : null);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        if (Intrinsics.f(data.f165982c, c.d.f249513a)) {
            fixedTabs.setStyle$ui_kit_components_release(mx0.i6.DARK);
        } else {
            fixedTabs.setStyle$ui_kit_components_release(mx0.i6.LIGHT);
        }
    }
}
