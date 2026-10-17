package akh;

import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements fsl.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBalanceControllerContract$InputData f5955a;

    public a(CashBalanceControllerContract$InputData cashBalanceControllerContract$InputData) {
        this.f5955a = cashBalanceControllerContract$InputData;
    }

    @Override // fsl.c
    public final Object a(Continuation continuation) {
        CashBalanceControllerContract$InputData cashBalanceControllerContract$InputData = this.f5955a;
        return new InvestOrdersListFeatureContract$InputData.PendingOrders.DisplayOptions(new InvestOrdersListFeatureContract$Disclaimers.Custom(Intrinsics.f(cashBalanceControllerContract$InputData.f95951a, TradingAccountType.Gia.f105270a), Intrinsics.f(cashBalanceControllerContract$InputData.f95951a, TradingAccountType.Margin.f105271a), false));
    }
}
