package e1i;

import aab.b;
import aii.u;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$CurrencyPairKillswitch;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$ExchangeKeyboardSuggestions;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$HideRateExchangeScreen;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$OrderDetailsKompot;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$TransparentPricing;
import com.revolut.feature_exchange.api.navigation.OrderDetailsDestination;
import com.revolut.feature_exchange.api.navigation.TakeProfitStopLossDestination;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsController;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsScreenContract$InputData;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.TakeProfitStopLossController;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.TakeProfitStopLossControllerContract$InputData;
import dki.g;
import gc0.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f121991a = 0;

    @Override // nte.a
    public final List e() {
        return v.k(ExchangeApi$Toggles$ExchangeKeyboardSuggestions.f96818c, ExchangeApi$Toggles$HideRateExchangeScreen.f96819c, ExchangeApi$Toggles$TransparentPricing.f96821c, ExchangeApi$Toggles$CurrencyPairKillswitch.f96817c, ExchangeApi$Toggles$OrderDetailsKompot.f96820c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TakeProfitStopLossDestination) {
            return c.b(new TakeProfitStopLossController(new TakeProfitStopLossControllerContract$InputData(((TakeProfitStopLossDestination) destination).f96865a)), new b(10));
        }
        if (destination instanceof OrderDetailsDestination) {
            return c.b(new OrderDetailsController(new OrderDetailsScreenContract$InputData(((OrderDetailsDestination) destination).f96863a)), new b(11));
        }
        return null;
    }
}
