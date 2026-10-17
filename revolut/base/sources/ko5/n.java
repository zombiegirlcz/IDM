package ko5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f186246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f186247c;
    public final long d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f186248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f186249h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f186250j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f186251l;

    public n(String cryptoAddressId, wk5.a blockchain, String currency, long j2, String requestId, long j3, Long l2, Long l3, Long l4, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f186245a = cryptoAddressId;
        this.f186246b = blockchain;
        this.f186247c = currency;
        this.d = j2;
        this.e = requestId;
        this.f = j3;
        this.f186248g = l2;
        this.f186249h = l3;
        this.i = l4;
        this.f186250j = z;
        this.k = str;
        this.f186251l = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f186245a, nVar.f186245a) && this.f186246b == nVar.f186246b && Intrinsics.f(this.f186247c, nVar.f186247c) && this.d == nVar.d && Intrinsics.f(this.e, nVar.e) && this.f == nVar.f && Intrinsics.f(this.f186248g, nVar.f186248g) && Intrinsics.f(this.f186249h, nVar.f186249h) && Intrinsics.f(this.i, nVar.i) && this.f186250j == nVar.f186250j && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f186251l, nVar.f186251l);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(a0.d.c(p.a.c((this.f186246b.hashCode() + (this.f186245a.hashCode() * 31)) * 31, 31, this.f186247c), 31, this.d), 31, this.e), 31, this.f);
        Long l2 = this.f186248g;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f186249h;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        int iC2 = j6.a.c((iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f186250j);
        String str = this.k;
        int iHashCode3 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f186251l;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
