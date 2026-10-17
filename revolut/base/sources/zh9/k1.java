package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k1 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f322296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f322297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f322298c;
    public final c1 d;

    public k1(int i, t1 t1Var, n1 termDetails, c1 c1Var) {
        Intrinsics.checkNotNullParameter(termDetails, "termDetails");
        this.f322296a = i;
        this.f322297b = t1Var;
        this.f322298c = termDetails;
        this.d = c1Var;
    }

    @Override // zh9.m1
    public final int a() {
        return this.f322296a;
    }

    @Override // zh9.m1
    public final t1 b() {
        return this.f322297b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return this.f322296a == k1Var.f322296a && this.f322297b == k1Var.f322297b && Intrinsics.f(this.f322298c, k1Var.f322298c) && Intrinsics.f(this.d, k1Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f322296a) * 31;
        t1 t1Var = this.f322297b;
        int iHashCode2 = (this.f322298c.hashCode() + ((iHashCode + (t1Var == null ? 0 : t1Var.hashCode())) * 31)) * 31;
        c1 c1Var = this.d;
        return iHashCode2 + (c1Var != null ? c1Var.hashCode() : 0);
    }
}
