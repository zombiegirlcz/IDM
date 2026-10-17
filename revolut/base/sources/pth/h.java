package pth;

import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$InputData;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowDestination;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowControllerDescriptor$InputData;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f239692a = 0;

    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof til.c)) {
            return null;
        }
        til.c cVar = (til.c) descriptor;
        WorkflowControllerDescriptor$InputData workflowControllerDescriptor$InputData = cVar.f271576a;
        WorkflowConfiguration workflowConfiguration = workflowControllerDescriptor$InputData.f105814a;
        WorkflowFlowType workflowFlowType = workflowControllerDescriptor$InputData.f105815b;
        boolean z = workflowControllerDescriptor$InputData.f105816c;
        return cVar.a(new WorkflowFlow(new WorkflowFlowContract$InputData(workflowControllerDescriptor$InputData.f, workflowConfiguration, workflowFlowType, workflowControllerDescriptor$InputData.d, z, workflowControllerDescriptor$InputData.e)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof WorkflowFlowDestination)) {
            return null;
        }
        WorkflowFlowDestination workflowFlowDestination = (WorkflowFlowDestination) destination;
        return gc0.c.b(new WorkflowFlow(new WorkflowFlowContract$InputData(null, workflowFlowDestination.f96490b, workflowFlowDestination.f96491c, null, 57)), new ogk.b(13));
    }
}
