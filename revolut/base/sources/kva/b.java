package kva;

import android.content.Context;
import com.revolut.feature.recurringbuys.api.navigation.RecurringBuysFeatureConfig;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f190056a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f190056a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof RecurringBuysFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        RecurringBuysFeatureConfig config = (RecurringBuysFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        boolean z = config instanceof RecurringBuysFeatureConfig.CreateFromScratch;
        gte.a aVar = this.f190056a;
        if (z) {
            navigator.c(((d) aVar).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c) ? u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(StartUpPocket.FiatAccountsAll.f104847a, (com.revolut.shared.feature.move_money.api.navigation.a) null, 2), (Set) null, 6), null)) : new FeatureCommand(new ExchangeFeatureConfig.RecurringBuy(null, null, 11)));
        } else {
            if (!(config instanceof RecurringBuysFeatureConfig.CreateWithPresetValues)) {
                throw new NoWhenBranchMatchedException();
            }
            RecurringBuysFeatureConfig.CreateWithPresetValues createWithPresetValues = (RecurringBuysFeatureConfig.CreateWithPresetValues) config;
            xi0.b bVar = createWithPresetValues.f81657b;
            dj0.d dVar = createWithPresetValues.f81656a;
            navigator.c(((d) aVar).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c) ? u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoneyWithAccountPair(new StartUpPocket.CurrencyAccount(dVar.f115083b), new StartUpPocket.CurrencyAccount(bVar), null, null, 60), (Set) null, 6), null)) : new FeatureCommand(new ExchangeFeatureConfig.RecurringBuy(bVar, dVar.f115083b, 12)));
        }
    }
}
