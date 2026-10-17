package hta;

import aii.u;
import com.revolut.feature.raffle.api.navigation.RaffleDestination;
import com.revolut.feature.raffle.impl.flow.RaffleFlow;
import com.revolut.feature.raffle.impl.flow.RaffleFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RaffleDestination) {
            return new RaffleFlow(new RaffleFlowContract$InputData(((RaffleDestination) destination).f81623a.f81624a));
        }
        return null;
    }
}
