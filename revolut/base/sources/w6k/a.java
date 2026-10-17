package w6k;

import android.content.Context;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$BridgeDetails$ById;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ById;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof MoneyRequestFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        MoneyRequestFeatureConfig config = (MoneyRequestFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof MoneyRequestFeatureConfig$Details$ByMoneyRequest) {
            MoneyRequestFeatureConfig$Details$ByMoneyRequest moneyRequestFeatureConfig$Details$ByMoneyRequest = (MoneyRequestFeatureConfig$Details$ByMoneyRequest) config;
            navigator.c(new FeatureCommand(new MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest(moneyRequestFeatureConfig$Details$ByMoneyRequest.f79613a, moneyRequestFeatureConfig$Details$ByMoneyRequest.f79614b)));
        } else {
            if (!(config instanceof MoneyRequestFeatureConfig$Details$ById)) {
                throw new NoWhenBranchMatchedException();
            }
            MoneyRequestFeatureConfig$Details$ById moneyRequestFeatureConfig$Details$ById = (MoneyRequestFeatureConfig$Details$ById) config;
            navigator.c(new FeatureCommand(new MoneyRequestFeatureConfig$BridgeDetails$ById(moneyRequestFeatureConfig$Details$ById.f79610a, moneyRequestFeatureConfig$Details$ById.f79611b, moneyRequestFeatureConfig$Details$ById.f79612c)));
        }
    }
}
