package pth;

import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowFlowContract$InputData f239690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pbi.e f239691b;

    public e(WorkflowFlowContract$InputData inputData, pbi.e countryInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f239690a = inputData;
        this.f239691b = countryInteractor;
    }

    public final boolean a() {
        WorkflowConfiguration workflowConfiguration = this.f239690a.f96479b;
        WorkflowConfiguration.Workflow workflow = workflowConfiguration instanceof WorkflowConfiguration.Workflow ? (WorkflowConfiguration.Workflow) workflowConfiguration : null;
        return workflow != null && workflow.f78247g;
    }

    public final Object b(gim.c cVar) {
        wi0.b f78245b = this.f239690a.f96479b.getF78245b();
        return f78245b == null ? vkm.q.x(mo3.a.g(zi0.c.w(rd0.e.b(nim.a.w(this.f239691b.f234686a.k(false), pbi.d.f))), null, new psl.m(9), 1), cVar) : f78245b;
    }

    public final boolean c() {
        WorkflowFlowType workflowFlowType = this.f239690a.f96478a;
        return (workflowFlowType instanceof WorkflowFlowType.Inner) || (workflowFlowType instanceof WorkflowFlowType.Onboarding);
    }
}
