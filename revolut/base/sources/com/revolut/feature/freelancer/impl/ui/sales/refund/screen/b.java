package com.revolut.feature.freelancer.impl.ui.sales.refund.screen;

import b9k.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData;
import dj0.d;
import et6.a3;
import et6.f1;
import et6.h1;
import gr6.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import o27.j;
import o27.l;
import o27.p;
import o27.w;
import oki.h;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements p {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f74211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f1 f74212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1 f74213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f74214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q27.b f74215t;
    public final a3 u;
    public final wj0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FreelancerRefundScreenContract$InputData f74216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ppk.f f74217x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f74218y;
    public final y z;

    public b(f acquiringOrderInteractor, w80.b amountFormatter, f1 freelancerEquivalentAmountInteractor, h1 freelancerInteractor, m freelancerPocketsInteractor, q27.b freelancerRefundDialogFactory, a3 freelancerRefundInteractor, wj0.a idempotencyKeyHolder, FreelancerRefundScreenContract$InputData inputData, ppk.f ratesInteractor, w stateMapper) {
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(freelancerEquivalentAmountInteractor, "freelancerEquivalentAmountInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(freelancerRefundDialogFactory, "freelancerRefundDialogFactory");
        Intrinsics.checkNotNullParameter(freelancerRefundInteractor, "freelancerRefundInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = acquiringOrderInteractor;
        this.f74211p = amountFormatter;
        this.f74212q = freelancerEquivalentAmountInteractor;
        this.f74213r = freelancerInteractor;
        this.f74214s = freelancerPocketsInteractor;
        this.f74215t = freelancerRefundDialogFactory;
        this.u = freelancerRefundInteractor;
        this.v = idempotencyKeyHolder;
        this.f74216w = inputData;
        this.f74217x = ratesInteractor;
        this.f74218y = new vii.b();
        d f74209a = inputData.getF74209a();
        d f74209a2 = inputData.getF74209a();
        FreelancerRefundScreenContract$InputData.Order order = inputData instanceof FreelancerRefundScreenContract$InputData.Order ? (FreelancerRefundScreenContract$InputData.Order) inputData : null;
        FreelancerOrder freelancerOrder = order != null ? order.f74208b : null;
        FreelancerRefundScreenContract$InputData.OrderPayment orderPayment = inputData instanceof FreelancerRefundScreenContract$InputData.OrderPayment ? (FreelancerRefundScreenContract$InputData.OrderPayment) inputData : null;
        AcquiringOrderPayment acquiringOrderPayment = orderPayment != null ? orderPayment.f74210b : null;
        j jVar = j.AMOUNT;
        m70.a.c(t0.f186434a);
        this.z = mra.d.b(this, new l(f74209a, f74209a2, null, jVar, freelancerOrder, acquiringOrderPayment, "", new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f74218y, new ns9.h(continuation, this, 11)), null, null, new nwc.f(this, continuation, 15), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }
}
