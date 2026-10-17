package kh2;

import aii.u;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$Destination;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$InputData;
import com.revolut.feature.apm.wero.impl.ui.wrapper.WeroWrapperFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof WeroNavigation$Destination) {
            return new WeroWrapperFlow((WeroNavigation$InputData) ((WeroNavigation$Destination) destination).f98300a);
        }
        return null;
    }
}
