package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f3639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f3640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3641c;
    public final boolean d;

    public n0(TradingAccount tradingAccount, TradingAccount tradingAccount2, boolean z, boolean z3) {
        this.f3639a = tradingAccount;
        this.f3640b = tradingAccount2;
        this.f3641c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f3639a, n0Var.f3639a) && Intrinsics.f(this.f3640b, n0Var.f3640b) && this.f3641c == n0Var.f3641c && this.d == n0Var.d;
    }

    public final int hashCode() {
        TradingAccount tradingAccount = this.f3639a;
        int iHashCode = (tradingAccount == null ? 0 : tradingAccount.hashCode()) * 31;
        TradingAccount tradingAccount2 = this.f3640b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (tradingAccount2 != null ? tradingAccount2.hashCode() : 0)) * 31, 31, this.f3641c);
    }
}
