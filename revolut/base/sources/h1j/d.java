package h1j;

import com.revolut.core.model.account.AccountId;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f148581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f148582c;
    public final k1j.a d;

    public d(String balanceId, xi0.b currency, AccountId accountId, k1j.a type) {
        Intrinsics.checkNotNullParameter(balanceId, "balanceId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f148580a = balanceId;
        this.f148581b = currency;
        this.f148582c = accountId;
        this.d = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f148580a, dVar.f148580a) && Intrinsics.f(this.f148581b, dVar.f148581b) && Intrinsics.f(this.f148582c, dVar.f148582c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + l.b(this.f148582c, l.j(this.f148581b, this.f148580a.hashCode() * 31, 31), 31);
    }
}
