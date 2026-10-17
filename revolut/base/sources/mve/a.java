package mve;

import aii.u;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlow;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData;
import com.revolut.navigation.destination.CheckoutDestination;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CheckoutDestination)) {
            return null;
        }
        CheckoutDestination checkoutDestination = (CheckoutDestination) destination;
        return new CheckoutFlow(new CheckoutFlowContract$InputData(checkoutDestination.f98460a, checkoutDestination.f98461b, checkoutDestination.f98462c, checkoutDestination.d, checkoutDestination.e));
    }
}
