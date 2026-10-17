package ajh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount f5574a;

    public e(WealthAccount wealthAccount) {
        Intrinsics.checkNotNullParameter(wealthAccount, "wealthAccount");
        this.f5574a = wealthAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f5574a, ((e) obj2).f5574a);
    }

    public final int hashCode() {
        return this.f5574a.hashCode();
    }
}
