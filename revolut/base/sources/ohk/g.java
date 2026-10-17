package ohk;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import ffk.w;
import grl.k9;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import til.m;
import vkm.q;
import vkm.v1;
import vkm.z1;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends bgk.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f225391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f225392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f225393n;
    public final z1 o;

    public g(m workflowFlowProvider, w planWorkflowsInteractor, k errorParser) {
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(planWorkflowsInteractor, "planWorkflowsInteractor");
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        this.f225391l = workflowFlowProvider;
        this.f225392m = planWorkflowsInteractor;
        this.f225393n = errorParser;
        this.o = q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    @Override // bgk.a
    public final Object Z2(Function1 function1, gim.i iVar) {
        return q.x(q.L(new v1(new iji.d(4, (Continuation) null, function1)), 5L, new d(this, null)), iVar);
    }

    @Override // bgk.a
    public final void b3(hha.d plan, Function1 onResult) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        T2(new nyd.j(this, onResult, plan, null, 14), new yi5.b(27));
    }

    public final void c3(String str, Function0 function0, Function1 function1) {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = k9.Premium;
        companion.getClass();
        WorkflowFlow workflowFlowB = m.b(this.f225391l, new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, AnalyticsProduct.Companion.b(k9Var), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, null, 60);
        workflowFlowB.l2(new a3l.b(8, function0));
        n.P2(this, workflowFlowB, null, new ofg.a(this, function1, 6), 1);
    }
}
