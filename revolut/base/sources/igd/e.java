package igd;

import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlowContract$State;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yfd.n;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends g implements a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SharedAddAssetFlowContract$InputData f161163t;
    public final SharedAddAssetFlowContract$State u;
    public final SharedAddAssetFlowContract$Step v;

    public e(SharedAddAssetFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161163t = inputData;
        List list = inputData.f86846a;
        if (list.isEmpty()) {
            throw new IllegalStateException("provide at least 1 assetTypeKey as inputData");
        }
        this.u = new SharedAddAssetFlowContract$State(list.size() == 1 ? (FavouritesAssetTypeKey) d0.b0(list) : null);
        if (list.isEmpty()) {
            throw new IllegalStateException("provide at least 1 assetTypeKey as inputData");
        }
        this.v = list.size() == 1 ? SharedAddAssetFlowContract$Step.ASSET_CHOOSER : SharedAddAssetFlowContract$Step.ASSET_TYPE_CHOOSER;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        SharedAddAssetFlowContract$Step step = (SharedAddAssetFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        int i = d.f161162a[step.ordinal()];
        if (i == 1) {
            SharedFavouritesAssetTypeChooserScreen sharedFavouritesAssetTypeChooserScreen = new SharedFavouritesAssetTypeChooserScreen(new SharedFavouritesAssetTypeChooserScreenContract$InputData(this.f161163t.f86846a));
            i9e.a aVar = new i9e.a(this, 23);
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            sharedFavouritesAssetTypeChooserScreen.H = aVar;
            return sharedFavouritesAssetTypeChooserScreen;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        FavouritesAssetTypeKey favouritesAssetTypeKey = ((SharedAddAssetFlowContract$State) A2().f98429a).f86847a;
        if (favouritesAssetTypeKey == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen = new SharedFavouritesAddAssetScreen(new SharedFavouritesAddAssetScreenContract$InputData(favouritesAssetTypeKey, null, n.SINGLE, null));
        i25.e eVar = new i25.e(this, favouritesAssetTypeKey, 22);
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        sharedFavouritesAddAssetScreen.H = eVar;
        return sharedFavouritesAddAssetScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
