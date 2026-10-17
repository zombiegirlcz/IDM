package qp5;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f248272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f248273c;
    public final String d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f248274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f248275h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f248276j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f248277l;

    public d(String addressId, wk5.a blockchain, dj0.d amount, String requestId, Long l2, Long l3, Long l4, long j2, boolean z, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f248271a = addressId;
        this.f248272b = blockchain;
        this.f248273c = amount;
        this.d = requestId;
        this.e = l2;
        this.f = l3;
        this.f248274g = l4;
        this.f248275h = j2;
        this.i = z;
        this.f248276j = str;
        this.k = str2;
        this.f248277l = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f248271a, dVar.f248271a) && this.f248272b == dVar.f248272b && Intrinsics.f(this.f248273c, dVar.f248273c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f248274g, dVar.f248274g) && this.f248275h == dVar.f248275h && this.i == dVar.i && Intrinsics.f(this.f248276j, dVar.f248276j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f248277l, dVar.f248277l);
    }

    public final int hashCode() {
        int iC = p.a.c(v7.c((this.f248272b.hashCode() + (this.f248271a.hashCode() * 31)) * 31, 31, this.f248273c), 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f248274g;
        int iC2 = j6.a.c(a0.d.c((iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f248275h), 31, this.i);
        String str = this.f248276j;
        int iHashCode3 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f248277l;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
