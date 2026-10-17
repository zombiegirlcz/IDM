package iqk;

import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import wsg.n;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    public f(n walletInteractor, f73.c revolutCardsNavigationFactory) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsNavigationFactory, "revolutCardsNavigationFactory");
    }

    public static BridgeDestination a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.g(transaction), null, null, null, 126)));
    }
}
