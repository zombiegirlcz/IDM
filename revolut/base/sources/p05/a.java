package p05;

import aii.u;
import com.revolut.feature.credit.health.api.navigation.CreditHealthNavigationDestination;
import com.revolut.feature.credit.health.impl.ui.flow.CreditHealthFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CreditHealthNavigationDestination) {
            return new CreditHealthFlow();
        }
        return null;
    }
}
