package com.revolut.feature.tab.invest.impl.ui.home;

import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
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
        return ((c) create((d28.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d28.c cVar = (d28.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = cVar instanceof d28.e;
        f fVar = this.v;
        if (z) {
            fVar.C1(((d28.e) cVar).f110781a);
        } else {
            if (!(cVar instanceof d28.d)) {
                throw new NoWhenBranchMatchedException();
            }
            h.v2(fVar.f0, new TabInvestControllerContract$ModalStep.KompotDescriptor(((d28.d) cVar).f110780a), ModalDestination.Style.FullscreenPaged.f98310a);
        }
        return Unit.f186387a;
    }
}
