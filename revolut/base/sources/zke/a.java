package zke;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tzg.h;
import x8h.a0;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements zhh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ale.f f322936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f322937b;

    public a(ale.f investSettingsActionHandler, h investWithdrawToMoveMoneyChecker) {
        Intrinsics.checkNotNullParameter(investSettingsActionHandler, "investSettingsActionHandler");
        Intrinsics.checkNotNullParameter(investWithdrawToMoveMoneyChecker, "investWithdrawToMoveMoneyChecker");
        this.f322936a = investSettingsActionHandler;
        this.f322937b = investWithdrawToMoveMoneyChecker;
    }

    @Override // zhh.a
    public final Flow a(TradingAccount account) {
        Object objL;
        Intrinsics.checkNotNullParameter(account, "account");
        if (account.getD() != cfl.b.TERMINATED) {
            hih.a aVar = hih.a.MARGIN_TRADING;
            WealthAction[] elements = {new WealthAction.Trade(true, aVar), new WealthAction.AddMoney(com.revolut.shared.feature.wealth.models.trading_accounts.d.i(account), aVar), ((a0) this.f322937b).a(account) ? new WealthAction.MoveMoney(aVar, com.revolut.shared.feature.wealth.models.trading_accounts.d.i(account), com.revolut.shared.feature.wealth.models.trading_accounts.d.k(account)) : new WealthAction.Withdraw(com.revolut.shared.feature.wealth.models.trading_accounts.d.k(account), aVar), (com.revolut.shared.feature.wealth.models.trading_accounts.d.f(account) || com.revolut.shared.feature.wealth.models.trading_accounts.d.h(account)) ? new WealthAction.Documents(true, aVar) : null, new WealthAction.Settings(true, aVar)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            objL = kotlin.collections.d.L(elements);
        } else {
            objL = f0.f322471a;
        }
        return zi0.c.i(objL);
    }

    @Override // zhh.a
    public final Set b() {
        return y0.b(this.f322936a);
    }
}
