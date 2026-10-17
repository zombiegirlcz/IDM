package nh1;

import aii.u;
import com.revolut.feature.add_money.api.navigation.AddMoneyDestination;
import com.revolut.feature.add_money.impl.flow.AddMoneyFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AddMoneyDestination) {
            return new AddMoneyFlow(((AddMoneyDestination) destination).f60914a);
        }
        return null;
    }
}
