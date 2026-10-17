package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f215999b;

    public p1(String str, Long l2) {
        this.f215998a = str;
        this.f215999b = l2;
    }

    public final String a() {
        return this.f215998a;
    }

    public final Long b() {
        return this.f215999b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f215998a, p1Var.f215998a) && Intrinsics.f(this.f215999b, p1Var.f215999b);
    }

    public final int hashCode() {
        String str = this.f215998a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.f215999b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
