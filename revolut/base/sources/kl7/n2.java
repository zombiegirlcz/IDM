package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f185365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f185366c;
    public final q2 d;

    public n2(String imageUrl, o1 o1Var, o1 o1Var2, q2 q2Var) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f185364a = imageUrl;
        this.f185365b = o1Var;
        this.f185366c = o1Var2;
        this.d = q2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return Intrinsics.f(this.f185364a, n2Var.f185364a) && Intrinsics.f(this.f185365b, n2Var.f185365b) && Intrinsics.f(this.f185366c, n2Var.f185366c) && Intrinsics.f(this.d, n2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f185364a.hashCode() * 31;
        o1 o1Var = this.f185365b;
        int iHashCode2 = (iHashCode + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        o1 o1Var2 = this.f185366c;
        int iHashCode3 = (iHashCode2 + (o1Var2 == null ? 0 : o1Var2.hashCode())) * 31;
        q2 q2Var = this.d;
        return iHashCode3 + (q2Var != null ? q2Var.hashCode() : 0);
    }
}
