package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f215719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215720b;

    public b3(String str, Double d) {
        this.f215719a = d;
        this.f215720b = str;
    }

    public final String a() {
        return this.f215720b;
    }

    public final Double b() {
        return this.f215719a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.f215719a, b3Var.f215719a) && Intrinsics.f(this.f215720b, b3Var.f215720b);
    }

    public final int hashCode() {
        Double d = this.f215719a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.f215720b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
