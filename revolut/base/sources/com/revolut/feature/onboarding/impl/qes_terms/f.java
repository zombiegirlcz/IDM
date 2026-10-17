package com.revolut.feature.onboarding.impl.qes_terms;

import com.revolut.feature.onboarding.impl.qes_terms.QesTermsFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        h hVar = this.v;
        if (i == 0) {
            o.b(obj2);
            pfm.h hVarI = hVar.f78562p.i();
            this.u = 1;
            if (nim.a.a(hVarI, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        oki.h.t2(hVar, hVar.A, QesTermsFlowContract$Step.AccountRecovery.f78541a, false, TransitionAnimation.FADE.f98392a, false, 8);
        return Unit.f186387a;
    }
}
