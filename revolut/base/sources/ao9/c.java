package ao9;

import aii.u;
import com.revolut.feature.payment.counterparty.api.navigation.CounterPartyDetailsDestination;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreen;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreenContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CounterPartyDetailsDestination) {
            return new CounterPartyDetailsScreen(new CounterPartyDetailsScreenContract$InputData(((CounterPartyDetailsDestination) destination).f79048a));
        }
        return null;
    }
}
