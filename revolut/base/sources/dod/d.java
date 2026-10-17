package dod;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f116540b;

    public d(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f116540b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f116540b, ((d) obj2).f116540b);
    }

    public final int hashCode() {
        return this.f116540b.hashCode();
    }
}
