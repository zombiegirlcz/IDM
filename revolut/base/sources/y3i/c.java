package y3i;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f310734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f310735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChargeBreakdown f310736c;
    public final Amount d;
    public final Amount e;
    public final Amount f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f310737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f310738h;

    public c(Amount requestedAmount, Amount exchangedAmount, ChargeBreakdown fees, Amount estimatedTotal, Amount baseAmount, Amount counterAmount, b rowOrder, a estimatedTotalType) {
        Intrinsics.checkNotNullParameter(requestedAmount, "requestedAmount");
        Intrinsics.checkNotNullParameter(exchangedAmount, "exchangedAmount");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(estimatedTotal, "estimatedTotal");
        Intrinsics.checkNotNullParameter(baseAmount, "baseAmount");
        Intrinsics.checkNotNullParameter(counterAmount, "counterAmount");
        Intrinsics.checkNotNullParameter(rowOrder, "rowOrder");
        Intrinsics.checkNotNullParameter(estimatedTotalType, "estimatedTotalType");
        this.f310734a = requestedAmount;
        this.f310735b = exchangedAmount;
        this.f310736c = fees;
        this.d = estimatedTotal;
        this.e = baseAmount;
        this.f = counterAmount;
        this.f310737g = rowOrder;
        this.f310738h = estimatedTotalType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f310734a, cVar.f310734a) && Intrinsics.f(this.f310735b, cVar.f310735b) && Intrinsics.f(this.f310736c, cVar.f310736c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f310737g == cVar.f310737g && this.f310738h == cVar.f310738h;
    }

    public final int hashCode() {
        return this.f310738h.hashCode() + ((this.f310737g.hashCode() + y.d(this.f, y.d(this.e, y.d(this.d, (this.f310736c.hashCode() + y.d(this.f310735b, this.f310734a.hashCode() * 31, 31)) * 31, 31), 31), 31)) * 31);
    }
}
