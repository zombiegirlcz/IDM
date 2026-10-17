package com.revolut.feature.travel.flights.impl.ui.screen.post_booking;

import b4g.f;
import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreenContract$Tab;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mra.d;
import oki.h;
import t6g.g;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements g {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f93393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f93394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f93395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ali.b f93396s;

    public b(c stateMapper, TravelFlightsPostBookingScreenContract$InputData inputData, f repository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.o = repository;
        this.f93393p = inputData.f93388a;
        TravelFlightsPostBookingScreenContract$Tab travelFlightsPostBookingScreenContract$Tab = inputData.f93389b;
        this.f93394q = travelFlightsPostBookingScreenContract$Tab != null ? travelFlightsPostBookingScreenContract$Tab.getF94249a() : null;
        TravelFlightsPostBookingScreenContract$Tab.Overview overview = TravelFlightsPostBookingScreenContract$Tab.Overview.f93392a;
        this.f93395r = d.b(this, new t6g.d(u.c(overview), overview.getF94249a()), stateMapper, null, false, 12);
        this.f93396s = s.b(this, new suf.a(this, 21));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f93396s;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.a(this.f93393p, w4l.h.f294642c), null, null, new a(this, null), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f93395r;
    }
}
