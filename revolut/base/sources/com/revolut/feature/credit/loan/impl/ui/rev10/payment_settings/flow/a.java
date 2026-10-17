package com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.LoanPaymentSettingsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import cp5.d;
import d75.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import x35.e;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements d75.a {

    @NotNull
    private static final c Companion = new c();
    public final LoanPaymentSettingsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f70452p;

    public a(LoanPaymentSettingsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f70452p = d.a(this, new LoanPaymentSettingsFlowContract$Step.Hub(inputData.f70447a), f0.f322471a, new cwj.h(this, 10));
    }

    public final void I2(LoanDetails loanDetails, e eVar) {
        int i = d75.d.f111826a[loanDetails.f70144a.f.f241819b.ordinal()];
        if (i == 1) {
            C1(new LoanKompotFeatureConfig.AutoPayNavigationDestination(this.o.f70447a, false));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = jli.h.f175850a;
        } else {
            h.w2(this.f70452p, new LoanPaymentSettingsFlowContract$Step.ChangeAutoPayAccount(loanDetails, eVar), ModalDestination.Style.POPUP.f98311a);
        }
    }

    @Override // yki.g
    public final b s() {
        return this.f70452p;
    }
}
