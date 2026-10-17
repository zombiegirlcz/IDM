package avh;

import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowState;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class f {
    private f() {
    }

    public static WorkflowState a(String str) {
        WorkflowState workflowState;
        if (str != null) {
            WorkflowState[] workflowStateArrValues = WorkflowState.values();
            int length = workflowStateArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    workflowState = null;
                    break;
                }
                workflowState = workflowStateArrValues[i];
                if (a0.z(workflowState.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (workflowState != null) {
                return workflowState;
            }
        }
        return WorkflowState.NOT_DEFINED;
    }
}
