package uyh;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CryptoExchangeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CryptoExchangeScreen cryptoExchangeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoExchangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = (com.revolut.feature_crypto_order_flow.impl.exchange.d) this.u.R2();
        dVar.getClass();
        dVar.n2(new c0(dVar, null, 1), new whi.b(6));
        return Unit.f186387a;
    }
}
