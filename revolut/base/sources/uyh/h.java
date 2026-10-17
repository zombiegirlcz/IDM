package uyh;

import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoExchangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CryptoExchangeScreen cryptoExchangeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoExchangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((nqi.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        nqi.a aVar = (nqi.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarR2 = this.v.R2();
        String formattedInput = aVar.f218468b;
        com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = (com.revolut.feature_crypto_order_flow.impl.exchange.d) oVarR2;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(formattedInput, "formattedInput");
        dVar.n2(new un8.j(dVar, formattedInput, null, 26), new whi.b(6));
        return Unit.f186387a;
    }
}
