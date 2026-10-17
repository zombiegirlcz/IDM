package pq6;

import aii.u;
import com.revolut.feature.foreign_currencies.api.ForeignCurrenciesDestination;
import com.revolut.feature.foreign_currencies.impl.ui.flow.ForeignCurrenciesFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ForeignCurrenciesDestination) {
            return new ForeignCurrenciesFlow();
        }
        return null;
    }
}
