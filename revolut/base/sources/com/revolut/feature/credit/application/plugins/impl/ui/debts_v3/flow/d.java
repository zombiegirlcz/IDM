package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import ht3.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import my3.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function2 {
    public e u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f67517w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.f67517w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.f67517w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e eVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        e eVar2 = this.f67517w;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            c cVar = new c(eVar2, continuation, 0);
            this.u = eVar2;
            this.v = 1;
            obj2 = eVar2.p2(this, cVar);
            if (obj2 == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.u;
            o.b(obj2);
        }
        eVar.f67520r = (h) obj2;
        h hVar = eVar2.f67520r;
        if (hVar == null) {
            Intrinsics.r("flowConfiguration");
            throw null;
        }
        l0 l0Var = hVar.f210315a;
        if (l0Var == null) {
            oki.h.t2(eVar2, eVar2.f67521s, new OutstandingDebtsV3FlowContract$Step.DebtsHub(hVar.f210316b), false, TransitionAnimation.NONE.f98393a, false, 8);
        } else {
            oki.h.t2(eVar2, eVar2.f67521s, new OutstandingDebtsV3FlowContract$Step.Intro(l0Var), false, TransitionAnimation.NONE.f98393a, false, 8);
        }
        return Unit.f186387a;
    }
}
