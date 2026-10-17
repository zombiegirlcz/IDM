package cgf;

import bgf.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.onboarding.api.workflow.WorkflowFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousTransactionFeatureConfig;
import e8e.w;
import egf.c;
import elm.f;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import sri.m;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements agf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f23964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f23965b;

    public b(c transactionWorkflowRepository, m navigator) {
        Intrinsics.checkNotNullParameter(transactionWorkflowRepository, "transactionWorkflowRepository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f23964a = transactionWorkflowRepository;
        this.f23965b = navigator;
    }

    public static FeatureCommand a(h transactionWorkflow, NaviCommand endDestination, String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        Intrinsics.checkNotNullParameter(endDestination, "endDestination");
        int i = a.f23963a[transactionWorkflow.f15197b.ordinal()];
        FeatureConfig workflowFeatureConfig = i != 1 ? i != 2 ? null : new WorkflowFeatureConfig(new WorkflowConfiguration.Workflow(transactionWorkflow.f15196a, (wi0.b) null, endDestination, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 122), false) : new SuspiciousTransactionFeatureConfig(new SuspiciousTransactionFeatureConfig.SuspiciousTransaction(transactionId));
        if (workflowFeatureConfig != null) {
            return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), null, new FeatureCommand(workflowFeatureConfig), 2)));
        }
        return null;
    }

    public final void b(h transactionWorkflow, NaviCommand endDestination, String transactionId) {
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(endDestination, "endDestination");
        FeatureCommand featureCommandA = a(transactionWorkflow, endDestination, transactionId);
        if (featureCommandA != null) {
            this.f23965b.c(featureCommandA);
        }
    }

    public final Object c(String str, gim.c cVar) {
        c cVar2 = this.f23964a;
        cVar2.getClass();
        w wVar = new w(cVar2, str, null, 17);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, wVar, cVar);
    }
}
