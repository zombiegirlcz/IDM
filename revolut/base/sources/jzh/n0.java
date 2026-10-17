package jzh;

import com.revolut.data.model.Data;
import com.revolut.feature_crypto_order_flow.api.CryptoExchangeFeatureApi$Toggles$CryptoSellAccountBalanceLimitUAE;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.order_summary.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n0 n0Var = new n0(this.v, continuation);
        n0Var.u = obj2;
        return n0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        OrderQuote orderQuote = (OrderQuote) data.getContent();
        if (orderQuote != null) {
            com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar2 = this.v;
            aVar2.H2(aVar2.E, new ja3.d(aVar2, orderQuote, ((jte.d) aVar2.z).c(CryptoExchangeFeatureApi$Toggles$CryptoSellAccountBalanceLimitUAE.f96677c) ? kyh.k.a(orderQuote.f104756h) : null, data, 5));
        }
        return Unit.f186387a;
    }
}
