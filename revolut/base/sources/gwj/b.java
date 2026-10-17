package gwj;

import aii.u;
import com.revolut.retail.feature.api.userauth.location_enforce.LocationEnforceDestination;
import com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.LocationEnforceFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof LocationEnforceDestination) {
            return new LocationEnforceFlow();
        }
        return null;
    }
}
