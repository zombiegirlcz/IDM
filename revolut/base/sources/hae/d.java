package hae;

import com.revolut.feature.subscriptions.impl.history.kompot.SubscriptionHistoryController;
import hae.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ SubscriptionHistoryController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SubscriptionHistoryController subscriptionHistoryController, Continuation continuation) {
        super(2, continuation);
        this.u = subscriptionHistoryController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((l) ((e) this.u.L.getValue())).I2(i.a.f150493a);
        return Unit.f186387a;
    }
}
