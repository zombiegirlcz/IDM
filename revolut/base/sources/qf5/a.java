package qf5;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.crypto.exchange.fees.api.navigation.CryptoExchangeFeesDestination;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesController;
import com.revolut.feature.crypto.exchange.fees.impl.ui.crypto_exchange_fees_dialog_controller.CryptoExchangeFeesDialogController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof mf5.b)) {
            return null;
        }
        mf5.b bVar = (mf5.b) descriptor;
        if (bVar instanceof mf5.a) {
            return bVar.a(new CryptoExchangeFeesDialogController(((mf5.a) bVar).b()));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CryptoExchangeFeesDestination)) {
            return null;
        }
        CryptoExchangeFeesDestination cryptoExchangeFeesDestination = (CryptoExchangeFeesDestination) destination;
        if (cryptoExchangeFeesDestination instanceof CryptoExchangeFeesDestination.FeesWithUpgradePlans) {
            CryptoExchangeFeesDestination.FeesWithUpgradePlans feesWithUpgradePlans = (CryptoExchangeFeesDestination.FeesWithUpgradePlans) cryptoExchangeFeesDestination;
            return new CryptoExchangeFeesController(feesWithUpgradePlans.getF70821a(), feesWithUpgradePlans.getF70822b());
        }
        if (cryptoExchangeFeesDestination instanceof CryptoExchangeFeesDestination.FeesBreakDown) {
            return new CryptoExchangeFeesDialogController(((CryptoExchangeFeesDestination.FeesBreakDown) cryptoExchangeFeesDestination).getF70820a());
        }
        throw new NoWhenBranchMatchedException();
    }
}
