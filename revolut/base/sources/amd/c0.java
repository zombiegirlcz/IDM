package amd;

import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetWorthAccount f6311b;

    public c0(b netWorthGroupType, NetWorthAccount netWorthAccount) {
        Intrinsics.checkNotNullParameter(netWorthGroupType, "netWorthGroupType");
        Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
        this.f6310a = netWorthGroupType;
        this.f6311b = netWorthAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f6310a == c0Var.f6310a && Intrinsics.f(this.f6311b, c0Var.f6311b);
    }

    public final int hashCode() {
        return this.f6311b.hashCode() + (this.f6310a.hashCode() * 31);
    }
}
