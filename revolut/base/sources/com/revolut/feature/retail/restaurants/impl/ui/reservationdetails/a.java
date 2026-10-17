package com.revolut.feature.retail.restaurants.impl.ui.reservationdetails;

import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qeb.f;
import qeb.g;
import qeb.j;
import rdb.k;
import u29.c;
import wdb.n;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements qeb.h {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f82873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qeb.a f82874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f82875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f82876s;

    public a(g input, n interactor, qeb.a calendarIntentFactory, j stateMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(calendarIntentFactory, "calendarIntentFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = input;
        this.f82873p = interactor;
        this.f82874q = calendarIntentFactory;
        this.f82875r = d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f82876s = e.a(this, new qc8.a(12));
    }

    @Override // yji.l
    public final void I1() {
        String reservationId = this.o.f245107a;
        n nVar = this.f82873p;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k kVar = nVar.f296526a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = kVar.e.b(reservationId, loadingStrategy);
        Continuation continuation = null;
        l.a1(this, xam.a.h(new c(nVar, reservationId, continuation, 27), dVarB), null, null, new qc3.c(this, continuation, 8), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f82876s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f82875r;
    }
}
