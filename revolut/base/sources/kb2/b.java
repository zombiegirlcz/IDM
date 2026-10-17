package kb2;

import aii.u;
import com.revolut.feature.apm.payto.api.navigation.PayToConfirmationDestination;
import com.revolut.feature.apm.payto.api.navigation.PayToConfirmationWithPendingActionDestination;
import com.revolut.feature.apm.payto.api.navigation.PayToTopupLinkedAccountDestination;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreen;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreenContract$InputData;
import com.revolut.feature.apm.payto.impl.screen.topup.flow.PayToTopupFlow;
import com.revolut.feature.apm.payto.impl.screen.topup.flow.PayToTopupFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PayToConfirmationDestination) {
            PayToConfirmationDestination payToConfirmationDestination = (PayToConfirmationDestination) destination;
            return new PayToConfirmationScreen(new PayToConfirmationScreenContract$InputData.WithId(payToConfirmationDestination.f62742a, payToConfirmationDestination.f62743b));
        }
        if (destination instanceof PayToConfirmationWithPendingActionDestination) {
            return new PayToConfirmationScreen(new PayToConfirmationScreenContract$InputData.WithPendingActionData(((PayToConfirmationWithPendingActionDestination) destination).f62744a));
        }
        if (destination instanceof PayToTopupLinkedAccountDestination) {
            return new PayToTopupFlow(new PayToTopupFlowContract$InputData(((PayToTopupLinkedAccountDestination) destination).f62745a));
        }
        return null;
    }
}
