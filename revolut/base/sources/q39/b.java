package q39;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.localisation.ui.impl.screens.date_input.DateInputScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof o39.a)) {
            return null;
        }
        o39.a aVar = (o39.a) descriptor;
        return aVar.a(new DateInputScreen(aVar.f221708a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
