package com.revolut.retail.feature.airportlounges.impl.ui.flows.scheme;

import com.revolut.retail.feature.airportlounges.impl.ui.flows.scheme.SchemeLoungesFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import swi.c;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = ((Boolean) obj2).booleanValue();
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((a) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.v;
        if (z) {
            h.t2(cVar, cVar.f266228q, SchemeLoungesFlowContract$Step.Home.f99025a, false, null, false, 12);
        } else {
            h.t2(cVar, cVar.f266228q, SchemeLoungesFlowContract$Step.UnlockLounges.f99026a, false, null, false, 12);
        }
        return Unit.f186387a;
    }
}
