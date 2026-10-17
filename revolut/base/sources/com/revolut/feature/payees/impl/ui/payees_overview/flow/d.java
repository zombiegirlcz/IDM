package com.revolut.feature.payees.impl.ui.payees_overview.flow;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.payees.impl.ui.payees_overview.flow.PayeesOverviewFlowContract$FlowPagerItem;
import com.revolut.feature.security_hub.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sm9.e;
import sm9.f;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f264394b;
        List list = domainState.f264393a;
        List<PayeesOverviewFlowContract$FlowPagerItem> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (PayeesOverviewFlowContract$FlowPagerItem payeesOverviewFlowContract$FlowPagerItem : list2) {
            if (payeesOverviewFlowContract$FlowPagerItem instanceof PayeesOverviewFlowContract$FlowPagerItem.CurrentUser) {
                textLocalisedClause = new TextLocalisedClause(R$string.security_hub_payees_tab_for_you, null, null, 14);
            } else {
                if (!(payeesOverviewFlowContract$FlowPagerItem instanceof PayeesOverviewFlowContract$FlowPagerItem.Junior)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.security_hub_payees_tab_placeholder, u.c(((PayeesOverviewFlowContract$FlowPagerItem.Junior) payeesOverviewFlowContract$FlowPagerItem).f79007b), null, 12);
            }
            arrayList.add(new q(payeesOverviewFlowContract$FlowPagerItem.getF79006a(), new t(textLocalisedClause), 58));
        }
        return new f(str, arrayList, list.size() > 1);
    }
}
