package com.revolut.trading.orders.ui.invest.placement.screens.edit;

import cli.y;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep;
import cul.p0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import vkm.q;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e eVar = this.v;
        y yVar = eVar.m0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Flow flowB = yVar.B(new p0(15));
            Flow flowB2 = yVar.B(new p0(16));
            vkm.d dVarT2 = eVar.T2();
            jhi.b bVarG = mo3.a.g(nim.a.u(new a2c.c(2, 29, null), u0.m(u0.i(flowB, flowB2, dVarT2), yVar.B(new p0(17)))), null, new ct6.o(29), 1);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.v2(eVar.f106922n0, (InvestOrderEditScreenContract$ModalStep.SelectOrderType) obj2, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
