package com.revolut.feature.topup_screen.impl.flows.checkout.flow;

import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$Step;
import cxe.j;
import cxe.n;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ e u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = this.u;
        yki.a aVar2 = eVar.M;
        j jVar = (j) this.v;
        h.t2(eVar, aVar2, new CheckoutFlowContract$Step.TopUpMethods(jVar.f109946a.f90523a.f115083b.f306286a, eVar.N, kxe.a.b(jVar.f109947b), jVar.f109948c, jVar.f109946a), true, null, false, 12);
        return Unit.f186387a;
    }
}
