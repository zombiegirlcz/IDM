package xsb;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.onboarding.api.workflow.WorkflowFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import grl.k9;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import pfm.z;
import q06.h;
import sri.m;
import ue0.e;
import v3e.t;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f308443a;

    public d(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f308443a = navigator;
    }

    public static FeatureCommand b(jf0.c cVar) {
        WorkflowConfiguration workflow;
        if (Intrinsics.f(cVar.e(2), "create")) {
            HashMap map = cVar.d;
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = k9.KYC;
            companion.getClass();
            workflow = new WorkflowConfiguration.CreateWorkflow(map, AnalyticsProduct.Companion.b(k9Var), 46);
        } else {
            String strE = cVar.e(2);
            AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
            k9 k9Var2 = k9.KYC;
            companion2.getClass();
            workflow = new WorkflowConfiguration.Workflow(strE, (wi0.b) null, (NaviCommand) null, (String) null, AnalyticsProduct.Companion.b(k9Var2), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG);
        }
        return new FeatureCommand(new WorkflowFeatureConfig(workflow, true));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "workflows") && cVar.e(2).length() > 0;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new h(new BridgeDestination(b(cVar)), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new pfm.h(new t(this, deeplink, 29), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return e.F(zVarD, Boolean.FALSE);
    }
}
