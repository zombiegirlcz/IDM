package xoh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.screener_header_title, null, null, 14);
        TextNavBarMenuItem textNavBarMenuItem = new TextNavBarMenuItem("LIST_ID_MENU_CLEAR_ALL", new TextLocalisedClause(R$string.screener_action_clear_all, null, null, 14), null, null, 12);
        boolean z = domainState.e;
        boolean z3 = domainState.f;
        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page = domainState.f307838b;
        if (!z) {
            textNavBarMenuItem = null;
        }
        List listL = zhm.v.l(textNavBarMenuItem);
        List<ScreenerAllFiltersFlowContract$Page> list = domainState.f307837a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page2 : list) {
            zel.f fVarF = hx7.b.F(screenerAllFiltersFlowContract$Page2);
            arrayList.add(new com.revolut.core.ui_kit.views.q(screenerAllFiltersFlowContract$Page2.getF94249a(), new com.revolut.core.ui_kit.views.u(new TextLocalisedClause(kqh.o.b(fVarF, z3), null, null, 14), kqh.o.a(fVarF)), 58));
        }
        String f94249a = screenerAllFiltersFlowContract$Page.getF94249a();
        zel.f fVarF2 = hx7.b.F(screenerAllFiltersFlowContract$Page);
        Map map = domainState.f307839c;
        return new p(textLocalisedClause, listL, arrayList, f94249a, new o(vph.h.a(fVarF2, (Integer) map.get(screenerAllFiltersFlowContract$Page), z3), map.get(screenerAllFiltersFlowContract$Page) == null));
    }
}
