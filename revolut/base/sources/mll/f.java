package mll;

import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowConfiguration;
import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowControllerDescriptor;
import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowOutputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpInputData;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlow;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlowContract$InputData;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step;
import com.revolut.sso.impl.ui.combined_authentication.two_buttons.CombinedAuthenticationTwoButtonsScreen;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreen;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreen;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$InputData;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$Mode;
import com.revolut.sso.impl.ui.signin_sessions_flow.SignInSessionsFlow;
import com.revolut.sso.impl.ui.signup.SignUpFlow;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mhd.p0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207056b;

    public /* synthetic */ f(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, int i) {
        this.f207055a = i;
        this.f207056b = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController authenticationRejectedFlow;
        RevolutSsoApi$DefaultIdentifier revolutSsoApi$DefaultIdentifierR2;
        int i = this.f207055a;
        Continuation continuation = null;
        com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = this.f207056b;
        switch (i) {
            case 0:
                oki.g onResult = (oki.g) obj2;
                UaePassFlowOutputData output = (UaePassFlowOutputData) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof UaePassFlowOutputData.Completed) {
                    List<String> queryParameters = ((f80.b) cVar.E).f(((UaePassFlowOutputData.Completed) output).f77914a).getQueryParameters("challengeId");
                    Intrinsics.checkNotNullExpressionValue(queryParameters, "getQueryParameters(...)");
                    String str = (String) zhm.d0.M0(queryParameters);
                    if (str == null || str.length() <= 0) {
                        str = null;
                    }
                    if (str == null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "Revolut SSO", "UAE PASS terminal URL has no single non-empty challengeId", null, h0Var);
                        com.revolut.sso.impl.ui.combined_authentication.flow.c.d3(cVar);
                    } else {
                        cVar.l2(new p0(cVar, str, continuation, 10), new yi5.b(26));
                    }
                } else if (!(output instanceof UaePassFlowOutputData.Cancelled) && !(output instanceof UaePassFlowOutputData.ApplicationUnavailable)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                UICustomization uICustomization = cVar.D;
                RevolutSsoApi$InputData$CombinedAuthentication revolutSsoApi$InputData$CombinedAuthentication = cVar.f106425p;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                CombinedAuthenticationFlowContract$Step step = (CombinedAuthenticationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CombinedAuthenticationFlowContract$Step.UnifiedAuthentication) {
                    CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen = new CombinedAuthenticationUnifiedScreen(new qll.r(revolutSsoApi$InputData$CombinedAuthentication.f105847a, revolutSsoApi$InputData$CombinedAuthentication.f105848b, uICustomization.e));
                    e block = new e(cVar, 2);
                    Intrinsics.checkNotNullParameter(block, "block");
                    combinedAuthenticationUnifiedScreen.H = block;
                    return combinedAuthenticationUnifiedScreen;
                }
                int i2 = 3;
                if (step instanceof CombinedAuthenticationFlowContract$Step.SingleVideoTwoButtons) {
                    CombinedAuthenticationTwoButtonsScreen combinedAuthenticationTwoButtonsScreen = new CombinedAuthenticationTwoButtonsScreen(new oll.e(revolutSsoApi$InputData$CombinedAuthentication.f105847a, revolutSsoApi$InputData$CombinedAuthentication.f105848b, uICustomization.e));
                    e block2 = new e(cVar, i2);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    combinedAuthenticationTwoButtonsScreen.H = block2;
                    return combinedAuthenticationTwoButtonsScreen;
                }
                if (step instanceof CombinedAuthenticationFlowContract$Step.ExistingAccountsChooser) {
                    SignInSessionsFlow signInSessionsFlow = new SignInSessionsFlow();
                    e block3 = new e(cVar, 4);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    signInSessionsFlow.H = block3;
                    return signInSessionsFlow;
                }
                if (step instanceof CombinedAuthenticationFlowContract$Step.OpenSignUp) {
                    cVar.a3();
                    authenticationRejectedFlow = new SignUpFlow(new RevolutSsoApi$SignUpInputData(cVar.R2(), revolutSsoApi$InputData$CombinedAuthentication.d), new ryc.a(((CombinedAuthenticationFlowContract$State) ((j2) cVar.G.f22677a).getValue()).f106405a, (yil.a) new mlk.b0(cVar, 6)));
                    e block4 = new e(cVar, 6);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    authenticationRejectedFlow.H = block4;
                } else {
                    int i3 = 0;
                    if (step instanceof CombinedAuthenticationFlowContract$Step.OpenSignIn) {
                        RevolutAccountSession revolutAccountSession = ((CombinedAuthenticationFlowContract$Step.OpenSignIn) step).f106418a;
                        cVar.a3();
                        return cVar.X2(new AuthenticationFlowContract$InputData.SignIn(revolutAccountSession, cVar.R2(), new AuthenticationFlowContract$InputData.SignIn.Origin.Default(false, 3)));
                    }
                    if (step instanceof CombinedAuthenticationFlowContract$Step.LostAccount) {
                        RevolutSsoApi$DefaultIdentifier revolutSsoApi$DefaultIdentifier = ((CombinedAuthenticationFlowContract$Step.LostAccount) step).f106417a;
                        cVar.a3();
                        return cVar.X2(new AuthenticationFlowContract$InputData.SignIn(null, revolutSsoApi$DefaultIdentifier, AuthenticationFlowContract$InputData.SignIn.Origin.LostAccess.f106240a));
                    }
                    if (step instanceof CombinedAuthenticationFlowContract$Step.ClaimRequired) {
                        return cVar.Y2(new AuthenticationFlowContract$InputData.SignIn(null, cVar.R2(), new AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.ClaimRequired(revolutSsoApi$InputData$CombinedAuthentication.d, ((CombinedAuthenticationFlowContract$Step.ClaimRequired) step).f106411a)));
                    }
                    if (step instanceof CombinedAuthenticationFlowContract$Step.EvidenceRequired) {
                        CombinedAuthenticationFlowContract$Step.EvidenceRequired evidenceRequired = (CombinedAuthenticationFlowContract$Step.EvidenceRequired) step;
                        Claim claim = evidenceRequired.f106413a;
                        Challenge challenge = evidenceRequired.f106414b;
                        List list = evidenceRequired.f106415c;
                        if (claim instanceof Claim.Phone) {
                            String value = ((Claim.Phone) claim).f106131a;
                            Intrinsics.checkNotNullParameter(value, "value");
                            revolutSsoApi$DefaultIdentifierR2 = new RevolutSsoApi$DefaultIdentifier.Predefined.Phone(value);
                        } else if (claim instanceof Claim.Email) {
                            String value2 = ((Claim.Email) claim).f106127a;
                            Intrinsics.checkNotNullParameter(value2, "value");
                            revolutSsoApi$DefaultIdentifierR2 = new RevolutSsoApi$DefaultIdentifier.Predefined.Email(value2);
                        } else {
                            if ((claim instanceof Claim.BioPublicKey) || (claim instanceof Claim.Google) || (claim instanceof Claim.IdentityId) || (claim instanceof Claim.Password) || (claim instanceof Claim.Pin) || (claim instanceof Claim.PublicKey) || (claim instanceof Claim.WebAuthn)) {
                                throw new IllegalStateException(("Claim " + o0.f186429a.b(claim.getClass()) + " is not supported as identifier").toString());
                            }
                            if (claim != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            revolutSsoApi$DefaultIdentifierR2 = cVar.R2();
                        }
                        return cVar.Y2(new AuthenticationFlowContract$InputData.SignIn(null, revolutSsoApi$DefaultIdentifierR2, new AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.EvidenceRequired(revolutSsoApi$InputData$CombinedAuthentication.d, challenge, list)));
                    }
                    if (!(step instanceof CombinedAuthenticationFlowContract$Step.AuthRejected)) {
                        if (step instanceof CombinedAuthenticationFlowContract$Step.UaePass) {
                            CombinedAuthenticationFlowContract$Step.UaePass uaePass = (CombinedAuthenticationFlowContract$Step.UaePass) step;
                            String str2 = uaePass.f106422a;
                            String str3 = uaePass.f106423b;
                            ViewController viewControllerE1 = cVar.e1(new UaePassFlowControllerDescriptor(new UaePassFlowConfiguration(str2, str3, zhm.u.c(str3))));
                            cVar.a(viewControllerE1, new f(cVar, i3));
                            return viewControllerE1;
                        }
                        if (step instanceof CombinedAuthenticationFlowContract$Step.Social) {
                            cVar.a3();
                            return cVar.Y2(new AuthenticationFlowContract$InputData.SignIn(null, cVar.R2(), new AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.Social(revolutSsoApi$InputData$CombinedAuthentication.d)));
                        }
                        if (!(step instanceof CombinedAuthenticationFlowContract$Step.CollectClaimBeforeChat)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IdentifierInputScreen identifierInputScreen = new IdentifierInputScreen(new IdentifierInputScreenContract$InputData(cVar.R2(), new IdentifierInputScreenContract$Mode.GetIdentifier(false)));
                        e eVar = new e(cVar, 1);
                        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
                        identifierInputScreen.H = eVar;
                        return identifierInputScreen;
                    }
                    CombinedAuthenticationFlowContract$Step.AuthRejected authRejected = (CombinedAuthenticationFlowContract$Step.AuthRejected) step;
                    Claim claim2 = authRejected.f106408a;
                    authenticationRejectedFlow = new AuthenticationRejectedFlow(new AuthenticationRejectedFlowContract$InputData(authRejected.f106409b, authRejected.f106410c));
                    mk5.s block5 = new mk5.s(cVar, claim2, 8);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    authenticationRejectedFlow.H = block5;
                }
                return authenticationRejectedFlow;
        }
    }
}
