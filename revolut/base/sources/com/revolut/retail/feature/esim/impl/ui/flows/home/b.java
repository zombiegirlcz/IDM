package com.revolut.retail.feature.esim.impl.ui.flows.home;

import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import vkm.y;
import w4l.h;
import xce.d;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
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
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            if (q.x(new y(mo3.a.g(cVar.f100685w.a(null, null, null, (7 & 8) != 0 ? h.f294642c : w4l.i.f294643c), null, new d(6), 1), new x18.c(3, 9, null)), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), false, TransitionAnimation.NONE.f98393a, true);
        return Unit.f186387a;
    }
}
