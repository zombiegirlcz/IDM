package ywg;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317428b;

    public d(String portfolioId, String indicatorKey) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
        this.f317427a = portfolioId;
        this.f317428b = indicatorKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f317427a, dVar.f317427a) && Intrinsics.f(this.f317428b, dVar.f317428b);
    }

    public final int hashCode() {
        return this.f317428b.hashCode() + (this.f317427a.hashCode() * 31);
    }
}
