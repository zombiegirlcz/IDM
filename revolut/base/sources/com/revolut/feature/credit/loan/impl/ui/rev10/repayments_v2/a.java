package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2;

import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements d85.a {
    public final LoanRepaymentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l35.h f70543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f70544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f70545r;

    public a(LoanRepaymentFlowContract$InputData inputData, l35.h repaymentV2AvailabilityInteractor) {
        FlowStep confirmPayment;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repaymentV2AvailabilityInteractor, "repaymentV2AvailabilityInteractor");
        this.o = inputData;
        this.f70543p = repaymentV2AvailabilityInteractor;
        this.f70544q = e.b(this, new LoanRepaymentFlowContract$State(inputData.f70535a));
        if (inputData.d) {
            dj0.d dVar = inputData.f70537c;
            if (dVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            confirmPayment = new LoanRepaymentFlowContract$Step.ConfirmPayment(null, dVar, null);
        } else {
            confirmPayment = LoanRepaymentFlowContract$Step.ChooseAmount.f70539a;
        }
        this.f70545r = cp5.d.a(this, confirmPayment, f0.f322471a, new cwj.h(this, 14));
    }

    @Override // qki.e
    public final d getState() {
        return this.f70544q;
    }

    @Override // yki.g
    public final b s() {
        return this.f70545r;
    }
}
