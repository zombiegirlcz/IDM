package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f307439c;

    public q0(String accountId, String accountName, int i) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        this.f307437a = accountId;
        this.f307438b = accountName;
        this.f307439c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f307437a, q0Var.f307437a) && Intrinsics.f(this.f307438b, q0Var.f307438b) && this.f307439c == q0Var.f307439c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f307439c) + p.a.c(this.f307437a.hashCode() * 31, 31, this.f307438b);
    }
}
