package f25;

import aii.u;
import com.revolut.feature.credit.api.CreditApi$Toggles;
import com.revolut.feature.credit.api.navigation.CreditKompotDestination;
import com.revolut.feature.credit.api.navigation.GetCreditDestination;
import com.revolut.feature.credit.api.navigation.ProductGroupDestination;
import com.revolut.feature.credit.api.navigation.SecurityDepositInfoDestination;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsController;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsControllerContract$Configuration;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsControllerContract$InputData;
import com.revolut.feature.credit.impl.ui.security_deposit.SecurityDepositInfoScreen;
import com.revolut.feature.credit.impl.ui.security_deposit.SecurityDepositInfoScreenContract$InputData;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return d0.E0(CreditApplicationApi$Toggles.a(), CreditApi$Toggles.a());
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        CreditKompotDestination creditKompotDestination = destination instanceof CreditKompotDestination ? (CreditKompotDestination) destination : null;
        if (creditKompotDestination == null) {
            return null;
        }
        if (creditKompotDestination instanceof GetCreditDestination) {
            return new CreditEntryPointsController(new CreditEntryPointsControllerContract$InputData(CreditEntryPointsControllerContract$Configuration.All.f70055a, ((GetCreditDestination) creditKompotDestination).getF66172a()));
        }
        if (creditKompotDestination instanceof ProductGroupDestination) {
            ProductGroupDestination productGroupDestination = (ProductGroupDestination) creditKompotDestination;
            return new CreditEntryPointsController(new CreditEntryPointsControllerContract$InputData(new CreditEntryPointsControllerContract$Configuration.Specified(productGroupDestination.getF66175a(), productGroupDestination.getF66176b()), productGroupDestination.getF66177c()));
        }
        if (creditKompotDestination instanceof SecurityDepositInfoDestination) {
            return new SecurityDepositInfoScreen(new SecurityDepositInfoScreenContract$InputData(((SecurityDepositInfoDestination) creditKompotDestination).getF66178a()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
