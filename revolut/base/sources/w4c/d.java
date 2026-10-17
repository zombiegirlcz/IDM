package w4c;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreen;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof t4c.b)) {
            return null;
        }
        t4c.b bVar = (t4c.b) descriptor;
        return bVar.a(new RevXOrdersBreakdownScreen(new RevXOrdersBreakdownScreenContract$InputData(bVar.f267970a, t4c.a.LOCKED_BALANCE)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
