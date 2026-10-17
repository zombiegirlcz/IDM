package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2 f173584c;
    public final v1 d;

    public w1(String groupEntity, String issuingEntity, k2 k2Var, v1 v1Var) {
        Intrinsics.checkNotNullParameter(groupEntity, "groupEntity");
        Intrinsics.checkNotNullParameter(issuingEntity, "issuingEntity");
        this.f173582a = groupEntity;
        this.f173583b = issuingEntity;
        this.f173584c = k2Var;
        this.d = v1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f173582a, w1Var.f173582a) && Intrinsics.f(this.f173583b, w1Var.f173583b) && Intrinsics.f(this.f173584c, w1Var.f173584c) && Intrinsics.f(this.d, w1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f173582a.hashCode() * 31, 31, this.f173583b);
        k2 k2Var = this.f173584c;
        int iHashCode = (iC + (k2Var == null ? 0 : k2Var.hashCode())) * 31;
        v1 v1Var = this.d;
        return iHashCode + (v1Var != null ? v1Var.hashCode() : 0);
    }
}
