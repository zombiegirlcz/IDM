package com.revolut.trading.orders.ui.screens.investment_plan.projection;

import ael.d0;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$Context;
import e3h.k;
import hsl.g;
import i4h.p0;
import jdf.e;
import jdf.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vii.c;
import vkm.j2;
import ybl.b;
import ybl.l;
import z0h.d;
import zr2.o;
import zul.a0;
import zul.c0;
import zul.n;
import zul.n0;
import zul.p;
import zul.q;
import zul.s;
import zul.x;
import zul.z;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements q {

    @NotNull
    public static final x Companion = new x();
    public static final sel.a D = sel.a.MONTHLY;
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final c B;
    public final y C;
    public final InvestmentProjectionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f107037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hsl.q f107038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nil.c f107039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f107040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f107041t;
    public final d u;
    public final d0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zul.a f107042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a3h.c f107043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gte.a f107044y;
    public final k z;

    public a(InvestmentProjectionsScreenContract$InputData input, n0 stateMapper, p saveStateDelegate, e investmentPlanProjectionsControllerModelExtension, hsl.q investmentPlanProjectionsProvider, nil.c tradingProjectionsInteractor, b instrumentTickerInteractor, l configInteractor, d wealthDisclaimersContractDataProvider, d0 stocksInteractor, zul.a modalProvider, a3h.c etfExposureOverviewControllerModelExtension, gte.a featureToggleInteractor, k historicalChartViewControllerModelExtension) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsControllerModelExtension, "investmentPlanProjectionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsProvider, "investmentPlanProjectionsProvider");
        Intrinsics.checkNotNullParameter(tradingProjectionsInteractor, "tradingProjectionsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersContractDataProvider, "wealthDisclaimersContractDataProvider");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(modalProvider, "modalProvider");
        Intrinsics.checkNotNullParameter(etfExposureOverviewControllerModelExtension, "etfExposureOverviewControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(historicalChartViewControllerModelExtension, "historicalChartViewControllerModelExtension");
        this.o = input;
        this.f107037p = investmentPlanProjectionsControllerModelExtension;
        this.f107038q = investmentPlanProjectionsProvider;
        this.f107039r = tradingProjectionsInteractor;
        this.f107040s = instrumentTickerInteractor;
        this.f107041t = configInteractor;
        this.u = wealthDisclaimersContractDataProvider;
        this.v = stocksInteractor;
        this.f107042w = modalProvider;
        this.f107043x = etfExposureOverviewControllerModelExtension;
        this.f107044y = featureToggleInteractor;
        this.z = historicalChartViewControllerModelExtension;
        this.A = hx7.e.a(this, new zo2.h(this, 17));
        this.B = new c();
        InvestmentProjectionsContract$Context investmentProjectionsContract$Context = input.f107033c;
        a3h.d dVar = (a3h.d) ((j2) ((e4h.c) etfExposureOverviewControllerModelExtension).f122554n.f22677a).getValue();
        this.C = mra.d.b(this, new n((f) ((j2) ((g) investmentPlanProjectionsControllerModelExtension).f155089l.f22677a).getValue(), null, investmentProjectionsContract$Context, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), dVar, (e3h.c) ((j2) ((p0) historicalChartViewControllerModelExtension).f158478y.f22677a).getValue(), s.PROJECTION), stateMapper, saveStateDelegate, false, 8);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, (j2) ((g) this.f107037p).f155089l.f22677a, null, null, new z(5, this, continuation), 3);
        InvestmentProjectionsScreenContract$InputData investmentProjectionsScreenContract$InputData = this.o;
        yji.l.a1(this, rd0.e.b(((ael.k) this.f107040s).f(investmentProjectionsScreenContract$InputData.f107031a)), null, null, new z(6, this, continuation), 3);
        yji.l.a1(this, rd0.e.b(this.v.a(investmentProjectionsScreenContract$InputData.f107031a, false)), null, null, new z(2, this, continuation), 3);
        Unit unit = Unit.f186387a;
        c cVar = this.B;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, vkm.q.q(vkm.q.Q(cVar.a(unit, hVar), new a0(0, this, continuation))), null, null, new z(3, this, continuation), 3);
        yji.l.a1(this, vkm.q.q(vkm.q.Q(cVar.a(unit, hVar), new a0(1, this, continuation))), null, null, new z(4, this, continuation), 3);
        yji.l.a1(this, l.d(this.f107041t), null, null, new z(7, this, continuation), 3);
        yji.l.a1(this, vkm.q.q(nim.a.v(this.u.w0(), new o(26))), null, null, new c0(this, null), 3);
        if (((jte.d) this.f107044y).c(FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c)) {
            yji.l.a1(this, (j2) ((e4h.c) this.f107043x).f122554n.f22677a, null, null, new z(0, this, continuation), 3);
            yji.l.a1(this, (j2) ((p0) this.z).f158478y.f22677a, null, null, new z(1, this, continuation), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
