package com.revolut.feature.pay_bills_taxes.impl.ui_payment.form;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.FormPaymentFlowContract$Step;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreenContract$InputData;
import cp5.d;
import i69.p;
import ih9.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(FormPaymentFlowContract$InputData flowInputData) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        this.o = d.a(this, new FormPaymentFlowContract$Step.Amount(new FormAmountScreenContract$InputData(flowInputData.f78779a, flowInputData.f78780b, flowInputData.f78781c, flowInputData.d, flowInputData.e)), f0.f322471a, new p(this, 18));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
