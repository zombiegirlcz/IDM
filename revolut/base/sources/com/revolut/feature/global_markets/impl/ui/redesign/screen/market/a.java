package com.revolut.feature.global_markets.impl.ui.redesign.screen.market;

import b4h.e;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.domain.Market;
import cq9.m;
import foh.i;
import i4b.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ou5.b;
import q5g.f0;
import q75.n;
import q87.j;
import q87.k;
import q87.o;
import q87.s;
import q87.u;
import t87.d;
import vii.c;
import vkm.q;
import ybl.l;
import zh9.u0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements k {
    public final c A;
    public final y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final MarketDetailsRedesignScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f74602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h87.c f74603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aah.h f74604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f74605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s87.a f74606t;
    public final b u;
    public final zhl.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ybl.b f74607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f74608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f74609y;
    public final c87.c z;

    public a(m stateMapper, MarketDetailsRedesignScreenContract$InputData inputData, e chartSettingsInteractor, h87.c globalMarketsCollectionWidgetControllerModel, aah.h wealthDisclaimersControllerModelExtension, f marketDetailsInteractor, s87.a economicIndicatorsInfoDialogMapper, b globalMarketsCollectionProvider, zhl.k historicalPricesInteractor, ybl.b instrumentTickerInteractor, l tradingConfigInteractor, d chartPointsBaselineAligner, c87.c globalMarketsNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chartSettingsInteractor, "chartSettingsInteractor");
        Intrinsics.checkNotNullParameter(globalMarketsCollectionWidgetControllerModel, "globalMarketsCollectionWidgetControllerModel");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(marketDetailsInteractor, "marketDetailsInteractor");
        Intrinsics.checkNotNullParameter(economicIndicatorsInfoDialogMapper, "economicIndicatorsInfoDialogMapper");
        Intrinsics.checkNotNullParameter(globalMarketsCollectionProvider, "globalMarketsCollectionProvider");
        Intrinsics.checkNotNullParameter(historicalPricesInteractor, "historicalPricesInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(chartPointsBaselineAligner, "chartPointsBaselineAligner");
        Intrinsics.checkNotNullParameter(globalMarketsNaviCommandFactory, "globalMarketsNaviCommandFactory");
        this.o = inputData;
        this.f74602p = chartSettingsInteractor;
        this.f74603q = globalMarketsCollectionWidgetControllerModel;
        this.f74604r = wealthDisclaimersControllerModelExtension;
        this.f74605s = marketDetailsInteractor;
        this.f74606t = economicIndicatorsInfoDialogMapper;
        this.u = globalMarketsCollectionProvider;
        this.v = historicalPricesInteractor;
        this.f74607w = instrumentTickerInteractor;
        this.f74608x = tradingConfigInteractor;
        this.f74609y = chartPointsBaselineAligner;
        this.z = globalMarketsNaviCommandFactory;
        this.A = new c();
        this.B = mra.d.b(this, new j(null, null, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, r0.g(), h0.f322473a, new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
        this.C = hx7.e.a(this, new f0(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        h87.f fVar;
        MarketDetailsRedesignScreenContract$InputData marketDetailsRedesignScreenContract$InputData = this.o;
        h87.f fVarI = i.I(marketDetailsRedesignScreenContract$InputData.f74600a);
        h87.c cVar = this.f74603q;
        Continuation continuation = null;
        yji.l.a1(this, cVar.Z2(fVarI), null, null, new s(3, this, continuation), 3);
        Market market = marketDetailsRedesignScreenContract$InputData.f74600a;
        int i = o.f243027a[market.ordinal()];
        if (i == 1) {
            fVar = h87.f.US_CURRENCIES;
        } else if (i == 2) {
            fVar = h87.f.EUROPE_CURRENCIES;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = h87.f.APAC_CURRENCIES;
        }
        yji.l.a1(this, cVar.Z2(fVar), null, null, new s(1, this, continuation), 3);
        yji.l.a1(this, q.Q(this.A.a(Unit.f186387a, w4l.h.f294642c), new u(1, this, continuation)), null, null, new s(6, this, continuation), 3);
        b bVar = this.u;
        yji.l.a1(this, nim.a.v(bVar.C(market), new n(22)), null, null, new s(0, this, continuation), 3);
        l2(new q87.y(1, this, continuation), new yi5.b(26));
        yji.l.a1(this, c6d.b.i(nim.a.v(u0.m(bVar.C(market), new olf.e(this.B.B(new n(23)), 24)), new q56.o(this, 14)), new n(24)), null, null, new s(4, this, continuation), 3);
        yji.l.a1(this, nim.a.v(this.f74604r.f2828l.w0(), new n(25)), null, null, new s(2, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, this.f74602p.a(), null, new s(7, this, continuation), 3);
        yji.l.b1(this, q.Q(mo3.a.g(this.u.C(this.o.f74600a), null, new q34.a(26), 1), new u(0, this, continuation)), null, new s(5, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.B;
    }
}
