package hae;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.subscriptions.impl.history.kompot.SubscriptionHistoryController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SubscriptionHistoryController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SubscriptionHistoryController subscriptionHistoryController, Continuation continuation) {
        super(2, continuation);
        this.v = subscriptionHistoryController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.L.getValue();
        Intrinsics.h(model);
        ((l) eVar).I2(new j(model));
        return Unit.f186387a;
    }
}
