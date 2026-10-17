package zke;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tzg.h;
import ybl.l;
import zf5.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements zhh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f322939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f322940b;

    public c(l tradingConfigInteractor, h investWithdrawToMoveMoneyChecker) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(investWithdrawToMoveMoneyChecker, "investWithdrawToMoveMoneyChecker");
        this.f322939a = tradingConfigInteractor;
        this.f322940b = investWithdrawToMoveMoneyChecker;
    }

    @Override // zhh.a
    public final Flow a(TradingAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return nim.a.v(l.d(this.f322939a), new n(account, this, 12));
    }
}
