package com.revolut.feature.revolutpay.impl.ui.instore.flow;

import a9c.b;
import com.revolut.feature.revolutpay.impl.ui.instore.flow.InStorePaymentFlowContract$Step;
import com.revolut.feature.revolutpay.impl.ui.instore.paymentscreen.InStorePaymentScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InStorePaymentFlowContract$Step.InStorePayment f84498t = InStorePaymentFlowContract$Step.InStorePayment.f84497a;
    public final InStorePaymentFlowContract$State u = InStorePaymentFlowContract$State.f84496a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        InStorePaymentFlowContract$Step step = (InStorePaymentFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof InStorePaymentFlowContract$Step.InStorePayment) {
            return new InStorePaymentScreen();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f84498t;
    }
}
