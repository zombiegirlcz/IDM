package dod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116553c;
    public final int d;

    public k(String accountId, String accountName, int i) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        this.f116552b = accountId;
        this.f116553c = accountName;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f116552b, kVar.f116552b) && Intrinsics.f(this.f116553c, kVar.f116553c) && this.d == kVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.c(this.f116552b.hashCode() * 31, 31, this.f116553c);
    }
}
