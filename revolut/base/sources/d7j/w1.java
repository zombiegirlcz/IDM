package d7j;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import grl.k9;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class w1 extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g u;
    public final /* synthetic */ ExchangeOrderDraft v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, ExchangeOrderDraft exchangeOrderDraft, Continuation continuation) {
        super(1, continuation);
        this.u = gVar;
        this.v = exchangeOrderDraft;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w1(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Long l2;
        Asset assetC;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = this.u;
        Pair pair = (Pair) ((w) ((j2) gVar.T.f22677a).getValue()).i.getContent();
        if (pair == null) {
            return Unit.f186387a;
        }
        OrderQuote orderQuote = (OrderQuote) pair.f186385a;
        OrderQuoteParams orderQuoteParams = (OrderQuoteParams) pair.f186386b;
        BigDecimal bigDecimal = orderQuoteParams.d;
        if (bigDecimal != null) {
            l4i.a aVar2 = gVar.o;
            int i = v1.f112066a[orderQuoteParams.e.ordinal()];
            if (i == 1) {
                xi0.b bVar = orderQuoteParams.f104784b;
                aVar2.getClass();
                assetC = l4i.a.c(bVar);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                xi0.b bVar2 = orderQuoteParams.f104783a;
                aVar2.getClass();
                assetC = l4i.a.c(bVar2);
            }
            Amount amount = new Amount(bigDecimal, assetC);
            aVar2.getClass();
            l2 = new Long(l4i.a.b(amount).f115082a);
        } else {
            l2 = null;
        }
        ExchangeOrderDraft exchangeOrderDraft = this.v;
        if (!Intrinsics.f(i7j.e.d(exchangeOrderDraft).f99904b, l2)) {
            return Unit.f186387a;
        }
        c4i.a aVar3 = c4i.a.COMMODITY_ORDER;
        xi0.b bVar3 = exchangeOrderDraft.f99886b.f99903a;
        k9 value = k9.Commodities;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        gVar.C1(zh9.u0.c(new ExchangeBreakdownFeatureConfig(orderQuoteParams, orderQuote, aVar3, new AnalyticsProduct.Retail(value), bVar3, null, null, null, null, null, 4048)));
        return Unit.f186387a;
    }
}
