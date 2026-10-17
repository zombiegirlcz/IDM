package hr1;

import com.revolut.feature.apm.bills.postal_check.api.PostalCheckToggles$PostalCheck;
import com.revolut.feature.apm.bills.postal_check.api.navigation.PostalCheckNavigation$Destination;
import com.revolut.feature.apm.bills.postal_check.impl.ui.PostalCheckFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return u.c(PostalCheckToggles$PostalCheck.f61497c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PostalCheckNavigation$Destination) {
            return new PostalCheckFlow(((PostalCheckNavigation$Destination) destination).f61508b);
        }
        return null;
    }
}
