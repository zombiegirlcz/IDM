package com.revolut.feature.payinstore.impl.ui.flow;

import com.revolut.feature.payinstore.impl.ui.flow.PayInStoreFlowContract$Step;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pij.d1;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends g implements pn9.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PayInStoreFlowContract$Step.PayInStore f79043t;
    public final PayInStoreFlowContract$State u;

    public a(PayInStoreFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f79043t = new PayInStoreFlowContract$Step.PayInStore(inputData.f79040a);
        this.u = PayInStoreFlowContract$State.f79041a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PayInStoreFlowContract$Step step = (PayInStoreFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PayInStoreFlowContract$Step.PayInStore)) {
            throw new NoWhenBranchMatchedException();
        }
        PayInStoreScreen payInStoreScreen = new PayInStoreScreen(((PayInStoreFlowContract$Step.PayInStore) step).f79042a);
        d1 d1Var = new d1(this, 21);
        Intrinsics.checkNotNullParameter(d1Var, "<set-?>");
        payInStoreScreen.H = d1Var;
        return payInStoreScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f79043t;
    }
}
