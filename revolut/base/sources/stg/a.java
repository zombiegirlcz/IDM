package stg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f265582c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f265583g;

    public a(String portfolioId, String str, String str2, boolean z, int i, String str3, boolean z3) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f265580a = i;
        this.f265581b = portfolioId;
        this.f265582c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f265583g = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f265580a == aVar.f265580a && Intrinsics.f(this.f265581b, aVar.f265581b) && this.f265582c == aVar.f265582c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f265583g == aVar.f265583g;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(Integer.hashCode(this.f265580a) * 31, 31, this.f265581b), 31, this.f265582c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.f265583g) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
