package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i4 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120630c;
    public final q d;
    public final q e;
    public final d1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f120631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f120632h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f120633j;
    public final g4 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f120634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f120635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h4 f120636n;
    public final b4 o;

    public i4(String name, String title, String str, q qVar, q qVar2, d1 d1Var, l lVar, l lVar2, String str2, String str3, g4 g4Var, String str4, boolean z, h4 valueStyle, b4 b4Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(valueStyle, "valueStyle");
        this.f120628a = name;
        this.f120629b = title;
        this.f120630c = str;
        this.d = qVar;
        this.e = qVar2;
        this.f = d1Var;
        this.f120631g = lVar;
        this.f120632h = lVar2;
        this.i = str2;
        this.f120633j = str3;
        this.k = g4Var;
        this.f120634l = str4;
        this.f120635m = z;
        this.f120636n = valueStyle;
        this.o = b4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj2;
        return Intrinsics.f(this.f120628a, i4Var.f120628a) && Intrinsics.f(this.f120629b, i4Var.f120629b) && Intrinsics.f(this.f120630c, i4Var.f120630c) && this.d == i4Var.d && this.e == i4Var.e && Intrinsics.f(this.f, i4Var.f) && Intrinsics.f(this.f120631g, i4Var.f120631g) && Intrinsics.f(this.f120632h, i4Var.f120632h) && Intrinsics.f(this.i, i4Var.i) && Intrinsics.f(this.f120633j, i4Var.f120633j) && this.k == i4Var.k && Intrinsics.f(this.f120634l, i4Var.f120634l) && this.f120635m == i4Var.f120635m && this.f120636n == i4Var.f120636n && Intrinsics.f(this.o, i4Var.o);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120628a.hashCode() * 31, 31, this.f120629b);
        String str = this.f120630c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        q qVar = this.d;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        q qVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (qVar2 == null ? 0 : qVar2.hashCode())) * 31;
        d1 d1Var = this.f;
        int iHashCode4 = (iHashCode3 + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        l lVar = this.f120631g;
        int iHashCode5 = (iHashCode4 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        l lVar2 = this.f120632h;
        int iHashCode6 = (iHashCode5 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120633j;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g4 g4Var = this.k;
        int iHashCode9 = (iHashCode8 + (g4Var == null ? 0 : g4Var.hashCode())) * 31;
        String str4 = this.f120634l;
        int iHashCode10 = (this.f120636n.hashCode() + j6.a.c((iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f120635m)) * 31;
        b4 b4Var = this.o;
        return iHashCode10 + (b4Var != null ? b4Var.f120559a.hashCode() : 0);
    }
}
