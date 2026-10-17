package com.revolut.feature.card.terminate.impl.ui.flow;

import com.revolut.feature.card.terminate.impl.ui.flow.CardTerminateFlowContract$Step;
import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreen;
import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements su2.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardTerminateFlowContract$InputData f64387t;
    public final CardTerminateFlowContract$Step.Initial u;
    public final CardTerminateFlowContract$State v;

    public a(CardTerminateFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f64387t = inputData;
        this.u = CardTerminateFlowContract$Step.Initial.f64386a;
        this.v = CardTerminateFlowContract$State.f64385a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CardTerminateFlowContract$Step step = (CardTerminateFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, CardTerminateFlowContract$Step.Initial.f64386a)) {
            throw new NoWhenBranchMatchedException();
        }
        CardTerminateFlowContract$InputData cardTerminateFlowContract$InputData = this.f64387t;
        CardTerminateScreen cardTerminateScreen = new CardTerminateScreen(new CardTerminateScreenContract$InputData(cardTerminateFlowContract$InputData.f64383a, cardTerminateFlowContract$InputData.f64384b));
        sl5.a aVar = new sl5.a(this, 18);
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        cardTerminateScreen.H = aVar;
        return cardTerminateScreen;
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
