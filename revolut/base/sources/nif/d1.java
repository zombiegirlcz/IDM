package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f215754b;

    public d1(String id10, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f215753a = id10;
        this.f215754b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f215753a, d1Var.f215753a) && this.f215754b == d1Var.f215754b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f215754b) + (this.f215753a.hashCode() * 31);
    }
}
