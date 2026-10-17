package kqe;

import aii.p;
import aii.u;
import com.revolut.feature.teen_dashboard.api.navigation.TeenDashboardDestination;
import com.revolut.feature.teen_dashboard.impl.ui.dashboard.TeenDashboardScreen;
import com.revolut.feature.teen_dashboard.impl.ui.dashboard.TeenDashboardScreenContract$InputData;
import com.revolut.feature.teen_dashboard.impl.ui.details.TeenDetailsScreen;
import com.revolut.feature.teen_dashboard.impl.ui.details.TeenDetailsScreenContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TeenDashboardDestination.Dashboard) {
            return new TeenDashboardScreen(new TeenDashboardScreenContract$InputData(((TeenDashboardDestination.Dashboard) destination).f90330a));
        }
        if (destination instanceof TeenDashboardDestination.Details) {
            return new TeenDetailsScreen(new TeenDetailsScreenContract$InputData(((TeenDashboardDestination.Details) destination).f90331a));
        }
        return null;
    }
}
