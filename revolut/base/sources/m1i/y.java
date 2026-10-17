package m1i;

import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.exchange.MarketOrderExchangeContract$ExchangeResultPayload;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeStakingData;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExchangeResult f201595b;

    public /* synthetic */ y(ExchangeResult exchangeResult, int i) {
        this.f201594a = i;
        this.f201595b = exchangeResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        switch (this.f201594a) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar = (od0.i) pair.f186385a;
                boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                return new MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload(this.f201595b, (ExchangeStakingData) iVar.f224257a, zBooleanValue);
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar2 = (od0.i) pair.f186385a;
                boolean zBooleanValue2 = ((Boolean) pair.f186386b).booleanValue();
                return new MarketOrderExchangeContract$ExchangeResultPayload(this.f201595b, (com.revolut.feature_crypto_order_flow.impl.order_summary.models.ExchangeStakingData) iVar2.f224257a, zBooleanValue2);
        }
    }
}
