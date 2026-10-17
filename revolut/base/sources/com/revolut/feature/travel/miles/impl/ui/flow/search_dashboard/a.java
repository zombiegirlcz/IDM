package com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard;

import ali.b;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.TravelMilesApi$Toggles;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem;
import hx7.e;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import kp0.m;
import md6.s;
import naf.j;
import ngg.i;
import ngg.n;
import nyb.k;
import oki.h;
import yji.l;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements i {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem f94253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f94254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f94256s;

    public a(n stateMapper, TravelMilesFlightSearchDashboardPagerFlowContract$InputData inputData, k revPointsInteractor, vfg.h milesFeatureInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(milesFeatureInteractor, "milesFeatureInteractor");
        this.o = revPointsInteractor;
        TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem travelMilesFlightSearchDashboardPagerFlowContract$PagerItem = ((d) milesFeatureInteractor.f288621a).c(TravelMilesApi$Toggles.LoyaltyAirMilesTransfers.f94080c) ? TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem.AirlinesHome.f94250b : TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem.AirlinesMain.f94251b;
        this.f94253p = travelMilesFlightSearchDashboardPagerFlowContract$PagerItem;
        this.f94254q = mra.d.b(this, new ngg.d(new Data(null, null, true, 3, null), inputData.f94245a ? "TAB_FLIGHT_FINDER_ID" : travelMilesFlightSearchDashboardPagerFlowContract$PagerItem.f94249a, v.k(travelMilesFlightSearchDashboardPagerFlowContract$PagerItem, TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem.FlightFinder.f94252b)), stateMapper, null, false, 12);
        this.f94255r = e.a(this, new n8i.e(this, 23));
        this.f94256s = s.b(this, new m(inputData, this, 14));
    }

    @Override // ali.h
    public final b I0() {
        return this.f94256s;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(this.o.c(false)), null, null, new j(this, null, 16), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94255r;
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.f94254q;
    }
}
