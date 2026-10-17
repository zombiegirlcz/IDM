package djl;

import com.revolut.sso.api.login.RevolutSsoApi$InputData$AccessRecovery;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import kotlin.jvm.internal.Intrinsics;
import xil.f;
import xil.h;
import yjl.p;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    /* JADX WARN: Multi-variable type inference failed */
    static AuthenticationFlow a(a aVar, RevolutSsoApi$InputData$AccessRecovery input, yil.a codeChallengeGenerator) {
        UICustomization uiCustomization = new UICustomization(null, 0 == true ? 1 : 0, 31);
        nkl.b bVar = (nkl.b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
        bVar.f216818a.c(new h(0));
        return new AuthenticationFlow(p.a(input), codeChallengeGenerator, uiCustomization);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static AuthenticationFlow b(nkl.b bVar, RevolutSsoApi$InputData$OperationBoundAuthentication input, yil.a codeChallengeGenerator) {
        UICustomization uiCustomization = new UICustomization(null, 0 == true ? 1 : 0, 31);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
        bVar.f216818a.c(new f(0));
        return new AuthenticationFlow(p.b(input), codeChallengeGenerator, uiCustomization);
    }
}
