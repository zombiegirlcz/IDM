package tsd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f274088a;

    public i(a netWorthInvestGroup) {
        Intrinsics.checkNotNullParameter(netWorthInvestGroup, "netWorthInvestGroup");
        this.f274088a = netWorthInvestGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f274088a == ((i) obj2).f274088a;
    }

    public final int hashCode() {
        return this.f274088a.hashCode();
    }
}
