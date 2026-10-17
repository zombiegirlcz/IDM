package zh9;

import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 {
    public final n0 A;
    public final ArrayList B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f322328c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f322329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f322330h;
    public final Instant i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f322331j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f322332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f322333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f322334n;
    public final xi0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q0 f322335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f322336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f322337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p1 f322338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wi0.b f322339t;
    public final p0 u;
    public final BigDecimal v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dj0.d f322340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k0 f322341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Integer f322342y;
    public final String z;

    public r0(String id10, String facilityId, String transactionId, String merchantName, String str, String str2, String str3, Instant startDateTime, Instant updateDateTime, dj0.d amount, dj0.d paidAmount, dj0.d remainingAmount, Long l2, dj0.d fee2, xi0.b currency, q0 state, boolean z, o0 feeType, p1 origin, wi0.b countryCode, p0 instalmentType, BigDecimal termFeeRate, dj0.d minFeeAmount, k0 k0Var, Integer num, String str4, n0 feeDetails, ArrayList instalments) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        Intrinsics.checkNotNullParameter(updateDateTime, "updateDateTime");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(paidAmount, "paidAmount");
        Intrinsics.checkNotNullParameter(remainingAmount, "remainingAmount");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(feeType, "feeType");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        Intrinsics.checkNotNullParameter(termFeeRate, "termFeeRate");
        Intrinsics.checkNotNullParameter(minFeeAmount, "minFeeAmount");
        Intrinsics.checkNotNullParameter(feeDetails, "feeDetails");
        Intrinsics.checkNotNullParameter(instalments, "instalments");
        this.f322326a = id10;
        this.f322327b = facilityId;
        this.f322328c = transactionId;
        this.d = merchantName;
        this.e = str;
        this.f = str2;
        this.f322329g = str3;
        this.f322330h = startDateTime;
        this.i = updateDateTime;
        this.f322331j = amount;
        this.k = paidAmount;
        this.f322332l = remainingAmount;
        this.f322333m = l2;
        this.f322334n = fee2;
        this.o = currency;
        this.f322335p = state;
        this.f322336q = z;
        this.f322337r = feeType;
        this.f322338s = origin;
        this.f322339t = countryCode;
        this.u = instalmentType;
        this.v = termFeeRate;
        this.f322340w = minFeeAmount;
        this.f322341x = k0Var;
        this.f322342y = num;
        this.z = str4;
        this.A = feeDetails;
        this.B = instalments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f322326a, r0Var.f322326a) && Intrinsics.f(this.f322327b, r0Var.f322327b) && Intrinsics.f(this.f322328c, r0Var.f322328c) && Intrinsics.f(this.d, r0Var.d) && Intrinsics.f(this.e, r0Var.e) && Intrinsics.f(this.f, r0Var.f) && Intrinsics.f(this.f322329g, r0Var.f322329g) && Intrinsics.f(this.f322330h, r0Var.f322330h) && Intrinsics.f(this.i, r0Var.i) && this.f322331j.equals(r0Var.f322331j) && this.k.equals(r0Var.k) && this.f322332l.equals(r0Var.f322332l) && Intrinsics.f(this.f322333m, r0Var.f322333m) && this.f322334n.equals(r0Var.f322334n) && this.o.equals(r0Var.o) && this.f322335p == r0Var.f322335p && this.f322336q == r0Var.f322336q && this.f322337r == r0Var.f322337r && this.f322338s == r0Var.f322338s && this.f322339t.equals(r0Var.f322339t) && this.u == r0Var.u && this.v.equals(r0Var.v) && this.f322340w.equals(r0Var.f322340w) && this.f322341x == r0Var.f322341x && Intrinsics.f(this.f322342y, r0Var.f322342y) && Intrinsics.f(this.z, r0Var.z) && this.A.equals(r0Var.A) && this.B.equals(r0Var.B);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f322326a.hashCode() * 31, 31, this.f322327b), 31, this.f322328c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f322329g;
        int iC2 = v7.c(v7.c(v7.c(r6.b.c(r6.b.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f322330h), 31, this.i), 31, this.f322331j), 31, this.k), 31, this.f322332l);
        Long l2 = this.f322333m;
        int iC3 = v7.c(t61.a.d(this.v, (this.u.hashCode() + p.a.c((this.f322338s.hashCode() + ((this.f322337r.hashCode() + j6.a.c((this.f322335p.hashCode() + h30.l.j(this.o, v7.c((iC2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f322334n), 31)) * 31, 31, this.f322336q)) * 31)) * 31, 31, this.f322339t.f297794a)) * 31, 31), 31, this.f322340w);
        k0 k0Var = this.f322341x;
        int iHashCode3 = (iC3 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        Integer num = this.f322342y;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.z;
        return this.B.hashCode() + ((this.A.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
    }
}
