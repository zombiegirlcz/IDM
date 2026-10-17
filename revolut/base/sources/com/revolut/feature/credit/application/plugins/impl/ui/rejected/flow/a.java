package com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Continuation continuation) {
        super(1, continuation);
        this.u = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = this.u;
        dVar.O2(null, dVar.f68313p.f68304c.f66892b);
        return Unit.f186387a;
    }
}
