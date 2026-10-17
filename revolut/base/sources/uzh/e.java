package uzh;

import android.os.Parcelable;
import bzh.l;
import bzh.m;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntryDetails;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wd6.h;
import wli.x;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoOrderDraft f284677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f284678m;

    public e(CryptoOrderDraft draft, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f284677l = draft;
        this.f284678m = deeplinkHandler;
    }

    @Override // uzh.a
    public final void Z2(CellDetailsActionDelegate.Model model) {
        ChargeBreakdown chargeBreakdown;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.f51787l;
        if (obj2 instanceof d4i.b) {
            chargeBreakdown = ((d4i.b) obj2).f111323a;
        } else if (!(obj2 instanceof ChargeBreakdown)) {
            return;
        } else {
            chargeBreakdown = (ChargeBreakdown) obj2;
        }
        ChargeBreakdown chargeBreakdown2 = chargeBreakdown;
        List list = chargeBreakdown2.f104723b;
        ChargeEntry chargeEntry = (ChargeEntry) d0.d0(list);
        ChargeEntryDetails chargeEntryDetails = chargeEntry != null ? chargeEntry.d : null;
        if (list.size() == 1 && chargeEntryDetails != null) {
            V2(new d(this, chargeEntryDetails, null), new yi5.b(29));
            return;
        }
        CryptoOrderDraft cryptoOrderDraft = this.f284677l;
        OrderQuoteParams orderQuoteParamsA = l.a(new m(cryptoOrderDraft, false, 6), AccountId.Personal.f51414a);
        xi0.a aVar = xi0.b.Companion;
        String str = chargeBreakdown2.f104722a.f104718b.f104720b;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        boolean z = cryptoOrderDraft.f != h.TAKE_PROFIT_STOP_LOSS;
        Intrinsics.checkNotNullParameter(cryptoOrderDraft, "<this>");
        h hVar = cryptoOrderDraft.f;
        boolean z3 = hVar == h.STOP || hVar == h.LIMIT;
        OrderQuoteParamsVariant.Migrated migrated = new OrderQuoteParamsVariant.Migrated(orderQuoteParamsA);
        c4i.a aVar2 = c4i.a.EXCHANGE;
        k9 value = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        A2(u0.c(new FeeBreakdownFeatureConfig(migrated, chargeBreakdown2, aVar2, new AnalyticsProduct.Retail(value), false, bVarA, z, z3, null, false, null)));
    }
}
