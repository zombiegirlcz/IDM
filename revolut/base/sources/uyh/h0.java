package uyh;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284367w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f284367w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h0 h0Var = new h0(this.f284367w, continuation);
        h0Var.v = obj2;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            OrderQuoteParams orderQuoteParams = (OrderQuoteParams) pair.f186385a;
            OrderQuote orderQuote = (OrderQuote) pair.f186386b;
            com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = this.f284367w;
            w wVar = new w(orderQuoteParams, 2, dVar, orderQuote);
            this.v = null;
            this.u = 1;
            Set set = com.revolut.feature_crypto_order_flow.impl.exchange.d.M;
            if (dVar.T2(this, wVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
