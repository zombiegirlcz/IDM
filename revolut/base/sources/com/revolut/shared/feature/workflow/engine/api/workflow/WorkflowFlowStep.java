package com.revolut.shared.feature.workflow.engine.api.workflow;

import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/WorkflowFlowStep;", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Landroid/os/Parcelable;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WorkflowFlowStep extends FlowStep, Parcelable {
    boolean G9();

    String H1();

    boolean X3();

    WorkflowStepNavigation p7();
}
