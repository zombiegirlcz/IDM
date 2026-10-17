package com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass;

import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.CassAccountSwitchingFlowContract$Step;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lp2.c;
import oki.h;
import smd.s;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements lp2.b {
    public final BankAccountSwitchingFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f64006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l61.a f64007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cq2.a f64008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mn2.a f64009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f64010t;

    public b(BankAccountSwitchingFlowInputData inputData, s jointAccountDataInteractor, l61.a userCompanyInteractor, cq2.a cassSwitchPreferenceScreenProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(jointAccountDataInteractor, "jointAccountDataInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(cassSwitchPreferenceScreenProvider, "cassSwitchPreferenceScreenProvider");
        this.o = inputData;
        this.f64006p = jointAccountDataInteractor;
        this.f64007q = userCompanyInteractor;
        this.f64008r = cassSwitchPreferenceScreenProvider;
        this.f64009s = mn2.a.CASS;
        this.f64010t = d.a(this, new c(this, 0));
    }

    public final void I2(String str) {
        h.t2(this, this.f64010t, new CassAccountSwitchingFlowContract$Step.RequestStatus(str), false, null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData = this.o;
        if (bankAccountSwitchingFlowInputData instanceof BankAccountSwitchingFlowInputData.NewRequest) {
            l2(new ll6.i(this, wn2.d.FULL, null, 15), new yi5.b(26));
        } else if (bankAccountSwitchingFlowInputData instanceof BankAccountSwitchingFlowInputData.RequestList) {
            h.t2(this, this.f64010t, CassAccountSwitchingFlowContract$Step.Entry.f63992a, true, null, false, 12);
        } else {
            if (!(bankAccountSwitchingFlowInputData instanceof BankAccountSwitchingFlowInputData.RequestStatus)) {
                throw new NoWhenBranchMatchedException();
            }
            I2(((BankAccountSwitchingFlowInputData.RequestStatus) bankAccountSwitchingFlowInputData).f63887b);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f64010t;
    }
}
