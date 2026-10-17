package ufd;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.CombinedWatchlistAddAssetDestination;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.CombinedWatchlistSharedDestination;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsDescriptor;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsInputData;
import com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.CombinedWatchlistHomeFlow;
import com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.CombinedWatchlistHomeFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        WatchlistAddAssetFlowContract$LaunchMode watchlistSelection;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof SelectAssetsDescriptor)) {
            super.c(descriptor);
            return null;
        }
        SelectAssetsDescriptor selectAssetsDescriptor = (SelectAssetsDescriptor) descriptor;
        CombinedWatchlistContext f86782a = selectAssetsDescriptor.getF86781a().getF86782a();
        SelectAssetsInputData.SelectionMode f86783b = selectAssetsDescriptor.getF86781a().getF86783b();
        if (f86783b instanceof SelectAssetsInputData.SelectionMode.SingleSelection) {
            watchlistSelection = new WatchlistAddAssetFlowContract$LaunchMode.SingleSelection(((SelectAssetsInputData.SelectionMode.SingleSelection) f86783b).getF86785a());
        } else if (f86783b instanceof SelectAssetsInputData.SelectionMode.DefaultWatchlistSelection) {
            watchlistSelection = WatchlistAddAssetFlowContract$LaunchMode.DefaultWatchlistSelection.f86942a;
        } else {
            if (!(f86783b instanceof SelectAssetsInputData.SelectionMode.WatchlistSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            watchlistSelection = new WatchlistAddAssetFlowContract$LaunchMode.WatchlistSelection(((SelectAssetsInputData.SelectionMode.WatchlistSelection) f86783b).getF86786a());
        }
        return selectAssetsDescriptor.a(new WatchlistAddAssetFlow(new WatchlistAddAssetFlowContract$InputData(f86782a, watchlistSelection, false)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CombinedWatchlistSharedDestination) {
            CombinedWatchlistSharedDestination.InputData inputData = ((CombinedWatchlistSharedDestination) destination).f86777b;
            return new CombinedWatchlistHomeFlow(new CombinedWatchlistHomeFlowContract$InputData(inputData.getF86779a(), false, inputData.getF86780b()));
        }
        if (destination instanceof CombinedWatchlistAddAssetDestination) {
            return new WatchlistAddAssetFlow(new WatchlistAddAssetFlowContract$InputData(((CombinedWatchlistAddAssetDestination) destination).f86775b.getF86776a(), (WatchlistAddAssetFlowContract$LaunchMode) null, 2));
        }
        return null;
    }
}
