package btk;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f18630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f18631c;

    public f(String instrumentRef, TradingAccount account, dj0.d monthlyInvestment) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(monthlyInvestment, "monthlyInvestment");
        this.f18629a = instrumentRef;
        this.f18630b = account;
        this.f18631c = monthlyInvestment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f18629a, fVar.f18629a) && Intrinsics.f(this.f18630b, fVar.f18630b) && Intrinsics.f(this.f18631c, fVar.f18631c);
    }

    public final int hashCode() {
        return this.f18631c.hashCode() + prk.o.b(this.f18630b, this.f18629a.hashCode() * 31, 31);
    }
}
