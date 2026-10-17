package eq5;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1j.a f128322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f128323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128324c;

    public s(k1j.a balanceType, AccountId accountId, String balanceId) {
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(balanceId, "balanceId");
        this.f128322a = balanceType;
        this.f128323b = accountId;
        this.f128324c = balanceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f128322a == sVar.f128322a && Intrinsics.f(this.f128323b, sVar.f128323b) && Intrinsics.f(this.f128324c, sVar.f128324c);
    }

    public final int hashCode() {
        return this.f128324c.hashCode() + h30.l.b(this.f128323b, this.f128322a.hashCode() * 31, 31);
    }
}
