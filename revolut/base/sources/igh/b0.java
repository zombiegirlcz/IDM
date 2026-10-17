package igh;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.private_equity.api.WealthPrivateEquityApi$Toggles$PreTradeStateRevamp;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$Action;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.b;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import mx0.d7;
import rnd.d0;
import z0h.q1;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161195a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3h.c f161196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3h.f f161197c;
    public final fsl.k d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f161198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f161199h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f161200j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f161201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f161202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f161203n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f161204p;

    public b0(w navBarMapper, e3h.f historicalChartMapper, q investmentsMapper, z performanceMapper, j highlightsMapper, f allocationMapper, t keyDetailsMapper, n featuredHoldingsMapper, c allHoldingsMapper, a0 portfolioUpdatesMapper, a4h.d documentsWidgetMapper, fsl.k ordersWidgetMapper, g helpMapper, m3h.c actionsPanelMapper, d1h.h disclaimersMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(historicalChartMapper, "historicalChartMapper");
        Intrinsics.checkNotNullParameter(investmentsMapper, "investmentsMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(highlightsMapper, "highlightsMapper");
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        Intrinsics.checkNotNullParameter(keyDetailsMapper, "keyDetailsMapper");
        Intrinsics.checkNotNullParameter(featuredHoldingsMapper, "featuredHoldingsMapper");
        Intrinsics.checkNotNullParameter(allHoldingsMapper, "allHoldingsMapper");
        Intrinsics.checkNotNullParameter(portfolioUpdatesMapper, "portfolioUpdatesMapper");
        Intrinsics.checkNotNullParameter(documentsWidgetMapper, "documentsWidgetMapper");
        Intrinsics.checkNotNullParameter(ordersWidgetMapper, "ordersWidgetMapper");
        Intrinsics.checkNotNullParameter(helpMapper, "helpMapper");
        Intrinsics.checkNotNullParameter(actionsPanelMapper, "actionsPanelMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.e = navBarMapper;
        this.f161197c = historicalChartMapper;
        this.f = investmentsMapper;
        this.f161198g = performanceMapper;
        this.f161199h = highlightsMapper;
        this.i = allocationMapper;
        this.f161200j = keyDetailsMapper;
        this.k = featuredHoldingsMapper;
        this.f161201l = allHoldingsMapper;
        this.f161202m = portfolioUpdatesMapper;
        this.f161203n = documentsWidgetMapper;
        this.d = ordersWidgetMapper;
        this.f161196b = actionsPanelMapper;
        this.o = disclaimersMapper;
        this.f161204p = featureToggleInteractor;
    }

    public List a(wfh.l lVar, boolean z) {
        j jVar = (j) this.f161199h;
        Data details = lVar.d;
        Data instrument = lVar.f297121b;
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return (List) iii.c.f(t1.t(details, instrument), new g7b.q(jVar, z, 24), new ieg.y(7), new ajd.t(jVar, z, 6));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Object textClause;
        com.revolut.feature.wealth.private_equity.impl.ui.fund_details.b bVar;
        gte.a aVar;
        List list;
        List list2;
        boolean z;
        List list3;
        List list4;
        List list5;
        List listC;
        aim.e eVarA;
        wuk.n nVar;
        Collection collection;
        List listA;
        Collection collection2;
        switch (this.f161195a) {
            case 0:
                gte.a aVar2 = (gte.a) this.f161204p;
                wfh.l domainState = (wfh.l) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                w wVar = (w) this.e;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                gte.a aVar3 = wVar.f161222a;
                WealthPrivateEquityApi$Toggles$PreTradeStateRevamp wealthPrivateEquityApi$Toggles$PreTradeStateRevamp = WealthPrivateEquityApi$Toggles$PreTradeStateRevamp.f95727c;
                if (((jte.d) aVar3).c(wealthPrivateEquityApi$Toggles$PreTradeStateRevamp)) {
                    bVar = (b.a) iii.c.f(domainState.f297121b, new k(4), new ieg.y(12), new o(wVar, domainState, 2));
                } else {
                    InstrumentTicker instrumentTicker = (InstrumentTicker) domainState.f297122c.getContent();
                    dj0.d dVar = instrumentTicker != null ? instrumentTicker.e : null;
                    if (dVar != null) {
                        textClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    } else {
                        m70.a.c(t0.f186434a);
                        textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    bVar = (b.AbstractC0588b) iii.c.f(domainState.f297121b, new k(3), new ieg.y(11), new ieg.z(wVar, domainState, textClause, 1));
                }
                x2h.b bVarA = this.f161196b.a(domainState.o.f211545a);
                Data data = domainState.u;
                Data details = domainState.d;
                boolean zJ = pd.b.j((Boolean) data.getContent());
                e3h.c historicalChartDomainState = domainState.i;
                List listA2 = (((jte.d) aVar2).c(wealthPrivateEquityApi$Toggles$PreTradeStateRevamp) || (domainState.f() && !zJ)) ? f0.f322471a : this.f161197c.a(historicalChartDomainState);
                Data tradingLegalEntityInformation = domainState.f297129p;
                if (tradingLegalEntityInformation != null) {
                    q qVar = (q) this.f;
                    Data instrumentBalance = domainState.f297132s;
                    Intrinsics.checkNotNullParameter(instrumentBalance, "instrumentBalance");
                    Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                    aVar = aVar2;
                    list = (List) iii.c.f(t1.t(instrumentBalance, tradingLegalEntityInformation), new k(qVar, 1), new ieg.y(9), new o(qVar, 0));
                } else {
                    aVar = aVar2;
                    list = null;
                }
                if (list == null) {
                    list = f0.f322471a;
                }
                if (!domainState.f() || zJ) {
                    list2 = list;
                    z = zJ;
                    list3 = null;
                } else {
                    c cVar = (c) this.f161201l;
                    boolean z3 = domainState.f297124h;
                    Intrinsics.checkNotNullParameter(details, "details");
                    list2 = list;
                    z = zJ;
                    list3 = (List) iii.c.f(details, new id8.a(cVar, 28), new ieg.y(5), new ajd.t(cVar, z3, 5));
                }
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                if (domainState.f()) {
                    a0 a0Var = (a0) this.f161202m;
                    Intrinsics.checkNotNullParameter(details, "details");
                    list4 = (List) iii.c.f(details, new k(6), new ieg.y(15), new i6j.q(a0Var, 9));
                } else {
                    list4 = null;
                }
                if (list4 == null) {
                    list4 = f0.f322471a;
                }
                z zVar = (z) this.f161198g;
                Data instrument = domainState.f297121b;
                Data instrumentTicker2 = domainState.f297122c;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(details, "details");
                Intrinsics.checkNotNullParameter(instrumentTicker2, "instrumentTicker");
                Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
                List list6 = list3;
                List list7 = list4;
                List list8 = (List) iii.c.f(t1.u(instrument, details, instrumentTicker2), new i9e.a(zVar, 24), new ieg.y(14), new ieg.z(zVar, historicalChartDomainState, 2));
                List listB = ((fsl.u) this.d).b(domainState, new fsl.j(null, 3));
                f fVar = (f) this.i;
                Data holdingInstruments = domainState.e;
                wfh.j jVar2 = domainState.f;
                Set expandedItems = domainState.f297123g;
                Intrinsics.checkNotNullParameter(details, "details");
                Intrinsics.checkNotNullParameter(holdingInstruments, "holdingInstruments");
                Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
                List list9 = listA2;
                Collection collection3 = (List) iii.c.f(t1.t(details, holdingInstruments), new id8.a(fVar, 29), new ieg.y(6), new a0i.a(fVar, 22, jVar2, expandedItems));
                if (collection3 == null) {
                    collection3 = f0.f322471a;
                }
                t tVar = (t) this.f161200j;
                Data orderLimits = domainState.f297133t;
                Intrinsics.checkNotNullParameter(details, "details");
                Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
                List list10 = (List) iii.c.f(t1.t(details, orderLimits), new k(tVar, 2), new ieg.y(10), new o(tVar, 1));
                if (!domainState.f() || z) {
                    n nVar2 = (n) this.k;
                    boolean zF = domainState.f();
                    Intrinsics.checkNotNullParameter(details, "details");
                    list5 = (List) iii.c.f(details, new k(nVar2, 0), new ieg.y(8), new ajd.t(nVar2, zF, 7));
                } else {
                    list5 = null;
                }
                if (list5 == null) {
                    list5 = f0.f322471a;
                }
                Collection collection4 = domainState.f297126l;
                if (collection4 == null) {
                    collection4 = f0.f322471a;
                }
                List listB2 = ((a4h.d) this.f161203n).b(domainState);
                CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("FUND_DETAILS_GET_HELP_BUTTON", new TextLocalisedClause(R$string.wealth_private_equity_fund_details_get_help, null, null, 14), 0, false, FundDetailsScreenContract$Action.NavigateToFaq.f95741a, null, null, 2028);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                List listC2 = zhm.u.c(model);
                d1h.g gVar = domainState.f297131r;
                if (gVar != null) {
                    listC = ((gah.g) ((d1h.h) this.o)).c(gVar, d7.DISCLAIMER);
                    yp0.b.q(listC, 0, 0, 0, 0, 15);
                } else {
                    listC = f0.f322471a;
                }
                if (((jte.d) aVar).c(wealthPrivateEquityApi$Toggles$PreTradeStateRevamp)) {
                    aim.e eVarB = zhm.u.b();
                    eVarB.addAll(list2);
                    eVarB.addAll(listB);
                    eVarB.addAll(list6);
                    eVarB.addAll(list7);
                    eVarB.addAll(a(domainState, true ^ eVarB.isEmpty()));
                    eVarB.addAll(list8);
                    eVarB.addAll(collection3);
                    eVarB.addAll(list5);
                    eVarB.addAll(list10);
                    eVarB.addAll(collection4);
                    eVarB.addAll(listB2);
                    eVarB.addAll(listC2);
                    eVarB.addAll(listC);
                    eVarA = zhm.u.a(eVarB);
                } else {
                    aim.e eVarB2 = zhm.u.b();
                    eVarB2.addAll(list9);
                    eVarB2.addAll(list2);
                    eVarB2.addAll(list6);
                    eVarB2.addAll(list7);
                    eVarB2.addAll(list8);
                    eVarB2.addAll(listB);
                    eVarB2.addAll(a(domainState, true));
                    eVarB2.addAll(collection3);
                    eVarB2.addAll(list5);
                    eVarB2.addAll(collection4);
                    eVarB2.addAll(list10);
                    eVarB2.addAll(listB2);
                    eVarB2.addAll(listC2);
                    eVarB2.addAll(listC);
                    eVarA = zhm.u.a(eVarB2);
                }
                return new wfh.o(bVar, bVarA, eVarA);
            default:
                wuk.j domainState2 = (wuk.j) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                Data data2 = domainState2.f300182a;
                if (data2 == null || (nVar = (wuk.n) iii.c.f(data2, new wuk.c(5), new wug.k(1), new vh2.o(this, domainState2, 25))) == null) {
                    nVar = wuk.l.f300200a;
                }
                s0 s0Var = new s0(18);
                s0Var.b(((jtk.l) this.f161203n).a(domainState2.f300191p).toArray(new koi.j[0]));
                s0Var.b(this.f161197c.a(domainState2.f).toArray(new qv0.i[0]));
                Collection collection5 = domainState2.f300185g;
                if (collection5 == null) {
                    collection5 = f0.f322471a;
                }
                s0Var.b(collection5.toArray(new koi.j[0]));
                s0Var.b(((atk.a) this.i).a(domainState2.f300186h).toArray(new koi.j[0]));
                rsk.k kVar = (rsk.k) this.f161199h;
                rsk.c domainState3 = domainState2.e;
                Intrinsics.checkNotNullParameter(domainState3, "domainState");
                Data data3 = domainState3.f257101a;
                if (data3 == null || (collection = (List) iii.c.f(data3, new rpi.e(27), new d0(21), new ri4.o(kVar, 9))) == null) {
                    collection = f0.f322471a;
                }
                s0Var.b(collection.toArray(new koi.j[0]));
                s0Var.b(((q4h.g) this.f161200j).a(domainState2.i).toArray(new koi.j[0]));
                s0Var.b(((fsl.u) this.d).b(domainState2, new fsl.j(null, 3)).toArray(new qv0.i[0]));
                s0Var.b(((n3h.e) this.f161198g).a(domainState2).toArray(new qv0.i[0]));
                t1j.b bVar2 = (t1j.b) this.k;
                Data keyStatsState = domainState2.f300189m;
                Intrinsics.checkNotNullParameter(keyStatsState, "keyStatsState");
                dtk.c cVar2 = (dtk.c) keyStatsState.getContent();
                if (cVar2 == null || (listA = ((dtk.a) bVar2.f267380b).a(cVar2)) == null) {
                    listA = f0.f322471a;
                }
                s0Var.b(listA.toArray(new koi.j[0]));
                s0Var.b(((a5h.i) this.f161201l).a(domainState2.f300190n).toArray(new koi.j[0]));
                s0Var.b(domainState2.f300193r.toArray(new koi.j[0]));
                psk.j jVar3 = (psk.j) this.f;
                psk.e state = domainState2.d;
                Intrinsics.checkNotNullParameter(state, "state");
                nel.n nVar3 = state.f239500a;
                Data data4 = state.f239501b;
                List list11 = (nVar3 == null || data4 == null) ? null : (List) iii.c.f(data4, new pqg.v(jVar3), new pof.e(24), new f4h.b(jVar3, nVar3));
                if (list11 == null) {
                    list11 = f0.f322471a;
                }
                s0Var.b(list11.toArray(new koi.j[0]));
                s0Var.b(domainState2.f300187j.toArray(new koi.j[0]));
                Collection collection6 = domainState2.k;
                if (collection6 == null) {
                    collection6 = f0.f322471a;
                }
                s0Var.b(collection6.toArray(new koi.j[0]));
                ksk.i iVar = (ksk.i) this.e;
                ksk.d domainState4 = domainState2.f300183b;
                Intrinsics.checkNotNullParameter(domainState4, "domainState");
                Data data5 = domainState4.f189474a;
                if (data5 == null || (collection2 = (List) iii.c.f(data5, new ksk.h(iVar, 0), new koe.x(29), new k8d.t(iVar, 12))) == null) {
                    collection2 = f0.f322471a;
                }
                s0Var.b(collection2.toArray(new koi.j[0]));
                s0Var.b(((ctk.t) this.f161202m).a(domainState2.o).toArray(new koi.j[0]));
                Collection collection7 = domainState2.f300196w;
                if (collection7 == null) {
                    collection7 = f0.f322471a;
                }
                s0Var.b(collection7.toArray(new koi.j[0]));
                Data data6 = domainState2.f300192q;
                List listB3 = data6 != null ? ((aah.m) ((q1) this.f161204p)).b(data6) : null;
                if (listB3 == null) {
                    listB3 = f0.f322471a;
                }
                s0Var.b(listB3.toArray(new qv0.i[0]));
                ArrayList arrayList = s0Var.f186433a;
                return new wuk.o(nVar, zhm.v.k(arrayList.toArray(new koi.j[arrayList.size()])), this.f161196b.a(domainState2.f300184c.f211545a));
        }
    }

    public b0(yuk.a headerMapper, ksk.i aboutIssuerWidgetMapper, m3h.c actionsPanelMapper, psk.j attributesWidgetMapper, n3h.e automationsWidgetMapper, rsk.k callDateWidgetMapper, e3h.f historicalChartMapper, atk.a investmentNoticeWidgetMapper, q4h.g investmentsWidgetMapper, fsl.k investOrdersWidgetMapper, t1j.b keyStatsMapper, a5h.i ratingsWidgetMapper, ctk.t similarToWidgetMapper, jtk.l warningGroupMapper, o3d.f watchlistQuickActionsMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(aboutIssuerWidgetMapper, "aboutIssuerWidgetMapper");
        Intrinsics.checkNotNullParameter(actionsPanelMapper, "actionsPanelMapper");
        Intrinsics.checkNotNullParameter(attributesWidgetMapper, "attributesWidgetMapper");
        Intrinsics.checkNotNullParameter(automationsWidgetMapper, "automationsWidgetMapper");
        Intrinsics.checkNotNullParameter(callDateWidgetMapper, "callDateWidgetMapper");
        Intrinsics.checkNotNullParameter(historicalChartMapper, "historicalChartMapper");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetMapper, "investmentNoticeWidgetMapper");
        Intrinsics.checkNotNullParameter(investmentsWidgetMapper, "investmentsWidgetMapper");
        Intrinsics.checkNotNullParameter(investOrdersWidgetMapper, "investOrdersWidgetMapper");
        Intrinsics.checkNotNullParameter(keyStatsMapper, "keyStatsMapper");
        Intrinsics.checkNotNullParameter(ratingsWidgetMapper, "ratingsWidgetMapper");
        Intrinsics.checkNotNullParameter(similarToWidgetMapper, "similarToWidgetMapper");
        Intrinsics.checkNotNullParameter(warningGroupMapper, "warningGroupMapper");
        Intrinsics.checkNotNullParameter(watchlistQuickActionsMapper, "watchlistQuickActionsMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.e = aboutIssuerWidgetMapper;
        this.f161196b = actionsPanelMapper;
        this.f = attributesWidgetMapper;
        this.f161198g = automationsWidgetMapper;
        this.f161199h = callDateWidgetMapper;
        this.f161197c = historicalChartMapper;
        this.i = investmentNoticeWidgetMapper;
        this.f161200j = investmentsWidgetMapper;
        this.d = investOrdersWidgetMapper;
        this.k = keyStatsMapper;
        this.f161201l = ratingsWidgetMapper;
        this.f161202m = similarToWidgetMapper;
        this.f161203n = warningGroupMapper;
        this.o = watchlistQuickActionsMapper;
        this.f161204p = wealthDisclaimersMapper;
    }
}
