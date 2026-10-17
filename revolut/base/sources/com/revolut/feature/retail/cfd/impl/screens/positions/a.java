package com.revolut.feature.retail.cfd.impl.screens.positions;

import ael.k;
import cli.g;
import cli.y;
import g4b.a0;
import g4b.b0;
import g4b.l;
import g4b.n;
import hx7.e;
import kge.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import vkm.q;
import ybl.b;
import zhm.u;
import zi0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g4b.h {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g5b.a f82266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f82267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f82268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f2b.b f82269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f82270t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(d cfdPositionsInteractor, g5b.a exitStrategiesExtension, n inputData, b instrumentTickerInteractor, g4b.y stateMapper, f2b.b cfdPerformanceTracker) {
        Intrinsics.checkNotNullParameter(cfdPositionsInteractor, "cfdPositionsInteractor");
        Intrinsics.checkNotNullParameter(exitStrategiesExtension, "exitStrategiesExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cfdPerformanceTracker, "cfdPerformanceTracker");
        this.o = cfdPositionsInteractor;
        this.f82266p = exitStrategiesExtension;
        this.f82267q = inputData;
        this.f82268r = instrumentTickerInteractor;
        this.f82269s = cfdPerformanceTracker;
        this.f82270t = mra.d.b(this, new l(null, null, null, true, inputData.d, inputData.f140453b), stateMapper, null, false, 12);
        this.u = e.a(this, new fv1.a(this, 24));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // b2b.f
    public final Flow M1() {
        return c.i(u.c(this.f82267q.f140452a));
    }

    @Override // yji.l
    public final void T1(long j2) {
        n nVar = this.f82267q;
        String str = nVar.f140452a;
        String str2 = nVar.f140453b;
        Continuation continuation = null;
        yji.l.b1(this, ((k) this.f82268r).g(str), null, new b0(this, null, 1), 3);
        String str3 = nVar.f140454c;
        d dVar = this.o;
        yji.l.b1(this, str3 != null ? nim.a.v(d.u(dVar, str3, str2), new g3e.h(16)) : nim.a.v(d.w(dVar, nVar.f140452a, str2), new g3e.h(17)), null, new b0(this, null, 2), 3);
        yji.l.b1(this, q.Q(q.s(new a0(this.f82270t.B(new g3e.h(18)), 0), new g3e.h(19), q.f290100b), new f5h.b(continuation, this, 24)), null, new b0(this, null, 0), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f82270t;
    }
}
