package com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow;

import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlowContract$Step;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreenContract$InputData;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nb6.p;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements nqg.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AddMoneyFlowContract$FlowInput f94768t;
    public final AddMoneyFlowContract$Step.AddMoneyStep u;
    public final EmptyFlowState v;

    public a(AddMoneyFlowContract$FlowInput flowInput) {
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        this.f94768t = flowInput;
        this.u = AddMoneyFlowContract$Step.AddMoneyStep.f94767a;
        this.v = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        AddMoneyFlowContract$Step step = (AddMoneyFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, AddMoneyFlowContract$Step.AddMoneyStep.f94767a)) {
            throw new NoWhenBranchMatchedException();
        }
        AddMoneyFlowContract$FlowInput addMoneyFlowContract$FlowInput = this.f94768t;
        AddMoneyScreen addMoneyScreen = new AddMoneyScreen(new AddMoneyScreenContract$InputData(addMoneyFlowContract$FlowInput.f94761a, addMoneyFlowContract$FlowInput.f94762b, addMoneyFlowContract$FlowInput.d, addMoneyFlowContract$FlowInput.e, addMoneyFlowContract$FlowInput.f, addMoneyFlowContract$FlowInput.f94763c, addMoneyFlowContract$FlowInput.f94764g, addMoneyFlowContract$FlowInput.f94765h, addMoneyFlowContract$FlowInput.f94766j));
        p pVar = new p(1, this, a.class, "onAddMoneyScreenResult", "onAddMoneyScreenResult(Lcom/revolut/feature/vaults/api/navigation/add_money/AddMoneyScreenProvider$Output;)V", 0, 15);
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        addMoneyScreen.H = pVar;
        return addMoneyScreen;
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
