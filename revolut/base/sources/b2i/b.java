package b2i;

import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dj0.d;
import f2i.g;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import mha.k;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.joda.time.LocalDate;
import wd6.e;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f11943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f11944c;
    public final d d;
    public final a e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f11945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f11946h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ChargeBreakdown f11947j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDate f11948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f11949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final OrderQuote f11950n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TakeProfitStopLoss f11951p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f11952q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f11953r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11954s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f11955t;
    public final xi0.b u;
    public final xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f11956w;

    public b(h orderType, e exchangeMode, double d, d amount, a amountType, d counterAmount, a counterAmountType, Double d5, d dVar, ChargeBreakdown chargeBreakdown, k kVar, LocalDate localDate, g gVar, OrderQuote orderQuote, boolean z, TakeProfitStopLoss takeProfitStopLoss, d dVar2, d dVar3, boolean z3, xi0.b bVar, xi0.b bVar2, boolean z4, int i) {
        Double d6 = (i & 128) != 0 ? null : d5;
        d dVar4 = (i & 256) != 0 ? null : dVar;
        ChargeBreakdown chargeBreakdown2 = (i & 512) != 0 ? null : chargeBreakdown;
        LocalDate localDate2 = (i & 2048) != 0 ? null : localDate;
        g gVar2 = (i & 4096) != 0 ? null : gVar;
        OrderQuote orderQuote2 = (i & 8192) != 0 ? null : orderQuote;
        boolean z6 = (i & 16384) != 0 ? false : z;
        TakeProfitStopLoss takeProfitStopLoss2 = (i & 32768) != 0 ? null : takeProfitStopLoss;
        d dVar5 = (i & 65536) != 0 ? null : dVar2;
        d dVar6 = (i & 131072) != 0 ? null : dVar3;
        boolean z11 = (i & 262144) != 0 ? false : z3;
        boolean z12 = (i & 524288) == 0;
        xi0.b bVar3 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : bVar;
        xi0.b bVar4 = (i & PKIFailureInfo.badSenderNonce) != 0 ? null : bVar2;
        boolean z29 = (i & 4194304) != 0 ? false : z4;
        d dVar7 = dVar5;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(counterAmount, "counterAmount");
        Intrinsics.checkNotNullParameter(counterAmountType, "counterAmountType");
        this.f11942a = orderType;
        this.f11943b = exchangeMode;
        this.f11944c = d;
        this.d = amount;
        this.e = amountType;
        this.f = counterAmount;
        this.f11945g = counterAmountType;
        this.f11946h = d6;
        this.i = dVar4;
        this.f11947j = chargeBreakdown2;
        this.k = kVar;
        this.f11948l = localDate2;
        this.f11949m = gVar2;
        this.f11950n = orderQuote2;
        this.o = z6;
        this.f11951p = takeProfitStopLoss2;
        this.f11952q = dVar7;
        this.f11953r = dVar6;
        this.f11954s = z11;
        this.f11955t = z12;
        this.u = bVar3;
        this.v = bVar4;
        this.f11956w = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f11942a == bVar.f11942a && this.f11943b == bVar.f11943b && Double.compare(this.f11944c, bVar.f11944c) == 0 && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f) && this.f11945g == bVar.f11945g && Intrinsics.f(this.f11946h, bVar.f11946h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f11947j, bVar.f11947j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f11948l, bVar.f11948l) && this.f11949m == bVar.f11949m && Intrinsics.f(this.f11950n, bVar.f11950n) && this.o == bVar.o && Intrinsics.f(this.f11951p, bVar.f11951p) && Intrinsics.f(this.f11952q, bVar.f11952q) && Intrinsics.f(this.f11953r, bVar.f11953r) && this.f11954s == bVar.f11954s && this.f11955t == bVar.f11955t && Intrinsics.f(this.u, bVar.u) && Intrinsics.f(this.v, bVar.v) && this.f11956w == bVar.f11956w;
    }

    public final int hashCode() {
        int iHashCode = (this.f11945g.hashCode() + v7.c((this.e.hashCode() + v7.c(m72.b.c(y.g(this.f11943b, this.f11942a.hashCode() * 31, 31), this.f11944c, 31), 31, this.d)) * 31, 31, this.f)) * 31;
        Double d = this.f11946h;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        d dVar = this.i;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ChargeBreakdown chargeBreakdown = this.f11947j;
        int iHashCode4 = (iHashCode3 + (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode())) * 31;
        k kVar = this.k;
        int iHashCode5 = (iHashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        LocalDate localDate = this.f11948l;
        int iHashCode6 = (iHashCode5 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        g gVar = this.f11949m;
        int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        OrderQuote orderQuote = this.f11950n;
        int iC = j6.a.c((iHashCode7 + (orderQuote == null ? 0 : orderQuote.hashCode())) * 31, 31, this.o);
        TakeProfitStopLoss takeProfitStopLoss = this.f11951p;
        int iHashCode8 = (iC + (takeProfitStopLoss == null ? 0 : takeProfitStopLoss.hashCode())) * 31;
        d dVar2 = this.f11952q;
        int iHashCode9 = (iHashCode8 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.f11953r;
        int iC2 = j6.a.c(j6.a.c((iHashCode9 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31, 31, this.f11954s), 31, this.f11955t);
        xi0.b bVar = this.u;
        int iHashCode10 = (iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        xi0.b bVar2 = this.v;
        return Boolean.hashCode(this.f11956w) + ((iHashCode10 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }
}
