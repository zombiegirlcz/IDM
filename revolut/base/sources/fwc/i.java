package fwc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138605b;

    public i(List limits, List walletLimits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
        this.f138604a = limits;
        this.f138605b = walletLimits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f138604a, iVar.f138604a) && Intrinsics.f(this.f138605b, iVar.f138605b);
    }

    public final int hashCode() {
        return this.f138605b.hashCode() + (this.f138604a.hashCode() * 31);
    }
}
