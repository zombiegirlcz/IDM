package jm9;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.payees.api.navigation.PayeesDestination;
import com.revolut.feature.payees.impl.ui.flow.PayeesFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof fm9.a)) {
            return null;
        }
        fm9.a aVar = (fm9.a) descriptor;
        return aVar.a(new PayeesFlow(aVar.f136034a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PayeesDestination) {
            return new PayeesFlow(((PayeesDestination) destination).f78991a);
        }
        return null;
    }
}
