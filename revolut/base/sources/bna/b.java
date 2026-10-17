package bna;

import com.revolut.feature.profile.impl.ui.details.flow.ChangeUserDetailsFlowContract$EmptyState;
import com.revolut.feature.profile.impl.ui.details.flow.ChangeUserDetailsFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.details.flow.ChangeUserDetailsFlowContract$Step;
import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlow;
import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlowContract$ChangeNameMode;
import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlowContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends g implements a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ChangeUserDetailsFlowContract$Step f17126t;
    public final ChangeUserDetailsFlowContract$EmptyState u;

    public b(ChangeUserDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f17126t = inputData.f81400a;
        this.u = ChangeUserDetailsFlowContract$EmptyState.f81399a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ChangeUserDetailsFlowContract$Step step = (ChangeUserDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof ChangeUserDetailsFlowContract$Step.NameChangeDocumentSubmission)) {
            throw new NoWhenBranchMatchedException();
        }
        ChangeNameFlow changeNameFlow = new ChangeNameFlow(new ChangeNameFlowContract$InputData(ChangeNameFlowContract$ChangeNameMode.DocumentSubmission.f81402a));
        bhl.g gVar = new bhl.g(this, 14);
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        changeNameFlow.J = gVar;
        return changeNameFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f17126t;
    }
}
