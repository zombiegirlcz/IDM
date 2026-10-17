package com.revolut.feature.credit.card.impl.ui.autopay.flow.setup;

import boh.f;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$State;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import up4.d;
import up4.k;
import vkm.q;
import w4l.h;
import w4l.j;
import yb5.e;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
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
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            lb5.b bVar = cVar.f69089p;
            CreditCardSetupAutopayFlowContract$InputData creditCardSetupAutopayFlowContract$InputData = cVar.o;
            String f69072a = creditCardSetupAutopayFlowContract$InputData.getF69072a();
            e eVar = (e) bVar;
            h hVar = h.f294642c;
            obj2 = q.x(mo3.a.g(rd0.e.n(f.e(u0.i(eVar.a(f69072a, hVar), eVar.b(creditCardSetupAutopayFlowContract$InputData.getF69072a(), hVar), nim.a.v(cVar.u.j(j.f294644c), k.f)), new d(cVar, 2)), h0.f322473a), null, null, 3), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.H2(cVar.z, new um7.d((CreditCardSetupAutopayFlowContract$State.Content) obj2, 18));
        cVar.M2(CreditCardSetupAutopayFlowContract$Step.ProductArticle.f69084a);
        return Unit.f186387a;
    }
}
