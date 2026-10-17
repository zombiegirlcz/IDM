package v6j;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f286407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f286408b;

    public b(Amount amount, xi0.b commodityCurrency) {
        Intrinsics.checkNotNullParameter("COMMODITY_SELL_MINIMUM_SUGGESTION", "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(commodityCurrency, "commodityCurrency");
        this.f286407a = amount;
        this.f286408b = commodityCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f286407a.equals(bVar.f286407a) && Intrinsics.f(this.f286408b, bVar.f286408b);
    }

    @Override // v6j.c
    public final Amount f() {
        return this.f286407a;
    }

    @Override // pel.f
    public final String getId() {
        return "COMMODITY_SELL_MINIMUM_SUGGESTION";
    }

    public final int hashCode() {
        return this.f286408b.hashCode() + y.d(this.f286407a, 1513753648, 31);
    }
}
