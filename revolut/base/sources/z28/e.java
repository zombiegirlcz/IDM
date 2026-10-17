package z28;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.Securities f319011a;

    public e(WealthAccount.Securities account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f319011a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f319011a, ((e) obj2).f319011a);
    }

    public final int hashCode() {
        return this.f319011a.hashCode();
    }
}
