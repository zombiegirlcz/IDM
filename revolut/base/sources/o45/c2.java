package o45;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222028c;
    public final String d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f222029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f222030h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f222031j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f222032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f222033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f222034n;
    public final b2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f222035p;

    public c2(String loanId, String id10, String transactionId, String repaymentDateTime, String currency, long j2, String type, String str, String str2, String str3, Long l2, Long l3, Long l4, String str4, b2 b2Var, String str5) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(repaymentDateTime, "repaymentDateTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f222026a = loanId;
        this.f222027b = id10;
        this.f222028c = transactionId;
        this.d = repaymentDateTime;
        this.e = currency;
        this.f = j2;
        this.f222029g = type;
        this.f222030h = str;
        this.i = str2;
        this.f222031j = str3;
        this.k = l2;
        this.f222032l = l3;
        this.f222033m = l4;
        this.f222034n = str4;
        this.o = b2Var;
        this.f222035p = str5;
    }

    public final b2 a() {
        return this.o;
    }

    public final Long b() {
        return this.f222032l;
    }

    public final long c() {
        return this.f;
    }

    public final String d() {
        return this.f222030h;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f222026a, c2Var.f222026a) && Intrinsics.f(this.f222027b, c2Var.f222027b) && Intrinsics.f(this.f222028c, c2Var.f222028c) && Intrinsics.f(this.d, c2Var.d) && Intrinsics.f(this.e, c2Var.e) && this.f == c2Var.f && Intrinsics.f(this.f222029g, c2Var.f222029g) && Intrinsics.f(this.f222030h, c2Var.f222030h) && Intrinsics.f(this.i, c2Var.i) && Intrinsics.f(this.f222031j, c2Var.f222031j) && Intrinsics.f(this.k, c2Var.k) && Intrinsics.f(this.f222032l, c2Var.f222032l) && Intrinsics.f(this.f222033m, c2Var.f222033m) && Intrinsics.f(this.f222034n, c2Var.f222034n) && Intrinsics.f(this.o, c2Var.o) && Intrinsics.f(this.f222035p, c2Var.f222035p);
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.f222027b;
    }

    public final String h() {
        return this.f222035p;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f222026a.hashCode() * 31, 31, this.f222027b), 31, this.f222028c), 31, this.d), 31, this.e), 31, this.f), 31, this.f222029g);
        String str = this.f222030h;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f222031j;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.k;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f222032l;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f222033m;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str4 = this.f222034n;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b2 b2Var = this.o;
        int iHashCode8 = (iHashCode7 + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        String str5 = this.f222035p;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.f222031j;
    }

    public final Long j() {
        return this.f222033m;
    }

    public final String k() {
        return this.f222026a;
    }

    public final Long l() {
        return this.k;
    }

    public final String m() {
        return this.d;
    }

    public final String n() {
        return this.f222028c;
    }

    public final String o() {
        return this.f222034n;
    }

    public final String p() {
        return this.f222029g;
    }
}
