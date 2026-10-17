package dnc;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioAllocationsDetailsScreenContract$InputData f116278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yoc.a f116279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f116280c;
    public final g d;
    public final nmc.d e;
    public final jlc.s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final spc.h f116281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f116282h;

    public t(PortfolioAllocationsDetailsScreenContract$InputData inputData, yoc.a allocationMapper, h tabsMapper, g contentMapper, nmc.d roboPortfolioUiMapper, jlc.s roboFooterDisclaimersWidgetMapper, spc.h rebalanceStatusMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        Intrinsics.checkNotNullParameter(tabsMapper, "tabsMapper");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetMapper, "roboFooterDisclaimersWidgetMapper");
        Intrinsics.checkNotNullParameter(rebalanceStatusMapper, "rebalanceStatusMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f116278a = inputData;
        this.f116279b = allocationMapper;
        this.f116280c = tabsMapper;
        this.d = contentMapper;
        this.e = roboPortfolioUiMapper;
        this.f = roboFooterDisclaimersWidgetMapper;
        this.f116281g = rebalanceStatusMapper;
        this.f116282h = featureToggleInteractor;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List listA;
        int i;
        int i2;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PortfolioAllocationsDetailsScreenContract$InputData inputData = this.f116278a;
        List listA2 = this.f116279b.a(inputData.f85153c);
        l lVar = domainState.f116257a;
        ((y) this.f116280c).getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        FixedTabs.Item item = new FixedTabs.Item(l.STOCKS_TAB_ID.a(), new TextLocalisedClause(R$string.wealth_robo_porfolio_portfolio_allocation_stocks, null, null, 14), (AnalyticsContext) null, 12);
        if (((List) inputData.e.getValue()).isEmpty()) {
            item = null;
        }
        FixedTabs.Item item2 = new FixedTabs.Item(l.BONDS_TAB_ID.a(), new TextLocalisedClause(R$string.wealth_robo_porfolio_portfolio_allocation_bonds, null, null, 14), (AnalyticsContext) null, 12);
        if (((List) inputData.f.getValue()).isEmpty()) {
            item2 = null;
        }
        FixedTabs.Item item3 = new FixedTabs.Item(l.COMMODITIES_TAB_ID.a(), new TextLocalisedClause(R$string.wealth_robo_porfolio_portfolio_allocation_commodities, null, null, 14), (AnalyticsContext) null, 12);
        if (((List) inputData.f85154g.getValue()).isEmpty()) {
            item3 = null;
        }
        FixedTabs.Item item4 = new FixedTabs.Item(l.CASH_TAB_ID.a(), new TextLocalisedClause(R$string.wealth_robo_porfolio_portfolio_allocation_cash, null, null, 14), (AnalyticsContext) null, 12);
        if (((List) inputData.f85155h.getValue()).isEmpty()) {
            item4 = null;
        }
        FixedTabs.Item[] elements = {item, item2, item3, item4};
        Intrinsics.checkNotNullParameter(elements, "elements");
        FixedTabsDelegate.Model model = new FixedTabsDelegate.Model("asset-subclasses-listId", kotlin.collections.d.L(elements), lVar != null ? lVar.a() : null, false, null, SyslogConstants.LOG_CLOCK);
        x xVar = (x) this.d;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        l lVar2 = domainState.f116257a;
        int i3 = lVar2 == null ? -1 : u.f116283a[lVar2.ordinal()];
        if (i3 == -1) {
            listA = xVar.d;
        } else if (i3 == 1) {
            listA = xVar.a(domainState.f116258b, i.STOCKS);
        } else if (i3 == 2) {
            listA = xVar.a(domainState.f116259c, i.BONDS);
        } else if (i3 == 3) {
            listA = xVar.a(domainState.d, i.COMMODITIES);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            listA = (List) xVar.f116285b.getValue();
        }
        List listA3 = ((ppc.t) this.f).a(domainState.e);
        List list = (List) iii.c.f(new Data(inputData.f85152b, null, false, 6, null), new soi.a(7), new sl5.g(19), new rd3.x(this.f116281g, 29));
        if (list == null) {
            list = f0.f322471a;
        }
        boolean z = ((jte.d) this.f116282h).c(WealthUiApi$Toggles.RoboStrategies.f95863c) && domainState.f == ilc.a.GB;
        int i5 = s.f116277a[inputData.d.ordinal()];
        if (i5 == 1) {
            i = R$string.wealth_robo_portfolio_portfolio_allocation;
            i2 = z ? R$string.wealth_robo_portfolio_portfolio_allocation_subtitle_rebrand : R$string.wealth_robo_portfolio_portfolio_allocation_subtitle;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_robo_portfolio_portfolio_allocation_target_allocation;
            i2 = z ? R$string.wealth_robo_portfolio_portfolio_allocation_subtitle_target_allocation_rebrand : R$string.wealth_robo_portfolio_portfolio_allocation_subtitle_target_allocation;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, zhm.u.c(this.e.g(inputData.f85151a)), null, 12);
        List listO = i2b.a.o(listA2, list);
        yp0.b.k(listO, 0, 0, 0, 0, 31);
        List listQ = i2b.a.q(model, listA);
        yp0.b.k(listQ, 0, 0, 0, 0, 31);
        return new m(textLocalisedClause, textLocalisedClause2, zhm.w.u(zhm.v.k(listO, listQ, listA3)));
    }
}
