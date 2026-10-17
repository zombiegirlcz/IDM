package vrc;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f291565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f291566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f291567c;
    public final String d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f291568g;

    public a(xi0.b fromCurrency, xi0.b toCurrency, String fromPocketId, String str, Long l2, Long l3, String str2) {
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        Intrinsics.checkNotNullParameter(fromPocketId, "fromPocketId");
        this.f291565a = fromCurrency;
        this.f291566b = toCurrency;
        this.f291567c = fromPocketId;
        this.d = str;
        this.e = l2;
        this.f = l3;
        this.f291568g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f291565a, aVar.f291565a) && Intrinsics.f(this.f291566b, aVar.f291566b) && Intrinsics.f(this.f291567c, aVar.f291567c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f291568g, aVar.f291568g);
    }

    public final int hashCode() {
        int iC = p.a.c(l.j(this.f291566b, this.f291565a.hashCode() * 31, 31), 31, this.f291567c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.f291568g;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
