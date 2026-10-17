package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111051b;

    public n0(boolean z, String str) {
        this.f111050a = z;
        this.f111051b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f111050a == n0Var.f111050a && Intrinsics.f(this.f111051b, n0Var.f111051b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f111050a) * 31;
        String str = this.f111051b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
