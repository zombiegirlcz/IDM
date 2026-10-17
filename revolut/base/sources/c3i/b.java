package c3i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import mha.k;
import wd6.e;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f20947c;
    public final d d;
    public final a e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f20948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ChargeBreakdown f20949h;
    public final k i;

    public b(h orderType, e exchangeMode, double d, d amount, a amountType, d counterAmount, a counterAmountType, ChargeBreakdown chargeBreakdown, k kVar) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(counterAmount, "counterAmount");
        Intrinsics.checkNotNullParameter(counterAmountType, "counterAmountType");
        this.f20945a = orderType;
        this.f20946b = exchangeMode;
        this.f20947c = d;
        this.d = amount;
        this.e = amountType;
        this.f = counterAmount;
        this.f20948g = counterAmountType;
        this.f20949h = chargeBreakdown;
        this.i = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f20945a == bVar.f20945a && this.f20946b == bVar.f20946b && Double.compare(this.f20947c, bVar.f20947c) == 0 && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f) && this.f20948g == bVar.f20948g && Intrinsics.f(this.f20949h, bVar.f20949h) && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f20948g.hashCode() + v7.c((this.e.hashCode() + v7.c(m72.b.c(y.g(this.f20946b, this.f20945a.hashCode() * 31, 31), this.f20947c, 31), 31, this.d)) * 31, 31, this.f)) * 31;
        ChargeBreakdown chargeBreakdown = this.f20949h;
        int iHashCode2 = (iHashCode + (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode())) * 31;
        k kVar = this.i;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }
}
