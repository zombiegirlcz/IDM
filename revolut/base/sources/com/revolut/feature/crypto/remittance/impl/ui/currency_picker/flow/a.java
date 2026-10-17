package com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow;

import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.CurrencyChooserFlowContractInternal$Step;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import cp5.d;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qce.b;
import qk5.c;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements c {
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f70970p;

    public a(CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = featureToggleInteractor;
        b bVar = new b(inputData, this, 4);
        this.f70970p = d.a(this, CurrencyChooserFlowContractInternal$Step.CurrencyChooser.f70969a, f0.f322471a, bVar);
    }

    public final void I2(xi0.b bVar, ExchangeFeatureConfigFinishBehavior exchangeFeatureConfigFinishBehavior) {
        C1(new BridgeDestination(new CompositeCommand(new FinishCommand(null, null, null, 7), ((jte.d) this.o).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c) ? u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(new StartUpPocket.CurrencyAccount(bVar), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, !Intrinsics.f(exchangeFeatureConfigFinishBehavior, ExchangeFeatureConfigFinishBehavior.Finish.f96861a)), (Set) null, 6), null)) : gc0.c.f(new ExchangeFeatureConfig.Buy(null, bVar, wd6.h.RECURRING, wd6.c.CRYPTO_ONLY, exchangeFeatureConfigFinishBehavior, null, true, null, 3553)))));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70970p;
    }
}
