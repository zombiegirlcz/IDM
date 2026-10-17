package ehh;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail.TaxAllowanceDetailScreen;
import com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail.TaxAllowanceDetailScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ygh.a) {
            ygh.a aVar = (ygh.a) descriptor;
            return aVar.a(new TaxAllowanceDetailScreen(new TaxAllowanceDetailScreenContract$InputData(aVar.f313666a)));
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
