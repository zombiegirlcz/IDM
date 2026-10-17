package com.revolut.feature.retail.privacy.impl.ui.flow;

import com.revolut.feature.retail.privacy.impl.ui.flow.RetailPrivacyFlowContract$Step;
import com.revolut.feature.retail.privacy.impl.ui.flow.screen.RetailPrivacyScreen;
import com.revolut.feature.retail.privacy.impl.ui.flow.screen.RetailPrivacyScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends g implements ncb.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetailPrivacyFlowContract$InputData f82778t;
    public final RetailPrivacyFlowContract$Step.Initial u;
    public final RetailPrivacyFlowContract$State v;

    public a(RetailPrivacyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f82778t = inputData;
        this.u = RetailPrivacyFlowContract$Step.Initial.f82777a;
        this.v = RetailPrivacyFlowContract$State.f82776a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        RetailPrivacyFlowContract$Step step = (RetailPrivacyFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, RetailPrivacyFlowContract$Step.Initial.f82777a)) {
            return new RetailPrivacyScreen(new RetailPrivacyScreenContract$InputData(this.f82778t.f82775a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
