package com.revolut.feature.apm.payto.impl.screen.topup.flow;

import com.revolut.feature.apm.payto.impl.screen.topup.flow.PayToTopupFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u7k.w;
import xg6.b0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements ub2.b {
    public final PayToTopupFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f62763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f62764q;

    public b(PayToTopupFlowContract$InputData inputData, b0 payToStoredMethodTopUpRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payToStoredMethodTopUpRepository, "payToStoredMethodTopUpRepository");
        this.o = inputData;
        this.f62763p = payToStoredMethodTopUpRepository;
        this.f62764q = d.a(this, new PayToTopupFlowContract$Step.LinkedAccount(inputData.f62759a), f0.f322471a, new w(this, 7));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62764q;
    }
}
