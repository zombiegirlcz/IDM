package myh;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import h30.l;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.h f210521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd6.e f210522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f210523c;
    public final dj0.d d;
    public final dj0.d e;
    public final ChargeBreakdown f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f210524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f210525h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xi0.b f210526j;
    public final xi0.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f210527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f210528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f210529n;
    public final xi0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OrderQuote f210530p;

    public i(wd6.h orderType, wd6.e exchangeMode, double d, dj0.d amount, dj0.d counterAmount, ChargeBreakdown chargeBreakdown, dj0.d dVar, dj0.d dVar2, boolean z, xi0.b baseCurrency, xi0.b counterCurrency, boolean z3, dj0.d navbarDescriptionAmount, dj0.d navbarTitleMoney, xi0.b priceReferencedCurrency, OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(counterAmount, "counterAmount");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(navbarDescriptionAmount, "navbarDescriptionAmount");
        Intrinsics.checkNotNullParameter(navbarTitleMoney, "navbarTitleMoney");
        Intrinsics.checkNotNullParameter(priceReferencedCurrency, "priceReferencedCurrency");
        this.f210521a = orderType;
        this.f210522b = exchangeMode;
        this.f210523c = d;
        this.d = amount;
        this.e = counterAmount;
        this.f = chargeBreakdown;
        this.f210524g = dVar;
        this.f210525h = dVar2;
        this.i = z;
        this.f210526j = baseCurrency;
        this.k = counterCurrency;
        this.f210527l = z3;
        this.f210528m = navbarDescriptionAmount;
        this.f210529n = navbarTitleMoney;
        this.o = priceReferencedCurrency;
        this.f210530p = orderQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f210521a == iVar.f210521a && this.f210522b == iVar.f210522b && Double.compare(this.f210523c, iVar.f210523c) == 0 && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f210524g, iVar.f210524g) && Intrinsics.f(this.f210525h, iVar.f210525h) && this.i == iVar.i && Intrinsics.f(this.f210526j, iVar.f210526j) && Intrinsics.f(this.k, iVar.k) && this.f210527l == iVar.f210527l && Intrinsics.f(this.f210528m, iVar.f210528m) && Intrinsics.f(this.f210529n, iVar.f210529n) && Intrinsics.f(this.o, iVar.o) && Intrinsics.f(this.f210530p, iVar.f210530p);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(m72.b.c(y.g(this.f210522b, this.f210521a.hashCode() * 31, 31), this.f210523c, 31), 31, this.d), 31, this.e);
        ChargeBreakdown chargeBreakdown = this.f;
        int iHashCode = (iC + (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode())) * 31;
        dj0.d dVar = this.f210524g;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f210525h;
        int iJ = l.j(this.o, v7.c(v7.c(j6.a.c(l.j(this.k, l.j(this.f210526j, j6.a.c((iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.i), 31), 31), 31, this.f210527l), 31, this.f210528m), 31, this.f210529n), 31);
        OrderQuote orderQuote = this.f210530p;
        return iJ + (orderQuote != null ? orderQuote.hashCode() : 0);
    }
}
