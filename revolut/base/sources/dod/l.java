package dod;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f116554b;

    public l(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f116554b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f116554b, ((l) obj2).f116554b);
    }

    public final int hashCode() {
        return this.f116554b.hashCode();
    }
}
