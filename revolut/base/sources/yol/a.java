package yol;

import cjl.s;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import xwd.o;

/* JADX INFO: loaded from: classes12.dex */
public interface a {
    static AuthenticationFlow a(b bVar, String url2, String state, List securityProfiles) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AuthenticationFlow authenticationFlowB = djl.a.b(bVar.f315702b, new RevolutSsoApi$InputData$OperationBoundAuthentication(s.REGIONAL, securityProfiles, state, 48), new e1(ref$ObjectRef, bVar, 13));
        o block = new o(bVar, 18, url2, ref$ObjectRef);
        Intrinsics.checkNotNullParameter(block, "block");
        authenticationFlowB.H = block;
        return authenticationFlowB;
    }
}
