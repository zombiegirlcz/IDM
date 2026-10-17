package tsd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f274091a;

    public l(a netWorthInvestGroup) {
        Intrinsics.checkNotNullParameter(netWorthInvestGroup, "netWorthInvestGroup");
        this.f274091a = netWorthInvestGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f274091a == ((l) obj2).f274091a;
    }

    public final int hashCode() {
        return this.f274091a.hashCode();
    }
}
