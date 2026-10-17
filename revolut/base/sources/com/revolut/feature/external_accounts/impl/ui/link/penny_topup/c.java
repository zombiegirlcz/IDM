package com.revolut.feature.external_accounts.impl.ui.link.penny_topup;

import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PennyTopUpFlowContract$Step.PaymentInitiationService f73040w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, PennyTopUpFlowContract$Step.PaymentInitiationService paymentInitiationService, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f73040w = paymentInitiationService;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f73040w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            PennyTopUpFlowContract$Step.PaymentInitiationService paymentInitiationService = this.f73040w;
            d dVar = this.v;
            b bVar = new b(dVar, paymentInitiationService, null);
            this.u = 1;
            if (dVar.p2(this, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
