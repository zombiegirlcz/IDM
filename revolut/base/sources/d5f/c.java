package d5f;

import aii.e;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.ui.api.navigation.trade.HoldingTradeDetailsDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements q1h.d {
    @Override // q1h.d
    public final e a(InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new sih.a(transaction.getF95577a());
    }

    @Override // q1h.d
    public final KompotDestination b(InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new HoldingTradeDetailsDestination(transaction.getF95577a());
    }
}
