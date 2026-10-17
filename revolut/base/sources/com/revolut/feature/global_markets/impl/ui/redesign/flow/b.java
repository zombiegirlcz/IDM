package com.revolut.feature.global_markets.impl.ui.redesign.flow;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.global_markets.impl.ui.redesign.flow.GlobalMarketsRedesignFlowContract$PagerItem;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m87.c;
import m87.d;
import m87.e;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements n {
    @Override // cli.n
    public final o c(j jVar) {
        int i;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<GlobalMarketsRedesignFlowContract$PagerItem> list = domainState.f203440a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (GlobalMarketsRedesignFlowContract$PagerItem globalMarketsRedesignFlowContract$PagerItem : list) {
            String f89793a = globalMarketsRedesignFlowContract$PagerItem.getF79006a();
            if (globalMarketsRedesignFlowContract$PagerItem instanceof GlobalMarketsRedesignFlowContract$PagerItem.GlobalItem) {
                i = R$string.invest_markets_tabs_global_title;
            } else {
                if (!(globalMarketsRedesignFlowContract$PagerItem instanceof GlobalMarketsRedesignFlowContract$PagerItem.MarketItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = e.f203444a[((GlobalMarketsRedesignFlowContract$PagerItem.MarketItem) globalMarketsRedesignFlowContract$PagerItem).f74596a.ordinal()];
                if (i2 == 1) {
                    i = R$string.invest_markets_tabs_united_states_title;
                } else if (i2 == 2) {
                    i = R$string.invest_markets_tabs_europe_title;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.invest_markets_tabs_asia_pacific_title;
                }
            }
            arrayList.add(new q(f89793a, new t(new TextLocalisedClause(i, null, null, 14)), 58));
        }
        return new d(domainState.f203441b, arrayList);
    }
}
