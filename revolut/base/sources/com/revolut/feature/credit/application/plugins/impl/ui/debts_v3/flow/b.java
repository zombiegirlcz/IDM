package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import my3.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            c cVar = new c(eVar, null, 4);
            this.u = 1;
            if (eVar.p2(this, cVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        yki.i iVar = eVar.f67521s;
        h hVar = eVar.f67520r;
        if (hVar != null) {
            oki.h.t2(eVar, iVar, new OutstandingDebtsV3FlowContract$Step.DebtsHub(hVar.f210316b), false, null, false, 12);
            return Unit.f186387a;
        }
        Intrinsics.r("flowConfiguration");
        throw null;
    }
}
