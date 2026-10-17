package com.revolut.feature.freelancer.impl.ui.profile.merchant_terms;

import cli.y;
import et6.h1;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import li2.f;
import m07.g;
import m07.i;
import mra.d;
import oki.h;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements g {
    public final h1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f74050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f74052r;

    public a(h1 freelancerInteractor, i stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerInteractor;
        this.f74050p = new b();
        this.f74051q = e.a(this, new lxi.g(this, 7));
        this.f74052r = d.b(this, new m07.e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f74050p, new f(continuation, this, 18)), null, null, new lph.h(this, continuation, 15), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74051q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f74052r;
    }
}
