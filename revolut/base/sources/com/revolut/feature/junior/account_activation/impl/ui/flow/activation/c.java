package com.revolut.feature.junior.account_activation.impl.ui.flow.activation;

import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountActivationFlowContract$Step.Workflow f76645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountActivationFlowContract$Step.Workflow workflow, f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f76645w = workflow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.f76645w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        AccountActivationFlowContract$Step.Workflow workflow = this.f76645w;
        f fVar = this.v;
        b bVar = new b(workflow, fVar, null);
        this.u = 1;
        Object objB = pu7.a.B(fVar.k, "HANDLE_WORKFLOW_RESULT", bVar, this);
        return objB == aVar ? aVar : objB;
    }
}
