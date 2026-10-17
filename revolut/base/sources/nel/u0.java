package nel;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f214626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f214627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f214628c;
    public final boolean d;
    public final TradingAccount e;
    public final n f;

    public u0(ArrayList productsAvailableToRemediate, z0 z0Var, boolean z, boolean z3, TradingAccount account, n instrument) {
        Intrinsics.checkNotNullParameter(productsAvailableToRemediate, "productsAvailableToRemediate");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f214626a = productsAvailableToRemediate;
        this.f214627b = z0Var;
        this.f214628c = z;
        this.d = z3;
        this.e = account;
        this.f = instrument;
    }

    @Override // nel.w0
    public final boolean a() {
        return this.f214628c;
    }

    @Override // nel.w0
    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return this.f214626a.equals(u0Var.f214626a) && Intrinsics.f(this.f214627b, u0Var.f214627b) && this.f214628c == u0Var.f214628c && this.d == u0Var.d && Intrinsics.f(this.e, u0Var.e) && Intrinsics.f(this.f, u0Var.f);
    }

    @Override // nel.v0
    public final TradingAccount getAccount() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.f214626a.hashCode() * 31;
        z0 z0Var = this.f214627b;
        return this.f.hashCode() + prk.o.b(this.e, j6.a.c(j6.a.c((iHashCode + (z0Var == null ? 0 : z0Var.hashCode())) * 31, 31, this.f214628c), 31, this.d), 31);
    }

    @Override // nel.w0
    public final n n() {
        return this.f;
    }
}
