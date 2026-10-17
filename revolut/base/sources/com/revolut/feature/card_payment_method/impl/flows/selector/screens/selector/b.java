package com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector;

import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import q43.o0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ SelectorScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SelectorScreen selectorScreen, Continuation continuation) {
        super(2, continuation);
        this.u = selectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((o0) this.u.T2()).A2(d.C0464d.f65300a);
        return Unit.f186387a;
    }
}
