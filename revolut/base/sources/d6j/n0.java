package d6j;

import com.revolut.data.model.Data;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreenContract$InputData;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import e7l.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 extends oki.h implements r {

    @NotNull
    public static final v Companion = new v();
    public final ppk.f A;
    public final f61.a B;
    public final y5j.g C;
    public final whf.b D;
    public final wsg.n E;
    public final fk3.a F;
    public final ou5.b G;
    public final tv5.b H;
    public final j60.a I;
    public final l80.e J;
    public final j61.b K;
    public final wwk.b L;
    public final b6j.a M;
    public final b4h.c N;
    public final z5j.d O;
    public final vii.c P;
    public final List Q;
    public final cli.y R;
    public final j2 S;
    public final Object T;
    public final CommodityAssetDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x8h.k f111571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f111572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l1d.a f111573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m1d.a f111574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u1d.a f111575t;
    public final fsl.m u;
    public final h1h.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final pcj.a f111576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qzj.b f111577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final aah.h f111578y;
    public final ybl.l z;

    public n0(cli.n stateMapper, CommodityAssetDetailsScreenContract$InputData inputData, x8h.k displayCurrencyInteractor, gte.a featureToggleInteractor, l1d.a alertsExtension, m1d.a alertsModelExtension, u1d.a watchlistExtension, fsl.m investOrdersWidgetProvider, h1h.b transactionsWidgetControllerModelExtension, pcj.a priceTargetsWidgetExtension, qzj.b topStoriesExtension, aah.h disclaimersExtension, ybl.l tradingConfigInteractor, ppk.f ratesInteractor, f61.a plotInteractor, y5j.g chartInteractor, whf.b transactionsListContentProvider, wsg.n walletInteractor, fk3.a configurationInteractor, ou5.b commoditiesPortfolioBalanceInteractor, tv5.b currencyDiscoveryInteractor, j60.a bottomDialog, l80.e dateProvider, j61.b mainWalletTransactionsInteractor, wwk.b tradingHoursExtension, b6j.a actionsPanelExtension, b4h.c automationsWidgetInteractor, z5j.d commodityAssetDetailsOrderFlowCommandProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(alertsExtension, "alertsExtension");
        Intrinsics.checkNotNullParameter(alertsModelExtension, "alertsModelExtension");
        Intrinsics.checkNotNullParameter(watchlistExtension, "watchlistExtension");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(priceTargetsWidgetExtension, "priceTargetsWidgetExtension");
        Intrinsics.checkNotNullParameter(topStoriesExtension, "topStoriesExtension");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(plotInteractor, "plotInteractor");
        Intrinsics.checkNotNullParameter(chartInteractor, "chartInteractor");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(commoditiesPortfolioBalanceInteractor, "commoditiesPortfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(mainWalletTransactionsInteractor, "mainWalletTransactionsInteractor");
        Intrinsics.checkNotNullParameter(tradingHoursExtension, "tradingHoursExtension");
        Intrinsics.checkNotNullParameter(actionsPanelExtension, "actionsPanelExtension");
        Intrinsics.checkNotNullParameter(automationsWidgetInteractor, "automationsWidgetInteractor");
        Intrinsics.checkNotNullParameter(commodityAssetDetailsOrderFlowCommandProvider, "commodityAssetDetailsOrderFlowCommandProvider");
        this.o = inputData;
        this.f111571p = displayCurrencyInteractor;
        this.f111572q = featureToggleInteractor;
        this.f111573r = alertsExtension;
        this.f111574s = alertsModelExtension;
        this.f111575t = watchlistExtension;
        this.u = investOrdersWidgetProvider;
        this.v = transactionsWidgetControllerModelExtension;
        this.f111576w = priceTargetsWidgetExtension;
        this.f111577x = topStoriesExtension;
        this.f111578y = disclaimersExtension;
        this.z = tradingConfigInteractor;
        this.A = ratesInteractor;
        this.B = plotInteractor;
        this.C = chartInteractor;
        this.D = transactionsListContentProvider;
        this.E = walletInteractor;
        this.F = configurationInteractor;
        this.G = commoditiesPortfolioBalanceInteractor;
        this.H = currencyDiscoveryInteractor;
        this.I = bottomDialog;
        this.J = dateProvider;
        this.K = mainWalletTransactionsInteractor;
        this.L = tradingHoursExtension;
        this.M = actionsPanelExtension;
        this.N = automationsWidgetInteractor;
        this.O = commodityAssetDetailsOrderFlowCommandProvider;
        this.P = new vii.c();
        qta.f[] elements = {qta.f.DAY, qta.f.WEEK, qta.f.MONTH, qta.f.SIX_MONTH, qta.f.YEAR, qta.f.FIVE_YEARS, qta.f.ALL};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        this.Q = listL;
        xi0.b bVar = inputData.f99788a;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        Data data6 = new Data(null, null, true, 3, null);
        zhm.f0 f0Var = zhm.f0.f322471a;
        cli.y yVarB = mra.d.b(this, new o(bVar, listL, data, false, data2, data3, null, null, data4, data5, -1, data6, null, f0Var, null, null, null, null, WealthNewsCategory.Commodities.f101804b, null, null, f0Var, new Data(null, null, true, 3, null), false, null), stateMapper, null, false, 12);
        this.R = yVarB;
        this.S = vkm.q.c(((o) ((j2) yVarB.f22677a).getValue()).f111581c);
        this.T = te0.w.y0(new co7.a(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        Object objD3;
        boolean zC = ((jte.d) this.f111572q).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c);
        x8h.k kVar = this.f111571p;
        CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = this.o;
        Continuation continuation = null;
        if (zC) {
            objD3 = mo3.a.g(vkm.q.Q(kVar.a(), new b0(0, this, continuation)), null, new czh.a(23), 1);
        } else {
            y1d.b.Companion.getClass();
            objD3 = this.f111575t.d3(y1d.a.d, commodityAssetDetailsScreenContract$InputData.f99788a.f306286a);
        }
        yji.l.a1(this, new cqh.m(objD3, this, 5), null, null, new e0(8, this, continuation), 3);
        wkm.l lVarQ = vkm.q.Q(kVar.a(), new b0(4, this, continuation));
        zhm.h0 h0Var = zhm.h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new e0(9, this, continuation), 3);
        n2(new d0(2, this, continuation), new whi.b(6));
        y5j.g gVar = this.C;
        yji.l.a1(this, mo3.a.g(new y5j.e(gVar.f311097a.C0("CHART_PERIOD_KEY", String.class), 0), null, new czh.a(21), 1), null, null, new e0(1, this, continuation), 3);
        yji.l.a1(this, mo3.a.g(new y5j.e(gVar.f311097a.C0("CHART_TYPE_KEY", String.class), 1), null, new czh.a(22), 1), null, null, new e0(2, this, continuation), 3);
        Unit unit = Unit.f186387a;
        vii.c cVar = this.P;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(cVar.a(unit, hVar), new b0(1, this, continuation)), h0Var), null, null, null, 7);
        yji.l.a1(this, vkm.q.Q(kVar.a(), new b0(3, this, continuation)), null, null, new e0(7, this, continuation), 3);
        yji.l.a1(this, vkm.q.q(ybl.l.d(this.z)), null, null, new e0(10, this, continuation), 3);
        cli.y yVar = this.R;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        yji.l.a1(this, this.f111577x.b3(((o) j2Var.getValue()).f111591s, commodityAssetDetailsScreenContract$InputData.f99788a.f306286a), null, null, new e0(11, this, continuation), 3);
        yji.l.a1(this, vkm.q.Q(kVar.a(), new b0(5, this, continuation)), null, null, new e0(13, this, continuation), 3);
        xi0.b bVar = ((o) j2Var2.getValue()).f111579a;
        yji.l.a1(this, nim.a.v(rd0.e.b(osg.b.g(this.E, hVar, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, null, 116)), new a94.q(18, bVar)), null, null, new e0(0, this, continuation), 3);
        yji.l.a1(this, new z(rd0.e.b(((ik3.c) this.F).l(g.b.f123407a, hVar)), ((o) j2Var2.getValue()).f111579a, 0), null, null, new f0(0, this, null), 3);
        y1d.b.Companion.getClass();
        Set setB = y0.b(y1d.a.d);
        xi0.b bVar2 = commodityAssetDetailsScreenContract$InputData.f99788a;
        yji.l.a1(this, this.f111574s.Z2(new AlertsWidgetContext(setB, null, new AssetIdWithSymbol(bVar2.f306286a, cp5.d.J(bVar2)), null, zhm.u.c(mgd.d.ACTIVE), o1d.f.ALWAYS, 4278)), null, null, new e0(12, this, continuation), 3);
        yji.l.a1(this, this.f111578y.f2828l.s1(), null, null, new e0(6, this, continuation), 3);
        yji.l.a1(this, this.L.Z2(), null, null, new f0(1, this, null), 3);
        l2(new d0(1, this, continuation), new yi5.b(26));
    }

    public final void I2() {
        y5j.b chartType;
        y5j.b bVar = ((o) ((j2) this.R.f22677a).getValue()).f111583h;
        int i = bVar == null ? -1 : w.f111607a[bVar.ordinal()];
        if (i == 1) {
            chartType = y5j.b.CANDLESTICK;
        } else if (i != 2) {
            return;
        } else {
            chartType = y5j.b.LINE;
        }
        y5j.g gVar = this.C;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        z9h.n.l(String.class, gVar.f311097a, "CHART_TYPE_KEY", chartType.name());
    }

    @Override // yji.l
    public final void T1(long j2) {
        xi0.b bVar = ((o) ((j2) this.R.f22677a).getValue()).f111579a;
        Continuation continuation = null;
        yji.l.b1(this, ((fsl.w) this.u).a(new InvestOrdersParams.OrdersByCurrencies(y0.b(bVar), k4l.d.COMMODITIES, 28)), null, new chf.a(this, bVar, continuation, 8), 3);
        CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = this.o;
        yji.l.a1(this, this.N.b(new y2h.a(commodityAssetDetailsScreenContract$InputData.f99788a)), null, null, new e0(14, this, continuation), 3);
        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
        List currencyToAccountTypeList = zhm.u.c(new Pair(commodityAssetDetailsScreenContract$InputData.f99788a, WealthAccountType.COMMODITIES));
        companion.getClass();
        Intrinsics.checkNotNullParameter(currencyToAccountTypeList, "currencyToAccountTypeList");
        List list = currencyToAccountTypeList;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add((xi0.b) ((Pair) it8.next()).f186385a);
        }
        SortedSet sortedSetP = zhm.c0.P(arrayList, new dfl.o());
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList2.add((WealthAccountType) ((Pair) it9.next()).f186386b);
        }
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImpl = new InvestTransactionsFilter.InvestTransactionsFilterImpl(zhm.c0.O(arrayList2), sortedSetP, null, null, null, null, null, 124);
        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
        yji.l.b1(this, this.v.c3(investTransactionsFilterImpl, w4l.i.f294643c, new h1h.c(new InvestTransactionsListContract$Disclaimers(false, 13), 1)), null, new e0(15, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.R;
    }
}
