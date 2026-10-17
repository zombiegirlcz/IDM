package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.funds_confirmation;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.funds_confirmation.OpenBankingFundsConfirmationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import kp0.m;
import ni6.b;
import ni6.c;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        m mVar = new m(inputData, this, 15);
        this.o = d.a(this, OpenBankingFundsConfirmationFlowContract$Step.FundsConfirmationScreen.f72507a, f0.f322471a, mVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
