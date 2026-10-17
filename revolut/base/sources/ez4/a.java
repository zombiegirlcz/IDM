package ez4;

import aii.u;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreen;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.guarantee.DirectDebitGuaranteeScreen;
import com.revolut.feature.credit.direct.debit.navigation.DirectDebitFeatureConfig$AccountDetails$NavigationDestination;
import com.revolut.feature.credit.direct.debit.navigation.DirectDebitFeatureConfig$Guarantee$NavigationDestination;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DirectDebitFeatureConfig$Guarantee$NavigationDestination) {
            return new DirectDebitGuaranteeScreen();
        }
        if (destination instanceof DirectDebitFeatureConfig$AccountDetails$NavigationDestination) {
            return new DirectDebitAccountDetailsScreen(new DirectDebitAccountDetailsScreenContract$InputData(((DirectDebitFeatureConfig$AccountDetails$NavigationDestination) destination).f69910a, null));
        }
        return null;
    }
}
