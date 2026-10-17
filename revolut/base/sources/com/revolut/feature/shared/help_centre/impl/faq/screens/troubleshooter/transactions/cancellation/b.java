package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCancellationScreenContract$InputData.RecurrentPayment f86334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, SubscriptionCancellationScreenContract$InputData.RecurrentPayment recurrentPayment, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f86334w = recurrentPayment;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f86334w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.v.x2(new c7e.i(data, this.f86334w, 2));
        return Unit.f186387a;
    }
}
