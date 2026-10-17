package com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility;

import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.MobilityAccountSwitchingFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nk4.o;
import oki.h;
import smd.s;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements np2.b {
    public final BankAccountSwitchingFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f64028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mn2.a f64029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f64030r;

    public b(BankAccountSwitchingFlowInputData inputData, s jointAccountDataInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(jointAccountDataInteractor, "jointAccountDataInteractor");
        this.o = inputData;
        this.f64028p = jointAccountDataInteractor;
        this.f64029q = mn2.a.MOBILITY;
        this.f64030r = d.a(this, new o(this, 9));
    }

    public final void I2(boolean z) {
        h.t2(this, this.f64030r, new MobilityAccountSwitchingFlowContract$Step.SwitchPreferenceSelection(z), true, z ? TransitionAnimation.FADE.f98392a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
    }

    public final void J2(String str) {
        h.t2(this, this.f64030r, new MobilityAccountSwitchingFlowContract$Step.RequestStatus(str), false, null, false, 12);
    }

    public final void K2(FormState formState, wn2.a aVar, wn2.d dVar) {
        h.t2(this, this.f64030r, new MobilityAccountSwitchingFlowContract$Step.SwitchDateSelection(formState, aVar, dVar), true, null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData = this.o;
        if (bankAccountSwitchingFlowInputData instanceof BankAccountSwitchingFlowInputData.NewRequest) {
            I2(false);
        } else if (bankAccountSwitchingFlowInputData instanceof BankAccountSwitchingFlowInputData.RequestList) {
            h.t2(this, this.f64030r, MobilityAccountSwitchingFlowContract$Step.Entry.f64011a, true, null, false, 12);
        } else {
            if (!(bankAccountSwitchingFlowInputData instanceof BankAccountSwitchingFlowInputData.RequestStatus)) {
                throw new NoWhenBranchMatchedException();
            }
            J2(((BankAccountSwitchingFlowInputData.RequestStatus) bankAccountSwitchingFlowInputData).f63887b);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f64030r;
    }
}
