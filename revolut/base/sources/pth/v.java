package pth;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WorkflowConfiguration.Workflow f239718w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, WorkflowConfiguration.Workflow workflow, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f239718w = workflow;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v(this.v, this.f239718w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        WorkflowConfiguration.Workflow workflow = this.f239718w;
        String str = workflow.f78244a;
        AnalyticsProduct analyticsProduct = workflow.e;
        this.u = 1;
        Object objR2 = this.v.R2(str, null, analyticsProduct, true, this);
        return objR2 == aVar ? aVar : objR2;
    }
}
