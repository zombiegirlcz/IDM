package j6b;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$PagerItem;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import k50.a4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data planHubInfoData = domainState.f171720c;
        Intrinsics.checkNotNullParameter(planHubInfoData, "planHubInfoData");
        g gVar = (g) iii.c.f(planHubInfoData, new a4(23), new k1f.n(13), new jb8.b(27));
        String str = domainState.f171719b;
        List<CobrandedCardsPlanHubFlowContract$PagerItem> list = domainState.f171718a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CobrandedCardsPlanHubFlowContract$PagerItem cobrandedCardsPlanHubFlowContract$PagerItem : list) {
            int i2 = k.f171734a[cobrandedCardsPlanHubFlowContract$PagerItem.ordinal()];
            if (i2 == 1) {
                i = R$string.cobrand_plan_hub_overview_tab_title;
            } else if (i2 == 2) {
                i = R$string.cobrand_plan_hub_rewards_tab_title;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.cobrand_plan_hub_transactions_tab_title;
            }
            arrayList.add(new q(cobrandedCardsPlanHubFlowContract$PagerItem.getF94249a(), new t(new TextLocalisedClause(i, null, null, 14)), 50));
        }
        return new h(gVar, str, arrayList);
    }
}
