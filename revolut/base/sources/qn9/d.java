package qn9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ PayInStoreScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PayInStoreScreen payInStoreScreen, Continuation continuation) {
        super(2, continuation);
        this.u = payInStoreScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((q) this.u.T2()).v2(j.f247885a);
        return Unit.f186387a;
    }
}
