package pm8;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.junior_rewards.api.navigation.JuniorRewardsDestination$JuniorRewardsListDestination;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreen;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreenContract$InputData;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreen;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof im8.a)) {
            return null;
        }
        im8.a aVar = (im8.a) descriptor;
        return aVar.a(new JuniorRewardDetailsDialogScreen(new JuniorRewardDetailsDialogScreenContract$InputData(aVar.f162313a, aVar.f162314b)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorRewardsDestination$JuniorRewardsListDestination) {
            return new JuniorRewardsListScreen(new JuniorRewardsListScreenContract$InputData(((JuniorRewardsDestination$JuniorRewardsListDestination) destination).f77231a));
        }
        return null;
    }
}
