package pth;

import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a2 a2Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar2 = this.u;
        WorkflowConfiguration workflowConfiguration = aVar2.f96495s.f239690a.f96479b;
        if ((workflowConfiguration instanceof WorkflowConfiguration.Workflow) && aVar2.K.d() != null && ((a2Var = aVar2.H) == null || !a2Var.d())) {
            WorkflowConfiguration.Workflow workflow = (WorkflowConfiguration.Workflow) workflowConfiguration;
            a2 a2Var2 = aVar2.H;
            if (a2Var2 != null) {
                a2Var2.f(null);
            }
            aVar2.H = aVar2.l2(new w(aVar2, workflow, null), new pj3.b(aVar2, workflow, 29));
        }
        return Unit.f186387a;
    }
}
