package n91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f213538c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f213539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f213540h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f213541j;
    public final String k;

    public d(String id10, String name, long j2, String currency, String date, String str, String frequency, String str2, String reference, String state, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f213536a = id10;
        this.f213537b = name;
        this.f213538c = j2;
        this.d = currency;
        this.e = date;
        this.f = str;
        this.f213539g = frequency;
        this.f213540h = str2;
        this.i = reference;
        this.f213541j = state;
        this.k = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f213536a, dVar.f213536a) && Intrinsics.f(this.f213537b, dVar.f213537b) && this.f213538c == dVar.f213538c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f213539g, dVar.f213539g) && Intrinsics.f(this.f213540h, dVar.f213540h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f213541j, dVar.f213541j) && Intrinsics.f(this.k, dVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(a0.d.c(p.a.c(this.f213536a.hashCode() * 31, 31, this.f213537b), 31, this.f213538c), 31, this.d), 31, this.e);
        String str = this.f;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f213539g);
        String str2 = this.f213540h;
        int iC3 = p.a.c(p.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.f213541j);
        String str3 = this.k;
        return iC3 + (str3 != null ? str3.hashCode() : 0);
    }
}
