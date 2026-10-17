package com.revolut.feature.travel.flights.impl.ui.screen.discover;

import cli.y;
import h4g.i;
import h4g.k;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qee.s;
import v5g.g;
import vkm.t0;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements g {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f93335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f93336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93337r;

    public a(TravelFlightsDiscoverScreenContract$InputData inputData, s stateMapper, k searchSessionInteractor, i searchParamsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(searchSessionInteractor, "searchSessionInteractor");
        Intrinsics.checkNotNullParameter(searchParamsInteractor, "searchParamsInteractor");
        this.o = searchSessionInteractor;
        this.f93335p = searchParamsInteractor;
        this.f93336q = d.b(this, new v5g.d(inputData.f93325a), stateMapper, null, false, 12);
        this.f93337r = e.a(this, new v48.d(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, new t0(this.f93335p.f149369a.f12328a, 1), null, null, new v44.e(this, null, 6), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93337r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93336q;
    }
}
