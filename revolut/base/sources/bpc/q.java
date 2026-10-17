package bpc;

import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import m1h.r;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.Robo f17593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoboPortfolioInfo f17594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f17595c;
    public final boolean d;

    public q(TradingAccount.Robo account, RoboPortfolioInfo portfolio, dj0.d minOneOffDeposit, boolean z) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(minOneOffDeposit, "minOneOffDeposit");
        this.f17593a = account;
        this.f17594b = portfolio;
        this.f17595c = minOneOffDeposit;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f17593a, qVar.f17593a) && Intrinsics.f(this.f17594b, qVar.f17594b) && Intrinsics.f(this.f17595c, qVar.f17595c) && this.d == qVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + v7.c((this.f17594b.hashCode() + (this.f17593a.hashCode() * 31)) * 31, 31, this.f17595c);
    }
}
