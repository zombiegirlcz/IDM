package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts;

import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.LoanRepaymentAccountsFlowContract$Step;
import cp5.d;
import d9.t0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements v75.a {
    public final LoanRepaymentAccountsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f70517p;

    public a(LoanRepaymentAccountsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f70517p = d.a(this, t0.i(inputData.f70512b) ? LoanRepaymentAccountsFlowContract$Step.ManageRepaymentAccounts.f70514a : new LoanRepaymentAccountsFlowContract$Step.SetupBackUpCard(false, inputData.f70513c), f0.f322471a, new v48.d(this, 8));
    }

    @Override // yki.g
    public final b s() {
        return this.f70517p;
    }
}
