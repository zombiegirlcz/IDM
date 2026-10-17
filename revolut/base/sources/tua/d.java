package tua;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f274550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274551c;
    public final int d;
    public final int e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f274552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f274553h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f274554j;
    public final long k;

    public d(String instalmentState, double d, String planId, int i, int i2, String str, String str2, String str3, String str4, String str5, long j2) {
        Intrinsics.checkNotNullParameter(instalmentState, "instalmentState");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f274549a = instalmentState;
        this.f274550b = d;
        this.f274551c = planId;
        this.d = i;
        this.e = i2;
        this.f = str;
        this.f274552g = str2;
        this.f274553h = str3;
        this.i = str4;
        this.f274554j = str5;
        this.k = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f274549a, dVar.f274549a) && Double.compare(this.f274550b, dVar.f274550b) == 0 && Intrinsics.f(this.f274551c, dVar.f274551c) && this.d == dVar.d && this.e == dVar.e && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f274552g, dVar.f274552g) && Intrinsics.f(this.f274553h, dVar.f274553h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f274554j, dVar.f274554j) && this.k == dVar.k;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, j6.a.b(this.d, p.a.c(m72.b.c(this.f274549a.hashCode() * 31, this.f274550b, 31), 31, this.f274551c), 31), 31);
        String str = this.f;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f274552g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f274553h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f274554j;
        return Long.hashCode(this.k) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
