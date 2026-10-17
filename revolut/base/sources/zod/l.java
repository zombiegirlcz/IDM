package zod;

import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yld.g f324005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetWorthAccount f324006b;

    public l(yld.g netWorthType, NetWorthAccount netWorthAccount) {
        Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
        Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
        this.f324005a = netWorthType;
        this.f324006b = netWorthAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f324005a == lVar.f324005a && Intrinsics.f(this.f324006b, lVar.f324006b);
    }

    public final int hashCode() {
        return this.f324006b.hashCode() + (this.f324005a.hashCode() * 31);
    }
}
