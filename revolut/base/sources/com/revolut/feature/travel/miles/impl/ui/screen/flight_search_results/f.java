package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.TravelMilesApi$Toggles;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreenContract$ModalStep;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a;
import com.revolut.kompot.common.ModalDestination;
import hfg.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lig.i;
import lig.j;
import lig.k;
import lk0.g;
import n68.x;
import nhg.b0;
import nhg.c0;
import nhg.d0;
import nhg.s;
import nhg.v;
import oki.h;
import q06.l;
import skm.a2;
import vf0.n;
import vf0.p;
import vfg.o;
import vfg.r;
import vkm.j2;
import vkm.q;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends h implements v {
    public final vhg.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f94330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f94331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f94332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f94333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f94334t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public f(kxk.o stateMapper, TravelMilesFlightSearchResultsScreenContract$InputData inputData, vhg.b analyticsMapper, o travelMilesSearchPagingInteractor, r travelMilesSearchInteractor, l deeplinkRouter, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(analyticsMapper, "analyticsMapper");
        Intrinsics.checkNotNullParameter(travelMilesSearchPagingInteractor, "travelMilesSearchPagingInteractor");
        Intrinsics.checkNotNullParameter(travelMilesSearchInteractor, "travelMilesSearchInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = analyticsMapper;
        this.f94330p = travelMilesSearchPagingInteractor;
        this.f94331q = travelMilesSearchInteractor;
        this.f94332r = deeplinkRouter;
        this.f94333s = featureToggleInteractor;
        this.u = mra.d.b(this, new b(inputData.f94308a, inputData.f94309b, inputData.f94310c, null, i0.PRICE, null, s.COLLAPSED, a.b.f94319a, false, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), false, null), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new n8i.e(this, 24));
    }

    public static TravelMilesSearchLocation K2(k kVar) {
        if (kVar instanceof i) {
            i iVar = (i) kVar;
            return new TravelMilesSearchLocation.Airport(iVar.f195511a, iVar.f195512b);
        }
        if (!(kVar instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar = (j) kVar;
        return new TravelMilesSearchLocation.City(jVar.f195513a, jVar.f195514b);
    }

    @Override // yji.l
    public final void I1() {
        o oVar = this.f94330p;
        efm.r rVarFilter = oVar.f288631c.hide().filter(new n(new p(14), 21));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(ue0.e.q(rVarFilter, h0.f322473a)), null, null, new d0(2, this, null), 3);
        boolean zJ2 = J2();
        y yVar = this.u;
        if (zJ2) {
            yji.l.a1(this, kii.e.t(oVar.d, "hide(...)"), null, null, new c(this, null), 3);
        } else {
            H2(yVar, new nd8.i(29));
        }
        I2();
        if (((jte.d) this.f94333s).c(TravelMilesApi$Toggles.AirMilesFlightSearchEmptyState.f94079c)) {
            yji.l.a1(this, q.Q(q.q(yVar.B(new b0(this, 0))), new c0(0, this, continuation)), null, null, new d0(0, this, null), 3);
        } else {
            yji.l.a1(this, q.Q(q.q(yVar.B(new b0(this, 0))), new c0(1, this, continuation)), null, null, new d0(1, this, null), 3);
        }
    }

    public final void I2() {
        a2 a2Var = this.f94334t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f94334t = l2(new x(this, continuation, 13), new yi5.b(26));
    }

    public final boolean J2() {
        return ((jte.d) this.f94333s).c(TravelMilesApi$Toggles.AirMilesFlightLiveSearch.f94077c);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    public final void L2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f275445a;
        if (Intrinsics.f(str, "BANNER_LEARN_MORE_ID") || Intrinsics.f(str, "NO_RESULTS_LEARN_MORE_ID")) {
            h.v2(this.v, TravelMilesFlightSearchResultsScreenContract$ModalStep.RewardFlights.f94316a, ModalDestination.Style.POPUP.f98311a);
        }
    }

    public final void M2(a aVar) {
        ArrayList arrayListU;
        List list;
        y yVar = this.u;
        g gVar = ((b) ((j2) yVar.f22677a).getValue()).d;
        g gVar2 = null;
        if (gVar == null || (list = gVar.f196174a) == null) {
            arrayListU = null;
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((lk0.e) it8.next()).f196171a);
            }
            arrayListU = w.u(arrayList);
        }
        if (J2() && !ue0.e.n(arrayListU)) {
            gVar2 = ((b) ((j2) yVar.f22677a).getValue()).d;
        }
        H2(yVar, new nc1.j(gVar2, aVar, 8));
        this.f94330p.f288631c.onNext(new g(f0.f322471a));
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
