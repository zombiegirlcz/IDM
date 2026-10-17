package com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap;

import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.OverstapAccountSwitchingFlowContract$Step;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pe2.l;
import plb.g;
import smd.s;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements pp2.b {
    public final BankAccountSwitchingFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f64041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mn2.a f64042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f64043r;

    public b(BankAccountSwitchingFlowInputData inputData, s jointAccountDataInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(jointAccountDataInteractor, "jointAccountDataInteractor");
        this.o = inputData;
        this.f64041p = jointAccountDataInteractor;
        this.f64042q = mn2.a.OVERSTAP;
        this.f64043r = d.a(this, new g(this, 11));
    }

    public final void I2(String str) {
        h.t2(this, this.f64043r, new OverstapAccountSwitchingFlowContract$Step.RequestStatus(str), false, null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData = this.o;
        if (bankAccountSwitchingFlowInputData instanceof BankAccountSwitchingFlowInputData.NewRequest) {
            l2(new l(this, null, 21), new yi5.b(26));
        } else if (bankAccountSwitchingFlowInputData instanceof BankAccountSwitchingFlowInputData.RequestList) {
            h.t2(this, this.f64043r, OverstapAccountSwitchingFlowContract$Step.Entry.f64031a, false, null, false, 14);
        } else {
            if (!(bankAccountSwitchingFlowInputData instanceof BankAccountSwitchingFlowInputData.RequestStatus)) {
                throw new NoWhenBranchMatchedException();
            }
            I2(((BankAccountSwitchingFlowInputData.RequestStatus) bankAccountSwitchingFlowInputData).f63887b);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f64043r;
    }
}
