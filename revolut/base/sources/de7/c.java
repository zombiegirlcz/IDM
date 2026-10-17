package de7;

import aii.u;
import com.revolut.feature.in_app_calls.declaration.InAppCallDestination;
import com.revolut.feature.in_app_calls.flow.InAppCallsFlow;
import com.revolut.feature.in_app_calls.flow.InAppCallsFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InAppCallDestination) {
            return new InAppCallsFlow(new InAppCallsFlowContract$InputData(((InAppCallDestination) destination).f74795a.f74796a));
        }
        return null;
    }
}
