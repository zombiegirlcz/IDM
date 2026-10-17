package hjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount f152824a;

    public g(WealthAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f152824a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f152824a, ((g) obj2).f152824a);
    }

    public final int hashCode() {
        return this.f152824a.hashCode();
    }
}
