package p1f;

import j1f.i;
import j1f.k;
import j1f.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f231901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f231902c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f231903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f231904h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f231905j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f231906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f231907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f231908n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f231909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f231910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f231911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f231912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f231913t;

    public b(String id10, String product, String name, String programmeName, String str, String subtitle, String description, String logoUrl, String learnMoreUrl, String str2, boolean z, String backgroundUrl, x loyaltyProgramme, List redeemTypes, String str3, String str4, List redeemOptions, List extraRedeemOptions, k kVar, i iVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(programmeName, "programmeName");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(loyaltyProgramme, "loyaltyProgramme");
        Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
        Intrinsics.checkNotNullParameter(redeemOptions, "redeemOptions");
        Intrinsics.checkNotNullParameter(extraRedeemOptions, "extraRedeemOptions");
        this.f231900a = id10;
        this.f231901b = product;
        this.f231902c = name;
        this.d = programmeName;
        this.e = str;
        this.f = subtitle;
        this.f231903g = description;
        this.f231904h = logoUrl;
        this.i = learnMoreUrl;
        this.f231905j = str2;
        this.k = z;
        this.f231906l = backgroundUrl;
        this.f231907m = loyaltyProgramme;
        this.f231908n = redeemTypes;
        this.o = str3;
        this.f231909p = str4;
        this.f231910q = redeemOptions;
        this.f231911r = extraRedeemOptions;
        this.f231912s = kVar;
        this.f231913t = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f231900a, bVar.f231900a) && Intrinsics.f(this.f231901b, bVar.f231901b) && Intrinsics.f(this.f231902c, bVar.f231902c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f231903g, bVar.f231903g) && Intrinsics.f(this.f231904h, bVar.f231904h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f231905j, bVar.f231905j) && this.k == bVar.k && Intrinsics.f(this.f231906l, bVar.f231906l) && Intrinsics.f(this.f231907m, bVar.f231907m) && Intrinsics.f(this.f231908n, bVar.f231908n) && Intrinsics.f(this.o, bVar.o) && Intrinsics.f(this.f231909p, bVar.f231909p) && Intrinsics.f(this.f231910q, bVar.f231910q) && Intrinsics.f(this.f231911r, bVar.f231911r) && Intrinsics.f(this.f231912s, bVar.f231912s) && Intrinsics.f(this.f231913t, bVar.f231913t);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f231900a.hashCode() * 31, 31, this.f231901b), 31, this.f231902c), 31, this.d);
        String str = this.e;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.f231903g), 31, this.f231904h), 31, this.i);
        String str2 = this.f231905j;
        int iD = p.a.d((this.f231907m.hashCode() + p.a.c(j6.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k), 31, this.f231906l)) * 31, 31, this.f231908n);
        String str3 = this.o;
        int iHashCode = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f231909p;
        int iD2 = p.a.d(p.a.d((iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f231910q), 31, this.f231911r);
        k kVar = this.f231912s;
        int iHashCode2 = (iD2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        i iVar = this.f231913t;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
