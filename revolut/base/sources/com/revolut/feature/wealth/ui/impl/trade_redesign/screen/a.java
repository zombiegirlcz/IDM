package com.revolut.feature.wealth.ui.impl.trade_redesign.screen;

import aeh.g;
import aim.b;
import anh.s;
import ble.c1;
import bnh.i0;
import bof.r;
import cli.y;
import com.revolut.feature.commodities.onboarding.api.CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$CommissionFreeEtfs;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestScreenerHighDividendWidget;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestScreenerRemoteCollectionWidgets;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestTopMoversScreenerRedesign;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$TradeScreenBondCollectionsScreenerMigration;
import d9.e1;
import eh9.j;
import imh.e;
import imh.g0;
import imh.z;
import inh.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mmh.n;
import oki.h;
import pmh.u;
import rmh.m;
import utk.f;
import vkm.j2;
import vkm.q;
import vkm.v1;
import vmh.d;
import wmh.i;
import yji.l;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.v;
import zhm.w;
import zmh.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements e {
    public final s A;
    public final i0 B;
    public final i C;
    public final ymh.i D;
    public final dlc.h E;
    public final o5d.a F;
    public final e5d.a G;
    public final y H;
    public final com.revolut.kompot.navigable.vc.modal.a I;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f96035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f96036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cnh.f f96037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f96038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kgm.i f96039t;
    public final u u;
    public final g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f96040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qmh.c f96041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f96042y;
    public final tmh.g z;

    public a(r mapper, d filterExtension, c widgetDefinitionsProvider, f assetListWidgetStateProvider, cnh.f allAssetsScreenerWidgetExtension, n allAssetsWidgetProvider, kgm.i allCommoditiesWidgetProvider, u allFundsWidgetProvider, g allMutualFundsWidgetProvider, m collectionsWidgetProvider, qmh.c assetsByCountryProvider, k earningsCallsWidgetProvider, tmh.g tradeDisclaimersProvider, s recommendedBuysProvider, i0 strategiesWidgetProvider, i ipoSpotlightWidgetProvider, ymh.i privateBankBannerProvider, dlc.h strategiesArticleExtension, o5d.a swipeActionsControllerModelExtension, e5d.a airTipWidgetControllerModelExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(filterExtension, "filterExtension");
        Intrinsics.checkNotNullParameter(widgetDefinitionsProvider, "widgetDefinitionsProvider");
        Intrinsics.checkNotNullParameter(assetListWidgetStateProvider, "assetListWidgetStateProvider");
        Intrinsics.checkNotNullParameter(allAssetsScreenerWidgetExtension, "allAssetsScreenerWidgetExtension");
        Intrinsics.checkNotNullParameter(allAssetsWidgetProvider, "allAssetsWidgetProvider");
        Intrinsics.checkNotNullParameter(allCommoditiesWidgetProvider, "allCommoditiesWidgetProvider");
        Intrinsics.checkNotNullParameter(allFundsWidgetProvider, "allFundsWidgetProvider");
        Intrinsics.checkNotNullParameter(allMutualFundsWidgetProvider, "allMutualFundsWidgetProvider");
        Intrinsics.checkNotNullParameter(collectionsWidgetProvider, "collectionsWidgetProvider");
        Intrinsics.checkNotNullParameter(assetsByCountryProvider, "assetsByCountryProvider");
        Intrinsics.checkNotNullParameter(earningsCallsWidgetProvider, "earningsCallsWidgetProvider");
        Intrinsics.checkNotNullParameter(tradeDisclaimersProvider, "tradeDisclaimersProvider");
        Intrinsics.checkNotNullParameter(recommendedBuysProvider, "recommendedBuysProvider");
        Intrinsics.checkNotNullParameter(strategiesWidgetProvider, "strategiesWidgetProvider");
        Intrinsics.checkNotNullParameter(ipoSpotlightWidgetProvider, "ipoSpotlightWidgetProvider");
        Intrinsics.checkNotNullParameter(privateBankBannerProvider, "privateBankBannerProvider");
        Intrinsics.checkNotNullParameter(strategiesArticleExtension, "strategiesArticleExtension");
        Intrinsics.checkNotNullParameter(swipeActionsControllerModelExtension, "swipeActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(airTipWidgetControllerModelExtension, "airTipWidgetControllerModelExtension");
        this.o = filterExtension;
        this.f96035p = widgetDefinitionsProvider;
        this.f96036q = assetListWidgetStateProvider;
        this.f96037r = allAssetsScreenerWidgetExtension;
        this.f96038s = allAssetsWidgetProvider;
        this.f96039t = allCommoditiesWidgetProvider;
        this.u = allFundsWidgetProvider;
        this.v = allMutualFundsWidgetProvider;
        this.f96040w = collectionsWidgetProvider;
        this.f96041x = assetsByCountryProvider;
        this.f96042y = earningsCallsWidgetProvider;
        this.z = tradeDisclaimersProvider;
        this.A = recommendedBuysProvider;
        this.B = strategiesWidgetProvider;
        this.C = ipoSpotlightWidgetProvider;
        this.D = privateBankBannerProvider;
        this.E = strategiesArticleExtension;
        this.F = swipeActionsControllerModelExtension;
        this.G = airTipWidgetControllerModelExtension;
        this.H = mra.d.b(this, new imh.d(new vmh.g(null, 7), r0.g(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), mapper, null, false, 12);
        this.I = hx7.e.a(this, new ijj.r(13));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.I;
    }

    @Override // yji.l
    public final void T1(long j2) {
        j2 j2Var = (j2) ((vmh.k) this.o).f290594p.f22677a;
        l.b1(this, j2Var, null, new g0(6, this, null), 3);
        l.b1(this, j2Var, null, new ikf.g(this, (Continuation) null, 5), 3);
        c cVar = this.f96035p;
        cVar.getClass();
        aim.e eVarB = zhm.u.b();
        c.b(eVarB, imh.h.RECENTLY_VIEWED, knh.d.f186167a, c.f323518c, null);
        gte.a aVar = cVar.f323519a;
        jte.d dVar = (jte.d) aVar;
        if (dVar.c(ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection.f96096c)) {
            imh.i iVar = imh.i.POPULAR_STOCKS;
            xnh.a aVar2 = xnh.a.STOCKS;
            xnh.a[] elements = {null, aVar2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            c.c(eVarB, iVar, kotlin.collections.d.y0(elements), aVar2);
            imh.i iVar2 = imh.i.POPULAR_ETPS;
            Set set = c.f323517b;
            c.c(eVarB, iVar2, set, xnh.a.ETFS);
            c.c(eVarB, imh.i.POPULAR_BONDS, set, xnh.a.BONDS);
            c.c(eVarB, imh.i.POPULAR_CFDS, set, xnh.a.CFD);
        } else {
            imh.h hVar = imh.h.POPULAR_STOCKS;
            knh.c cVar2 = new knh.c(knh.a.STOCKS);
            xnh.a[] elements2 = {null, xnh.a.STOCKS};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            c.b(eVarB, hVar, cVar2, kotlin.collections.d.y0(elements2), null);
            imh.h hVar2 = imh.h.POPULAR_ETFS;
            knh.c cVar3 = new knh.c(knh.a.ETF);
            Set set2 = c.f323517b;
            c.b(eVarB, hVar2, cVar3, set2, xnh.a.ETFS);
            c.b(eVarB, imh.h.POPULAR_BONDS, new knh.c(knh.a.BOND), set2, xnh.a.BONDS);
            c.b(eVarB, imh.h.POPULAR_CFD, new knh.c(knh.a.CFD), set2, xnh.a.CFD);
        }
        if (dVar.c(ScreenerApi$Toggles$CommissionFreeEtfs.f96091c)) {
            c.d(eVarB, imh.i.NO_COMMISSION_ETPS, xnh.a.ETFS);
        }
        CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc commoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc = CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc.f65947c;
        if (aVar.a(commoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc)) {
            c.b(eVarB, imh.h.POPULAR_COMMODITIES, new knh.c(knh.a.COMMODITY), c.f323517b, xnh.a.COMMODITY);
        }
        c.b(eVarB, imh.h.TOP_MOVERS, dVar.c(ScreenerApi$Toggles$InvestTopMoversScreenerRedesign.f96095c) ? new knh.f(new wgl.c(zel.f.STOCKS, zel.k.TOP_GAINERS, zel.a.ONE_DAY)) : knh.e.f186168a, c.f323517b, null);
        imh.h hVar3 = imh.h.MOST_TRADED_STOCKS;
        knh.a aVar3 = knh.a.STOCKS;
        xnh.a aVar4 = xnh.a.STOCKS;
        InstrumentsTrendCollectionId.MostTraded mostTraded = InstrumentsTrendCollectionId.MostTraded.f74902a;
        c.a(eVarB, hVar3, aVar3, mostTraded, aVar4);
        imh.h hVar4 = imh.h.MOST_TRADED_ETFS;
        knh.a aVar5 = knh.a.ETF;
        xnh.a aVar6 = xnh.a.ETFS;
        c.a(eVarB, hVar4, aVar5, mostTraded, aVar6);
        imh.h hVar5 = imh.h.MOST_TRADED_BONDS;
        knh.a aVar7 = knh.a.BOND;
        xnh.a aVar8 = xnh.a.BONDS;
        c.a(eVarB, hVar5, aVar7, mostTraded, aVar8);
        imh.h hVar6 = imh.h.MOST_TRADED_CFDS;
        knh.a aVar9 = knh.a.CFD;
        xnh.a aVar10 = xnh.a.CFD;
        c.a(eVarB, hVar6, aVar9, mostTraded, aVar10);
        c.a(eVarB, imh.h.CFDS_PNL_DRIVERS, aVar9, InstrumentsTrendCollectionId.CfdsPnlDrivers.f74894a, aVar10);
        c.a(eVarB, imh.h.MOST_SHORTED_CFDS, aVar9, InstrumentsTrendCollectionId.MostShortedCfds.f74901a, aVar10);
        if (dVar.c(ScreenerApi$Toggles$TradeScreenBondCollectionsScreenerMigration.f96097c)) {
            c.d(eVarB, imh.i.GOVERNMENT_BONDS, aVar8);
            c.d(eVarB, imh.i.CORPORATE_BONDS, aVar8);
        } else {
            c.a(eVarB, imh.h.GOVERNMENT_BONDS, aVar7, new InstrumentsTrendCollectionId.Bonds(com.revolut.feature.instruments.trend.collections.api.model.a.GOVERNMENT), aVar8);
            c.a(eVarB, imh.h.CORPORATE_BONDS, aVar7, new InstrumentsTrendCollectionId.Bonds(com.revolut.feature.instruments.trend.collections.api.model.a.CORPORATE), aVar8);
        }
        c.a(eVarB, imh.h.INDEX_ETFS, aVar5, InstrumentsTrendCollectionId.IndexEtfs.f74900a, aVar6);
        ScreenerApi$Toggles$InvestScreenerRemoteCollectionWidgets screenerApi$Toggles$InvestScreenerRemoteCollectionWidgets = ScreenerApi$Toggles$InvestScreenerRemoteCollectionWidgets.f96094c;
        if (dVar.c(screenerApi$Toggles$InvestScreenerRemoteCollectionWidgets)) {
            c.d(eVarB, imh.i.TECHNOLOGY_ETFS, aVar6);
            c.d(eVarB, imh.i.CRYPTO_EXPOSURE_ETNS, aVar6);
            c.d(eVarB, imh.i.COMMODITY_EXPOSURE_ETC, aVar6);
        } else {
            c.a(eVarB, imh.h.TECHNOLOGY_ETFS, aVar5, InstrumentsTrendCollectionId.TechnologyEtfs.f74906a, aVar6);
            c.a(eVarB, imh.h.ETNS_CRYPTO_EXPOSURE, aVar5, InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a, aVar6);
            c.a(eVarB, imh.h.ETCS_COMMODITY_EXPOSURE, aVar5, InstrumentsTrendCollectionId.EtcsCommodityExposure.f74896a, aVar6);
        }
        if (dVar.c(screenerApi$Toggles$InvestScreenerRemoteCollectionWidgets)) {
            c.d(eVarB, imh.i.ETPS_LEVERAGED, aVar6);
        } else {
            c.a(eVarB, imh.h.ETPS_LEVERAGED, aVar5, InstrumentsTrendCollectionId.EtpsLeveraged.f74898a, aVar6);
        }
        if (dVar.c(commoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc)) {
            c.a(eVarB, imh.h.PRECIOUS_METALS_ETCS, knh.a.COMMODITY, InstrumentsTrendCollectionId.PreciousMetalsEtcs.f74904a, xnh.a.COMMODITY);
        }
        if (dVar.c(ScreenerApi$Toggles$InvestScreenerHighDividendWidget.f96092c)) {
            c.d(eVarB, imh.i.HIGH_DIVIDEND_YIELD, aVar4);
        } else {
            c.a(eVarB, imh.h.DIVIDEND_LEADERS, aVar3, InstrumentsTrendCollectionId.DividendLeaders.f74895a, aVar4);
        }
        c.d(eVarB, imh.i.RECENTLY_ADDED_ETPS, aVar6);
        c.d(eVarB, imh.i.RECENTLY_ADDED_STOCKS, aVar4);
        c.d(eVarB, imh.i.RECENTLY_ADDED_BONDS, aVar8);
        c.d(eVarB, imh.i.RECENTLY_ADDED_CFDS, aVar10);
        aim.e eVarA = zhm.u.a(eVarB);
        ArrayList arrayList = new ArrayList(w.t(eVarA, 10));
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            b bVar = (b) listIterator;
            if (!bVar.hasNext()) {
                break;
            }
            imh.g gVar = (imh.g) bVar.next();
            arrayList.add(new Pair(gVar.f162474a, e1.N(new fi7.s(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 25), rd0.e.n(q.Q(j2Var, new j((Continuation) null, this, gVar, 23)), h0.f322473a))));
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            int i = 1;
            if (!it8.hasNext()) {
                break;
            }
            Pair pair = (Pair) it8.next();
            l.b1(this, (Flow) pair.f186386b, null, new im9.h(this, (imh.j) pair.f186385a, (Continuation) null, i), 3);
        }
        int i2 = 0;
        v1 v1VarN = e1.N(new fi7.s(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", i2, 21), q.Q(j2Var, new z(3, this, null)));
        Continuation continuation = null;
        l.b1(this, v1VarN, null, new g0(11, this, continuation), 3);
        int i3 = 4;
        v1 v1VarN2 = e1.N(new fi7.s(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", i2, 20), q.Q(j2Var, new z(i3, this, continuation)));
        Continuation continuation2 = null;
        l.b1(this, v1VarN2, null, new g0(12, this, continuation2), 3);
        v1 v1VarN3 = e1.N(new fi7.s(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", i2, 22), q.Q(j2Var, new z(5, this, continuation2)));
        Continuation continuation3 = null;
        l.b1(this, v1VarN3, null, new g0(13, this, continuation3), 3);
        v1 v1VarN4 = e1.N(new fi7.s(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", i2, 23), q.Q(j2Var, new z(6, this, continuation3)));
        Continuation continuation4 = null;
        l.b1(this, v1VarN4, null, new g0(14, this, continuation4), 3);
        v1 v1VarN5 = e1.N(new fi7.s(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", i2, 24), q.Q(j2Var, new z(7, this, continuation4)));
        Continuation continuation5 = null;
        l.b1(this, v1VarN5, null, new g0(15, this, continuation5), 3);
        int i5 = 8;
        l.b1(this, q.Q(j2Var, new z(i5, this, continuation5)), null, new g0(0, this, continuation5), 3);
        l.b1(this, q.Q(j2Var, new z(9, this, continuation5)), null, new g0(1, this, continuation5), 3);
        int i6 = 2;
        l.b1(this, q.Q(j2Var, new z(10, this, continuation5)), null, new g0(i6, this, continuation5), 3);
        xnh.a[] elements3 = {null, xnh.a.STOCKS};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        wkm.l lVarQ = q.Q(j2Var, new j(continuation5, new imh.n(kotlin.collections.d.y0(elements3), null), this, 22));
        l.b1(this, lVarQ, null, new g0(3, this, continuation5), 3);
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add((Flow) ((Pair) it9.next()).f186386b);
        }
        l.b1(this, this.F.Z2(new ag1.k((Flow[]) d0.d1(v.k(new ag1.k((Flow[]) d0.d1(arrayList2).toArray(new Flow[0]), 28), new c1(v1VarN2, 12), new c1(v1VarN, 13), new c1(v1VarN3, 14), new amh.w(lVarQ, 14), new c1(v1VarN4, 15), new c1(v1VarN5, 16))).toArray(new Flow[0]), 29)), null, new g0(i3, this, null), 3);
        tmh.g gVar2 = this.z;
        Continuation continuation6 = null;
        l.b1(this, boh.f.e(q.q(nim.a.v(gVar2.f272228a.a(), new tlf.n(2))), new tjf.e(gVar2, 13)), null, new g0(5, this, continuation6), 3);
        l.b1(this, q.Q(j2Var, new z(0, this, continuation6)), null, new g0(7, this, continuation6), 3);
        l.b1(this, q.Q(j2Var, new z(1, this, continuation6)), null, new g0(i5, this, continuation6), 3);
        l.b1(this, q.Q(j2Var, new z(i6, this, continuation6)), null, new g0(9, this, continuation6), 3);
        l.b1(this, this.G.Z2(), null, new g0(10, this, continuation6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.H;
    }
}
