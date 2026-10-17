package u4i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f277356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderQuoteParamsVariant f277357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f277358c;

    public m(ChargeBreakdown fee2, OrderQuoteParamsVariant orderQuoteParams, Clause clause) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        this.f277356a = fee2;
        this.f277357b = orderQuoteParams;
        this.f277358c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f277356a, mVar.f277356a) && Intrinsics.f(this.f277357b, mVar.f277357b) && Intrinsics.f(this.f277358c, mVar.f277358c);
    }

    public final int hashCode() {
        int iHashCode = (this.f277357b.hashCode() + (this.f277356a.hashCode() * 31)) * 31;
        Clause clause = this.f277358c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
