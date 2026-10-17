package puk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$Page;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x2h.b;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3h.a f239963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3d.f f239964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3h.c f239965c;

    public u(c3h.a assetDetailsHeaderMapper, q2d.a alertsQuickActionsMapper, o3d.f watchlistQuickActionsMapper, m3h.c actionsPanelMapper) {
        Intrinsics.checkNotNullParameter(assetDetailsHeaderMapper, "assetDetailsHeaderMapper");
        Intrinsics.checkNotNullParameter(alertsQuickActionsMapper, "alertsQuickActionsMapper");
        Intrinsics.checkNotNullParameter(watchlistQuickActionsMapper, "watchlistQuickActionsMapper");
        Intrinsics.checkNotNullParameter(actionsPanelMapper, "actionsPanelMapper");
        this.f239963a = assetDetailsHeaderMapper;
        this.f239964b = watchlistQuickActionsMapper;
        this.f239965c = actionsPanelMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        j jVar2 = (j) iii.c.f(domainState.f239930c, new pui.a(7), new psl.m(18), new ox2.d(this, domainState, 22));
        List<StockDetailsFlowControllerContract$Page> list = domainState.f239929b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page : list) {
            switch (t.f239962a[stockDetailsFlowControllerContract$Page.ordinal()]) {
                case 1:
                    i = R$string.wealth_stock_details_tab_overview;
                    break;
                case 2:
                    i = R$string.wealth_stock_details_tab_options;
                    break;
                case 3:
                    i = R$string.wealth_trading_instrument_financials_title;
                    break;
                case 4:
                    i = R$string.wealth_stock_details_tab_news;
                    break;
                case 5:
                    i = R$string.trading_asset_details_order_book_tab_title;
                    break;
                case 6:
                    i = R$string.wealth_stock_details_tab_feed;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new com.revolut.core.ui_kit.views.q(stockDetailsFlowControllerContract$Page.getF94249a(), new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(i, null, null, 14)), 58));
        }
        String str = domainState.f239928a;
        return new k(jVar2, arrayList, str, Intrinsics.f(str, StockDetailsFlowControllerContract$Page.OPTIONS.getF94249a()) ? b.C1676b.f302573a : this.f239965c.a(domainState.f.f211545a));
    }
}
