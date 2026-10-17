package com.revolut.feature.travel.miles.impl.ui.screen.flight_finder;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import g75.i;
import ga9.v;
import ghg.g;
import ghg.l;
import ghg.p;
import ghg.q;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import lfg.g0;
import lig.j;
import lig.k;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vfg.e;
import vfg.r;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends h implements l {

    @NotNull
    public static final p Companion = new p();
    public final TravelMilesFlightFinderScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f94289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f94290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f94291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f94293t;

    public c(ihg.b stateMapper, l80.e dateProvider, TravelMilesFlightFinderScreenContract$InputData inputData, r milesSearchInteractor, e airlinesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(milesSearchInteractor, "milesSearchInteractor");
        Intrinsics.checkNotNullParameter(airlinesInteractor, "airlinesInteractor");
        this.o = inputData;
        this.f94289p = milesSearchInteractor;
        this.f94290q = airlinesInteractor;
        this.f94292s = hx7.e.a(this, new i(this, 28));
        TravelMilesSearchLocation travelMilesSearchLocation = inputData.f94282a;
        TravelMilesSearchLocation travelMilesSearchLocation2 = inputData.f94283b;
        LocalDate localDatePlusMonths = ((f) dateProvider).e().plusMonths(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
        this.f94293t = d.b(this, new g(new ghg.h(localDatePlusMonths), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), travelMilesSearchLocation2, travelMilesSearchLocation, false, false), stateMapper, null, false, 12);
    }

    public static TravelMilesSearchLocation K2(k kVar) {
        if (kVar instanceof lig.i) {
            lig.i iVar = (lig.i) kVar;
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
        r rVar = this.f94289p;
        rVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g0 g0Var = rVar.f288635a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(g0Var.i.e(Unit.f186387a, loadingStrategy)), null, null, new q(this, continuation, 0), 3);
        yji.l.a1(this, e.a(this.f94290q, "TAP_PORTUGAL"), null, null, new q(this, continuation, 1), 3);
        l2(new ge7.f(this, continuation, 3), new yi5.b(26));
        gd8.j jVar = new gd8.j(25);
        y yVar = this.f94293t;
        yji.l.a1(this, vkm.q.q(yVar.B(jVar)), null, null, new v(this, continuation, 22), 3);
        TravelMilesFlightFinderScreenContract$InputData travelMilesFlightFinderScreenContract$InputData = this.o;
        if (travelMilesFlightFinderScreenContract$InputData.f94282a == null || travelMilesFlightFinderScreenContract$InputData.f94283b == null) {
            return;
        }
        H2(yVar, new gd8.j(26));
    }

    public final void I2() {
        a2 a2Var = this.f94291r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        H2(this.f94293t, new gd8.j(23));
    }

    public final void J2(boolean z) {
        y yVar = this.f94293t;
        g gVar = (g) ((j2) yVar.f22677a).getValue();
        TravelMilesSearchLocation travelMilesSearchLocation = gVar.e;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f94292s;
        if (travelMilesSearchLocation == null) {
            h.v2(aVar, TravelMilesFlightFinderScreenContract$ModalStep.OriginPicker.f94286a, popup);
            return;
        }
        TravelMilesSearchLocation travelMilesSearchLocation2 = gVar.d;
        if (travelMilesSearchLocation2 == null) {
            h.v2(aVar, TravelMilesFlightFinderScreenContract$ModalStep.DestinationPicker.f94285a, popup);
            return;
        }
        ghg.j jVar = gVar.f143908a;
        if (jVar instanceof ghg.h) {
            h.v2(aVar, TravelMilesFlightFinderScreenContract$ModalStep.DatePicker.f94284a, popup);
            return;
        }
        if (z) {
            C2(new ghg.k(travelMilesSearchLocation, travelMilesSearchLocation2, jVar.a()));
            return;
        }
        if (gVar.f143911g) {
            LocalDate localDateA = jVar.a();
            H2(yVar, new gd8.j(24));
            a2 a2Var = this.f94291r;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.f94291r = n2(new g0a.e(8, this, travelMilesSearchLocation, travelMilesSearchLocation2, localDateA, null), new whi.b(6));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94292s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        y yVar = this.f94293t;
        if (((g) ((j2) yVar.f22677a).getValue()).f) {
            H2(yVar, new gd8.j(22));
            a2 a2Var = this.f94291r;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.f94291r = n2(new b(this, null), new whi.b(6));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94293t;
    }
}
