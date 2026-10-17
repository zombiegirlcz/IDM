package com.revolut.feature.junior.account_activation.impl.ui.flow.activation;

import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountActivationFlowContract$Step.Workflow f76644w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AccountActivationFlowContract$Step.Workflow workflow, f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f76644w = workflow;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f76644w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            AccountActivationFlowContract$Step.Workflow workflow = this.f76644w;
            f fVar = this.v;
            a aVar2 = new a(workflow, fVar, null);
            this.u = 1;
            if (fVar.p2(this, aVar2) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
