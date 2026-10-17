package aff;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.merchant_history.MerchantHistoryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ MerchantHistoryScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MerchantHistoryScreen merchantHistoryScreen, Continuation continuation) {
        super(2, continuation);
        this.u = merchantHistoryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        io3.h.a(((n) this.u.c0.getValue()).f4047r, ce9.n.RETRY_LAST_PAGE);
        return Unit.f186387a;
    }
}
