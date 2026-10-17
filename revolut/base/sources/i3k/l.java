package i3k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158248c;
    public final long d;
    public final kq2.c e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f158249g;

    public l(String recipientCountry, String recipientCurrency, String senderCurrency, long j2, kq2.c cVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(recipientCurrency, "recipientCurrency");
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        this.f158246a = recipientCountry;
        this.f158247b = recipientCurrency;
        this.f158248c = senderCurrency;
        this.d = j2;
        this.e = cVar;
        this.f = str;
        this.f158249g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f158246a, lVar.f158246a) && Intrinsics.f(this.f158247b, lVar.f158247b) && Intrinsics.f(this.f158248c, lVar.f158248c) && this.d == lVar.d && this.e == lVar.e && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f158249g, lVar.f158249g);
    }

    public final int hashCode() {
        int iC = j6.a.c(a0.d.c(p.a.c(p.a.c(this.f158246a.hashCode() * 31, 31, this.f158247b), 31, this.f158248c), 31, this.d), 31, true);
        kq2.c cVar = this.e;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f158249g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
