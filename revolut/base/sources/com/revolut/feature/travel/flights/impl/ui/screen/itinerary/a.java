package com.revolut.feature.travel.flights.impl.ui.screen.itinerary;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import cvi.i;
import d6g.j;
import h4g.f;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements j {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j4g.a f93346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f93347q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f93348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93349s;

    public a(n stateMapper, TravelFlightsItineraryScreenContract$InputData inputData, f faresInteractor, j4g.a flightUnavailableDialogExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(faresInteractor, "faresInteractor");
        Intrinsics.checkNotNullParameter(flightUnavailableDialogExtension, "flightUnavailableDialogExtension");
        this.o = faresInteractor;
        this.f93346p = flightUnavailableDialogExtension;
        this.f93347q = new b();
        this.f93348r = d.b(this, new d6g.f(inputData.f93343a, inputData.f93344b, new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
        this.f93349s = e.a(this, new czh.a(20));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.q(q.Q(this.f93347q, new i(continuation, this, 10))), null, null, new cvi.j(this, continuation, 20), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93349s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f93348r;
    }
}
