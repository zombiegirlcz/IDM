package nel;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f214617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f214618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f214619c;
    public final TradingAccount d;
    public final n e;

    public s0(z0 z0Var, boolean z, boolean z3, TradingAccount account, n instrument) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f214617a = z0Var;
        this.f214618b = z;
        this.f214619c = z3;
        this.d = account;
        this.e = instrument;
    }

    @Override // nel.w0
    public final boolean a() {
        return this.f214618b;
    }

    @Override // nel.w0
    public final boolean b() {
        return this.f214619c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f214617a, s0Var.f214617a) && this.f214618b == s0Var.f214618b && this.f214619c == s0Var.f214619c && Intrinsics.f(this.d, s0Var.d) && Intrinsics.f(this.e, s0Var.e);
    }

    @Override // nel.v0
    public final TradingAccount getAccount() {
        return this.d;
    }

    public final int hashCode() {
        z0 z0Var = this.f214617a;
        return this.e.hashCode() + prk.o.b(this.d, j6.a.c(j6.a.c((z0Var == null ? 0 : z0Var.hashCode()) * 31, 31, this.f214618b), 31, this.f214619c), 31);
    }

    @Override // nel.w0
    public final n n() {
        return this.e;
    }
}
