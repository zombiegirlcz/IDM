package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nhg.f0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((d) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        return Boolean.FALSE;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = this.u;
        fVar.H2(fVar.u, new f0(2));
        return Boolean.FALSE;
    }
}
