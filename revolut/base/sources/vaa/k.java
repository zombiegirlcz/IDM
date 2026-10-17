package vaa;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f287202a;

    public k(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f287202a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f287202a, ((k) obj2).f287202a);
    }

    public final int hashCode() {
        return this.f287202a.hashCode();
    }
}
