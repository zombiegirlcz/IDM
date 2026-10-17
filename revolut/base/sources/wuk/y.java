package wuk;

import a83.o0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsControllerContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth_discovery.domain.api.CorporateEventsApi$Toggles$BondCouponEvents;
import i4h.p0;
import igh.b0;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vge.f1;
import vkm.j2;
import vkm.t0;
import vy5.d0;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends oki.h implements h {

    @NotNull
    public static final q Companion = new q();
    public final atk.c A;
    public final h3h.b B;
    public final fsl.m C;
    public final h1h.b D;
    public final dtk.b E;
    public final c4h.c F;
    public final k3h.b G;
    public final ctk.e H;
    public final jtk.b I;
    public final u1d.a J;
    public final aah.h K;
    public final h8b.h L;
    public final i7d.o M;
    public final cli.y N;
    public final BondDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f300216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b4h.c f300217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final owk.a f300218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f300219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ksk.b f300220t;
    public final n2h.a u;
    public final e5d.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final psk.b f300221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rsk.b f300222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e3h.k f300223y;
    public final s2h.e z;

    public y(BondDetailsControllerContract$InputData inputData, ybl.b instrumentTickerInteractor, b4h.c automationsWidgetInteractor, owk.a cfdInstrumentProvider, gte.a featureToggleInteractor, ksk.b aboutIssuerWidgetControllerModelExtension, n2h.a actionsPanelControllerModelExtension, e5d.a airTipWidgetControllerModelExtension, psk.b attributesWidgetControllerModelExtension, rsk.b callDateWidgetControllerModelExtension, e3h.k historicalChartViewControllerModelExtension, s2h.e instrumentBioExtension, atk.c investmentNoticeWidgetControllerModelExtension, h3h.b investmentsWidgetControllerModelExtension, fsl.m investOrdersWidgetProvider, h1h.b transactionsWidgetControllerModelExtension, dtk.b keyStatsControllerModelExtension, c4h.c stockOnboardingInteractor, k3h.b ratingsWidgetControllerModelExtension, ctk.e similarToWidgetControllerModelExtension, jtk.b warningGroupControllerModelExtension, u1d.a watchlistQuickActionsControllerModelExtension, aah.h wealthDisclaimersControllerModelExtension, h8b.h corporateEventsControllerModelExtension, i7d.o helpWidgetControllerModelExtension, b0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(automationsWidgetInteractor, "automationsWidgetInteractor");
        Intrinsics.checkNotNullParameter(cfdInstrumentProvider, "cfdInstrumentProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(aboutIssuerWidgetControllerModelExtension, "aboutIssuerWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(actionsPanelControllerModelExtension, "actionsPanelControllerModelExtension");
        Intrinsics.checkNotNullParameter(airTipWidgetControllerModelExtension, "airTipWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(attributesWidgetControllerModelExtension, "attributesWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(callDateWidgetControllerModelExtension, "callDateWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(historicalChartViewControllerModelExtension, "historicalChartViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(instrumentBioExtension, "instrumentBioExtension");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetControllerModelExtension, "investmentNoticeWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentsWidgetControllerModelExtension, "investmentsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(keyStatsControllerModelExtension, "keyStatsControllerModelExtension");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        Intrinsics.checkNotNullParameter(ratingsWidgetControllerModelExtension, "ratingsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(similarToWidgetControllerModelExtension, "similarToWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(warningGroupControllerModelExtension, "warningGroupControllerModelExtension");
        Intrinsics.checkNotNullParameter(watchlistQuickActionsControllerModelExtension, "watchlistQuickActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(corporateEventsControllerModelExtension, "corporateEventsControllerModelExtension");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f300216p = instrumentTickerInteractor;
        this.f300217q = automationsWidgetInteractor;
        this.f300218r = cfdInstrumentProvider;
        this.f300219s = featureToggleInteractor;
        this.f300220t = aboutIssuerWidgetControllerModelExtension;
        this.u = actionsPanelControllerModelExtension;
        this.v = airTipWidgetControllerModelExtension;
        this.f300221w = attributesWidgetControllerModelExtension;
        this.f300222x = callDateWidgetControllerModelExtension;
        this.f300223y = historicalChartViewControllerModelExtension;
        this.z = instrumentBioExtension;
        this.A = investmentNoticeWidgetControllerModelExtension;
        this.B = investmentsWidgetControllerModelExtension;
        this.C = investOrdersWidgetProvider;
        this.D = transactionsWidgetControllerModelExtension;
        this.E = keyStatsControllerModelExtension;
        this.F = stockOnboardingInteractor;
        this.G = ratingsWidgetControllerModelExtension;
        this.H = similarToWidgetControllerModelExtension;
        this.I = warningGroupControllerModelExtension;
        this.J = watchlistQuickActionsControllerModelExtension;
        this.K = wealthDisclaimersControllerModelExtension;
        this.L = corporateEventsControllerModelExtension;
        this.M = helpWidgetControllerModelExtension;
        ksk.d dVar = (ksk.d) ((j2) ((ksk.g) aboutIssuerWidgetControllerModelExtension).f189480q.f22677a).getValue();
        n2h.f fVar = (n2h.f) ((j2) ((m3h.a) actionsPanelControllerModelExtension).f202569p.f22677a).getValue();
        psk.e eVar = (psk.e) ((j2) ((psk.i) attributesWidgetControllerModelExtension).f239509q.f22677a).getValue();
        rsk.c cVar = (rsk.c) ((j2) ((rsk.j) callDateWidgetControllerModelExtension).f257119s.f22677a).getValue();
        e3h.c cVar2 = (e3h.c) ((j2) ((p0) historicalChartViewControllerModelExtension).f158478y.f22677a).getValue();
        atk.d dVar2 = (atk.d) ((j2) ((atk.l) investmentNoticeWidgetControllerModelExtension).f9094p.f22677a).getValue();
        Data data = new Data(null, null, false, 7, null);
        k3h.d dVar3 = (k3h.d) ((j2) ((a5h.f) ratingsWidgetControllerModelExtension).f1404r.f22677a).getValue();
        ctk.l lVar = (ctk.l) ((j2) ((ctk.r) similarToWidgetControllerModelExtension).f108700n.f22677a).getValue();
        h3h.d dVar4 = (h3h.d) ((j2) ((q4h.d) investmentsWidgetControllerModelExtension).f242166p.f22677a).getValue();
        jtk.i iVar = (jtk.i) ((j2) ((ktk.f) warningGroupControllerModelExtension).o.f22677a).getValue();
        f0 f0Var = f0.f322471a;
        this.N = mra.d.b(this, new j(null, dVar, fVar, eVar, cVar, cVar2, null, dVar2, dVar4, f0Var, null, data, new Data(null, null, false, 7, null), dVar3, lVar, iVar, null, f0Var, null, null, null, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        BondDetailsControllerContract$InputData bondDetailsControllerContract$InputData = this.o;
        String str = bondDetailsControllerContract$InputData.f103901a;
        ael.k kVar = (ael.k) this.f300216p;
        Continuation continuation = null;
        int i = 3;
        yji.l.b1(this, rd0.e.b(kVar.f(str)), null, new r(9, continuation, this), 3);
        yji.l.b1(this, (j2) ((ksk.g) this.f300220t).f189480q.f22677a, null, new r(0, continuation, this), 3);
        yji.l.b1(this, (j2) ((m3h.a) this.u).f202569p.f22677a, null, new r(1, continuation, this), 3);
        yji.l.b1(this, (j2) ((psk.i) this.f300221w).f239509q.f22677a, null, new r(3, continuation, this), 3);
        yji.l.b1(this, (j2) ((rsk.j) this.f300222x).f257119s.f22677a, null, new r(5, continuation, this), 3);
        yji.l.b1(this, (j2) ((p0) this.f300223y).f158478y.f22677a, null, new r(8, continuation, this), 3);
        yji.l.b1(this, this.v.Z2(), null, new r(2, continuation, this), 3);
        String str2 = bondDetailsControllerContract$InputData.f103901a;
        final int i2 = 1;
        yji.l.b1(this, c6d.b.i(u0.m(rd0.e.b(kVar.f(str2)), this.f300218r.a(str2, true)), new Function1(this) { // from class: wuk.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f300206b;

            {
                this.f300206b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        y yVar = this.f300206b;
                        gte.a aVar = yVar.f300219s;
                        u1d.a aVar2 = yVar.J;
                        if (((jte.d) aVar).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c)) {
                            y1d.b.Companion.getClass();
                            return aVar2.c3(y1d.a.f310361h, new Pair(instrument.f214596b, instrument.i.f306286a));
                        }
                        y1d.b.Companion.getClass();
                        return new d0(aVar2.d3(y1d.a.f310361h, instrument.f214596b), 9);
                    case 1:
                        s2h.e eVar = this.f300206b.z;
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        od0.i iVar = (od0.i) pair.f186386b;
                        return iVar.d() ? eVar.b3(nVar, (nel.n) iVar.c()) : eVar.Z2(nVar);
                    default:
                        nel.n instrument2 = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument2, "instrument");
                        return this.f300206b.E.Z2(instrument2);
                }
            }
        }), null, new r(10, continuation, this), 3);
        yji.l.b1(this, (j2) ((atk.l) this.A).f9094p.f22677a, null, new r(11, continuation, this), 3);
        yji.l.b1(this, (j2) ((q4h.d) this.B).f242166p.f22677a, null, new r(12, continuation, this), 3);
        c4h.c cVar = this.F;
        yji.l.b1(this, vkm.q.Q(cVar.a(), new s(1, continuation, this)), null, new r(15, continuation, this), 3);
        yji.l.b1(this, vkm.q.Q(cVar.a(), new wf0.f0(null, this)), null, new r(16, continuation, this), 3);
        yji.l.b1(this, new t38.e(vkm.q.Q(cVar.a(), new s(0, continuation, this)), 24, rd0.e.b(this.f300217q.f.a(TradingAccountType.Gia.f105270a)), new o0(i, 22, continuation)), null, new r(4, continuation, this), 3);
        c cVar2 = new c(3);
        cli.y yVar = this.N;
        final int i3 = 0;
        yji.l.b1(this, boh.f.e(new t0(yVar.B(cVar2), 1), new Function1(this) { // from class: wuk.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f300206b;

            {
                this.f300206b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        y yVar2 = this.f300206b;
                        gte.a aVar = yVar2.f300219s;
                        u1d.a aVar2 = yVar2.J;
                        if (((jte.d) aVar).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c)) {
                            y1d.b.Companion.getClass();
                            return aVar2.c3(y1d.a.f310361h, new Pair(instrument.f214596b, instrument.i.f306286a));
                        }
                        y1d.b.Companion.getClass();
                        return new d0(aVar2.d3(y1d.a.f310361h, instrument.f214596b), 9);
                    case 1:
                        s2h.e eVar = this.f300206b.z;
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        od0.i iVar = (od0.i) pair.f186386b;
                        return iVar.d() ? eVar.b3(nVar, (nel.n) iVar.c()) : eVar.Z2(nVar);
                    default:
                        nel.n instrument2 = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument2, "instrument");
                        return this.f300206b.E.Z2(instrument2);
                }
            }
        }), null, new r(13, continuation, this), 3);
        final int i5 = 2;
        yji.l.b1(this, boh.f.e(new d0(yVar.B(new c(4)), 10), new Function1(this) { // from class: wuk.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f300206b;

            {
                this.f300206b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        y yVar2 = this.f300206b;
                        gte.a aVar = yVar2.f300219s;
                        u1d.a aVar2 = yVar2.J;
                        if (((jte.d) aVar).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c)) {
                            y1d.b.Companion.getClass();
                            return aVar2.c3(y1d.a.f310361h, new Pair(instrument.f214596b, instrument.i.f306286a));
                        }
                        y1d.b.Companion.getClass();
                        return new d0(aVar2.d3(y1d.a.f310361h, instrument.f214596b), 9);
                    case 1:
                        s2h.e eVar = this.f300206b.z;
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        od0.i iVar = (od0.i) pair.f186386b;
                        return iVar.d() ? eVar.b3(nVar, (nel.n) iVar.c()) : eVar.Z2(nVar);
                    default:
                        nel.n instrument2 = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument2, "instrument");
                        return this.f300206b.E.Z2(instrument2);
                }
            }
        }), null, new r(14, continuation, this), 3);
        yji.l.b1(this, (j2) ((a5h.f) this.G).f1404r.f22677a, null, new r(17, continuation, this), 3);
        yji.l.b1(this, (j2) ((ctk.r) this.H).f108700n.f22677a, null, new r(18, continuation, this), 3);
        yji.l.b1(this, rd0.e.e(vkm.q.Q(cVar.a(), new s(2, continuation, this)), h0.f322473a, new f1(i, 27, continuation)), null, new r(19, continuation, this), 3);
        yji.l.b1(this, (j2) ((ktk.f) this.I).o.f22677a, null, new r(20, continuation, this), 3);
        yji.l.b1(this, nim.a.v(u0.m(new t0(yVar.B(new c(1)), 1), this.K.f2828l.w0()), new c(2)), null, new r(21, continuation, this), 3);
        if (((jte.d) this.f300219s).c(CorporateEventsApi$Toggles$BondCouponEvents.f105363c)) {
            yji.l.b1(this, this.L.c3(str2), null, new r(6, continuation, this), 3);
        }
        yji.l.b1(this, this.M.Z2(new i7d.j("stock-details-get-help", new TextLocalisedClause(R.string.contact_us, null, null, 14), new i7d.c("topic.trading"))), null, new r(7, continuation, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.N;
    }
}
