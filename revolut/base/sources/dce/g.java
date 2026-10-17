package dce;

import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsController;
import dce.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ SubscriptionDetailsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SubscriptionDetailsController subscriptionDetailsController, Continuation continuation) {
        super(2, continuation);
        this.u = subscriptionDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.u.R2()).L2(y.b.f112912a);
        return Unit.f186387a;
    }
}
