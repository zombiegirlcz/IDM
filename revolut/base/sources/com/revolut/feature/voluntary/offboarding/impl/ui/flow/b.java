package com.revolut.feature.voluntary.offboarding.impl.ui.flow;

import com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step;
import gim.i;
import jsg.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f fVar = new f(eVar, null, 0);
            this.u = 1;
            obj2 = eVar.p2(this, fVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        eVar.E2(((Boolean) obj2).booleanValue() ? VoluntaryOffboardingFlowContract$Step.RemoveObstaclesStep.f94836a : VoluntaryOffboardingFlowContract$Step.ProtectDataStep.f94835a, true, null, false);
        return Unit.f186387a;
    }
}
