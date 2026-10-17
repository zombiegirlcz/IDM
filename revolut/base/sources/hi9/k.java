package hi9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {
    public final c A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152552c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f152553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f152554h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f152555j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f152556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f152557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f152558n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f152559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f152560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f152561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f152562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f152563t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f152564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f152565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Integer f152566y;
    public final String z;

    public k(String id10, String facilityId, String transactionId, String merchantName, String str, String str2, String str3, long j2, long j3, long j5, long j16, long j22, Long l2, long j42, String currency, String state, boolean z, String feeType, String origin, String countryCode, String instalmentType, String termFeeRate, long j46, String str4, Integer num, String str5, c feeDetails) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(feeType, "feeType");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        Intrinsics.checkNotNullParameter(termFeeRate, "termFeeRate");
        Intrinsics.checkNotNullParameter(feeDetails, "feeDetails");
        this.f152550a = id10;
        this.f152551b = facilityId;
        this.f152552c = transactionId;
        this.d = merchantName;
        this.e = str;
        this.f = str2;
        this.f152553g = str3;
        this.f152554h = j2;
        this.i = j3;
        this.f152555j = j5;
        this.k = j16;
        this.f152556l = j22;
        this.f152557m = l2;
        this.f152558n = j42;
        this.o = currency;
        this.f152559p = state;
        this.f152560q = z;
        this.f152561r = feeType;
        this.f152562s = origin;
        this.f152563t = countryCode;
        this.u = instalmentType;
        this.v = termFeeRate;
        this.f152564w = j46;
        this.f152565x = str4;
        this.f152566y = num;
        this.z = str5;
        this.A = feeDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f152550a, kVar.f152550a) && Intrinsics.f(this.f152551b, kVar.f152551b) && Intrinsics.f(this.f152552c, kVar.f152552c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f152553g, kVar.f152553g) && this.f152554h == kVar.f152554h && this.i == kVar.i && this.f152555j == kVar.f152555j && this.k == kVar.k && this.f152556l == kVar.f152556l && Intrinsics.f(this.f152557m, kVar.f152557m) && this.f152558n == kVar.f152558n && Intrinsics.f(this.o, kVar.o) && Intrinsics.f(this.f152559p, kVar.f152559p) && this.f152560q == kVar.f152560q && Intrinsics.f(this.f152561r, kVar.f152561r) && Intrinsics.f(this.f152562s, kVar.f152562s) && Intrinsics.f(this.f152563t, kVar.f152563t) && Intrinsics.f(this.u, kVar.u) && Intrinsics.f(this.v, kVar.v) && this.f152564w == kVar.f152564w && Intrinsics.f(this.f152565x, kVar.f152565x) && Intrinsics.f(this.f152566y, kVar.f152566y) && Intrinsics.f(this.z, kVar.z) && Intrinsics.f(this.A, kVar.A);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f152550a.hashCode() * 31, 31, this.f152551b), 31, this.f152552c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f152553g;
        int iC2 = a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f152554h), 31, this.i), 31, this.f152555j), 31, this.k), 31, this.f152556l);
        Long l2 = this.f152557m;
        int iC3 = a0.d.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c(p.a.c(p.a.c(a0.d.c((iC2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f152558n), 31, this.o), 31, this.f152559p), 31, this.f152560q), 31, this.f152561r), 31, this.f152562s), 31, this.f152563t), 31, this.u), 31, this.v), 31, this.f152564w);
        String str4 = this.f152565x;
        int iHashCode3 = (iC3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f152566y;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.z;
        return this.A.hashCode() + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
