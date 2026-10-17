package qr1;

import aii.u;
import com.revolut.feature.apm.bills.tapi.api.TapiFeatureApi$Toggles$NonMxCurrencyPocketSelection;
import com.revolut.feature.apm.bills.tapi.api.TapiFeatureApi$Toggles$PaginatedBillers;
import com.revolut.feature.apm.bills.tapi.api.TapiFeatureApi$Toggles$TransferFromJointAccounts;
import com.revolut.feature.apm.bills.tapi.api.TapiFeatureConfig$Destination;
import com.revolut.feature.apm.bills.tapi.impl.flow.transfer.TapiTransferFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sr1.c;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return v.k(TapiFeatureApi$Toggles$NonMxCurrencyPocketSelection.f61529c, TapiFeatureApi$Toggles$TransferFromJointAccounts.f61531c, TapiFeatureApi$Toggles$PaginatedBillers.f61530c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TapiFeatureConfig$Destination.TapiTransfer) {
            return new TapiTransferFlow(new c(((TapiFeatureConfig$Destination.TapiTransfer) destination).f61532a));
        }
        return null;
    }
}
