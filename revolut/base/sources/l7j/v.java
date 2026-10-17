package l7j;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ z u;
    public final /* synthetic */ ChargeBreakdown v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, ChargeBreakdown chargeBreakdown, Continuation continuation) {
        super(1, continuation);
        this.u = zVar;
        this.v = chargeBreakdown;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVar = this.u;
        ExchangeOrderDraft exchangeOrderDraft = ((g) ((j2) zVar.A.f22677a).getValue()).f192670a;
        OrderQuoteParams orderQuoteParamsA = i7j.i.a(exchangeOrderDraft);
        c4i.a aVar2 = c4i.a.COMMODITY_ORDER;
        xi0.b bVar = exchangeOrderDraft.f99886b.f99903a;
        k9 value = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return zVar.C1(u0.c(new FeeBreakdownFeatureConfig(orderQuoteParamsA, this.v, aVar2, new AnalyticsProduct.Retail(value), bVar, false, (Clause) null, (HtmlLocalisedClause) null, 1984)));
    }
}
