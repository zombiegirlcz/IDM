package com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan;

import cli.y;
import et6.u1;
import fg8.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.c2;
import vkm.d2;
import vkm.q;
import vkm.q0;
import vkm.t1;
import wkm.l;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = this.v;
        Continuation continuation = null;
        l lVarQ = q.Q(fVar.D, new f5h.b(continuation, fVar, 6));
        d2.Companion.getClass();
        t1 t1VarM = q.M(lVarQ, coroutineScope, c2.f290008b, 1);
        y yVar = fVar.B;
        q.G(new q0(ta6.a.h(t1VarM, yVar.B(new g(26)), yVar.B(new g(27)), new ate.b(fVar, continuation, 2)), new a(fVar, null), 1), coroutineScope);
        return q.G(new q0(new u1(t1VarM, fVar, 9), new b(fVar, null), 1), coroutineScope);
    }
}
