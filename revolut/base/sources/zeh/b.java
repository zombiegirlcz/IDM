package zeh;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.wealth.private_companies.api.ui.details.PrivateCompanyDetailsContract$Destination;
import com.revolut.feature.wealth.private_companies.api.ui.details.PrivateCompanyDetailsContract$InputData;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PrivateCompanyDetailsContract$Destination) {
            return new PrivateCompanyDetailsFlowController(new PrivateCompanyDetailsContract$InputData(((PrivateCompanyDetailsContract$Destination) destination).f95720a));
        }
        return null;
    }
}
