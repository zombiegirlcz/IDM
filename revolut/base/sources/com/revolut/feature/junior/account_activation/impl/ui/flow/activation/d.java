package com.revolut.feature.junior.account_activation.impl.ui.flow.activation;

import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step;
import com.revolut.feature.junior_onboarding.api.model.OnboardingWorkflow;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import rh8.d0;
import skm.e0;
import skm.p0;
import wgb.v;
import wh8.j;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0Var = fVar.f76653y;
            String str = fVar.o.f76633a.f77103j;
            this.u = 1;
            j jVar = d0Var.f254330a;
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, new v(jVar, str, null, 3), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(fVar, fVar.E, new AccountActivationFlowContract$Step.Workflow.Activation(((OnboardingWorkflow) obj2).f76957a), true, null, false, 12);
        return Unit.f186387a;
    }
}
