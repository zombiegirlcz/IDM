package com.revolut.feature.credit.card.impl.ui.description.flow;

import com.revolut.feature.credit.card.impl.ui.description.flow.CreditCardBeDrivenDescriptionFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;
import zjc.g;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            g gVar = new g(2, continuation, bVar);
            this.u = 1;
            obj2 = bVar.p2(this, gVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.u2(bVar, bVar.f69220q, new CreditCardBeDrivenDescriptionFlowContract$Step.Details(bVar.o.f69216b, (vm4.a) obj2), null, 6);
        return Unit.f186387a;
    }
}
