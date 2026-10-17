package xf3;

import aii.u;
import com.revolut.feature.check_topup.api.navigation.CheckTopUpDestination;
import com.revolut.feature.check_topup.impl.ui_kompot.flow.CheckTopUpFlow;
import dg3.c;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CheckTopUpDestination) {
            return new CheckTopUpFlow(new c(((CheckTopUpDestination) destination).f65767b));
        }
        return null;
    }
}
