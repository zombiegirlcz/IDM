package rmc;

import com.revolut.feature.robo.api.navigation.RoboFeatureConfig;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements d {
    @Override // q1h.d
    public final aii.e a(InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new clc.a(transaction.getF85125a());
    }

    @Override // q1h.d
    public final KompotDestination b(InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new RoboFeatureConfig.TransactionDetailsDestination(transaction.getF85125a());
    }
}
