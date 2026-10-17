package avk;

import aqd.h1;
import au6.e2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsControllerContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import com.revolut.shared.feature.wealth.models.config.Links;
import i4h.p0;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.t0;
import z0h.k0;
import z0h.p1;
import z0h.t1;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 extends oki.h implements k {

    @NotNull
    public static final t Companion = new t();
    public final h3h.b A;
    public final c4h.c B;
    public final jtk.b C;
    public final u1d.a D;
    public final aah.h E;
    public final i7d.o F;
    public final cli.y G;
    public final n2h.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l1d.a f10086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m1d.a f10087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e5d.a f10088r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f10089s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e3h.k f10090t;
    public final CfdDetailsControllerContract$InputData u;
    public final s2h.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ybl.b f10091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fsl.m f10092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h1h.b f10093y;
    public final atk.c z;

    public h0(n2h.a actionsPanelControllerModelExtension, l1d.a alertsQuickActionsControllerModelExtension, m1d.a alertsWidgetControllerModelExtension, e5d.a airTipWidgetControllerModelExtension, gte.a featureToggleInteractor, e3h.k historicalChartViewControllerModelExtension, CfdDetailsControllerContract$InputData inputData, s2h.e instrumentBioExtension, ybl.b instrumentTickerInteractor, fsl.m investOrdersWidgetProvider, h1h.b transactionsWidgetControllerModelExtension, atk.c investmentNoticeWidgetControllerModelExtension, h3h.b investmentsWidgetControllerModelExtension, c4h.c stockOnboardingInteractor, jtk.b warningGroupControllerModelExtension, u1d.a watchlistQuickActionsControllerModelExtension, aah.h wealthDisclaimersControllerModelExtension, i7d.o helpWidgetControllerModelExtension, i0 stateMapper) {
        Intrinsics.checkNotNullParameter(actionsPanelControllerModelExtension, "actionsPanelControllerModelExtension");
        Intrinsics.checkNotNullParameter(alertsQuickActionsControllerModelExtension, "alertsQuickActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(alertsWidgetControllerModelExtension, "alertsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(airTipWidgetControllerModelExtension, "airTipWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(historicalChartViewControllerModelExtension, "historicalChartViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentBioExtension, "instrumentBioExtension");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetControllerModelExtension, "investmentNoticeWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentsWidgetControllerModelExtension, "investmentsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        Intrinsics.checkNotNullParameter(warningGroupControllerModelExtension, "warningGroupControllerModelExtension");
        Intrinsics.checkNotNullParameter(watchlistQuickActionsControllerModelExtension, "watchlistQuickActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = actionsPanelControllerModelExtension;
        this.f10086p = alertsQuickActionsControllerModelExtension;
        this.f10087q = alertsWidgetControllerModelExtension;
        this.f10088r = airTipWidgetControllerModelExtension;
        this.f10089s = featureToggleInteractor;
        this.f10090t = historicalChartViewControllerModelExtension;
        this.u = inputData;
        this.v = instrumentBioExtension;
        this.f10091w = instrumentTickerInteractor;
        this.f10092x = investOrdersWidgetProvider;
        this.f10093y = transactionsWidgetControllerModelExtension;
        this.z = investmentNoticeWidgetControllerModelExtension;
        this.A = investmentsWidgetControllerModelExtension;
        this.B = stockOnboardingInteractor;
        this.C = warningGroupControllerModelExtension;
        this.D = watchlistQuickActionsControllerModelExtension;
        this.E = wealthDisclaimersControllerModelExtension;
        this.F = helpWidgetControllerModelExtension;
        n2h.f fVar = (n2h.f) ((j2) ((m3h.a) actionsPanelControllerModelExtension).f202569p.f22677a).getValue();
        e3h.c cVar = (e3h.c) ((j2) ((p0) historicalChartViewControllerModelExtension).f158478y.f22677a).getValue();
        atk.d dVar = (atk.d) ((j2) ((atk.l) investmentNoticeWidgetControllerModelExtension).f9094p.f22677a).getValue();
        h3h.d dVar2 = (h3h.d) ((j2) ((q4h.d) investmentsWidgetControllerModelExtension).f242166p.f22677a).getValue();
        jtk.i iVar = (jtk.i) ((j2) ((ktk.f) warningGroupControllerModelExtension).o.f22677a).getValue();
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.G = mra.d.b(this, new m(fVar, f0Var, cVar, null, null, f0Var, null, null, null, null, dVar, dVar2, null, iVar, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, (j2) ((m3h.a) this.o).f202569p.f22677a, null, new v(0, this, continuation), 3);
        CfdDetailsControllerContract$InputData cfdDetailsControllerContract$InputData = this.u;
        String str = cfdDetailsControllerContract$InputData.f103914a;
        ael.k kVar = (ael.k) this.f10091w;
        yji.l.b1(this, rd0.e.b(kVar.f(str)), null, new v(7, this, continuation), 3);
        String str2 = cfdDetailsControllerContract$InputData.f103914a;
        ybl.b.Companion.getClass();
        yji.l.b1(this, kVar.p(str2, w4l.h.f294642c, InstrumentTickerInteractor$Companion.f105074b.a()), null, new v(8, this, continuation), 3);
        yji.l.b1(this, (j2) ((ktk.f) this.C).o.f22677a, null, new v(14, this, continuation), 3);
        yji.l.b1(this, (j2) ((p0) this.f10090t).f158478y.f22677a, null, new v(5, this, continuation), 3);
        yji.l.b1(this, this.f10088r.Z2(), null, new v(1, this, continuation), 3);
        yji.l.b1(this, (j2) ((atk.l) this.z).f9094p.f22677a, null, new v(9, this, continuation), 3);
        yji.l.b1(this, (j2) ((q4h.d) this.A).f242166p.f22677a, null, new v(10, this, continuation), 3);
        c4h.c cVar = this.B;
        yji.l.b1(this, vkm.q.Q(cVar.a(), new y(1, this, continuation)), null, new v(11, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(cVar.a(), new y(2, this, continuation)), null, new v(12, this, continuation), 3);
        e2 e2Var = new e2(14);
        cli.y yVar = this.G;
        yji.l.b1(this, vkm.q.Q(new t0(yVar.B(e2Var), 1), new y(0, this, continuation)), null, new v(6, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(cVar.a(), new y(3, this, continuation)), null, new v(13, this, continuation), 3);
        final int i = 2;
        yji.l.b1(this, nim.a.v(this.E.f2828l.w0(), new Function1(this) { // from class: avk.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f10122b;

            {
                this.f10122b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        m1d.a aVar = this.f10122b.f10087q;
                        y1d.b.Companion.getClass();
                        return aVar.Z2(new AlertsWidgetContext(y0.b(y1d.a.e), null, new AssetIdWithSymbol(instrument.f214596b, instrument.e), instrument.i.f306286a, zhm.u.c(mgd.d.ACTIVE), null, 7730));
                    case 1:
                        nel.n instrument2 = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument2, "instrument");
                        h0 h0Var = this.f10122b;
                        gte.a aVar2 = h0Var.f10089s;
                        u1d.a aVar3 = h0Var.D;
                        if (((jte.d) aVar2).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c)) {
                            y1d.b.Companion.getClass();
                            return aVar3.c3(y1d.a.i, new Pair(instrument2.f214596b, instrument2.i.f306286a));
                        }
                        y1d.b.Companion.getClass();
                        return new a35.d(aVar3.d3(y1d.a.i, instrument2.f214596b), 24);
                    default:
                        t1 disclaimersData = (t1) obj2;
                        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                        Links links = disclaimersData.f318563a;
                        hel.b bVar = disclaimersData.f318564b;
                        nel.z zVar = nel.z.CFD;
                        xi0.a aVar4 = xi0.b.Companion;
                        String str3 = this.f10122b.u.f103914a;
                        aVar4.getClass();
                        return new p1(zhm.u.c(new k0(links, bVar, zVar, xi0.a.a(str3))), bVar);
                }
            }
        }), null, new v(3, this, continuation), 3);
        final int i2 = 1;
        yji.l.b1(this, boh.f.e(new a35.d(yVar.B(new e2(13)), 23), new Function1(this) { // from class: avk.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f10122b;

            {
                this.f10122b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        m1d.a aVar = this.f10122b.f10087q;
                        y1d.b.Companion.getClass();
                        return aVar.Z2(new AlertsWidgetContext(y0.b(y1d.a.e), null, new AssetIdWithSymbol(instrument.f214596b, instrument.e), instrument.i.f306286a, zhm.u.c(mgd.d.ACTIVE), null, 7730));
                    case 1:
                        nel.n instrument2 = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument2, "instrument");
                        h0 h0Var = this.f10122b;
                        gte.a aVar2 = h0Var.f10089s;
                        u1d.a aVar3 = h0Var.D;
                        if (((jte.d) aVar2).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c)) {
                            y1d.b.Companion.getClass();
                            return aVar3.c3(y1d.a.i, new Pair(instrument2.f214596b, instrument2.i.f306286a));
                        }
                        y1d.b.Companion.getClass();
                        return new a35.d(aVar3.d3(y1d.a.i, instrument2.f214596b), 24);
                    default:
                        t1 disclaimersData = (t1) obj2;
                        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                        Links links = disclaimersData.f318563a;
                        hel.b bVar = disclaimersData.f318564b;
                        nel.z zVar = nel.z.CFD;
                        xi0.a aVar4 = xi0.b.Companion;
                        String str3 = this.f10122b.u.f103914a;
                        aVar4.getClass();
                        return new p1(zhm.u.c(new k0(links, bVar, zVar, xi0.a.a(str3))), bVar);
                }
            }
        }), null, new v(15, this, continuation), 3);
        a35.d dVar = new a35.d(yVar.B(new e2(12)), 22);
        final int i3 = 0;
        yji.l.b1(this, mo3.a.e(c6d.b.i(dVar, new Function1(this) { // from class: avk.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f10122b;

            {
                this.f10122b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        nel.n instrument = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        m1d.a aVar = this.f10122b.f10087q;
                        y1d.b.Companion.getClass();
                        return aVar.Z2(new AlertsWidgetContext(y0.b(y1d.a.e), null, new AssetIdWithSymbol(instrument.f214596b, instrument.e), instrument.i.f306286a, zhm.u.c(mgd.d.ACTIVE), null, 7730));
                    case 1:
                        nel.n instrument2 = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(instrument2, "instrument");
                        h0 h0Var = this.f10122b;
                        gte.a aVar2 = h0Var.f10089s;
                        u1d.a aVar3 = h0Var.D;
                        if (((jte.d) aVar2).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c)) {
                            y1d.b.Companion.getClass();
                            return aVar3.c3(y1d.a.i, new Pair(instrument2.f214596b, instrument2.i.f306286a));
                        }
                        y1d.b.Companion.getClass();
                        return new a35.d(aVar3.d3(y1d.a.i, instrument2.f214596b), 24);
                    default:
                        t1 disclaimersData = (t1) obj2;
                        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                        Links links = disclaimersData.f318563a;
                        hel.b bVar = disclaimersData.f318564b;
                        nel.z zVar = nel.z.CFD;
                        xi0.a aVar4 = xi0.b.Companion;
                        String str3 = this.f10122b.u.f103914a;
                        aVar4.getClass();
                        return new p1(zhm.u.c(new k0(links, bVar, zVar, xi0.a.a(str3))), bVar);
                }
            }
        }), new h1(21), new h1(22)), null, new v(2, this, continuation), 3);
        yji.l.b1(this, this.F.Z2(new i7d.j("stock-details-get-help", new TextLocalisedClause(R.string.contact_us, null, null, 14), new i7d.c("topic.trading"))), null, new v(4, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.G;
    }
}
