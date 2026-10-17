package com.revolut.feature.topup_screen.impl.flow.external_card_details;

import com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExternalCardDetailsFlowContract$Step.DeleteCardConfirmation f90610w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ExternalCardDetailsFlowContract$Step.DeleteCardConfirmation deleteCardConfirmation, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f90610w = deleteCardConfirmation;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f90610w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        ExternalCardDetailsFlowContract$Step.DeleteCardConfirmation deleteCardConfirmation = this.f90610w;
        e eVar = this.v;
        a aVar2 = new a(eVar, deleteCardConfirmation, null);
        this.u = 1;
        Object objP2 = eVar.p2(this, aVar2);
        return objP2 == aVar ? aVar : objP2;
    }
}
