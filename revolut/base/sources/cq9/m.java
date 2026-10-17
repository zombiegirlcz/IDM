package cq9;

import cli.n;
import com.revolut.data.model.Data;
import h30.q;
import h87.s;
import java.util.List;
import java.util.Set;
import jul.o;
import kotlin.jvm.internal.Intrinsics;
import ojk.g0;
import z0h.q1;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108057a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f108058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f108059c;
    public final Object d;
    public final Object e;

    public m(iuj.b challengesMapper, iuj.h referralsMapper, iuj.f questsMapper, iuj.c headerMapper) {
        Intrinsics.checkNotNullParameter(challengesMapper, "challengesMapper");
        Intrinsics.checkNotNullParameter(referralsMapper, "referralsMapper");
        Intrinsics.checkNotNullParameter(questsMapper, "questsMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        this.f108058b = challengesMapper;
        this.f108059c = referralsMapper;
        this.d = questsMapper;
        this.e = headerMapper;
    }

    public List a(q87.j jVar) {
        List list;
        eel.c selectedPeriod = jVar.f;
        if (selectedPeriod != null) {
            t87.l lVar = (t87.l) this.e;
            Data indexesHistoricalData = jVar.e;
            Set indexesActive = jVar.f243023h;
            List marketAvailableChartPeriods = t87.m.f268859a;
            Intrinsics.checkNotNullParameter(indexesHistoricalData, "indexesHistoricalData");
            Intrinsics.checkNotNullParameter(indexesActive, "indexesActive");
            Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
            Intrinsics.checkNotNullParameter(marketAvailableChartPeriods, "marketAvailableChartPeriods");
            list = (List) iii.c.f(indexesHistoricalData, new t87.i(lVar, selectedPeriod, marketAvailableChartPeriods, 0), new t87.j(lVar, selectedPeriod, marketAvailableChartPeriods, 0), new ccg.b(lVar, selectedPeriod, marketAvailableChartPeriods, indexesActive, 9));
        } else {
            list = null;
        }
        return list == null ? f0.f322471a : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0453  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v16 */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r76) {
        /*
            Method dump skipped, instruction units count: 2256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cq9.m.c(cli.j):cli.o");
    }

    public m(rzb.d itemsMapper, rzb.a footerMapper, rzb.b headerMapper, os2.g menuItemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(menuItemsMapper, "menuItemsMapper");
        this.f108058b = itemsMapper;
        this.f108059c = footerMapper;
        this.d = headerMapper;
        this.e = menuItemsMapper;
    }

    public m(ttk.c gaugeWidgetMapper, utk.e priceTargetsWidgetMapper, vtk.c ratingDistributionWidgetMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(gaugeWidgetMapper, "gaugeWidgetMapper");
        Intrinsics.checkNotNullParameter(priceTargetsWidgetMapper, "priceTargetsWidgetMapper");
        Intrinsics.checkNotNullParameter(ratingDistributionWidgetMapper, "ratingDistributionWidgetMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f108058b = gaugeWidgetMapper;
        this.f108059c = priceTargetsWidgetMapper;
        this.d = ratingDistributionWidgetMapper;
        this.e = wealthDisclaimersMapper;
    }

    public m(eq9.a addSplitItemFooterMapper, eq9.e addSplitItemMenuMapper, i4b.f addSplitItemTitleMapper, eq9.c addSplitItemItemsMapper) {
        Intrinsics.checkNotNullParameter(addSplitItemFooterMapper, "addSplitItemFooterMapper");
        Intrinsics.checkNotNullParameter(addSplitItemMenuMapper, "addSplitItemMenuMapper");
        Intrinsics.checkNotNullParameter(addSplitItemTitleMapper, "addSplitItemTitleMapper");
        Intrinsics.checkNotNullParameter(addSplitItemItemsMapper, "addSplitItemItemsMapper");
        this.f108058b = addSplitItemFooterMapper;
        this.f108059c = addSplitItemMenuMapper;
        this.d = addSplitItemTitleMapper;
        this.e = addSplitItemItemsMapper;
    }

    public m(g0 itemsMapper, imk.n onboardingMapper, imk.l headerMapper, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(onboardingMapper, "onboardingMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f108058b = itemsMapper;
        this.f108059c = onboardingMapper;
        this.d = headerMapper;
        this.e = legalEntityDisclaimerMapper;
    }

    public m(jeh.a navBarMapper, e3h.f historicalChartMapper, a4h.d documentsWidgetMapper, fsl.k ordersWidgetMapper, m3h.c actionsPanelMapper) {
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(historicalChartMapper, "historicalChartMapper");
        Intrinsics.checkNotNullParameter(documentsWidgetMapper, "documentsWidgetMapper");
        Intrinsics.checkNotNullParameter(ordersWidgetMapper, "ordersWidgetMapper");
        Intrinsics.checkNotNullParameter(actionsPanelMapper, "actionsPanelMapper");
        this.f108058b = historicalChartMapper;
        this.f108059c = documentsWidgetMapper;
        this.d = ordersWidgetMapper;
        this.e = actionsPanelMapper;
    }

    public m(q fieldsMapper, j4j.k navBarMapper, o buttonStateMapper, ty9.b sendFromClipboardItemProvider) {
        Intrinsics.checkNotNullParameter(fieldsMapper, "fieldsMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(buttonStateMapper, "buttonStateMapper");
        Intrinsics.checkNotNullParameter(sendFromClipboardItemProvider, "sendFromClipboardItemProvider");
        this.f108058b = fieldsMapper;
        this.f108059c = navBarMapper;
        this.d = buttonStateMapper;
        this.e = sendFromClipboardItemProvider;
    }

    public m(s collectionMapper, q1 wealthDisclaimersMapper, s87.d economicIndicatorsRedesignedMapper, t87.l mainIndexesChartBuilder) {
        Intrinsics.checkNotNullParameter(collectionMapper, "collectionMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(economicIndicatorsRedesignedMapper, "economicIndicatorsRedesignedMapper");
        Intrinsics.checkNotNullParameter(mainIndexesChartBuilder, "mainIndexesChartBuilder");
        this.f108058b = collectionMapper;
        this.f108059c = wealthDisclaimersMapper;
        this.d = economicIndicatorsRedesignedMapper;
        this.e = mainIndexesChartBuilder;
    }

    public m(x7f.a insightsBlocksMapper, v7f.f drawdownStateMapper, pak.h riskLevelItemsMapper, d1h.h disclaimersMapper) {
        Intrinsics.checkNotNullParameter(insightsBlocksMapper, "insightsBlocksMapper");
        Intrinsics.checkNotNullParameter(drawdownStateMapper, "drawdownStateMapper");
        Intrinsics.checkNotNullParameter(riskLevelItemsMapper, "riskLevelItemsMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        this.f108058b = insightsBlocksMapper;
        this.f108059c = drawdownStateMapper;
        this.d = riskLevelItemsMapper;
        this.e = disclaimersMapper;
    }

    public m(s4f.q collectionItemsMapper, nd.m navBarMapper, s4f.s disclaimerMapper, t5d.d swipeTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(collectionItemsMapper, "collectionItemsMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        Intrinsics.checkNotNullParameter(swipeTradeActionsMapper, "swipeTradeActionsMapper");
        this.f108058b = collectionItemsMapper;
        this.f108059c = navBarMapper;
        this.d = disclaimerMapper;
        this.e = swipeTradeActionsMapper;
    }
}
