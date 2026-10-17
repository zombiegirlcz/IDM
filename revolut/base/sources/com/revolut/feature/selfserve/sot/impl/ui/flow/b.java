package com.revolut.feature.selfserve.sot.impl.ui.flow;

import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import v2e.x;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            k7i.i iVar = eVar.f85942q;
            this.u = 1;
            obj2 = iVar.n(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        eVar.H2(eVar.v, new x(zBooleanValue, 29));
        h.t2(eVar, eVar.f85946w, zBooleanValue ? SotFlowContract$Step.Home.f85929a : SotFlowContract$Step.Status.f85932a, false, null, false, 12);
        return Unit.f186387a;
    }
}
