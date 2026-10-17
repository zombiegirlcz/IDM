package j26;

import aii.p;
import aii.u;
import com.revolut.feature.defi.asset_details.api.navigation.DeFiAssetDetailsDestination;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreen;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DeFiAssetDetailsDestination) {
            return new DeFiAssetDetailsScreen(new DeFiAssetDetailsScreenContract$InputData(((DeFiAssetDetailsDestination) destination).f71675a));
        }
        return null;
    }
}
