package zek;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321742c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f321743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f321744h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f321745j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f321746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f321747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f321748n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f321749p;

    public o(String id10, String code, String displayCode, String currencyCode, String str, List billing, List features, List featureGroups, List cardDesigns, List products, String str2, Integer num, int i, int i2, e eVar, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(displayCode, "displayCode");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(billing, "billing");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(featureGroups, "featureGroups");
        Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f321740a = id10;
        this.f321741b = code;
        this.f321742c = displayCode;
        this.d = currencyCode;
        this.e = str;
        this.f = billing;
        this.f321743g = features;
        this.f321744h = featureGroups;
        this.i = cardDesigns;
        this.f321745j = products;
        this.k = str2;
        this.f321746l = num;
        this.f321747m = i;
        this.f321748n = i2;
        this.o = eVar;
        this.f321749p = z;
    }

    public final List a() {
        return this.f;
    }

    public final List b() {
        return this.i;
    }

    public final int c() {
        return this.f321748n;
    }

    public final e d() {
        return this.o;
    }

    public final String e() {
        return this.f321741b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f321740a, oVar.f321740a) && Intrinsics.f(this.f321741b, oVar.f321741b) && Intrinsics.f(this.f321742c, oVar.f321742c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f321743g, oVar.f321743g) && Intrinsics.f(this.f321744h, oVar.f321744h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f321745j, oVar.f321745j) && Intrinsics.f(this.k, oVar.k) && Intrinsics.f(this.f321746l, oVar.f321746l) && this.f321747m == oVar.f321747m && this.f321748n == oVar.f321748n && Intrinsics.f(this.o, oVar.o) && this.f321749p == oVar.f321749p;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f321742c;
    }

    public final List h() {
        return this.f321744h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f321740a.hashCode() * 31, 31, this.f321741b), 31, this.f321742c), 31, this.d);
        String str = this.e;
        int iD = p.a.d(p.a.d(p.a.d(p.a.d(p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.f321743g), 31, this.f321744h), 31, this.i), 31, this.f321745j);
        String str2 = this.k;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f321746l;
        int iB = j6.a.b(this.f321748n, j6.a.b(this.f321747m, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        e eVar = this.o;
        return Boolean.hashCode(this.f321749p) + ((iB + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    public final List i() {
        return this.f321743g;
    }

    public final String j() {
        return this.f321740a;
    }

    public final String k() {
        return this.e;
    }

    public final int l() {
        return this.f321747m;
    }

    public final List m() {
        return this.f321745j;
    }

    public final Integer n() {
        return this.f321746l;
    }

    public final String o() {
        return this.k;
    }

    public final boolean p() {
        return this.f321749p;
    }
}
