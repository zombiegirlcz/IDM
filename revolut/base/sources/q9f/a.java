package q9f;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.trading.transfer.investments.api.TransferInvestmentsApi$Toggles;
import com.revolut.feature.trading.transfer.investments.api.navigation.NewTransferDestination;
import com.revolut.feature.trading.transfer.investments.api.navigation.TransferInvestmentsProgressDestination;
import com.revolut.feature.trading.transfer.investments.impl.navigation.internal_destinations.TransferInUpdatePurchasePriceDestination;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlow;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.TransferInPriceUpdateFlow;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.TransferInPriceUpdateFlowContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.TransferInvestmentsFlow;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.TransferProgressFlow;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.TransferProgressFlowContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        TransferInAssetSelectionFlowContract$InputData newTransferAssetSelection;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof r9f.c)) {
            super.c(descriptor);
            return null;
        }
        r9f.c cVar = (r9f.c) descriptor;
        if (descriptor instanceof r9f.a) {
            r9f.a aVar = (r9f.a) descriptor;
            newTransferAssetSelection = new TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection(aVar.c(), aVar.b());
        } else {
            if (!(descriptor instanceof r9f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            r9f.b bVar = (r9f.b) descriptor;
            newTransferAssetSelection = new TransferInAssetSelectionFlowContract$InputData.NewTransferAssetSelection(bVar.d(), bVar.b(), bVar.c());
        }
        return cVar.a(new TransferInAssetSelectionFlow(newTransferAssetSelection));
    }

    @Override // nte.a
    public final List e() {
        return TransferInvestmentsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TransferInvestmentsProgressDestination) {
            return new TransferProgressFlow(new TransferProgressFlowContract$InputData(((TransferInvestmentsProgressDestination) destination).getF91538a()));
        }
        if (destination instanceof NewTransferDestination) {
            return new TransferInvestmentsFlow(new paf.c(((NewTransferDestination) destination).getF91537a()));
        }
        if (destination instanceof TransferInUpdatePurchasePriceDestination) {
            return new TransferInPriceUpdateFlow(new TransferInPriceUpdateFlowContract$InputData(((TransferInUpdatePurchasePriceDestination) destination).getF91552b()));
        }
        return null;
    }
}
