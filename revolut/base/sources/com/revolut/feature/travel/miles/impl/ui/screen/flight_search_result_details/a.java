package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.TravelMilesFlightSearchResultDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gig.t;
import hfg.c0;
import hx7.e;
import iig.f;
import java.util.List;
import k3k.k;
import khg.n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lfg.g0;
import mra.d;
import oki.h;
import tig.b;
import vfg.q;
import vfg.r;
import yji.l;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements n {
    public final TravelMilesFlightSearchResultDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f94301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f94302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f94303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f94304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f94305t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(t stateMapper, TravelMilesFlightSearchResultDetailsScreenContract$InputData inputData, b topUpDialogMapper, f recommendedFlightDialogMapper, r searchInteractor, q travelMilesProvidersInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topUpDialogMapper, "topUpDialogMapper");
        Intrinsics.checkNotNullParameter(recommendedFlightDialogMapper, "recommendedFlightDialogMapper");
        Intrinsics.checkNotNullParameter(searchInteractor, "searchInteractor");
        Intrinsics.checkNotNullParameter(travelMilesProvidersInteractor, "travelMilesProvidersInteractor");
        this.o = inputData;
        this.f94301p = topUpDialogMapper;
        this.f94302q = recommendedFlightDialogMapper;
        this.f94303r = searchInteractor;
        this.f94304s = travelMilesProvidersInteractor;
        this.f94305t = d.b(this, new khg.h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null), stateMapper, null, false, 12);
        this.u = e.a(this, new k(this, 27));
    }

    @Override // yji.l
    public final void I1() {
        String flightId = this.o.f94294a;
        r rVar = this.f94303r;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(flightId, "flightId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g0 g0Var = rVar.f288635a;
        Intrinsics.checkNotNullParameter(flightId, "flightId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, yh5.b.d(rd0.e.b(g0Var.k.e(flightId, loadingStrategy)), rd0.e.b(this.f94304s.f288634a.d.f(Unit.f186387a, false))), null, null, new khg.r(this, null), 3);
    }

    public final void I2(String str, List list) {
        c0 c0Var;
        String str2 = (list == null || (c0Var = (c0) d0.M0(list)) == null) ? null : c0Var.f151811c;
        TravelMilesFlightSearchResultDetailsScreenContract$InputData travelMilesFlightSearchResultDetailsScreenContract$InputData = this.o;
        h.v2(this.u, new TravelMilesFlightSearchResultDetailsScreenContract$ModalStep.TopUp(str, str2, travelMilesFlightSearchResultDetailsScreenContract$InputData.f94295b, travelMilesFlightSearchResultDetailsScreenContract$InputData.f94296c), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f94305t;
    }
}
