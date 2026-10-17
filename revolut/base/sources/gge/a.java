package gge;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f143678c;
    public final long d;
    public final long e;
    public final int f;

    public a(int i, long j2, long j3, long j5, String accountId, String productId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f143676a = accountId;
        this.f143677b = productId;
        this.f143678c = j2;
        this.d = j3;
        this.e = j5;
        this.f = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f143676a, aVar.f143676a) && Intrinsics.f(this.f143677b, aVar.f143677b) && this.f143678c == aVar.f143678c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + d.c(d.c(d.c(p.a.c(this.f143676a.hashCode() * 31, 31, this.f143677b), 31, this.f143678c), 31, this.d), 31, this.e);
    }
}
