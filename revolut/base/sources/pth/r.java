package pth;

import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$Workflow;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkflowFlowContract$Workflow f239712b;

    public /* synthetic */ r(WorkflowFlowContract$Workflow workflowFlowContract$Workflow, int i) {
        this.f239711a = i;
        this.f239712b = workflowFlowContract$Workflow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f239711a) {
            case 0:
                return WorkflowFlowContract$State.a((WorkflowFlowContract$State) obj2, this.f239712b, null, null, null, null, 94);
            default:
                return WorkflowFlowContract$State.a((WorkflowFlowContract$State) obj2, this.f239712b, null, null, null, null, 126);
        }
    }
}
