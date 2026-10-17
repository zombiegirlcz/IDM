package pth;

import android.content.Context;
import com.revolut.feature.onboarding.api.workflow.WorkflowFeatureConfig;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.shared.feature.workflow.engine.api.WorkflowEngineApi$Toggles$AlternativeDocuments;
import com.revolut.shared.feature.workflow.engine.api.WorkflowEngineApi$Toggles$WorkflowRefactoringAndroid;
import com.revolut.shared.feature.workflow.engine.api.WorkflowEngineApi$Toggles$WorkflowRefreshOnForeground;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof WorkflowFeatureConfig;
    }

    @Override // uri.a
    public final void c(sri.m navigator, Context context, FeatureConfig featureConfig) {
        WorkflowFeatureConfig config = (WorkflowFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        navigator.c(vhi.c.c(new WorkflowFlowDestination(config.f78248a, config.f78249b), yhi.b.SOLID, null, false, 12));
    }

    @Override // nte.a
    public final List e() {
        return zhm.v.k(WorkflowEngineApi$Toggles$WorkflowRefactoringAndroid.f105373c, WorkflowEngineApi$Toggles$WorkflowRefreshOnForeground.f105374c, WorkflowEngineApi$Toggles$AlternativeDocuments.f105372c);
    }
}
