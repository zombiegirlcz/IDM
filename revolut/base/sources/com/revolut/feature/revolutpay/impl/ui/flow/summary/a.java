package com.revolut.feature.revolutpay.impl.ui.flow.summary;

import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlowContract$Step;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import pwb.p;
import q7c.q;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
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
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            q qVar = bVar.f84492p;
            this.u = 1;
            qVar.getClass();
            p pVar = new p(qVar, null, 17);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, pVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            h.t2(bVar, bVar.f84495s, bVar.I2(), false, null, false, 12);
        } else {
            h.t2(bVar, bVar.f84495s, SummaryFlowContract$Step.AddEmail.f84488a, false, null, false, 12);
        }
        return Unit.f186387a;
    }
}
