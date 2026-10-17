package com.revolut.feature.apm.multibanco.impl.via_verde.ui.list;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import f92.g;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import q2e.i0;
import q5g.f0;
import q7b.j;
import q92.c;
import ukm.f;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements c {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f62670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f62671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f62672r;

    public a(g repository, n stateMapper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = repository;
        this.f62670p = e.a(this, new f0(this, 6));
        this.f62671q = d.b(this, new q92.a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f62672r = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f62672r, new j(continuation, this, 4)), null, null, new i0(this, continuation, 23), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f62670p;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f62671q;
    }
}
