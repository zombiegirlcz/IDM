package gud;

import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import wd6.h;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f146902a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f146902a = featureToggleInteractor;
    }

    public final ParcelableDestination a(xi0.b bVar, xi0.b toCurrency) {
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        if (((d) this.f146902a).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c)) {
            return new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoneyWithAccountPair(bVar != null ? new StartUpPocket.CurrencyAccount(bVar) : StartUpPocket.FiatAccountsAll.f104847a, new StartUpPocket.CurrencyAccount(toCurrency), null, null, 44), (Set) null, 6), null);
        }
        return u0.c(new ExchangeFeatureConfig.Buy(bVar, toCurrency, h.MARKET, wd6.c.CRYPTO_ONLY, ExchangeFeatureConfigFinishBehavior.Finish.f96861a, null, false, null, 4000));
    }
}
