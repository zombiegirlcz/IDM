package ueh;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.wealth.options.ui.impl.ui.tab.OptionsTabController;
import com.revolut.feature.wealth.options.ui.impl.ui.tab.OptionsTabControllerContract$Input;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof leh.a)) {
            return null;
        }
        leh.a aVar = (leh.a) descriptor;
        return aVar.a(new OptionsTabController(new OptionsTabControllerContract$Input(aVar.f194555a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
