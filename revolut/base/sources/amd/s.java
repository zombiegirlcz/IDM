package amd;

import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetWorthAccount f6346b;

    public s(b netWorthGroupType, NetWorthAccount netWorthAccount) {
        Intrinsics.checkNotNullParameter(netWorthGroupType, "netWorthGroupType");
        Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
        this.f6345a = netWorthGroupType;
        this.f6346b = netWorthAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f6345a == sVar.f6345a && Intrinsics.f(this.f6346b, sVar.f6346b);
    }

    public final int hashCode() {
        return this.f6346b.hashCode() + (this.f6345a.hashCode() * 31);
    }
}
