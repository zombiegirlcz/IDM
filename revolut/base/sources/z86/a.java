package z86;

import aii.u;
import com.revolut.feature.direct_deposit.api.navigation.DirectDepositDestination;
import com.revolut.feature.direct_deposit.impl.ui_kompot.flow.DirectDepositFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DirectDepositDestination) {
            return new DirectDepositFlow();
        }
        return null;
    }
}
