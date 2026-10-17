package com.revolut.feature.credit.card.impl.ui.repay_with_review.flow;

import com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.CreditCardRepayWithReviewFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pu4.b;
import pu4.d;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardRepayWithReviewFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69607p;

    public a(CreditCardRepayWithReviewFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVar = new d(this, 0);
        this.f69607p = cp5.d.a(this, CreditCardRepayWithReviewFlowContract$Step.PaymentAmount.f69605a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69607p;
    }
}
