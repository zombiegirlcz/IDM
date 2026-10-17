package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow;

import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pqa.j;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ CardOwnerCreationFlowContract$Step u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CardOwnerCreationFlowContract$Step cardOwnerCreationFlowContract$Step, j jVar, Continuation continuation) {
        super(1, continuation);
        this.u = cardOwnerCreationFlowContract$Step;
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return CardOwnerCreationFlowContract$CreationProcessState.a(((CardOwnerCreationFlowContract$Step.AdditionalFields) this.u).f81568a, null, this.v.f238711a, 7);
    }
}
