package kug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackOptions;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureFeedbackOptions f189796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f189797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189798c;
    public final ltg.b d;

    public i(AccountClosureFeedbackOptions feedbackOptions, TradingAccount tradingAccount, String portfolioId, ltg.b bVar) {
        Intrinsics.checkNotNullParameter(feedbackOptions, "feedbackOptions");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f189796a = feedbackOptions;
        this.f189797b = tradingAccount;
        this.f189798c = portfolioId;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f189796a, iVar.f189796a) && Intrinsics.f(this.f189797b, iVar.f189797b) && Intrinsics.f(this.f189798c, iVar.f189798c) && this.d == iVar.d;
    }

    public final int hashCode() {
        int iC = p.a.c(prk.o.b(this.f189797b, this.f189796a.hashCode() * 31, 31), 31, this.f189798c);
        ltg.b bVar = this.d;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
