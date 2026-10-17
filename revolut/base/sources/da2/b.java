package da2;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.apm.payid.api.navigation.PayIdCreateContactDestination;
import com.revolut.feature.apm.payid.api.navigation.PayIdDestination;
import com.revolut.feature.apm.payid.api.navigation.PayIdVerifyOwnerShipDestination;
import com.revolut.feature.apm.payid.impl.flow.PayIdFlow;
import com.revolut.feature.apm.payid.impl.flow.PayIdFlowContract$InputData;
import com.revolut.feature.apm.payid.impl.screen.send.flow.SendFlow;
import com.revolut.feature.apm.payid.impl.screen.send.flow.SendFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ca2.a) {
            return ((ca2.a) descriptor).a(new PayIdFlow(null));
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PayIdDestination) {
            return new PayIdFlow(null);
        }
        if (destination instanceof PayIdCreateContactDestination) {
            return new SendFlow(new SendFlowContract$InputData(true));
        }
        if (!(destination instanceof PayIdVerifyOwnerShipDestination)) {
            return null;
        }
        PayIdVerifyOwnerShipDestination payIdVerifyOwnerShipDestination = (PayIdVerifyOwnerShipDestination) destination;
        return new PayIdFlow(new PayIdFlowContract$InputData.VerifyOwnership(payIdVerifyOwnerShipDestination.f62695b, payIdVerifyOwnerShipDestination.f62694a));
    }
}
