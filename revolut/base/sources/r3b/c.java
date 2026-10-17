package r3b;

import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.target_allocations.TargetAllocationsController;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d1h.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251234a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextDelegate f251235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FullScreenStateDelegate f251236c;

    public c(CfdTradingHomeScreen cfdTradingHomeScreen) {
        this.f251235b = cfdTradingHomeScreen.X;
        this.f251236c = cfdTradingHomeScreen.Q;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0 */
    public final FooterTextDelegate getV() {
        switch (this.f251234a) {
        }
        return this.f251235b;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q */
    public final FullScreenStateDelegate getF91266e0() {
        switch (this.f251234a) {
        }
        return this.f251236c;
    }

    public c(CashBalanceController cashBalanceController) {
        this.f251235b = cashBalanceController.T;
        this.f251236c = cashBalanceController.U;
    }

    public c(TargetAllocationsController targetAllocationsController) {
        this.f251235b = targetAllocationsController.W;
        this.f251236c = targetAllocationsController.R;
    }
}
