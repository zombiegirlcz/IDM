package nie;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f215683c;
    public final long d;
    public final long e;
    public final int f;

    public a(int i, long j2, long j3, long j5, String accountId, String productId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f215681a = accountId;
        this.f215682b = productId;
        this.f215683c = j2;
        this.d = j3;
        this.e = j5;
        this.f = i;
    }

    public static a a(a aVar, String productId, long j2, long j3, long j5, int i, int i2) {
        String accountId = aVar.f215681a;
        if ((i2 & 2) != 0) {
            productId = aVar.f215682b;
        }
        if ((i2 & 4) != 0) {
            j2 = aVar.f215683c;
        }
        if ((i2 & 8) != 0) {
            j3 = aVar.d;
        }
        if ((i2 & 16) != 0) {
            j5 = aVar.e;
        }
        int i3 = (i2 & 32) != 0 ? aVar.f : i;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new a(i3, j2, j3, j5, accountId, productId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f215681a, aVar.f215681a) && Intrinsics.f(this.f215682b, aVar.f215682b) && this.f215683c == aVar.f215683c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + a0.d.c(a0.d.c(a0.d.c(p.a.c(this.f215681a.hashCode() * 31, 31, this.f215682b), 31, this.f215683c), 31, this.d), 31, this.e);
    }
}
