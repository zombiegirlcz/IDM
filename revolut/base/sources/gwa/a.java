package gwa;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.referrals.code.impl.referral_code.flow.ReferralCodeFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof xva.a)) {
            return null;
        }
        xva.a aVar = (xva.a) descriptor;
        return aVar.a(new ReferralCodeFlow(aVar.f309226a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
