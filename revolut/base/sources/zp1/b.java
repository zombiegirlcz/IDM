package zp1;

import aii.u;
import com.revolut.feature.apm.bills.f24.api.navigation.F24Destination;
import com.revolut.feature.apm.bills.f24.impl.ui.F24Flow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof F24Destination) {
            return new F24Flow();
        }
        return null;
    }
}
