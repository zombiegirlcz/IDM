package ude;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.support.api.navigation.InboundTransferTrackerDestination;
import com.revolut.feature.support.impl.transfer_tracker.ui.InboundTransferTrackerFlow;
import com.revolut.feature.support.impl.transfer_tracker.ui.date_picker.DatePickerScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.date_picker.DatePickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof uce.a)) {
            return null;
        }
        uce.a aVar = (uce.a) descriptor;
        return aVar.a(new DatePickerScreen(new DatePickerScreenContract$InputData(aVar.f279032a, aVar.f279033b, aVar.f279034c)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InboundTransferTrackerDestination) {
            return new InboundTransferTrackerFlow();
        }
        return null;
    }
}
