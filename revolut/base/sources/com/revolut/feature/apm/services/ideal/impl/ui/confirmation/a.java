package com.revolut.feature.apm.services.ideal.impl.ui.confirmation;

import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ b u;
    public final /* synthetic */ IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint iDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
        this.v = iDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.u;
        bVar.f62845q.c(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, ((f80.b) bVar.f62844p).f(((IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint.Mobile) this.v).f62843a), 14), null, null, null, 0, null, null, null, null, false, 1022)));
        return Unit.f186387a;
    }
}
