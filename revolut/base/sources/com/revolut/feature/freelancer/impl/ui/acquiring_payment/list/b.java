package com.revolut.feature.freelancer.impl.ui.acquiring_payment.list;

import cli.y;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import et6.u1;
import et6.z;
import ft4.w;
import fv6.g;
import fv6.k;
import fv6.n;
import fv6.o;
import fv6.s;
import fv6.x;
import gim.i;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements k {
    public final z o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fv6.a f73733p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o7.b f73734q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f73736s;

    public b(z acquiringPaymentInteractor, fv6.a acquiringPaymentPagingSource, o7.b filterMapper, FreelancerAcquiringPaymentListScreenContract$InputData inputData, x stateMapper) {
        Intrinsics.checkNotNullParameter(acquiringPaymentInteractor, "acquiringPaymentInteractor");
        Intrinsics.checkNotNullParameter(acquiringPaymentPagingSource, "acquiringPaymentPagingSource");
        Intrinsics.checkNotNullParameter(filterMapper, "filterMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = acquiringPaymentInteractor;
        this.f73733p = acquiringPaymentPagingSource;
        this.f73734q = filterMapper;
        this.f73735r = e.a(this, new fv1.a(this, 2));
        this.f73736s = d.b(this, new g(inputData.f73730a, 13), stateMapper, null, false, 12);
    }

    public static Object I2(b bVar, AcquiringPaymentsQuery acquiringPaymentsQuery, i iVar) {
        bVar.H2(bVar.f73736s, new fpk.b(acquiringPaymentsQuery, null, 13));
        Object objL = bVar.f73733p.l(acquiringPaymentsQuery, iVar);
        return objL == fim.a.COROUTINE_SUSPENDED ? objL : Unit.f186387a;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(this.f73733p.j(250L), new w(29)), null, null, new s(this, continuation, 0), 3);
        l2(new o(this, continuation, 1), new yi5.b(26));
        l.a1(this, q.Q(new u1(this.f73736s.B(new n(0)), this, 13), new f5h.b(continuation, this, 14)), null, null, new s(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73735r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f73736s;
    }
}
