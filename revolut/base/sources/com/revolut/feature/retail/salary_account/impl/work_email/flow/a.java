package com.revolut.feature.retail.salary_account.impl.work_email.flow;

import com.revolut.feature.retail.salary_account.impl.work_email.flow.VerifyEmploymentFlowContract$Step;
import cp5.d;
import ghl.c;
import gib.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(VerifyEmploymentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        String str = inputData.f83061a;
        String str2 = inputData.f83062b;
        this.o = d.a(this, (str == null || d0.W(str)) ? new VerifyEmploymentFlowContract$Step.VerifyEmployment(false, str2) : new VerifyEmploymentFlowContract$Step.VerificationInProgress(str2, inputData.f83061a), f0.f322471a, new c(this, 6));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
