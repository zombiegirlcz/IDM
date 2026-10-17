package ceh;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.wealth.mutual_funds.api.ui.details.MutualFundDetailsContract$InputData;
import com.revolut.feature.wealth.mutual_funds.impl.ui.mutual_fund_details.MutualFundDetailsScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof beh.a) {
            beh.a aVar = (beh.a) descriptor;
            return aVar.a(new MutualFundDetailsScreen(new MutualFundDetailsContract$InputData(aVar.f14852a)));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
