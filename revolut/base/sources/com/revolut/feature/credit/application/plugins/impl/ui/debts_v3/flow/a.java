package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import my3.f;
import my3.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar = eVar.f67520r;
            if (hVar == null) {
                Intrinsics.r("flowConfiguration");
                throw null;
            }
            if (hVar.f210315a != null) {
                c cVar = new c(eVar, null, 3);
                this.u = 1;
                if (eVar.p2(this, cVar) == aVar) {
                    return aVar;
                }
            }
            oki.h.w2(eVar.f67521s, OutstandingDebtsV3FlowContract$Step.TypeSelector.f67515a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        h hVar2 = eVar.f67520r;
        if (hVar2 == null) {
            Intrinsics.r("flowConfiguration");
            throw null;
        }
        f debtsHub = hVar2.f210316b;
        my3.c typeSelector = hVar2.f210317c;
        Intrinsics.checkNotNullParameter(debtsHub, "debtsHub");
        Intrinsics.checkNotNullParameter(typeSelector, "typeSelector");
        eVar.f67520r = new h(null, debtsHub, typeSelector);
        oki.h.w2(eVar.f67521s, OutstandingDebtsV3FlowContract$Step.TypeSelector.f67515a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
