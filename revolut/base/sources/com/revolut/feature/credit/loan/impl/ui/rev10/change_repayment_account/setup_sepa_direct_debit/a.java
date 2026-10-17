package com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit;

import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import lp2.c;
import m65.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final LoanSetupSepaAccountFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l35.b f70385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f70386q;

    public a(LoanSetupSepaAccountFlowContract$InputData inputData, l35.b loanInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        this.o = inputData;
        this.f70385p = loanInteractor;
        c cVar = new c(this, 27);
        this.f70386q = d.a(this, LoanSetupSepaAccountFlowContract$Step.SelectAccount.f70384a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70386q;
    }
}
