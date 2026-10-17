package orh;

import aii.p;
import aii.u;
import com.revolut.feature.web_sign_in.navigation.WebSignInDestination;
import com.revolut.feature.web_sign_in.ui.flow.web_sign_in.WebSignInFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof WebSignInDestination) {
            return new WebSignInFlow(((WebSignInDestination) destination).getF96325b());
        }
        return null;
    }
}
