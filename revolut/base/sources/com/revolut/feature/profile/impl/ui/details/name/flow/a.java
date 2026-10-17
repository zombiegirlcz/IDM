package com.revolut.feature.profile.impl.ui.details.name.flow;

import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlowContract$Step;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar2 = bVar.f81406t;
            WorkflowName.INSTANCE.getClass();
            WorkflowName workflowName = WorkflowName.f105665b;
            this.u = 1;
            obj2 = aVar2.a(workflowName, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.E2(new ChangeNameFlowContract$Step.Workflow((String) obj2), false, null, false);
        return Unit.f186387a;
    }
}
