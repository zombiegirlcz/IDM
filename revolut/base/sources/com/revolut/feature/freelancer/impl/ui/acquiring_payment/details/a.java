package com.revolut.feature.freelancer.impl.ui.acquiring_payment.details;

import cli.g;
import cli.y;
import et6.z;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import r10.r;
import rp0.g1;
import umd.n;
import uu6.i;
import uu6.o;
import vkm.q;
import vkm.t0;
import whf.b;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements i {
    public final z o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f73707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f73708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FreelancerAcquiringPaymentDetailsScreenContract$InputData f73709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g1 f73710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f73711t;
    public final vii.b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73712w;

    public a(z acquiringPaymentsInteractor, r acquiringPaymentDetailsInteractor, c70.a clipboard, FreelancerAcquiringPaymentDetailsScreenContract$InputData inputData, g1 shotDialogDisplayer, b transactionContentProvider, uu6.r stateMapper) {
        Intrinsics.checkNotNullParameter(acquiringPaymentsInteractor, "acquiringPaymentsInteractor");
        Intrinsics.checkNotNullParameter(acquiringPaymentDetailsInteractor, "acquiringPaymentDetailsInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(transactionContentProvider, "transactionContentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = acquiringPaymentsInteractor;
        this.f73707p = acquiringPaymentDetailsInteractor;
        this.f73708q = clipboard;
        this.f73709r = inputData;
        this.f73710s = shotDialogDisplayer;
        this.f73711t = transactionContentProvider;
        this.u = new vii.b();
        this.v = d.b(this, new uu6.h(0), stateMapper, null, false, 12);
        this.f73712w = e.a(this, new n(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        o oVar = new o(0, this, continuation);
        vii.b bVar = this.u;
        l.a1(this, q.Q(bVar, oVar), null, null, new uu6.q(0, this, null), 3);
        l.a1(this, q.Q(bVar, new o(2, this, continuation)), null, null, new uu6.q(1, this, null), 3);
        l.a1(this, q.Q(new t0(this.v.B(new urd.y(27)), 1), new o(1, this, continuation)), null, null, new uu6.q(2, this, null), 3);
    }

    public final void I2(String str) {
        this.f73708q.c(null, str, false, new ur2.a(this, 3));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73712w;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
