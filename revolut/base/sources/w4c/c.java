package w4c;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevXOrdersBreakdownControllerDestination;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$Destination;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreen;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreenContract$InputData;
import com.revolut.feature.revolut_x_balances.impl.fiat.RevolutXFiatBalancesDetailsScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof t4c.c)) {
            return null;
        }
        t4c.c cVar = (t4c.c) descriptor;
        return cVar.a(new RevXOrdersBreakdownScreen(new RevXOrdersBreakdownScreenContract$InputData(cVar.f267971a, cVar.f267972b)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevolutXFiatBalancesDetailsController$Destination) {
            return new RevolutXFiatBalancesDetailsScreen(((RevolutXFiatBalancesDetailsController$Destination) destination).f84248b);
        }
        if (!(destination instanceof RevXOrdersBreakdownControllerDestination)) {
            return null;
        }
        RevXOrdersBreakdownControllerDestination revXOrdersBreakdownControllerDestination = (RevXOrdersBreakdownControllerDestination) destination;
        return new RevXOrdersBreakdownScreen(new RevXOrdersBreakdownScreenContract$InputData(revXOrdersBreakdownControllerDestination.f84246a, revXOrdersBreakdownControllerDestination.f84247b));
    }
}
