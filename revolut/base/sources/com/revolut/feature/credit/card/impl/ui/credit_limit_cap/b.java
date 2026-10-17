package com.revolut.feature.credit.card.impl.ui.credit_limit_cap;

import com.revolut.feature.credit.card.api.models.credit_limit_cap.CreditLimitCapImpact;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dp4.d0;
import dp4.e0;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import om4.y2;
import rq4.j;
import skm.p0;
import vkm.j2;
import yhm.o;

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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            Long l2 = ((j) ((j2) cVar.C.f22677a).getValue()).f256467c;
            if (l2 == null) {
                return Unit.f186387a;
            }
            long jLongValue = l2.longValue();
            y2 y2Var = cVar.f69184p;
            String str = cVar.o.f69172a;
            this.u = 1;
            e0 e0Var = y2Var.f226758a;
            e0Var.getClass();
            d0 d0Var = new d0(e0Var, str, jLongValue, null, 0);
            p0 p0Var = p0.f264001a;
            obj2 = skm.e0.J(f.f127540b, d0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.v2(cVar.B, new CreditLimitCapChangeScreenContract$ModalStep.ImpactedCardholders((CreditLimitCapImpact) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
