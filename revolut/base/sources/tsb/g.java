package tsb;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f274065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f274066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f274067c;
    public final OrderQuoteParams d;

    public g(long j2, long j3, xi0.b currency, OrderQuoteParams orderQuoteParams) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f274065a = j2;
        this.f274066b = j3;
        this.f274067c = currency;
        this.d = orderQuoteParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f274065a == gVar.f274065a && this.f274066b == gVar.f274066b && Intrinsics.f(this.f274067c, gVar.f274067c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iJ = l.j(this.f274067c, a0.d.c(Long.hashCode(this.f274065a) * 31, 31, this.f274066b), 31);
        OrderQuoteParams orderQuoteParams = this.d;
        return iJ + (orderQuoteParams == null ? 0 : orderQuoteParams.hashCode());
    }
}
