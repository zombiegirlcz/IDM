package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q2 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f173549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173550c;

    public q2(String placeholder, t2 t2Var, String value) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173548a = placeholder;
        this.f173549b = t2Var;
        this.f173550c = value;
    }

    @Override // jel.s2
    public final String a() {
        return this.f173548a;
    }

    @Override // jel.s2
    public final t2 b() {
        return this.f173549b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj2;
        return Intrinsics.f(this.f173548a, q2Var.f173548a) && this.f173549b == q2Var.f173549b && Intrinsics.f(this.f173550c, q2Var.f173550c);
    }

    public final int hashCode() {
        int iHashCode = this.f173548a.hashCode() * 31;
        t2 t2Var = this.f173549b;
        return this.f173550c.hashCode() + ((iHashCode + (t2Var == null ? 0 : t2Var.hashCode())) * 31);
    }
}
