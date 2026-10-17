package com.revolut.feature.workflow.chat.impl.ui.flow;

import com.revolut.feature.workflow.chat.impl.ui.flow.WorkflowChatFlowContract$Step;
import com.revolut.feature.workflow.chat.impl.ui.flow.screen.initial.WorkflowChatScreen;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import dmj.e0;
import dth.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WorkflowChatFlowContract$Step.Initial f96389t = WorkflowChatFlowContract$Step.Initial.f96388a;
    public final EmptyFlowState u = EmptyFlowState.f98428a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        WorkflowChatFlowContract$Step step = (WorkflowChatFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, WorkflowChatFlowContract$Step.Initial.f96388a)) {
            throw new NoWhenBranchMatchedException();
        }
        WorkflowChatScreen workflowChatScreen = new WorkflowChatScreen();
        e0 e0Var = new e0(this, 29);
        Intrinsics.checkNotNullParameter(e0Var, "<set-?>");
        workflowChatScreen.H = e0Var;
        return workflowChatScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f96389t;
    }
}
