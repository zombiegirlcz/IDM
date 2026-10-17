package naj;

import aii.u;
import com.revolut.retail.feature.crypto.newlyadded.api.navigation.NewlyAddedCryptoDestination;
import com.revolut.retail.feature.crypto.newlyadded.impl.ui.controller.NewlyAddedCryptoController;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (Intrinsics.f(destination, NewlyAddedCryptoDestination.f100029a)) {
            return new NewlyAddedCryptoController();
        }
        return null;
    }
}
