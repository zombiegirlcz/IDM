package fvk;

import a83.o0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewControllerContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import i4h.p0;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends oki.h implements k {

    @NotNull
    public static final p Companion = new p();
    public final btk.b A;
    public final h3h.b B;
    public final h1h.b C;
    public final dtk.b D;
    public final fsl.m E;
    public final ctk.e F;
    public final jtk.b G;
    public final aah.h H;
    public final c4h.c I;
    public final i7d.o J;
    public final cli.y K;
    public final EtfDetailsOverviewControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b4h.c f138470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f138471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final owk.a f138472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m1d.a f138473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e5d.a f138474t;
    public final a3h.c u;
    public final vsk.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final qdf.b f138475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e3h.k f138476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s2h.e f138477y;
    public final atk.c z;

    public x(EtfDetailsOverviewControllerContract$InputData inputData, y stateMapper, b4h.c automationsWidgetInteractor, ybl.b instrumentTickerInteractor, owk.a cfdInstrumentProvider, m1d.a alertsWidgetControllerModelExtension, e5d.a airTipWidgetControllerModelExtension, a3h.c etfExposureOverviewControllerModelExtension, vsk.c etfVariantsControllerModelExtension, qdf.b freeTradesIncentiveControllerModelExtension, e3h.k historicalChartViewControllerModelExtension, s2h.e instrumentBioExtension, atk.c investmentNoticeWidgetControllerModelExtension, btk.b investmentPlanControllerModelExtension, h3h.b investmentsWidgetControllerModelExtension, h1h.b transactionsWidgetControllerModelExtension, dtk.b keyStatsControllerModelExtension, fsl.m investOrdersWidgetProvider, ctk.e similarToWidgetControllerModelExtension, jtk.b warningGroupControllerModelExtension, aah.h wealthDisclaimersControllerModelExtension, c4h.c stockOnboardingInteractor, i7d.o helpWidgetControllerModelExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(automationsWidgetInteractor, "automationsWidgetInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(cfdInstrumentProvider, "cfdInstrumentProvider");
        Intrinsics.checkNotNullParameter(alertsWidgetControllerModelExtension, "alertsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(airTipWidgetControllerModelExtension, "airTipWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(etfExposureOverviewControllerModelExtension, "etfExposureOverviewControllerModelExtension");
        Intrinsics.checkNotNullParameter(etfVariantsControllerModelExtension, "etfVariantsControllerModelExtension");
        Intrinsics.checkNotNullParameter(freeTradesIncentiveControllerModelExtension, "freeTradesIncentiveControllerModelExtension");
        Intrinsics.checkNotNullParameter(historicalChartViewControllerModelExtension, "historicalChartViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(instrumentBioExtension, "instrumentBioExtension");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetControllerModelExtension, "investmentNoticeWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentPlanControllerModelExtension, "investmentPlanControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentsWidgetControllerModelExtension, "investmentsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(keyStatsControllerModelExtension, "keyStatsControllerModelExtension");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(similarToWidgetControllerModelExtension, "similarToWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(warningGroupControllerModelExtension, "warningGroupControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        this.o = inputData;
        this.f138470p = automationsWidgetInteractor;
        this.f138471q = instrumentTickerInteractor;
        this.f138472r = cfdInstrumentProvider;
        this.f138473s = alertsWidgetControllerModelExtension;
        this.f138474t = airTipWidgetControllerModelExtension;
        this.u = etfExposureOverviewControllerModelExtension;
        this.v = etfVariantsControllerModelExtension;
        this.f138475w = freeTradesIncentiveControllerModelExtension;
        this.f138476x = historicalChartViewControllerModelExtension;
        this.f138477y = instrumentBioExtension;
        this.z = investmentNoticeWidgetControllerModelExtension;
        this.A = investmentPlanControllerModelExtension;
        this.B = investmentsWidgetControllerModelExtension;
        this.C = transactionsWidgetControllerModelExtension;
        this.D = keyStatsControllerModelExtension;
        this.E = investOrdersWidgetProvider;
        this.F = similarToWidgetControllerModelExtension;
        this.G = warningGroupControllerModelExtension;
        this.H = wealthDisclaimersControllerModelExtension;
        this.I = stockOnboardingInteractor;
        this.J = helpWidgetControllerModelExtension;
        e3h.c cVar = (e3h.c) ((j2) ((p0) historicalChartViewControllerModelExtension).f158478y.f22677a).getValue();
        atk.d dVar = (atk.d) ((j2) ((atk.l) investmentNoticeWidgetControllerModelExtension).f9094p.f22677a).getValue();
        btk.d dVar2 = (btk.d) ((j2) ((btk.k) investmentPlanControllerModelExtension).f18642q.f22677a).getValue();
        h3h.d dVar3 = (h3h.d) ((j2) ((q4h.d) investmentsWidgetControllerModelExtension).f242166p.f22677a).getValue();
        ctk.l lVar = (ctk.l) ((j2) ((ctk.r) similarToWidgetControllerModelExtension).f108700n.f22677a).getValue();
        Data data = new Data(null, null, false, 7, null);
        a3h.d dVar4 = (a3h.d) ((j2) ((e4h.c) etfExposureOverviewControllerModelExtension).f122554n.f22677a).getValue();
        vsk.g gVar = (vsk.g) ((j2) ((wsk.c) etfVariantsControllerModelExtension).o.f22677a).getValue();
        qdf.c cVar2 = (qdf.c) ((j2) ((wvl.g) freeTradesIncentiveControllerModelExtension).f300560p.f22677a).getValue();
        f0 f0Var = f0.f322471a;
        this.K = mra.d.b(this, new m(cVar, null, dVar, dVar2, dVar3, null, data, dVar4, gVar, lVar, cVar2, f0Var, f0Var, (jtk.i) ((j2) ((ktk.f) warningGroupControllerModelExtension).o.f22677a).getValue(), new Data(null, null, false, 7, null), null, null, null, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, (j2) ((p0) this.f138476x).f158478y.f22677a, null, new r(7, this, continuation), 3);
        yji.l.b1(this, this.f138474t.Z2(), null, new r(0, this, continuation), 3);
        yji.l.b1(this, (j2) ((atk.l) this.z).f9094p.f22677a, null, new r(9, this, continuation), 3);
        yji.l.b1(this, (j2) ((btk.k) this.A).f18642q.f22677a, null, new r(10, this, continuation), 3);
        yji.l.b1(this, (j2) ((q4h.d) this.B).f242166p.f22677a, null, new r(11, this, continuation), 3);
        yji.l.b1(this, (j2) ((ctk.r) this.F).f108700n.f22677a, null, new r(15, this, continuation), 3);
        EtfDetailsOverviewControllerContract$InputData etfDetailsOverviewControllerContract$InputData = this.o;
        String str = etfDetailsOverviewControllerContract$InputData.f103946a;
        ael.k kVar = (ael.k) this.f138471q;
        final int i = 0;
        yji.l.b1(this, boh.f.e(rd0.e.b(kVar.f(str)), new Function1(this) { // from class: fvk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f138456b;

            {
                this.f138456b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        return this.f138456b.D.Z2(instrument);
                    default:
                        s2h.e eVar = this.f138456b.f138477y;
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        od0.i iVar = (od0.i) pair.f186386b;
                        return iVar.d() ? eVar.b3(nVar, (nel.n) iVar.c()) : eVar.Z2(nVar);
                }
            }
        }), null, new r(12, this, continuation), 3);
        yji.l.b1(this, (j2) ((e4h.c) this.u).f122554n.f22677a, null, new r(3, this, continuation), 3);
        yji.l.b1(this, (j2) ((wsk.c) this.v).o.f22677a, null, new r(4, this, continuation), 3);
        yji.l.b1(this, (j2) ((wvl.g) this.f138475w).f300560p.f22677a, null, new r(5, this, continuation), 3);
        String str2 = etfDetailsOverviewControllerContract$InputData.f103946a;
        final int i2 = 1;
        yji.l.b1(this, c6d.b.i(u0.m(rd0.e.b(kVar.f(str2)), this.f138472r.a(str2, true)), new Function1(this) { // from class: fvk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f138456b;

            {
                this.f138456b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        return this.f138456b.D.Z2(instrument);
                    default:
                        s2h.e eVar = this.f138456b.f138477y;
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        od0.i iVar = (od0.i) pair.f186386b;
                        return iVar.d() ? eVar.b3(nVar, (nel.n) iVar.c()) : eVar.Z2(nVar);
                }
            }
        }), null, new r(8, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(mo3.a.g(rd0.e.b(kVar.f(str2)), null, null, 3), new s(0, this, continuation)), null, new r(1, this, continuation), 3);
        yji.l.b1(this, (j2) ((ktk.f) this.G).o.f22677a, null, new r(17, this, continuation), 3);
        yji.l.b1(this, nim.a.v(u0.m(rd0.e.b(kVar.f(str2)), this.H.f2828l.w0()), new fv6.n(5)), null, new r(18, this, continuation), 3);
        c4h.c cVar = this.I;
        yji.l.b1(this, new t38.e(vkm.q.Q(cVar.a(), new s(1, this, continuation)), 24, rd0.e.b(this.f138470p.f.a(TradingAccountType.Gia.f105270a)), new o0(3, 6, continuation)), null, new r(2, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(cVar.a(), new s(2, this, continuation)), null, new r(13, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(cVar.a(), new eh9.j(continuation, this, 8)), null, new r(14, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(cVar.a(), new s(3, this, continuation)), null, new r(16, this, continuation), 3);
        yji.l.b1(this, this.J.Z2(new i7d.j("stock-details-get-help", new TextLocalisedClause(R.string.contact_us, null, null, 14), new i7d.c("topic.trading"))), null, new r(6, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.K;
    }
}
