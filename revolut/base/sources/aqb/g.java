package aqb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8287c;

    public g(String accountId, String accountName, boolean z) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        this.f8285a = accountId;
        this.f8286b = accountName;
        this.f8287c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f8285a, gVar.f8285a) && Intrinsics.f(this.f8286b, gVar.f8286b) && this.f8287c == gVar.f8287c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8287c) + p.a.c(this.f8285a.hashCode() * 31, 31, this.f8286b);
    }
}
