package aqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f8406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f8407b;

    public u(dj0.d availableBalance, dj0.d destinationsTotal) {
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(destinationsTotal, "destinationsTotal");
        this.f8406a = availableBalance;
        this.f8407b = destinationsTotal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f8406a, uVar.f8406a) && Intrinsics.f(this.f8407b, uVar.f8407b);
    }

    public final int hashCode() {
        return this.f8407b.hashCode() + (this.f8406a.hashCode() * 31);
    }
}
