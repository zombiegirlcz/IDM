package azd;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f11443a;

    public e(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f11443a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f11443a, ((e) obj2).f11443a);
    }

    public final int hashCode() {
        return this.f11443a.hashCode();
    }
}
