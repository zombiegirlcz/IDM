package com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal;

import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationConfig;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlowContract$Step;
import dlk.k;
import dp4.l;
import elm.f;
import eq4.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import om4.z;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            z zVar = dVar.f69155p;
            String str = dVar.f69158s.f69149a;
            this.u = 1;
            l lVar = zVar.f226762a;
            lVar.getClass();
            k kVar = new k(lVar, str, null, 9);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, kVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        CreditCardCancellationConfig creditCardCancellationConfig = (CreditCardCancellationConfig) obj2;
        dVar.H2(dVar.v, new g(creditCardCancellationConfig, 0));
        h.t2(dVar, dVar.f69160w, new CreditCardWithdrawalFlowContract$Step.Prompt(creditCardCancellationConfig.f68703b.f68704a), false, null, false, 14);
        return Unit.f186387a;
    }
}
