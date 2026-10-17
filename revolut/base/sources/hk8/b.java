package hk8;

import aii.u;
import com.revolut.feature.junior_progression.api.navigation.JuniorProgressionDestination;
import com.revolut.feature.junior_progression.impl.ui.prompt.JuniorProgressionFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorProgressionDestination) {
            return new JuniorProgressionFlow();
        }
        return null;
    }
}
