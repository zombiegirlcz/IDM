package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f215882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215883c;
    public final j0 d;

    public k0(String excludedTransactionId, Long l2, String str, j0 j0Var) {
        Intrinsics.checkNotNullParameter(excludedTransactionId, "excludedTransactionId");
        this.f215881a = excludedTransactionId;
        this.f215882b = l2;
        this.f215883c = str;
        this.d = j0Var;
    }

    public final String a() {
        return this.f215881a;
    }

    public final j0 b() {
        return this.d;
    }

    public final Long c() {
        return this.f215882b;
    }

    public final String d() {
        return this.f215883c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f215881a, k0Var.f215881a) && Intrinsics.f(this.f215882b, k0Var.f215882b) && Intrinsics.f(this.f215883c, k0Var.f215883c) && this.d == k0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f215881a.hashCode() * 31;
        Long l2 = this.f215882b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f215883c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        j0 j0Var = this.d;
        return iHashCode3 + (j0Var != null ? j0Var.hashCode() : 0);
    }
}
