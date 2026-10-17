package j1j;

import com.revolut.core.model.account.AccountId;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f170618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f170619c;
    public final k1j.a d;

    public d(String balanceId, xi0.b currency, AccountId accountId, k1j.a type) {
        Intrinsics.checkNotNullParameter(balanceId, "balanceId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f170617a = balanceId;
        this.f170618b = currency;
        this.f170619c = accountId;
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
        return Intrinsics.f(this.f170617a, dVar.f170617a) && Intrinsics.f(this.f170618b, dVar.f170618b) && Intrinsics.f(this.f170619c, dVar.f170619c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + l.b(this.f170619c, l.j(this.f170618b, this.f170617a.hashCode() * 31, 31), 31);
    }
}
