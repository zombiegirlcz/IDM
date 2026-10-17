package uub;

import aii.u;
import com.revolut.feature.rev_points.buying.api.RevPointsBuyingApi$Toggles$OneOffPointsBuying;
import com.revolut.feature.rev_points.buying.api.RevPointsBuyingApi$Toggles$RecurringPointsBuying;
import com.revolut.feature.rev_points.buying.api.navigation.RevPointsBuyingDestination;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return v.k(RevPointsBuyingApi$Toggles$OneOffPointsBuying.f83551c, RevPointsBuyingApi$Toggles$RecurringPointsBuying.f83552c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevPointsBuyingDestination) {
            return new RevPointsBuyingFlow(((RevPointsBuyingDestination) destination).f83556a);
        }
        return null;
    }
}
