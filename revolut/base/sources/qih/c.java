package qih;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f246713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kel.b f246714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyInvestmentFundsBreakdown f246715c;
    public final hel.b d;
    public final TradingAccount e;

    public c(TextLocalisedClause explanationTitle, kel.b cashHolding, WealthDisclaimersContract$Disclaimer$Investment.MoveMoneyInvestmentFundsBreakdown disclaimersData, hel.b tradingContext, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(explanationTitle, "explanationTitle");
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f246713a = explanationTitle;
        this.f246714b = cashHolding;
        this.f246715c = disclaimersData;
        this.d = tradingContext;
        this.e = tradingAccount;
    }

    public final kel.b b() {
        return this.f246714b;
    }

    public final WealthDisclaimersContract$Disclaimer$Investment c() {
        return this.f246715c;
    }

    public final Clause d() {
        return this.f246713a;
    }

    public final TradingAccount e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f246713a.equals(cVar.f246713a) && Intrinsics.f(this.f246714b, cVar.f246714b) && this.f246715c.equals(cVar.f246715c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final hel.b f() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f246715c.f95342a.hashCode() + ((this.f246714b.hashCode() + (this.f246713a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
