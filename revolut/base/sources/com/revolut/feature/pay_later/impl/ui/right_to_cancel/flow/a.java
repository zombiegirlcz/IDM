package com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow;

import com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.RightToCancelFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oa4.c;
import ok9.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final RightToCancelFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f78925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f78926q;

    public a(RightToCancelFlowContract$InputData inputData, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f78925p = idempotencyKeyHolder;
        c cVar = new c(this, 23);
        this.f78926q = d.a(this, RightToCancelFlowContract$Step.Intro.f78923a, f0.f322471a, cVar);
    }

    @Override // yji.l
    public final void I1() {
        this.f78925p.a("BNPL_CANCELLATION_IDEMPOTENCY_TAG");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78926q;
    }
}
