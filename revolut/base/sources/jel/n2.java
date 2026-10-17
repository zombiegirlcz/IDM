package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n2 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f173523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f173524c;

    public n2(String placeholder, t2 t2Var, dj0.d value) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173522a = placeholder;
        this.f173523b = t2Var;
        this.f173524c = value;
    }

    @Override // jel.s2
    public final String a() {
        return this.f173522a;
    }

    @Override // jel.s2
    public final t2 b() {
        return this.f173523b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return Intrinsics.f(this.f173522a, n2Var.f173522a) && this.f173523b == n2Var.f173523b && Intrinsics.f(this.f173524c, n2Var.f173524c);
    }

    public final int hashCode() {
        int iHashCode = this.f173522a.hashCode() * 31;
        t2 t2Var = this.f173523b;
        return this.f173524c.hashCode() + ((iHashCode + (t2Var == null ? 0 : t2Var.hashCode())) * 31);
    }
}
