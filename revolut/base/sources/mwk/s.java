package mwk;

import a83.o0;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewControllerContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import i4h.p0;
import klf.l1;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends oki.h implements h {

    @NotNull
    public static final l Companion = new l();
    public final ftk.k A;
    public final h1h.b B;
    public final jtk.b C;
    public final s2h.e D;
    public final m1d.a E;
    public final h8b.h F;
    public final dtk.b G;
    public final tsk.c H;
    public final xsk.b I;
    public final b4h.c J;
    public final c4h.c K;
    public final itk.a L;
    public final e5d.a M;
    public final i7d.o N;
    public final y O;
    public final StockDetailsOverviewControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f209526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final owk.a f209527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qdf.b f209528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e3h.k f209529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final atk.c f209530t;
    public final ctk.e u;
    public final osk.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final aah.h f209531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zsk.c f209532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h3h.b f209533y;
    public final fsl.m z;

    public s(StockDetailsOverviewControllerContract$InputData input, t stateMapper, ybl.b instrumentTickerInteractor, owk.a cfdInstrumentProvider, qdf.b freeTradesIncentiveControllerModelExtension, e3h.k historicalChartViewControllerModelExtension, atk.c investmentNoticeWidgetControllerModelExtension, ctk.e similarToWidgetControllerModelExtension, osk.b analystsWidgetControllerModelExtension, aah.h wealthDisclaimersControllerModelExtension, zsk.c importantInformationViewControllerModelExtension, h3h.b investmentsWidgetControllerModelExtension, fsl.m investOrdersWidgetProvider, ftk.k suggestionControllerModelExtension, h1h.b transactionsWidgetControllerModelExtension, jtk.b warningGroupControllerModelExtension, s2h.e instrumentBioExtension, m1d.a alertsWidgetControllerModelExtension, h8b.h corporateEventsControllerModelExtension, dtk.b keyStatsControllerModelExtension, tsk.c epsControllerModelExtension, xsk.b financialPerformanceWidgetModelExtension, b4h.c automationsWidgetInteractor, c4h.c stockOnboardingInteractor, itk.a tradeCfdsWidgetControllerModelExtension, e5d.a airTipWidgetControllerModelExtension, i7d.o helpWidgetControllerModelExtension) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(cfdInstrumentProvider, "cfdInstrumentProvider");
        Intrinsics.checkNotNullParameter(freeTradesIncentiveControllerModelExtension, "freeTradesIncentiveControllerModelExtension");
        Intrinsics.checkNotNullParameter(historicalChartViewControllerModelExtension, "historicalChartViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetControllerModelExtension, "investmentNoticeWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(similarToWidgetControllerModelExtension, "similarToWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(analystsWidgetControllerModelExtension, "analystsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(importantInformationViewControllerModelExtension, "importantInformationViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentsWidgetControllerModelExtension, "investmentsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(suggestionControllerModelExtension, "suggestionControllerModelExtension");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(warningGroupControllerModelExtension, "warningGroupControllerModelExtension");
        Intrinsics.checkNotNullParameter(instrumentBioExtension, "instrumentBioExtension");
        Intrinsics.checkNotNullParameter(alertsWidgetControllerModelExtension, "alertsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(corporateEventsControllerModelExtension, "corporateEventsControllerModelExtension");
        Intrinsics.checkNotNullParameter(keyStatsControllerModelExtension, "keyStatsControllerModelExtension");
        Intrinsics.checkNotNullParameter(epsControllerModelExtension, "epsControllerModelExtension");
        Intrinsics.checkNotNullParameter(financialPerformanceWidgetModelExtension, "financialPerformanceWidgetModelExtension");
        Intrinsics.checkNotNullParameter(automationsWidgetInteractor, "automationsWidgetInteractor");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        Intrinsics.checkNotNullParameter(tradeCfdsWidgetControllerModelExtension, "tradeCfdsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(airTipWidgetControllerModelExtension, "airTipWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        this.o = input;
        this.f209526p = instrumentTickerInteractor;
        this.f209527q = cfdInstrumentProvider;
        this.f209528r = freeTradesIncentiveControllerModelExtension;
        this.f209529s = historicalChartViewControllerModelExtension;
        this.f209530t = investmentNoticeWidgetControllerModelExtension;
        this.u = similarToWidgetControllerModelExtension;
        this.v = analystsWidgetControllerModelExtension;
        this.f209531w = wealthDisclaimersControllerModelExtension;
        this.f209532x = importantInformationViewControllerModelExtension;
        this.f209533y = investmentsWidgetControllerModelExtension;
        this.z = investOrdersWidgetProvider;
        this.A = suggestionControllerModelExtension;
        this.B = transactionsWidgetControllerModelExtension;
        this.C = warningGroupControllerModelExtension;
        this.D = instrumentBioExtension;
        this.E = alertsWidgetControllerModelExtension;
        this.F = corporateEventsControllerModelExtension;
        this.G = keyStatsControllerModelExtension;
        this.H = epsControllerModelExtension;
        this.I = financialPerformanceWidgetModelExtension;
        this.J = automationsWidgetInteractor;
        this.K = stockOnboardingInteractor;
        this.L = tradeCfdsWidgetControllerModelExtension;
        this.M = airTipWidgetControllerModelExtension;
        this.N = helpWidgetControllerModelExtension;
        qdf.c cVar = (qdf.c) ((j2) ((wvl.g) freeTradesIncentiveControllerModelExtension).f300560p.f22677a).getValue();
        e3h.c cVar2 = (e3h.c) ((j2) ((p0) historicalChartViewControllerModelExtension).f158478y.f22677a).getValue();
        atk.d dVar = (atk.d) ((j2) ((atk.l) investmentNoticeWidgetControllerModelExtension).f9094p.f22677a).getValue();
        ctk.l lVar = (ctk.l) ((j2) ((ctk.r) similarToWidgetControllerModelExtension).f108700n.f22677a).getValue();
        osk.c cVar3 = (osk.c) ((j2) ((osk.n) analystsWidgetControllerModelExtension).f229356r.f22677a).getValue();
        Data data = new Data(null, null, false, 7, null);
        zsk.a aVar = (zsk.a) ((j2) ((zsk.e) importantInformationViewControllerModelExtension).f324950n.f22677a).getValue();
        h3h.d dVar2 = (h3h.d) ((j2) ((q4h.d) investmentsWidgetControllerModelExtension).f242166p.f22677a).getValue();
        ftk.m mVar = (ftk.m) ((j2) ((gtk.f) suggestionControllerModelExtension).f146632q.f22677a).getValue();
        jtk.i iVar = (jtk.i) ((j2) ((ktk.f) warningGroupControllerModelExtension).o.f22677a).getValue();
        f0 f0Var = f0.f322471a;
        this.O = mra.d.b(this, new i(null, cVar, cVar2, dVar, lVar, cVar3, data, aVar, dVar2, null, null, mVar, null, iVar, new Data(null, null, false, 7, null), f0Var, f0Var, f0Var, null, (xsk.c) ((j2) ((ysk.d) financialPerformanceWidgetModelExtension).o.f22677a).getValue(), null, null, null, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        int i = 3;
        yji.l.b1(this, (j2) ((p0) this.f209529s).f158478y.f22677a, null, new m(20, continuation, this), 3);
        yji.l.b1(this, (j2) ((gtk.f) this.A).f146632q.f22677a, null, new m(21, continuation, this), 3);
        yji.l.b1(this, (j2) ((ktk.f) this.C).o.f22677a, null, new m(22, continuation, this), 3);
        n2(new mci.e(this, continuation, 24), new whi.b(6));
        yji.l.b1(this, (j2) ((ctk.r) this.u).f108700n.f22677a, null, new m(17, continuation, this), 3);
        yji.l.b1(this, (j2) ((osk.n) this.v).f229356r.f22677a, null, new m(2, continuation, this), 3);
        yji.l.b1(this, (j2) ((wvl.g) this.f209528r).f300560p.f22677a, null, new m(8, continuation, this), 3);
        yji.l.b1(this, (j2) ((atk.l) this.f209530t).f9094p.f22677a, null, new m(12, continuation, this), 3);
        StockDetailsOverviewControllerContract$InputData stockDetailsOverviewControllerContract$InputData = this.o;
        String str = stockDetailsOverviewControllerContract$InputData.f104061a;
        ael.k kVar = (ael.k) this.f209526p;
        yji.l.b1(this, nim.a.v(u0.m(rd0.e.b(kVar.f(str)), this.f209531w.f2828l.w0()), new mul.k(18)), null, new m(5, continuation, this), 3);
        yji.l.b1(this, (j2) ((zsk.e) this.f209532x).f324950n.f22677a, null, new m(10, continuation, this), 3);
        yji.l.b1(this, (j2) ((q4h.d) this.f209533y).f242166p.f22677a, null, new m(13, continuation, this), 3);
        c4h.c cVar = this.K;
        yji.l.b1(this, vkm.q.Q(cVar.a(), new n(2, continuation, this)), null, new m(15, continuation, this), 3);
        yji.l.b1(this, vkm.q.Q(cVar.a(), new n(3, continuation, this)), null, new m(16, continuation, this), 3);
        yji.l.b1(this, rd0.e.e(vkm.q.Q(cVar.a(), new n(4, continuation, this)), h0.f322473a, new l1(i, 28, continuation)), null, new m(19, continuation, this), 3);
        String str2 = stockDetailsOverviewControllerContract$InputData.f104061a;
        final int i2 = 1;
        yji.l.b1(this, c6d.b.i(u0.m(rd0.e.b(kVar.f(str2)), this.f209527q.a(str2, true)), new Function1(this) { // from class: mwk.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f209517b;

            {
                this.f209517b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        return this.f209517b.G.Z2(instrument);
                    default:
                        s2h.e eVar = this.f209517b.D;
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        od0.i iVar = (od0.i) pair.f186386b;
                        return iVar.d() ? eVar.b3(nVar, (nel.n) iVar.c()) : eVar.Z2(nVar);
                }
            }
        }), null, new m(11, continuation, this), 3);
        yji.l.b1(this, vkm.q.Q(mo3.a.g(rd0.e.b(kVar.f(str2)), null, null, 3), new n(0, continuation, this)), null, new m(1, continuation, this), 3);
        yji.l.b1(this, this.F.c3(str2), null, new m(4, continuation, this), 3);
        final int i3 = 0;
        yji.l.b1(this, boh.f.e(rd0.e.b(kVar.f(str2)), new Function1(this) { // from class: mwk.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f209517b;

            {
                this.f209517b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        return this.f209517b.G.Z2(instrument);
                    default:
                        s2h.e eVar = this.f209517b.D;
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        od0.i iVar = (od0.i) pair.f186386b;
                        return iVar.d() ? eVar.b3(nVar, (nel.n) iVar.c()) : eVar.Z2(nVar);
                }
            }
        }), null, new m(14, continuation, this), 3);
        yji.l.b1(this, (j2) ((usk.i) this.H).o.f22677a, null, new m(6, continuation, this), 3);
        yji.l.b1(this, (j2) ((ysk.d) this.I).o.f22677a, null, new m(7, continuation, this), 3);
        yji.l.b1(this, new t38.e(vkm.q.Q(cVar.a(), new n(1, continuation, this)), 24, rd0.e.b(this.J.f.a(TradingAccountType.Gia.f105270a)), new o0(i, 14, continuation)), null, new m(3, continuation, this), 3);
        yji.l.b1(this, this.L.c3(str2), null, new m(18, continuation, this), 3);
        yji.l.b1(this, this.M.Z2(), null, new m(0, continuation, this), 3);
        yji.l.b1(this, this.N.Z2(new i7d.j("stock-details-get-help", new TextLocalisedClause(R.string.contact_us, null, null, 14), new i7d.c("topic.trading"))), null, new m(9, continuation, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.O;
    }
}
