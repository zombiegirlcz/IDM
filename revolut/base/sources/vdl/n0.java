package vdl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288005b;

    public n0(String portfolioId, String id10) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f288004a = portfolioId;
        this.f288005b = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f288004a, n0Var.f288004a) && Intrinsics.f(this.f288005b, n0Var.f288005b);
    }

    public final int hashCode() {
        return this.f288005b.hashCode() + (this.f288004a.hashCode() * 31);
    }
}
