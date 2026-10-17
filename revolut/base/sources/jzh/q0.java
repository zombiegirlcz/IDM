package jzh;

import com.revolut.data.model.Data;
import com.revolut.feature_crypto_order_flow.api.CryptoExchangeFeatureApi$Toggles$CryptoSellAccountBalanceLimitUAE;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.order_summary.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q0 q0Var = new q0(this.v, continuation);
        q0Var.u = obj2;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        OrderQuote orderQuote;
        OrderQuote orderQuote2;
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Data data = (Data) pair.f186385a;
        Data data2 = (Data) pair.f186386b;
        com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar2 = this.v;
        cli.y yVar = aVar2.E;
        s sVar = ((r) ((j2) yVar.f22677a).getValue()).f179848b;
        h0 h0Var = sVar instanceof h0 ? (h0) sVar : null;
        if (h0Var == null) {
            return Unit.f186387a;
        }
        if (data2 == null || (orderQuote2 = (OrderQuote) data2.getContent()) == null || (list = orderQuote2.f104756h) == null) {
            list = (data == null || (orderQuote = (OrderQuote) data.getContent()) == null) ? zhm.f0.f322471a : orderQuote.f104756h;
        }
        aVar2.H2(yVar, new ja3.d(h0Var, data2, data, ((jte.d) aVar2.z).c(CryptoExchangeFeatureApi$Toggles$CryptoSellAccountBalanceLimitUAE.f96677c) ? kyh.k.a(list) : null, 6));
        return Unit.f186387a;
    }
}
