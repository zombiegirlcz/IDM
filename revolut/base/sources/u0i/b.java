package u0i;

import android.content.Context;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsDestination;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$OrderDetailsKompot;
import com.revolut.feature_exchange.api.navigation.OrderDetailsDestination;
import com.revolut.feature_exchange.api.navigation.OrderDetailsFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import hx7.q;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f276202a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f276202a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof OrderDetailsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        NaviCommand activityNavigateCommand;
        OrderDetailsFeatureConfig config = (OrderDetailsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        ExchangeOrder exchangeOrder = config.f96864a;
        if (q.L(exchangeOrder.getF72134a())) {
            activityNavigateCommand = u0.f(new CryptoOrderDetailsDestination(new CryptoOrderDetailsInputData.StopLimitInputData(exchangeOrder)));
        } else {
            if (((d) this.f276202a).c(ExchangeApi$Toggles$OrderDetailsKompot.f96820c)) {
                activityNavigateCommand = u0.f(new OrderDetailsDestination(exchangeOrder));
            } else {
                x2i.d.Companion.getClass();
                activityNavigateCommand = new ActivityNavigateCommand(x2i.b.f302577b, config, null, null, 0, null, null, null, null, false, 1020);
            }
        }
        navigator.c(activityNavigateCommand);
    }
}
