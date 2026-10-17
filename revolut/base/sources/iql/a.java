package iql;

import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static AuthenticationFlow a(AuthenticationFlowContract$InputData.SignIn input, ryc.a codeChallengeGenerator, UICustomization uiCustomization) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        return new AuthenticationFlow(input, codeChallengeGenerator, uiCustomization);
    }
}
