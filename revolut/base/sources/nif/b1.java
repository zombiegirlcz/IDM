package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f215718c;

    public b1(String juniorUserId, String str, q1 q1Var) {
        Intrinsics.checkNotNullParameter(juniorUserId, "juniorUserId");
        this.f215716a = juniorUserId;
        this.f215717b = str;
        this.f215718c = q1Var;
    }

    public final String a() {
        return this.f215716a;
    }

    public final q1 b() {
        return this.f215718c;
    }

    public final String c() {
        return this.f215717b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f215716a, b1Var.f215716a) && Intrinsics.f(this.f215717b, b1Var.f215717b) && Intrinsics.f(this.f215718c, b1Var.f215718c);
    }

    public final int hashCode() {
        int iHashCode = this.f215716a.hashCode() * 31;
        String str = this.f215717b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        q1 q1Var = this.f215718c;
        return iHashCode2 + (q1Var != null ? q1Var.hashCode() : 0);
    }
}
