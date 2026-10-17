package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit;

import d3i.k;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o7j.p;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f99853w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f99853w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f99853w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            g gVar = this.v;
            k kVar = new k(gVar, this.f99853w, 22);
            this.u = 1;
            if (gVar.P2(this, kVar) == aVar) {
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
