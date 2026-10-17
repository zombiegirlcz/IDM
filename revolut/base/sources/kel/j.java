package kel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183169b;

    public j(String ref2, String portfolioId) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f183168a = ref2;
        this.f183169b = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f183168a, jVar.f183168a) && Intrinsics.f(this.f183169b, jVar.f183169b);
    }

    public final int hashCode() {
        return this.f183169b.hashCode() + (this.f183168a.hashCode() * 31);
    }
}
