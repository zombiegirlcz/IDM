package f45;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsController;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsControllerContract$InputData;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.SelectAccountV2Controller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof v35.a) {
            v35.a aVar = (v35.a) descriptor;
            return aVar.a(new SelectAccountV2Controller(aVar.f285852a));
        }
        if (!(descriptor instanceof y35.a)) {
            return null;
        }
        y35.a aVar2 = (y35.a) descriptor;
        return aVar2.a(new AccountDetailsController(new AccountDetailsControllerContract$InputData(aVar2.f310682a, aVar2.f310683b, null, null, false)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
