package n8i;

import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyFlowContract$MoveMoneyProcessState f213465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderQuote f213466b;

    public r(MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyProcessState, OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(moveMoneyProcessState, "moveMoneyProcessState");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        this.f213465a = moveMoneyProcessState;
        this.f213466b = orderQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f213465a, rVar.f213465a) && Intrinsics.f(this.f213466b, rVar.f213466b);
    }

    public final int hashCode() {
        return this.f213466b.hashCode() + (this.f213465a.hashCode() * 31);
    }
}
