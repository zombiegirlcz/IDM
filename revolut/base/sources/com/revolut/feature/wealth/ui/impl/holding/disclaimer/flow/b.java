package com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow;

import com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$ModalStep;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import vkm.q;
import w4l.j;
import yhm.o;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CashHoldingsInfoFlowContract$InputData.ForTradingAccount f96018w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, CashHoldingsInfoFlowContract$InputData.ForTradingAccount forTradingAccount, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f96018w = forTradingAccount;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f96018w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        CashHoldingsInfoFlowContract$InputData.ForTradingAccount forTradingAccount = this.f96018w;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jhi.b bVarG = mo3.a.g(wzg.a.d(cVar.o, y0.b(forTradingAccount.e.getF105262a()), j.f294644c), null, null, 3);
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
        List list = (List) obj2;
        int size = list.size();
        if (size == 0) {
            h.D2(cVar.f96021r);
        } else if (size != 1) {
            cVar.I2(new CashHoldingsInfoFlowContract$ModalStep.Selector(forTradingAccount.f96004a, forTradingAccount.e, list));
        } else {
            kel.b bVar = (kel.b) d0.b0(list);
            CashHoldingsInfoFlowContract$InputData cashHoldingsInfoFlowContract$InputData = cVar.f96019p;
            cVar.I2(new CashHoldingsInfoFlowContract$ModalStep.AvailableExplanation(cashHoldingsInfoFlowContract$InputData.getF96005b(), cashHoldingsInfoFlowContract$InputData.getF96006c(), bVar));
        }
        return Unit.f186387a;
    }
}
