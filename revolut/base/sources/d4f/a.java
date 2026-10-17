package d4f;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import grl.k9;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends ote.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mbh.a f111279l;

    public a(mbh.a currencyExchangeExtension) {
        Intrinsics.checkNotNullParameter(currencyExchangeExtension, "currencyExchangeExtension");
        this.f111279l = currencyExchangeExtension;
    }

    @Override // ote.a
    public final Set Z2() {
        return y0.b(this.f111279l);
    }

    @Override // ote.a
    public final Object b3(Continuation continuation) {
        return Boolean.FALSE;
    }

    @Override // ote.a
    public final Boolean c3(bw0.m mVar) {
        Object obj2 = mVar != null ? mVar.e : null;
        LegacyOrderQuoteParams orderQuoteParams = obj2 instanceof LegacyOrderQuoteParams ? (LegacyOrderQuoteParams) obj2 : null;
        if (orderQuoteParams == null) {
            return Boolean.FALSE;
        }
        c4i.a transactionType = c4i.a.EXCHANGE;
        k9 value = k9.ProductUnspecified;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
        mbh.a aVar = this.f111279l;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        aVar.A2(u0.c(new ExchangeBreakdownFeatureConfig(orderQuoteParams, null, transactionType, analyticsProduct, false, 2018)));
        return Boolean.TRUE;
    }

    @Override // ote.a
    public final boolean d3() {
        return false;
    }
}
