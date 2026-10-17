package bzj;

import com.revolut.core.model.account.AccountId;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f20046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f20047b;

    public a(AccountId accountId, Set limitTypes) {
        Intrinsics.checkNotNullParameter(limitTypes, "limitTypes");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f20046a = limitTypes;
        this.f20047b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f20046a, aVar.f20046a) && Intrinsics.f(this.f20047b, aVar.f20047b);
    }

    public final int hashCode() {
        return this.f20047b.hashCode() + j6.a.c(p.a.f(Boolean.hashCode(true) * 31, 31, this.f20046a), 31, true);
    }
}
