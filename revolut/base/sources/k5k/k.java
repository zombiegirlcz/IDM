package k5k;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f181543a;

    public k(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f181543a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f181543a, ((k) obj2).f181543a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f181543a.hashCode() * 31);
    }
}
