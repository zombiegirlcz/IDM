package ma5;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f203945c;
    public final long d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f203946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f203947h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f203948j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f203949l;

    public a(String planId, String type, String currency, long j2, Long l2, Long l3, Integer num, int i, String status, long j3, long j5, Long l4) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f203943a = planId;
        this.f203944b = type;
        this.f203945c = currency;
        this.d = j2;
        this.e = l2;
        this.f = l3;
        this.f203946g = num;
        this.f203947h = i;
        this.i = status;
        this.f203948j = j3;
        this.k = j5;
        this.f203949l = l4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f203943a, aVar.f203943a) && Intrinsics.f(this.f203944b, aVar.f203944b) && Intrinsics.f(this.f203945c, aVar.f203945c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f203946g, aVar.f203946g) && this.f203947h == aVar.f203947h && Intrinsics.f(this.i, aVar.i) && this.f203948j == aVar.f203948j && this.k == aVar.k && Intrinsics.f(this.f203949l, aVar.f203949l);
    }

    public final int hashCode() {
        int iC = d.c(p.a.c(p.a.c(this.f203943a.hashCode() * 31, 31, this.f203944b), 31, this.f203945c), 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f203946g;
        int iC2 = d.c(d.c(p.a.c(j6.a.b(this.f203947h, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.i), 31, this.f203948j), 31, this.k);
        Long l4 = this.f203949l;
        return iC2 + (l4 != null ? l4.hashCode() : 0);
    }
}
