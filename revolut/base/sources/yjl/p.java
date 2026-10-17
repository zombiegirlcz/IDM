package yjl;

import com.revolut.sso.api.login.RevolutSsoApi$InputData$AccessRecovery;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class p {
    public static final AuthenticationFlowContract$InputData.AccessRecovery a(RevolutSsoApi$InputData$AccessRecovery revolutSsoApi$InputData$AccessRecovery) {
        AuthenticationFlowContract$InputData.AccessRecovery.Origin origin;
        Intrinsics.checkNotNullParameter(revolutSsoApi$InputData$AccessRecovery, "<this>");
        RevolutSsoApi$InputData$AccessRecovery.Origin origin2 = revolutSsoApi$InputData$AccessRecovery.f105844b;
        if (origin2 instanceof RevolutSsoApi$InputData$AccessRecovery.Origin.ForgotPasscode) {
            origin = AuthenticationFlowContract$InputData.AccessRecovery.Origin.ForgotPasscode.f106220a;
        } else {
            if (!(origin2 instanceof RevolutSsoApi$InputData$AccessRecovery.Origin.UnlockAppWithBiometrics)) {
                throw new NoWhenBranchMatchedException();
            }
            origin = AuthenticationFlowContract$InputData.AccessRecovery.Origin.UnlockAppWithBiometrics.f106221a;
        }
        return new AuthenticationFlowContract$InputData.AccessRecovery(revolutSsoApi$InputData$AccessRecovery.f105843a, origin);
    }

    public static final AuthenticationFlowContract$InputData.OperationBoundAuthentication b(RevolutSsoApi$InputData$OperationBoundAuthentication revolutSsoApi$InputData$OperationBoundAuthentication) {
        AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin oneTimeFaceSignIn;
        Intrinsics.checkNotNullParameter(revolutSsoApi$InputData$OperationBoundAuthentication, "<this>");
        cjl.s sVar = revolutSsoApi$InputData$OperationBoundAuthentication.f105853a;
        List list = revolutSsoApi$InputData$OperationBoundAuthentication.f105854b;
        String str = revolutSsoApi$InputData$OperationBoundAuthentication.f105855c;
        String str2 = revolutSsoApi$InputData$OperationBoundAuthentication.e;
        String str3 = revolutSsoApi$InputData$OperationBoundAuthentication.d;
        RevolutSsoApi$InputData$OperationBoundAuthentication.Origin origin = revolutSsoApi$InputData$OperationBoundAuthentication.f;
        if (Intrinsics.f(origin, RevolutSsoApi$InputData$OperationBoundAuthentication.Origin.Default.f105856a)) {
            oneTimeFaceSignIn = AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin.Default.f106229a;
        } else {
            if (!(origin instanceof RevolutSsoApi$InputData$OperationBoundAuthentication.Origin.OneTimeFaceSignIn)) {
                throw new NoWhenBranchMatchedException();
            }
            oneTimeFaceSignIn = new AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin.OneTimeFaceSignIn(((RevolutSsoApi$InputData$OperationBoundAuthentication.Origin.OneTimeFaceSignIn) origin).f105857a);
        }
        return new AuthenticationFlowContract$InputData.OperationBoundAuthentication(sVar, list, str, str3, null, str2, oneTimeFaceSignIn);
    }
}
