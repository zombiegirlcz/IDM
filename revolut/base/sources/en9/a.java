package en9;

import aii.u;
import com.revolut.feature.payinstore.api.config.PayInStoreDestination;
import com.revolut.feature.payinstore.api.declaration.PayInStoreApi$Toggles;
import com.revolut.feature.payinstore.impl.ui.flow.PayInStoreFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return PayInStoreApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PayInStoreDestination) {
            return new PayInStoreFlow(((PayInStoreDestination) destination).f79038a);
        }
        return null;
    }
}
