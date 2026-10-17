package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b3 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f173421b;

    public b3(String sector, double d) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        this.f173420a = sector;
        this.f173421b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.f173420a, b3Var.f173420a) && Double.compare(this.f173421b, b3Var.f173421b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f173421b) + (this.f173420a.hashCode() * 31);
    }
}
