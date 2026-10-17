package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow;

import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n37.e;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f5j.a f74326w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, f5j.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f74326w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f74326w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVar = new e(dVar, null, 1);
            this.u = 1;
            obj2 = dVar.p2(this, eVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        yki.a aVar2 = dVar.f74329r;
        String str = dVar.f74328q.f74312b;
        h.t2(dVar, aVar2, new TaxHubPaymentFlowContract$Step.BankTransfer(this.f74326w, (TaxHubPaymentFlowContract$PocketInfo) obj2, str), true, null, false, 12);
        return Unit.f186387a;
    }
}
