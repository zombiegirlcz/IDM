package com.revolut.feature.apm.upi.impl.flow.intent_payment;

import com.revolut.feature.apm.upi.impl.flow.intent_payment.UpiIntentPaymentFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sf2.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final UpiIntentPaymentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b3a.a f62982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f62983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f62984r;

    public a(UpiIntentPaymentFlowContract$InputData inputData, b3a.a chatTransferNavigationProvider, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f62982p = chatTransferNavigationProvider;
        this.f62983q = idempotencyKeyHolder;
        scl.h hVar = new scl.h(this, 7);
        this.f62984r = d.a(this, UpiIntentPaymentFlowContract$Step.Review.f62981a, f0.f322471a, hVar);
    }

    @Override // yji.l
    public final void I1() {
        this.f62983q.a("payments-upi-transfer");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62984r;
    }
}
