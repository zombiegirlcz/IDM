package til;

import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$InputData;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowDestination;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public interface m {
    static /* synthetic */ com.revolut.kompot.common.b a(m mVar, WorkflowConfiguration workflowConfiguration, hea.r rVar, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            rVar = null;
        }
        return ((pth.g) mVar).d(workflowConfiguration, z, rVar);
    }

    static WorkflowFlow b(m mVar, WorkflowConfiguration configuration, WorkflowFlowType flowType, i iVar, int i) {
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            iVar = i.DEFAULT;
        }
        i backgroundType = iVar;
        ((pth.g) mVar).getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        return new WorkflowFlow(new WorkflowFlowContract$InputData(null, configuration, flowType, backgroundType, z, false));
    }

    static WorkflowFlowDestination c(m mVar, WorkflowConfiguration configuration) {
        ((pth.g) mVar).getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new WorkflowFlowDestination(configuration, true);
    }
}
