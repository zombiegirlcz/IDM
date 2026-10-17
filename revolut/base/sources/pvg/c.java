package pvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f240090c;
    public final String d;
    public final jo3.b e;
    public final Float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f240091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f240092h;
    public final jo3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Float f240093j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ko3.b f240094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ko3.b f240095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f240096n;
    public final String o;

    public c(iwg.a analyticsProductType, boolean z, jo3.b totalValue, String str, jo3.b bVar, Float f, String str2, String str3, jo3.b bVar2, Float f4, String str4, ko3.b bVar3, ko3.b bVar4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        this.f240088a = analyticsProductType;
        this.f240089b = z;
        this.f240090c = totalValue;
        this.d = str;
        this.e = bVar;
        this.f = f;
        this.f240091g = str2;
        this.f240092h = str3;
        this.i = bVar2;
        this.f240093j = f4;
        this.k = str4;
        this.f240094l = bVar3;
        this.f240095m = bVar4;
        this.f240096n = str5;
        this.o = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f240088a == cVar.f240088a && this.f240089b == cVar.f240089b && Intrinsics.f(this.f240090c, cVar.f240090c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f240091g, cVar.f240091g) && Intrinsics.f(this.f240092h, cVar.f240092h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f240093j, cVar.f240093j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f240094l, cVar.f240094l) && Intrinsics.f(this.f240095m, cVar.f240095m) && Intrinsics.f(this.f240096n, cVar.f240096n) && Intrinsics.f(this.o, cVar.o);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.f240090c, j6.a.c(this.f240088a.hashCode() * 31, 31, this.f240089b), 31);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        jo3.b bVar = this.e;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Float f = this.f;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.f240091g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f240092h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        jo3.b bVar2 = this.i;
        int iHashCode6 = (iHashCode5 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Float f4 = this.f240093j;
        int iHashCode7 = (iHashCode6 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ko3.b bVar3 = this.f240094l;
        int iHashCode9 = (iHashCode8 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        ko3.b bVar4 = this.f240095m;
        int iHashCode10 = (iHashCode9 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        String str5 = this.f240096n;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }
}
