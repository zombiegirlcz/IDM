package o45;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f222138b;

    public x1(String loanId, boolean z) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f222137a = loanId;
        this.f222138b = z;
    }

    public static x1 a(x1 x1Var, boolean z) {
        String loanId = x1Var.f222137a;
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        return new x1(loanId, z);
    }

    public final String b() {
        return this.f222137a;
    }

    public final boolean c() {
        return this.f222138b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.f222137a, x1Var.f222137a) && this.f222138b == x1Var.f222138b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f222138b) + (this.f222137a.hashCode() * 31);
    }
}
