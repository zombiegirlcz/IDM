package izh;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature_crypto_order_flow.api.CryptoExchangeFeatureApi$Toggles$BalancePickerCryptoSellFlow;
import com.revolut.feature_crypto_order_flow.api.CryptoExchangeFeatureApi$Toggles$CryptoSellAccountBalanceLimitUAE;
import com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeDestination;
import com.revolut.feature_crypto_order_flow.impl.flow.CryptoExchangeFlow;
import com.revolut.feature_crypto_order_flow.impl.order_summary.account_balance_limit.AccountBalanceLimitBottomSheetController;
import com.revolut.feature_crypto_order_flow.impl.order_summary.firm_price_deviance.FirmPriceDevianceBottomSheetController;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nyh.c;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof c) {
            c cVar = (c) descriptor;
            return cVar.a(new FirmPriceDevianceBottomSheetController(cVar.f220876a));
        }
        if (!(descriptor instanceof nyh.a)) {
            return null;
        }
        nyh.a aVar = (nyh.a) descriptor;
        return aVar.a(new AccountBalanceLimitBottomSheetController(aVar.f220874a));
    }

    @Override // nte.a
    public final List e() {
        return v.k(CryptoExchangeFeatureApi$Toggles$BalancePickerCryptoSellFlow.f96676c, CryptoExchangeFeatureApi$Toggles$CryptoSellAccountBalanceLimitUAE.f96677c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoExchangeDestination) {
            return new CryptoExchangeFlow(((CryptoExchangeDestination) destination).f96714a);
        }
        return null;
    }
}
