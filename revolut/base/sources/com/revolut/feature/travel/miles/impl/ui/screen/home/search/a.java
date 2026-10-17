package com.revolut.feature.travel.miles.impl.ui.screen.home.search;

import bw4.s;
import c9f.c;
import cig.e;
import cig.g;
import cli.n;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qr0.i;
import tsk.t;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements g {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f94361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dyb.a f94362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f94363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f94364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94365t;

    public a(n stateMapper, i agentsInteractor, t accountsInteractor, dyb.a kycCheckExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(agentsInteractor, "agentsInteractor");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(kycCheckExtension, "kycCheckExtension");
        this.o = agentsInteractor;
        this.f94361p = accountsInteractor;
        this.f94362q = kycCheckExtension;
        this.f94363r = new b();
        this.f94364s = d.b(this, new e(0), stateMapper, null, false, 12);
        this.f94365t = hx7.e.a(this, new c(this, 20));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f94363r, new s(continuation, this, 15)), null, null, new cbh.g(this, continuation, 23), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94365t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94364s;
    }
}
