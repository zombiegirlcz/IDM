package com.revolut.feature.voluntary.offboarding.impl.ui.flow;

import com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step;
import efm.r;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
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
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarD = eVar.A.d(wog.a.REWARDS);
            this.u = 1;
            obj2 = nim.a.c(rVarD, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            eVar.E2(VoluntaryOffboardingFlowContract$Step.RewardsUnavailableStep.f94837a, true, null, false);
        } else {
            eVar.l2(new b(eVar, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
