package com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow;

import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract$InputData;
import com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.PaymentProfileLazyFlowContract$Step;
import do3.n;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
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
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarF = bVar.f79647p.f(false);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        n nVar = (n) obj2;
        yki.i iVar = bVar.f79648q;
        sw9.a aVar2 = bVar.o.f79645a;
        Intrinsics.h(nVar);
        h.u2(bVar, iVar, new PaymentProfileLazyFlowContract$Step.Profile(new PaymentProfileFlowContract$InputData(aVar2, nVar)), null, 6);
        return Unit.f186387a;
    }
}
