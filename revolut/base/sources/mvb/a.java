package mvb;

import aii.u;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.RevPointsExclusiveStoreProductCheckoutDestination;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.RevPointsExclusiveStoreProductDestination;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.RevPointsExclusiveStoreProductStatusDestination;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.RevPointsExclusiveStoreProductFlow;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status.RevPointsExclusiveStoreProductStatusScreen;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status.RevPointsExclusiveStoreProductStatusScreenContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return dvb.a.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevPointsExclusiveStoreProductDestination) {
            return new RevPointsExclusiveStoreProductFlow(((RevPointsExclusiveStoreProductDestination) destination).getF83578a());
        }
        if (destination instanceof RevPointsExclusiveStoreProductCheckoutDestination) {
            return new RevPointsExclusiveStoreProductFlow(new ExclusiveStoreInputData.Checkout(((RevPointsExclusiveStoreProductCheckoutDestination) destination).getF83577a()));
        }
        if (destination instanceof RevPointsExclusiveStoreProductStatusDestination) {
            return new RevPointsExclusiveStoreProductStatusScreen(new RevPointsExclusiveStoreProductStatusScreenContract$InputData(((RevPointsExclusiveStoreProductStatusDestination) destination).getF83579a()));
        }
        return null;
    }
}
