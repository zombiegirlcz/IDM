package ow7;

import aii.u;
import com.revolut.feature.insurance_home.api.navigation.InsuranceHomeDestinations$Home;
import com.revolut.feature.insurance_home.impl.ui.flow.home.InsuranceHomeFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InsuranceHomeDestinations$Home) {
            return new InsuranceHomeFlow();
        }
        return null;
    }
}
