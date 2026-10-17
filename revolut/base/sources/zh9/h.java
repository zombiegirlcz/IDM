package zh9;

import ip0.v7;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f322268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f322269c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f322270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f322271h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f322272j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f322273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f322274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LocalDate f322275n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f322276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f322277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f322278r;

    public h(String facilityId, wi0.b countryCode, BigDecimal fee2, BigDecimal apr, BigDecimal lateInterest, dj0.d availableToSpend, dj0.d maxPurchaseAmount, boolean z, dj0.d minFeeAmount, boolean z3, dj0.d totalToRepay, dj0.d totalCreditLimit, f fVar, LocalDate localDate, e creditLimitState, boolean z4, w preferredInstalmentType, g homeScreenType) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(apr, "apr");
        Intrinsics.checkNotNullParameter(lateInterest, "lateInterest");
        Intrinsics.checkNotNullParameter(availableToSpend, "availableToSpend");
        Intrinsics.checkNotNullParameter(maxPurchaseAmount, "maxPurchaseAmount");
        Intrinsics.checkNotNullParameter(minFeeAmount, "minFeeAmount");
        Intrinsics.checkNotNullParameter(totalToRepay, "totalToRepay");
        Intrinsics.checkNotNullParameter(totalCreditLimit, "totalCreditLimit");
        Intrinsics.checkNotNullParameter(creditLimitState, "creditLimitState");
        Intrinsics.checkNotNullParameter(preferredInstalmentType, "preferredInstalmentType");
        Intrinsics.checkNotNullParameter(homeScreenType, "homeScreenType");
        this.f322267a = facilityId;
        this.f322268b = countryCode;
        this.f322269c = fee2;
        this.d = apr;
        this.e = lateInterest;
        this.f = availableToSpend;
        this.f322270g = maxPurchaseAmount;
        this.f322271h = z;
        this.i = minFeeAmount;
        this.f322272j = z3;
        this.k = totalToRepay;
        this.f322273l = totalCreditLimit;
        this.f322274m = fVar;
        this.f322275n = localDate;
        this.o = creditLimitState;
        this.f322276p = z4;
        this.f322277q = preferredInstalmentType;
        this.f322278r = homeScreenType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f322267a, hVar.f322267a) && Intrinsics.f(this.f322268b, hVar.f322268b) && Intrinsics.f(this.f322269c, hVar.f322269c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f322270g, hVar.f322270g) && this.f322271h == hVar.f322271h && Intrinsics.f(this.i, hVar.i) && this.f322272j == hVar.f322272j && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f322273l, hVar.f322273l) && this.f322274m == hVar.f322274m && Intrinsics.f(this.f322275n, hVar.f322275n) && this.o == hVar.o && this.f322276p == hVar.f322276p && this.f322277q == hVar.f322277q && this.f322278r == hVar.f322278r;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(j6.a.c(v7.c(j6.a.c(v7.c(v7.c(t61.a.d(this.e, t61.a.d(this.d, t61.a.d(this.f322269c, p.a.c(this.f322267a.hashCode() * 31, 31, this.f322268b.f297794a), 31), 31), 31), 31, this.f), 31, this.f322270g), 31, this.f322271h), 31, this.i), 31, this.f322272j), 31, this.k), 31, this.f322273l);
        f fVar = this.f322274m;
        int iHashCode = (iC + (fVar == null ? 0 : fVar.hashCode())) * 31;
        LocalDate localDate = this.f322275n;
        return this.f322278r.hashCode() + ((this.f322277q.hashCode() + j6.a.c((this.o.hashCode() + ((iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31)) * 31, 31, this.f322276p)) * 31);
    }
}
