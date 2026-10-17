package kw4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f190223c;
    public final ll4.y d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f190224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xw4.a f190225h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f190226j;
    public final wi0.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f190227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f190228m;

    public h(String facilityId, String pocketId, dj0.d pocketBalance, ll4.y paymentInfo, dj0.d overLimitAmount, dj0.d limitAmount, dj0.d maxAllowedPayment, xw4.a paymentState, boolean z, boolean z3, wi0.b countryCode, g inputAmountModel) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
        Intrinsics.checkNotNullParameter(overLimitAmount, "overLimitAmount");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        Intrinsics.checkNotNullParameter(maxAllowedPayment, "maxAllowedPayment");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(inputAmountModel, "inputAmountModel");
        this.f190221a = facilityId;
        this.f190222b = pocketId;
        this.f190223c = pocketBalance;
        this.d = paymentInfo;
        this.e = overLimitAmount;
        this.f = limitAmount;
        this.f190224g = maxAllowedPayment;
        this.f190225h = paymentState;
        this.i = z;
        this.f190226j = z3;
        this.k = countryCode;
        this.f190227l = inputAmountModel;
        this.f190228m = inputAmountModel.f190218a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f190221a, hVar.f190221a) && Intrinsics.f(this.f190222b, hVar.f190222b) && Intrinsics.f(this.f190223c, hVar.f190223c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f190224g, hVar.f190224g) && this.f190225h == hVar.f190225h && this.i == hVar.i && this.f190226j == hVar.f190226j && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f190227l, hVar.f190227l);
    }

    public final int hashCode() {
        return this.f190227l.hashCode() + p.a.c(j6.a.c(j6.a.c((this.f190225h.hashCode() + v7.c(v7.c(v7.c((this.d.hashCode() + v7.c(p.a.c(this.f190221a.hashCode() * 31, 31, this.f190222b), 31, this.f190223c)) * 31, 31, this.e), 31, this.f), 31, this.f190224g)) * 31, 31, this.i), 31, this.f190226j), 31, this.k.f297794a);
    }
}
