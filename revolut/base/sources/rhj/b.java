package rhj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.EsimExpiredSubscriptionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ EsimExpiredSubscriptionsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = esimExpiredSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((l) this.u.R2()).u.a();
        return Unit.f186387a;
    }
}
