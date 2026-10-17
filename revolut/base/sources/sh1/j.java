package sh1;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {
    public final Clause A;
    public final Clause B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f263354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f263355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f263356c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f263357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f263358h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f263359j;
    public final Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f263360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f263361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Clause f263362n;
    public final Clause o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Clause f263363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Clause f263364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Clause f263365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Clause f263366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Clause f263367t;
    public final Clause u;
    public final Clause v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Clause f263368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Clause f263369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Clause f263370y;
    public final Clause z;

    public j(Clause selectCountry, Clause skip, Clause continueAction, Clause postCodeLookup, Clause searchAddress, Clause clause, Clause addressLine1, Clause clause2, Clause addressLine2, Clause clause3, Clause clause4, Clause clause5, Clause clause6, Clause clause7, Clause clause8, Clause clause9, Clause clause10, Clause clause11, Clause clause12, Clause postCode, Clause clause13, Clause neighbourhood, Clause clause14, Clause city, Clause clause15, Clause region, Clause clause16, Clause optional) {
        Intrinsics.checkNotNullParameter(selectCountry, "selectCountry");
        Intrinsics.checkNotNullParameter(skip, "skip");
        Intrinsics.checkNotNullParameter(continueAction, "continueAction");
        Intrinsics.checkNotNullParameter(postCodeLookup, "postCodeLookup");
        Intrinsics.checkNotNullParameter(searchAddress, "searchAddress");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        Intrinsics.checkNotNullParameter(addressLine2, "addressLine2");
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        Intrinsics.checkNotNullParameter(neighbourhood, "neighbourhood");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(optional, "optional");
        this.f263354a = selectCountry;
        this.f263355b = skip;
        this.f263356c = continueAction;
        this.d = postCodeLookup;
        this.e = searchAddress;
        this.f = clause;
        this.f263357g = addressLine1;
        this.f263358h = clause2;
        this.i = addressLine2;
        this.f263359j = clause3;
        this.k = clause4;
        this.f263360l = clause5;
        this.f263361m = clause6;
        this.f263362n = clause7;
        this.o = clause8;
        this.f263363p = clause9;
        this.f263364q = clause10;
        this.f263365r = clause11;
        this.f263366s = clause12;
        this.f263367t = postCode;
        this.u = clause13;
        this.v = neighbourhood;
        this.f263368w = clause14;
        this.f263369x = city;
        this.f263370y = clause15;
        this.z = region;
        this.A = clause16;
        this.B = optional;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f263354a, jVar.f263354a) && Intrinsics.f(this.f263355b, jVar.f263355b) && Intrinsics.f(this.f263356c, jVar.f263356c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f263357g, jVar.f263357g) && Intrinsics.f(this.f263358h, jVar.f263358h) && Intrinsics.f(this.i, jVar.i) && Intrinsics.f(this.f263359j, jVar.f263359j) && Intrinsics.f(this.k, jVar.k) && Intrinsics.f(this.f263360l, jVar.f263360l) && Intrinsics.f(this.f263361m, jVar.f263361m) && Intrinsics.f(this.f263362n, jVar.f263362n) && Intrinsics.f(this.o, jVar.o) && Intrinsics.f(this.f263363p, jVar.f263363p) && Intrinsics.f(this.f263364q, jVar.f263364q) && Intrinsics.f(this.f263365r, jVar.f263365r) && Intrinsics.f(this.f263366s, jVar.f263366s) && Intrinsics.f(this.f263367t, jVar.f263367t) && Intrinsics.f(this.u, jVar.u) && Intrinsics.f(this.v, jVar.v) && Intrinsics.f(this.f263368w, jVar.f263368w) && Intrinsics.f(this.f263369x, jVar.f263369x) && Intrinsics.f(this.f263370y, jVar.f263370y) && Intrinsics.f(this.z, jVar.z) && Intrinsics.f(this.A, jVar.A) && Intrinsics.f(this.B, jVar.B);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(p.a.a(p.a.a(this.f263354a.hashCode() * 31, 31, this.f263355b), 31, this.f263356c), 31, this.d), 31, this.e);
        Clause clause = this.f;
        int iA2 = p.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f263357g);
        Clause clause2 = this.f263358h;
        int iA3 = p.a.a((iA2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.i);
        Clause clause3 = this.f263359j;
        int iHashCode = (iA3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.k;
        int iHashCode2 = (iHashCode + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Clause clause5 = this.f263360l;
        int iHashCode3 = (iHashCode2 + (clause5 == null ? 0 : clause5.hashCode())) * 31;
        Clause clause6 = this.f263361m;
        int iHashCode4 = (iHashCode3 + (clause6 == null ? 0 : clause6.hashCode())) * 31;
        Clause clause7 = this.f263362n;
        int iHashCode5 = (iHashCode4 + (clause7 == null ? 0 : clause7.hashCode())) * 31;
        Clause clause8 = this.o;
        int iHashCode6 = (iHashCode5 + (clause8 == null ? 0 : clause8.hashCode())) * 31;
        Clause clause9 = this.f263363p;
        int iHashCode7 = (iHashCode6 + (clause9 == null ? 0 : clause9.hashCode())) * 31;
        Clause clause10 = this.f263364q;
        int iHashCode8 = (iHashCode7 + (clause10 == null ? 0 : clause10.hashCode())) * 31;
        Clause clause11 = this.f263365r;
        int iHashCode9 = (iHashCode8 + (clause11 == null ? 0 : clause11.hashCode())) * 31;
        Clause clause12 = this.f263366s;
        int iA4 = p.a.a((iHashCode9 + (clause12 == null ? 0 : clause12.hashCode())) * 31, 31, this.f263367t);
        Clause clause13 = this.u;
        int iA5 = p.a.a((iA4 + (clause13 == null ? 0 : clause13.hashCode())) * 31, 31, this.v);
        Clause clause14 = this.f263368w;
        int iA6 = p.a.a((iA5 + (clause14 == null ? 0 : clause14.hashCode())) * 31, 31, this.f263369x);
        Clause clause15 = this.f263370y;
        int iA7 = p.a.a((iA6 + (clause15 == null ? 0 : clause15.hashCode())) * 31, 31, this.z);
        Clause clause16 = this.A;
        return this.B.hashCode() + ((iA7 + (clause16 != null ? clause16.hashCode() : 0)) * 31);
    }
}
