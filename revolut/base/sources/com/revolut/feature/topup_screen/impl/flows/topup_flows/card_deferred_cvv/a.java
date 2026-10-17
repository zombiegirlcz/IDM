package com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv;

import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step;
import cue.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oxe.j;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardDeferredCvvFlowContract$Step f90980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f90981x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, CardDeferredCvvFlowContract$Step cardDeferredCvvFlowContract$Step, j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f90980w = cardDeferredCvvFlowContract$Step;
        this.f90981x = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f90980w, this.f90981x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            d dVar = ((CardDeferredCvvFlowContract$Step.Cvv) this.f90980w).f90977a;
            String str = this.f90981x.f230791a;
            this.u = 1;
            if (c.J2(this.v, dVar, str, this) == aVar) {
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
