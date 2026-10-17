package qo9;

import aii.u;
import com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferDestination;
import com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof AirPaymentTransferDestination)) {
            return null;
        }
        AirPaymentTransferDestination airPaymentTransferDestination = (AirPaymentTransferDestination) destination;
        return new AirPaymentTransferFlow(airPaymentTransferDestination.f79125a, airPaymentTransferDestination.f79126b);
    }
}
