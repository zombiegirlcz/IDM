package com.revolut.feature.freelancer.impl.ui.acquiring_order.details;

import b9k.f;
import cli.y;
import ft4.w;
import fu6.i;
import fu6.j;
import fu6.p;
import fu6.r;
import fu6.t;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import o7.b;
import oki.h;
import rp0.g1;
import tqi.g;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements j {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f73673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gr6.a f73674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FreelancerAcquiringOrderDetailsScreenContract$InputData f73675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f73676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f73677t;
    public final g1 u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f73678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f73679x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f73680y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(f acquiringOrderInteractor, c70.a clipboard, gr6.a freelancerAccountDetailsInteractor, FreelancerAcquiringOrderDetailsScreenContract$InputData inputData, b paymentsInteractor, g shareNaviCommandFactory, g1 shotDialogDisplayer, t stateMapper) {
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentsInteractor, "paymentsInteractor");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = acquiringOrderInteractor;
        this.f73673p = clipboard;
        this.f73674q = freelancerAccountDetailsInteractor;
        this.f73675r = inputData;
        this.f73676s = paymentsInteractor;
        this.f73677t = shareNaviCommandFactory;
        this.u = shotDialogDisplayer;
        this.v = new vii.b();
        this.f73678w = new vii.b();
        this.f73679x = new vii.b();
        this.f73680y = d.b(this, new i(0), stateMapper, null, false, 12);
        this.z = e.a(this, new fgj.g(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f73678w, new p(1, this, continuation)), null, null, new r(0, this, null), 3);
        l.a1(this, q.Q(this.f73679x, new p(2, this, continuation)), null, null, new r(1, this, null), 3);
        l.a1(this, q.Q(this.v, new p(0, this, continuation)), null, null, new r(2, this, null), 3);
        l.a1(this, nim.a.v(((et6.g) this.f73674q).d(w4l.h.f294642c), new w(7)), null, null, new r(3, this, null), 3);
    }

    public final void I2(String str) {
        this.f73673p.c(null, str, false, new fp3.a(this, 7));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f73680y;
    }
}
