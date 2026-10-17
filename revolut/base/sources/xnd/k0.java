package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nb8.g f307415b;

    public k0(String juniorId, nb8.g juniorAllowanceInfo) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(juniorAllowanceInfo, "juniorAllowanceInfo");
        this.f307414a = juniorId;
        this.f307415b = juniorAllowanceInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f307414a, k0Var.f307414a) && Intrinsics.f(this.f307415b, k0Var.f307415b);
    }

    public final int hashCode() {
        return this.f307415b.hashCode() + (this.f307414a.hashCode() * 31);
    }
}
