package td9;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.onboarding.selfie.impl.intro.flow.OnboardingSelfieIntroFlow;
import kotlin.jvm.internal.Intrinsics;
import vd9.c;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof sd9.b)) {
            return null;
        }
        sd9.b bVar = (sd9.b) descriptor;
        return bVar.a(new OnboardingSelfieIntroFlow(new c(bVar.f261835a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
