package v6j;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f286405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f286406b;

    public a(Amount amount, xi0.b commodityCurrency) {
        Intrinsics.checkNotNullParameter("COMMODITY_BUY_MINIMUM_SUGGESTION", "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(commodityCurrency, "commodityCurrency");
        this.f286405a = amount;
        this.f286406b = commodityCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f286405a.equals(aVar.f286405a) && Intrinsics.f(this.f286406b, aVar.f286406b);
    }

    @Override // v6j.c
    public final Amount f() {
        return this.f286405a;
    }

    @Override // pel.f
    public final String getId() {
        return "COMMODITY_BUY_MINIMUM_SUGGESTION";
    }

    public final int hashCode() {
        return this.f286406b.hashCode() + y.d(this.f286405a, 1296532768, 31);
    }
}
