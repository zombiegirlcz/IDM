package bxj;

import aii.u;
import com.revolut.retail.feature.impl.userauth.screen.sso_sign_in_sessions.RetailSsoSignInSessionsDestination;
import com.revolut.retail.feature.impl.userauth.screen.sso_sign_in_sessions.flow.RetailSsoSignInSessionsFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RetailSsoSignInSessionsDestination) {
            return new RetailSsoSignInSessionsFlow();
        }
        return null;
    }
}
