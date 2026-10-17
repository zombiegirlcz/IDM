package com.revolut.feature.pay_bills_taxes.impl.ui.flow;

import com.revolut.feature.pay_bills_taxes.impl.ui.flow.PayBillsAndTaxesFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nf9.f;
import oki.h;
import yf9.d;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        FlowStep registration;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f fVar = bVar.o;
            this.u = 1;
            obj2 = fVar.b(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        nf9.b bVar2 = (nf9.b) obj2;
        nf9.a aVar2 = bVar2.f214877b;
        int i2 = aVar2 == null ? -1 : d.f313204a[aVar2.ordinal()];
        if (i2 == -1) {
            registration = PayBillsAndTaxesFlowContract$Step.Screen.f78693a;
        } else {
            if (i2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            registration = new PayBillsAndTaxesFlowContract$Step.Registration(bVar2.f214877b);
        }
        h.u2(bVar, bVar.f78695q, registration, null, 6);
        return Unit.f186387a;
    }
}
