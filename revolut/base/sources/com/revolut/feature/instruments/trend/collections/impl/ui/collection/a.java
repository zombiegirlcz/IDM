package com.revolut.feature.instruments.trend.collections.impl.ui.collection;

import ael.h0;
import bof.r;
import cli.y;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionTimeframeFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.cfdspnldrivers.InstrumentsCfdsPnlDriversCollectionKeyFilterValue;
import d9.e1;
import dfj.f;
import fgj.g;
import fi7.j;
import fi7.l;
import fi7.o;
import fi7.p;
import fi7.s;
import fi7.t;
import hi7.b;
import hx7.e;
import igh.k;
import ii7.d;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import twg.c;
import tzg.m;
import vkm.j2;
import vkm.q;
import vkm.v1;
import zh9.u0;
import zhm.f0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements fi7.h {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f74912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ii7.b f74913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f74914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f74915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f74916t;
    public final ybl.l u;
    public final g9h.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o5d.a f74917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.c f74918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f74919y;
    public final j2 z;

    public a(j60.a bottomExpandableDialogControllerExtension, b disclaimersContextProvider, ii7.b filtersMapper, d filtersProvider, l inputData, c instrumentsTrendCollectionsInteractor, ybl.l tradingConfigInteractor, g9h.c assetDetailsNotAvailableProvider, o5d.a swipeActionsControllerModelExtension, t saveStateDelegate, r stateMapper) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(disclaimersContextProvider, "disclaimersContextProvider");
        Intrinsics.checkNotNullParameter(filtersMapper, "filtersMapper");
        Intrinsics.checkNotNullParameter(filtersProvider, "filtersProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentsTrendCollectionsInteractor, "instrumentsTrendCollectionsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(assetDetailsNotAvailableProvider, "assetDetailsNotAvailableProvider");
        Intrinsics.checkNotNullParameter(swipeActionsControllerModelExtension, "swipeActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = bottomExpandableDialogControllerExtension;
        this.f74912p = disclaimersContextProvider;
        this.f74913q = filtersMapper;
        this.f74914r = filtersProvider;
        this.f74915s = inputData;
        this.f74916t = instrumentsTrendCollectionsInteractor;
        this.u = tradingConfigInteractor;
        this.v = assetDetailsNotAvailableProvider;
        this.f74917w = swipeActionsControllerModelExtension;
        this.f74918x = new vii.c();
        InstrumentsTrendCollectionId instrumentsTrendCollectionId = inputData.f135330a;
        ph7.c cVar = inputData.f135331b;
        Map map = inputData.f135332c;
        y yVarB = mra.d.b(this, new j(instrumentsTrendCollectionId, map == null ? r0.g() : map, cVar), stateMapper, saveStateDelegate, false, 8);
        this.f74919y = yVarB;
        this.z = q.c(((j) ((j2) yVarB.f22677a).getValue()).f135325c);
        this.A = e.a(this, new g(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        go.g gVar;
        Flow flowV;
        InstrumentsTrendCollectionId collectionId = this.f74915s.f135330a;
        d dVar = this.f74914r;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Continuation continuation = null;
        if (Intrinsics.f(collectionId, InstrumentsTrendCollectionId.MostTraded.f74902a)) {
            flowV = nim.a.v(nim.a.v(u0.m(m.c(dVar.f161590b, null, null, 3), ((h0) dVar.f161589a).d()), new k(13)), new ii4.b(collectionId, 2));
        } else {
            if (Intrinsics.f(collectionId, InstrumentsTrendCollectionId.CfdsPnlDrivers.f74894a)) {
                gVar = new go.g(zi0.c.P(v.k(new ph7.a(ph7.b.COLLECTION_KEY_FILTER, InstrumentsCfdsPnlDriversCollectionKeyFilterValue.a()), new ph7.a(ph7.b.TIMEFRAME, v.k(InstrumentsTrendCollectionTimeframeFilterValue.ONE_DAY, InstrumentsTrendCollectionTimeframeFilterValue.ONE_WEEK, InstrumentsTrendCollectionTimeframeFilterValue.ONE_MONTH, InstrumentsTrendCollectionTimeframeFilterValue.ONE_YEAR))), false, null, 3), 2);
            } else {
                if (!Intrinsics.f(collectionId, InstrumentsTrendCollectionId.MostShortedCfds.f74901a) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.PopularStarterCfds.f74903a) && !(collectionId instanceof InstrumentsTrendCollectionId.Bonds) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.IndexEtfs.f74900a) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.TechnologyEtfs.f74906a) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.EtcsCommodityExposure.f74896a) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.PreciousMetalsEtcs.f74904a) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.EtpsLeveraged.f74898a) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.DividendLeaders.f74895a) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.RecommendedBuy.f74905a) && !Intrinsics.f(collectionId, InstrumentsTrendCollectionId.FreeStocks.f74899a)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = new go.g(zi0.c.P(f0.f322471a, false, null, 3), 2);
            }
            flowV = gVar;
        }
        yji.l.a1(this, nim.a.v(flowV, new fca.d(this, 22)), null, null, new o(0, this, continuation), 3);
        l2(new ewa.d(this, continuation, 20), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.z, new p(1, this, continuation)), null, new o(3, this, continuation), 3);
        vii.b bVarA = this.f74918x.a(Unit.f186387a, w4l.h.f294642c);
        fg8.g gVar = new fg8.g(15);
        y yVar = this.f74919y;
        v1 v1VarN = e1.N(new s(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 0), q.Q(yh5.b.e(bVarA, q.q(new f(yVar.B(gVar), 26)), q.q(yVar.B(new fg8.g(16)))), new p(0, this, continuation)));
        yji.l.b1(this, v1VarN, null, new o(1, this, continuation), 3);
        yji.l.b1(this, this.f74917w.Z2(new a07.p(nim.a.v(v1VarN, new fg8.g(17)), 16)), null, new o(2, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f74919y;
    }
}
