package dod;

import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yld.g f116547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NetWorthAccount f116548c;

    public h(yld.g netWorthType, NetWorthAccount netWorthAccount) {
        Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
        Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
        this.f116547b = netWorthType;
        this.f116548c = netWorthAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f116547b == hVar.f116547b && Intrinsics.f(this.f116548c, hVar.f116548c);
    }

    public final int hashCode() {
        return this.f116548c.hashCode() + (this.f116547b.hashCode() * 31);
    }
}
