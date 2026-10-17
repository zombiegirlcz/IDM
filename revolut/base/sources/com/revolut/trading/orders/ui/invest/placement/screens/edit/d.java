package com.revolut.trading.orders.ui.invest.placement.screens.edit;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep;
import cul.r1;
import cul.z1;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import vkm.q;
import yhm.o;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            a87.b bVar = new a87.b(mo3.a.g(rd0.e.n(new z1(eVar.X.j(), 0), y0.b(new Pair("InvestOrderEditScreenModel", "showCommissionFreeTradesInfoDialog"))), null, new r1(1), 1), 8);
            this.u = 1;
            obj2 = q.x(bVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.v2(eVar.f106922n0, (InvestOrderEditScreenContract$ModalStep.CommissionFreeTradeDialog) obj2, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
