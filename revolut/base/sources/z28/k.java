package z28;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.TaxAdvantageWealthAccount f319017a;

    public k(WealthAccount.TaxAdvantageWealthAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f319017a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f319017a, ((k) obj2).f319017a);
    }

    public final int hashCode() {
        return this.f319017a.hashCode();
    }
}
