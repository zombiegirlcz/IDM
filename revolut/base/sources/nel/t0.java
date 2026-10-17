package nel;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f214621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f214622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f214623c;

    public t0(TradingAccount account, n instrument, ArrayList productsWithOnboardingPending) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(productsWithOnboardingPending, "productsWithOnboardingPending");
        this.f214621a = account;
        this.f214622b = instrument;
        this.f214623c = productsWithOnboardingPending;
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
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f214621a, t0Var.f214621a) && Intrinsics.f(this.f214622b, t0Var.f214622b) && this.f214623c.equals(t0Var.f214623c);
    }

    @Override // nel.v0
    public final TradingAccount getAccount() {
        return this.f214621a;
    }

    public final int hashCode() {
        return this.f214623c.hashCode() + a10.b.d(this.f214622b, this.f214621a.hashCode() * 31, 31);
    }

    @Override // nel.w0
    public final n n() {
        return this.f214622b;
    }
}
