package com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen;

import cli.g;
import cli.y;
import g06.k;
import g57.l;
import g57.p;
import g57.r;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vii.b;
import vkm.q;
import zjh.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements l {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f74443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f74444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74445r;

    public a(j freelancerVatReminderInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerVatReminderInteractor, "freelancerVatReminderInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerVatReminderInteractor;
        this.f74443p = new b();
        this.f74444q = d.b(this, new g57.h(0), stateMapper, null, false, 12);
        this.f74445r = e.a(this, new fv1.a(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(q.Q(this.f74443p, new f5h.b(continuation, this, 26)), new p(this, 0)), null, null, new k(this, continuation, 16), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74445r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f74444q;
    }
}
