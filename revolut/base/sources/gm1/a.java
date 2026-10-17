package gm1;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.apm.bills.billers.api.navigation.BillersFlowDestination;
import com.revolut.feature.apm.bills.billers.impl.ui.BillersFlow;
import com.revolut.feature.apm.bills.billers.impl.ui.chooser.BillersChooserScreen;
import com.revolut.feature.apm.bills.billers.impl.ui.search.BillerSearchScreen;
import jm1.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof dm1.e) {
            dm1.e eVar = (dm1.e) descriptor;
            return eVar.a(new BillersChooserScreen(eVar.f115818a));
        }
        if (!(descriptor instanceof dm1.a)) {
            return null;
        }
        dm1.a aVar = (dm1.a) descriptor;
        return aVar.a(new BillerSearchScreen(aVar.f115815a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BillersFlowDestination) {
            return new BillersFlow(new c(((BillersFlowDestination) destination).f61158a));
        }
        return null;
    }
}
