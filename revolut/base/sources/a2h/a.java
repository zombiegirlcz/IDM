package a2h;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.wealth.asset.selection.api.navigation.WealthAssetSelectionDestination;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowController;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof z1h.a)) {
            return null;
        }
        z1h.a aVar = (z1h.a) descriptor;
        return aVar.a(new AssetSelectionFlowController(new AssetSelectionFlowControllerContract$InputData(aVar.f318796a, aVar.f318797b, aVar.f318798c, aVar.d, aVar.e, aVar.f)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof WealthAssetSelectionDestination)) {
            return null;
        }
        WealthAssetSelectionDestination wealthAssetSelectionDestination = (WealthAssetSelectionDestination) destination;
        return new AssetSelectionFlowController(new AssetSelectionFlowControllerContract$InputData(wealthAssetSelectionDestination.f95383a, wealthAssetSelectionDestination.f95384b, wealthAssetSelectionDestination.f95385c, wealthAssetSelectionDestination.d, wealthAssetSelectionDestination.e, wealthAssetSelectionDestination.f));
    }
}
