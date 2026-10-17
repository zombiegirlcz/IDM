package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsInputData;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements qfd.a {
    @Override // qfd.a
    public final ViewController a(SelectAssetsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CombinedWatchlistContext combinedWatchlistContext = inputData.f86782a;
        SelectAssetsInputData.SelectionMode selectionMode = inputData.f86783b;
        boolean zF = Intrinsics.f(selectionMode, SelectAssetsInputData.SelectionMode.DefaultWatchlistSelection.f86784a);
        WatchlistAddAssetFlowContract$LaunchMode singleSelection = WatchlistAddAssetFlowContract$LaunchMode.DefaultWatchlistSelection.f86942a;
        if (!zF) {
            if (selectionMode instanceof SelectAssetsInputData.SelectionMode.SingleSelection) {
                singleSelection = new WatchlistAddAssetFlowContract$LaunchMode.SingleSelection(((SelectAssetsInputData.SelectionMode.SingleSelection) selectionMode).f86785a);
            } else if (!(selectionMode instanceof SelectAssetsInputData.SelectionMode.WatchlistSelection)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new WatchlistAddAssetFlow(new WatchlistAddAssetFlowContract$InputData(combinedWatchlistContext, singleSelection, 4));
    }
}
