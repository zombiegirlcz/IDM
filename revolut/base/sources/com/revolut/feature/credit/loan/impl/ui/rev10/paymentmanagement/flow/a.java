package com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow;

import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.LoanPaymentManagementFlowContract$Step;
import cp5.d;
import i69.p;
import i75.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(LoanPaymentManagementFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new LoanPaymentManagementFlowContract$Step.Manage(inputData.f70469a), f0.f322471a, new p(inputData, 1));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
