package com.revolut.sso.impl.ui.signup;

import a5h.g;
import akl.z;
import bjl.p0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.restricted_access.api.FeatureNotAvailableDestination;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpInputData;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.SsoServerError;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step;
import dm0.d;
import gkl.g1;
import gkl.h1;
import gkl.i1;
import gkl.j1;
import gkl.k1;
import ip0.fg0;
import iql.c;
import iql.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vc.o;
import vkm.j2;
import yji.l;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements c {

    @NotNull
    public static final e Companion = new e();
    public final i A;
    public final uil.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iql.a f106768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gu2.e f106769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xjl.h f106770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yil.a f106771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z f106772t;
    public final p0 u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jol.b f106773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RevolutSsoApi$SignUpInputData f106774x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f106775y;
    public final qki.d z;

    public b(uil.a accountsManager, iql.a authenticationFlowFactory, gu2.e captchaViewControllerExtension, xjl.h clientDeeplinkRestoreManager, yil.a codeChallengeGenerator, z configurationRepository, p0 dependenciesProvider, d deviceIdRepository, jol.b dialogsFactory, RevolutSsoApi$SignUpInputData inputData, g signUpRepository) {
        Intrinsics.checkNotNullParameter(accountsManager, "accountsManager");
        Intrinsics.checkNotNullParameter(authenticationFlowFactory, "authenticationFlowFactory");
        Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
        Intrinsics.checkNotNullParameter(clientDeeplinkRestoreManager, "clientDeeplinkRestoreManager");
        Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(deviceIdRepository, "deviceIdRepository");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(signUpRepository, "signUpRepository");
        this.o = accountsManager;
        this.f106768p = authenticationFlowFactory;
        this.f106769q = captchaViewControllerExtension;
        this.f106770r = clientDeeplinkRestoreManager;
        this.f106771s = codeChallengeGenerator;
        this.f106772t = configurationRepository;
        this.u = dependenciesProvider;
        this.v = deviceIdRepository;
        this.f106773w = dialogsFactory;
        this.f106774x = inputData;
        this.f106775y = signUpRepository;
        this.z = hx7.e.b(this, new SignUpFlowContract$State(codeChallengeGenerator.generate(), null));
        this.A = d8l.d.a(this, new in1.a(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.sso.impl.ui.signup.b r10, com.revolut.sso.impl.domain.models.Claim.Email r11, com.revolut.sso.api.models.GoogleEvidence r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof iql.m
            if (r0 == 0) goto L13
            r0 = r13
            iql.m r0 = (iql.m) r0
            int r1 = r0.f167906x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f167906x = r1
            goto L18
        L13:
            iql.m r0 = new iql.m
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f167906x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.revolut.sso.impl.domain.models.Claim$Email r11 = r0.u
            yhm.o.b(r13)
            r5 = r10
            goto L4d
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            yhm.o.b(r13)
            gu2.e r13 = r10.f106769q
            hsd.c r4 = new hsd.c
            r9 = 24
            r7 = 0
            r8 = 0
            r5 = r10
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.u = r11
            r0.f167906x = r3
            java.lang.Object r13 = fkl.c.b(r13, r4, r0)
            if (r13 != r1) goto L4d
            return r1
        L4d:
            gkl.k1 r13 = (gkl.k1) r13
            r5.K2(r13, r11)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.signup.b.I2(com.revolut.sso.impl.ui.signup.b, com.revolut.sso.impl.domain.models.Claim$Email, com.revolut.sso.api.models.GoogleEvidence, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.sso.impl.ui.signup.b r10, com.revolut.sso.impl.domain.models.Claim r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof iql.l
            if (r0 == 0) goto L13
            r0 = r12
            iql.l r0 = (iql.l) r0
            int r1 = r0.f167904x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f167904x = r1
            goto L18
        L13:
            iql.l r0 = new iql.l
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f167904x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.sso.impl.domain.models.Claim r11 = r0.u
            com.revolut.sso.impl.domain.models.Claim r11 = (com.revolut.sso.impl.domain.models.Claim) r11
            yhm.o.b(r12)
            r5 = r10
            goto L53
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            yhm.o.b(r12)
            gu2.e r12 = r10.f106769q
            hsd.c r4 = new hsd.c
            r9 = 23
            r7 = 0
            r8 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r6
            com.revolut.sso.impl.domain.models.Claim r11 = (com.revolut.sso.impl.domain.models.Claim) r11
            r0.u = r11
            r0.f167904x = r3
            java.lang.Object r12 = fkl.c.b(r12, r4, r0)
            if (r12 != r1) goto L52
            return r1
        L52:
            r11 = r6
        L53:
            gkl.k1 r12 = (gkl.k1) r12
            r5.K2(r12, r11)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.signup.b.J2(com.revolut.sso.impl.ui.signup.b, com.revolut.sso.impl.domain.models.Claim, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void K1() {
        this.f106770r.b();
    }

    public final void K2(k1 k1Var, Claim claim) {
        boolean z = k1Var instanceof g1;
        i iVar = this.A;
        if (z) {
            h.t2(this, iVar, new SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired(((g1) k1Var).f144452a), true, null, false, 12);
            return;
        }
        if (k1Var instanceof h1) {
            h1 h1Var = (h1) k1Var;
            Challenge challenge = h1Var.f144453a;
            o.q(this, challenge);
            h.t2(this, iVar, new SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired(claim, challenge, h1Var.f144454b), true, null, false, 12);
            return;
        }
        if (!(k1Var instanceof i1)) {
            if (!(k1Var instanceof j1)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, iVar, SignUpFlowContract$Step$Authentication$SignUpMode$Social.f106765a, true, null, false, 12);
            return;
        }
        SsoServerError ssoServerError = ((i1) k1Var).f144458a;
        if (ssoServerError instanceof SsoServerError.AuthenticationRejected) {
            SsoServerError.AuthenticationRejected authenticationRejected = (SsoServerError.AuthenticationRejected) ssoServerError;
            h.t2(this, iVar, new SignUpFlowContract$Step.AuthRejected(claim, authenticationRejected.f106162a, authenticationRejected.f106163b), true, null, false, 12);
            return;
        }
        if (ssoServerError instanceof SsoServerError.AuthenticationReviewing) {
            throw new IllegalStateException("Unexpected sign-up error", ssoServerError);
        }
        if (ssoServerError instanceof SsoServerError.CaptchaRequired) {
            throw new IllegalStateException("Unsatisfied captcha requirement. The request must be wrapped by withCaptchaRequiredHandling()");
        }
        if ((ssoServerError instanceof SsoServerError.ConfirmationRequired) || (ssoServerError instanceof SsoServerError.EvidenceNotVerifiedYet) || (ssoServerError instanceof SsoServerError.ExternalIdentityVerificationFailed)) {
            throw new IllegalStateException("Unexpected sign-up error", ssoServerError);
        }
        if (ssoServerError instanceof SsoServerError.DeviceIdHardwareIdMismatch) {
            O2(new iql.g(this, null, 0));
            return;
        }
        if (ssoServerError instanceof SsoServerError.Forbidden) {
            O2(new iql.g(this, null, 1));
            return;
        }
        if (ssoServerError instanceof SsoServerError.LoginRejected) {
            h.t2(this, iVar, new SignUpFlowContract$Step.AuthRejected(claim, null, h0.f322473a), true, null, false, 12);
            return;
        }
        if (ssoServerError instanceof SsoServerError.FeatureNotAvailable) {
            C1(new FeatureNotAvailableDestination((TextClause) null, (Clause) null, (TextLocalisedClause) null, (FeatureNotAvailableDestination.Action) null, (FeatureNotAvailableDestination.Action) null, 63));
            return;
        }
        if ((ssoServerError instanceof SsoServerError.AccountIsNotRelatedToUser) || (ssoServerError instanceof SsoServerError.ChallengeNoLongerAvailable) || (ssoServerError instanceof SsoServerError.CodeExpiredOrInvalid) || (ssoServerError instanceof SsoServerError.CountryMismatch) || (ssoServerError instanceof SsoServerError.EmailIsTheSame) || (ssoServerError instanceof SsoServerError.IdentityInUse) || (ssoServerError instanceof SsoServerError.LocationDistance) || (ssoServerError instanceof SsoServerError.LocationRequired) || (ssoServerError instanceof SsoServerError.PasscodeContainsBirthDate) || (ssoServerError instanceof SsoServerError.PasscodeContainsCurrentDate) || (ssoServerError instanceof SsoServerError.PasscodeContainsIndividualCreatedDate) || (ssoServerError instanceof SsoServerError.PasscodeIsNotStrong) || (ssoServerError instanceof SsoServerError.PasscodeIsTheSame) || (ssoServerError instanceof SsoServerError.PasswordInvalid) || (ssoServerError instanceof SsoServerError.PasswordIsTheSame) || (ssoServerError instanceof SsoServerError.PasswordNotStrongEnough) || (ssoServerError instanceof SsoServerError.PasswordTooLong) || (ssoServerError instanceof SsoServerError.PhoneIsTheSame) || (ssoServerError instanceof SsoServerError.PhoneResidencyMismatch) || (ssoServerError instanceof SsoServerError.SsoRequired)) {
            throw new IllegalStateException("Unexpected sign-up error", ssoServerError);
        }
        if ((ssoServerError instanceof SsoServerError.SessionTokenAuthFailed) || (ssoServerError instanceof SsoServerError.SessionTokenExpired) || (ssoServerError instanceof SsoServerError.SessionTokenInvalid)) {
            l.a1(this, X1(((jol.c) this.f106773w).h()), null, null, new iql.g(this, null, 2), 3);
            return;
        }
        if (ssoServerError instanceof SsoServerError.SocialAccountUnlinked) {
            throw new IllegalStateException("Unexpected sign-up error", ssoServerError);
        }
        if (ssoServerError instanceof SsoServerError.TooManyChallenges) {
            SsoServerError.TooManyChallenges tooManyChallenges = (SsoServerError.TooManyChallenges) ssoServerError;
            h.t2(this, iVar, new SignUpFlowContract$Step.AuthRejected(claim, tooManyChallenges.f106198b, tooManyChallenges.f106199c), true, null, false, 12);
        } else {
            if (!(ssoServerError instanceof SsoServerError.Unauthorised)) {
                throw new NoWhenBranchMatchedException();
            }
            O2(new e31.i(2, 29, null));
        }
    }

    public final AuthenticationFlow L2(AuthenticationFlowContract$InputData.SignIn signIn) {
        ryc.a aVar = new ryc.a(((SignUpFlowContract$State) ((j2) this.z.f22677a).getValue()).f106754a, (yil.a) new fg0(this, 29));
        UICustomization uICustomization = new UICustomization(null, null, 31);
        this.f106768p.getClass();
        AuthenticationFlow authenticationFlowA = iql.a.a(signIn, aVar, uICustomization);
        iql.h block = new iql.h(1, 0, b.class, this, "handleSignInResult", "handleSignInResult(Lcom/revolut/sso/api/login/RevolutSsoApi$OutputData$SignIn;)V");
        Intrinsics.checkNotNullParameter(block, "block");
        authenticationFlowA.H = block;
        return authenticationFlowA;
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(com.revolut.sso.impl.domain.models.Claim r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof iql.i
            if (r0 == 0) goto L13
            r0 = r8
            iql.i r0 = (iql.i) r0
            int r1 = r0.f167900x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f167900x = r1
            goto L18
        L13:
            iql.i r0 = new iql.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f167900x
            yki.i r3 = r6.A
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            com.revolut.sso.impl.ui.signup.b r7 = r0.u
            yhm.o.b(r8)
            goto L73
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.revolut.sso.impl.ui.signup.b r7 = r0.u
            yhm.o.b(r8)
            goto L55
        L3c:
            yhm.o.b(r8)
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Email
            r2 = 0
            if (r8 == 0) goto L5e
            iql.j r8 = new iql.j
            r8.<init>(r6, r7, r2)
            r0.u = r6
            r0.f167900x = r5
            java.lang.Object r8 = r6.p2(r0, r8)
            if (r8 != r1) goto L54
            goto L71
        L54:
            r7 = r6
        L55:
            aii.u r8 = (aii.u) r8
            r7.C1(r8)
            oki.h.D2(r3)
            goto L7b
        L5e:
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Phone
            if (r8 == 0) goto L7e
            iql.k r8 = new iql.k
            r8.<init>(r6, r7, r2)
            r0.u = r6
            r0.f167900x = r4
            java.lang.Object r8 = r6.p2(r0, r8)
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            r7 = r6
        L73:
            aii.u r8 = (aii.u) r8
            r7.C1(r8)
            oki.h.D2(r3)
        L7b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L7e:
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.BioPublicKey
            if (r8 != 0) goto La1
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Google
            if (r8 != 0) goto La1
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.IdentityId
            if (r8 != 0) goto La1
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Password
            if (r8 != 0) goto La1
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Pin
            if (r8 != 0) goto La1
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.PublicKey
            if (r8 != 0) goto La1
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.WebAuthn
            if (r8 == 0) goto L9b
            goto La1
        L9b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        La1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            java.lang.String r0 = "Claim of "
            java.lang.String r1 = " type is not supported"
            java.lang.String r7 = a10.b.s(r0, r7, r1)
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.signup.b.M2(com.revolut.sso.impl.domain.models.Claim, gim.c):java.lang.Object");
    }

    public final void N2() {
        H2(this.z, new iql.d(this, 2));
        i iVar = this.A;
        h.r2(iVar);
        h.t2(this, iVar, SignUpFlowContract$Step.StartAccountCreation.f106767a, false, null, false, 12);
    }

    public final void O2(Function2 function2) {
        l.a1(this, X1(((jol.c) this.f106773w).e("DIALOG_ID_GENERIC_ERROR")), null, null, function2, 3);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.z;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.A;
    }
}
