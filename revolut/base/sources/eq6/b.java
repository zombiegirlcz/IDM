package eq6;

import aii.e;
import aii.g;
import aii.u;
import aq6.f;
import com.revolut.feature.flexible.staking.consent.impl.screen.FlexibleStakingConsentScreenController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof f)) {
            return null;
        }
        f fVar = (f) descriptor;
        return fVar.a(new FlexibleStakingConsentScreenController(fVar.f8273a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
