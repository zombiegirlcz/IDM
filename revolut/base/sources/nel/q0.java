package nel;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccountAvailableToOnboard f214611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f214612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f214613c;
    public final n d;

    public q0(TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard, TradingAccount tradingAccount, List productsAvailableToOnboard, n instrument) {
        Intrinsics.checkNotNullParameter(productsAvailableToOnboard, "productsAvailableToOnboard");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f214611a = tradingAccountAvailableToOnboard;
        this.f214612b = tradingAccount;
        this.f214613c = productsAvailableToOnboard;
        this.d = instrument;
    }

    @Override // nel.w0
    public final boolean a() {
        return false;
    }

    @Override // nel.w0
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f214611a, q0Var.f214611a) && Intrinsics.f(this.f214612b, q0Var.f214612b) && this.f214613c.equals(q0Var.f214613c) && Intrinsics.f(this.d, q0Var.d);
    }

    public final int hashCode() {
        TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = this.f214611a;
        int iHashCode = (tradingAccountAvailableToOnboard == null ? 0 : tradingAccountAvailableToOnboard.hashCode()) * 31;
        TradingAccount tradingAccount = this.f214612b;
        return this.d.hashCode() + j6.a.c(p.a.b((iHashCode + (tradingAccount == null ? 0 : tradingAccount.hashCode())) * 31, 961, this.f214613c), 31, false);
    }

    @Override // nel.w0
    public final n n() {
        return this.d;
    }
}
