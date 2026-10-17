package com.revolut.feature.rev_points.impl.ui.trophy_room.home;

import ac4.g;
import au6.a3;
import b1c.i;
import b1c.m;
import cli.y;
import ffk.t;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nyb.k;
import oki.h;
import u29.d;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements m {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f83928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f83929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f83930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f83931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83932t;

    public b(g stateMapper, d lifestyleSavingsInteractor, k revPointsInteractor, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(lifestyleSavingsInteractor, "lifestyleSavingsInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.o = lifestyleSavingsInteractor;
        this.f83928p = revPointsInteractor;
        this.f83929q = pricingPlanInteractor;
        this.f83930r = new vii.b();
        this.f83931s = mra.d.b(this, new i(0), stateMapper, null, false, 12);
        this.f83932t = e.a(this, new axd.e(11));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83932t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f83930r, new a3(continuation, this, 6)), null, new avk.i(this, continuation, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f83931s;
    }
}
