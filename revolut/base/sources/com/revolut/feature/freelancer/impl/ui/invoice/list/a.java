package com.revolut.feature.freelancer.impl.ui.invoice.list;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.api.navigation.c;
import et6.h3;
import et6.p1;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import rx6.l;
import rx6.m;
import rx6.o;
import rx6.r;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements o {
    public final p1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h3 f73876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f73877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f73878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73879s;

    public a(p1 freelancerInvoiceInteractor, h3 freelancerSaleTypeAvailabilityInteractor, InvoiceListScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleTypeAvailabilityInteractor, "freelancerSaleTypeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerInvoiceInteractor;
        this.f73876p = freelancerSaleTypeAvailabilityInteractor;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f73877q = z1VarB;
        c cVar = inputData.f73874a;
        m.Companion.getClass();
        this.f73878r = d.b(this, new m(cVar, l.a(cVar), false, null, new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
        this.f73879s = e.a(this, new rl8.d(this, 18));
    }

    public final void I2(Function1 function1) {
        H2(this.f73878r, new js7.c(22, function1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73879s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, q.Q(this.f73877q, new mki.d((Continuation) null, this, 10)), null, new r(this, null), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f73878r;
    }
}
