package com.revolut.feature.security_hub.impl.ui.flow;

import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import smd.s;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        m mVar = this.v;
        if (i == 0) {
            o.b(obj2);
            s sVar = mVar.u;
            this.u = 1;
            obj2 = sVar.c(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        oki.h.t2(mVar, mVar.N, ((Boolean) obj2).booleanValue() ? SecurityHubFlowContract$Step.TransactionsDayNightLimits.f85544a : SecurityHubFlowContract$Step.TransactionsLimit.f85545a, false, TransitionAnimation.FADE.f98392a, false, 8);
        return Unit.f186387a;
    }
}
