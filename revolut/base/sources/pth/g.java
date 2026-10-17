package pth;

import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements til.m {
    public final com.revolut.kompot.common.b d(WorkflowConfiguration configuration, boolean z, Function1 block) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        WorkflowFlow workflowFlow = new WorkflowFlow(new WorkflowFlowContract$InputData(null, configuration, z, null, 57));
        if (block != null) {
            Intrinsics.checkNotNullParameter(block, "block");
            workflowFlow.H = block;
        }
        return new com.revolut.kompot.common.b(workflowFlow, (ModalDestination.Style) null, 6);
    }
}
