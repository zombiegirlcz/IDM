package com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list;

import a31.k;
import cli.n;
import cli.y;
import gr6.e;
import i27.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import tzl.l;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements g {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f74193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vad.g f74194q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f74195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74196s;

    public b(l orderInitiationPagingSource, e freelancerAvailabilityInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(orderInitiationPagingSource, "orderInitiationPagingSource");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = orderInitiationPagingSource;
        this.f74193p = freelancerAvailabilityInteractor;
        this.f74194q = new vad.g(0);
        this.f74195r = d.b(this, new a(0), stateMapper, null, false, 12);
        this.f74196s = hx7.e.a(this, new hw9.b(this, 21));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.q(this.o.j(250L)), null, null, new i13.d(this, continuation, 4), 3);
        l2(new i27.l(this, continuation, 2), new yi5.b(26));
    }

    public final void I2(Function1 function1) {
        H2(this.f74195r, new k(18, function1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74196s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l2(new i27.l(this, null, 0), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f74195r;
    }
}
