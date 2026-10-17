package com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.CreditCardRepayCustomAmountFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wde.f;
import ws4.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardRepayCustomAmountFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69477p;

    public a(CreditCardRepayCustomAmountFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        f fVar = new f(this, 28);
        this.f69477p = d.a(this, CreditCardRepayCustomAmountFlowContract$Step.ChooseAmount.f69474a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69477p;
    }
}
