package xnd;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f307430a;

    public o(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f307430a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f307430a, ((o) obj2).f307430a);
    }

    public final int hashCode() {
        return this.f307430a.hashCode();
    }
}
