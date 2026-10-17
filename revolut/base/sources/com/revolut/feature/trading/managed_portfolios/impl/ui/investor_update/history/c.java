package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlowContract$PagerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l7f.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements n {
    @Override // cli.n
    public final o c(j jVar) {
        q qVar;
        l7f.c domainState = (l7f.c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<InvestorUpdateHistoryFlowContract$PagerItem> list = domainState.f192579c;
        ArrayList arrayList = new ArrayList();
        for (InvestorUpdateHistoryFlowContract$PagerItem investorUpdateHistoryFlowContract$PagerItem : list) {
            if (investorUpdateHistoryFlowContract$PagerItem instanceof InvestorUpdateHistoryFlowContract$PagerItem.Year) {
                int i = ((InvestorUpdateHistoryFlowContract$PagerItem.Year) investorUpdateHistoryFlowContract$PagerItem).f91358a;
                qVar = new q(String.valueOf(i), new t(new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), 50);
            } else if (investorUpdateHistoryFlowContract$PagerItem instanceof InvestorUpdateHistoryFlowContract$PagerItem.Loading) {
                qVar = new q("LOADING_PAGE", Tabs.c.a.f58897a, 58);
            } else {
                if (!(investorUpdateHistoryFlowContract$PagerItem instanceof InvestorUpdateHistoryFlowContract$PagerItem.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = null;
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return new f(domainState.f192578b, arrayList);
    }
}
