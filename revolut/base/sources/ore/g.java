package ore;

import aii.p;
import aii.u;
import com.revolut.feature.terms.api.navigation.TnCListDestination;
import com.revolut.feature.terms.impl.ui.tnc_list.TnCListScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements p, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TnCListDestination) {
            return new TnCListScreen();
        }
        return null;
    }
}
