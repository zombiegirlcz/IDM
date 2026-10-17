package com.revolut.sso.impl.ui.auth;

import akl.o0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.browser.auth.AuthTabIntent;
import androidx.browser.customtabs.CustomTabsClient;
import bjl.a0;
import bjl.g0;
import bjl.i0;
import bjl.p0;
import bjl.r;
import bjl.u;
import com.google.firebase.messaging.t;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.captcha.api.models.CaptchaError;
import com.revolut.feature.restricted_access.api.FeatureNotAvailableDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlow;
import com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlowContract$InputData;
import com.revolut.otp.input.flow.common.OtpInvalidException;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.login.RevolutSsoApi$Toggles;
import com.revolut.sso.api.models.BankIdEvidence;
import com.revolut.sso.api.models.DAPEvidence;
import com.revolut.sso.api.models.DocumentEvidence;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.FaceEvidence;
import com.revolut.sso.api.models.FaceOtpEvidence;
import com.revolut.sso.api.models.GoogleEvidence;
import com.revolut.sso.api.models.PasswordEvidence;
import com.revolut.sso.api.models.PinEvidence;
import com.revolut.sso.api.models.QrDelegatedEvidence;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.api.models.SimBindingEvidence;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.api.models.UserInfo;
import com.revolut.sso.api.models.WebAuthnEvidence;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.AuthLocation;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.InitialAuthenticationCredential;
import com.revolut.sso.impl.domain.models.SsoServerError;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge;
import fmb.a1;
import gkl.e0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import jkl.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import mp.p;
import nii.y0;
import nii.z;
import nyb.q;
import okl.b0;
import okl.f1;
import okl.g1;
import okl.l0;
import okl.l1;
import okl.m0;
import okl.n1;
import okl.v;
import okl.v0;
import okl.w;
import okl.x;
import okl.x0;
import okl.z0;
import org.jetbrains.annotations.NotNull;
import rl0.b;
import skm.a2;
import tll.s;
import vkm.j2;
import vkm.q0;
import vkm.z1;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends oki.h implements okl.b {

    @NotNull
    public static final okl.n Companion = new okl.n();
    public final fkg.a A;
    public final pml.d B;
    public final dm0.d C;
    public final jol.b D;
    public final a E;
    public final AuthenticationFlowContract$InputData F;
    public final inl.b G;
    public final pnl.d H;
    public final tnl.e I;
    public final lkl.a J;
    public final mni.a K;
    public final tll.n L;
    public final col.c M;
    public final vnl.l N;
    public final knl.d O;
    public final nkl.a P;
    public final v60.g Q;
    public final uil.a R;
    public final p0 S;
    public final zpl.a T;
    public final t U;
    public final a61.a V;
    public final b5l.a W;
    public final s X;
    public final kql.f Y;
    public final fkl.i Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ynl.c f106368a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final iol.c f106369b0;
    public final UICustomization c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final f80.a f106370d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final rqk.m f106371e0;
    public final o0 f0;
    public final kol.b g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final AtomicBoolean f106372h0;
    public String i0;
    public final tll.t j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public a2 f106373k0;
    public final yki.i l0;
    public final qki.d m0;
    public final qkl.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n1 f106374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f106375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vkl.d f106376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bs.a f106377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xkl.i f106378t;
    public final zkl.a u;
    public final gu2.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wll.c f106379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xjl.h f106380x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yil.a f106381y;
    public final mki.b z;

    public n(qkl.h authenticationFlowRoutingControllerModelExtension, n1 authenticationInteractor, p bankIdIntentHandler, vkl.d bankIdIdentificationControllerModelExtension, bs.a biometricVerificationFlowProvider, xkl.i bioSignatureExtension, zkl.a bypassChallengeControllerModelExtension, gu2.e captchaViewControllerExtension, wll.c claimSubmissionStrategy, xjl.h clientDeeplinkRestoreManager, yil.a codeChallengeGenerator, mki.b controllerEnvironment, fkg.a dapIntentHandler, pml.d dapIdentificationControllerModelExtension, dm0.d deviceIdRepository, jol.b dialogsFactory, a initialStepAndStateCalculator, AuthenticationFlowContract$InputData inputData, inl.b lateIdentificationControllerModelExtension, pnl.d merchantPermissionsControllerModelExtension, tnl.e oktaIdentityVerificationControllerModelExtension, lkl.a operationStateParser, mni.a otpDispatcher, tll.n parentStateDispatcher, col.c passkeysControllerModelExtension, vnl.l pushOtpControllerModelExtension, knl.d requestLocationControllerModelExtension, nkl.a resendTimeProvider, v60.g restrictedAccessRepository, uil.a revolutAccountsManager, p0 revolutSsoDependenciesProvider, zpl.a signatureControllerModelExtension, t signOutRepository, a61.a silentAuthRepository, b5l.a simBindingScreenFactory, s simBindingParentStateReceiver, kql.f simBindingControllerModelExtension, fkl.i ssoDeeplinkResultReceiver, ynl.c ssoServerErrorPasscodeRelatedToDialogMapper, iol.c ssoServerErrorPasswordRelatedToDialogMapper, UICustomization uiCustomization, f80.a uriHelper, rqk.m userInfoFromAppProvider, o0 userInfoRepository, kol.b welcomeMessageFactory) {
        Intrinsics.checkNotNullParameter(authenticationFlowRoutingControllerModelExtension, "authenticationFlowRoutingControllerModelExtension");
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        Intrinsics.checkNotNullParameter(bankIdIntentHandler, "bankIdIntentHandler");
        Intrinsics.checkNotNullParameter(bankIdIdentificationControllerModelExtension, "bankIdIdentificationControllerModelExtension");
        Intrinsics.checkNotNullParameter(biometricVerificationFlowProvider, "biometricVerificationFlowProvider");
        Intrinsics.checkNotNullParameter(bioSignatureExtension, "bioSignatureExtension");
        Intrinsics.checkNotNullParameter(bypassChallengeControllerModelExtension, "bypassChallengeControllerModelExtension");
        Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
        Intrinsics.checkNotNullParameter(claimSubmissionStrategy, "claimSubmissionStrategy");
        Intrinsics.checkNotNullParameter(clientDeeplinkRestoreManager, "clientDeeplinkRestoreManager");
        Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
        Intrinsics.checkNotNullParameter(controllerEnvironment, "controllerEnvironment");
        Intrinsics.checkNotNullParameter(dapIntentHandler, "dapIntentHandler");
        Intrinsics.checkNotNullParameter(dapIdentificationControllerModelExtension, "dapIdentificationControllerModelExtension");
        Intrinsics.checkNotNullParameter(deviceIdRepository, "deviceIdRepository");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(initialStepAndStateCalculator, "initialStepAndStateCalculator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(lateIdentificationControllerModelExtension, "lateIdentificationControllerModelExtension");
        Intrinsics.checkNotNullParameter(merchantPermissionsControllerModelExtension, "merchantPermissionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(oktaIdentityVerificationControllerModelExtension, "oktaIdentityVerificationControllerModelExtension");
        Intrinsics.checkNotNullParameter(operationStateParser, "operationStateParser");
        Intrinsics.checkNotNullParameter(otpDispatcher, "otpDispatcher");
        Intrinsics.checkNotNullParameter(parentStateDispatcher, "parentStateDispatcher");
        Intrinsics.checkNotNullParameter(passkeysControllerModelExtension, "passkeysControllerModelExtension");
        Intrinsics.checkNotNullParameter(pushOtpControllerModelExtension, "pushOtpControllerModelExtension");
        Intrinsics.checkNotNullParameter(requestLocationControllerModelExtension, "requestLocationControllerModelExtension");
        Intrinsics.checkNotNullParameter(resendTimeProvider, "resendTimeProvider");
        Intrinsics.checkNotNullParameter(restrictedAccessRepository, "restrictedAccessRepository");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(signatureControllerModelExtension, "signatureControllerModelExtension");
        Intrinsics.checkNotNullParameter(signOutRepository, "signOutRepository");
        Intrinsics.checkNotNullParameter(silentAuthRepository, "silentAuthRepository");
        Intrinsics.checkNotNullParameter(simBindingScreenFactory, "simBindingScreenFactory");
        Intrinsics.checkNotNullParameter(simBindingParentStateReceiver, "simBindingParentStateReceiver");
        Intrinsics.checkNotNullParameter(simBindingControllerModelExtension, "simBindingControllerModelExtension");
        Intrinsics.checkNotNullParameter(ssoDeeplinkResultReceiver, "ssoDeeplinkResultReceiver");
        Intrinsics.checkNotNullParameter(ssoServerErrorPasscodeRelatedToDialogMapper, "ssoServerErrorPasscodeRelatedToDialogMapper");
        Intrinsics.checkNotNullParameter(ssoServerErrorPasswordRelatedToDialogMapper, "ssoServerErrorPasswordRelatedToDialogMapper");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(userInfoFromAppProvider, "userInfoFromAppProvider");
        Intrinsics.checkNotNullParameter(userInfoRepository, "userInfoRepository");
        Intrinsics.checkNotNullParameter(welcomeMessageFactory, "welcomeMessageFactory");
        this.o = authenticationFlowRoutingControllerModelExtension;
        this.f106374p = authenticationInteractor;
        this.f106375q = bankIdIntentHandler;
        this.f106376r = bankIdIdentificationControllerModelExtension;
        this.f106377s = biometricVerificationFlowProvider;
        this.f106378t = bioSignatureExtension;
        this.u = bypassChallengeControllerModelExtension;
        this.v = captchaViewControllerExtension;
        this.f106379w = claimSubmissionStrategy;
        this.f106380x = clientDeeplinkRestoreManager;
        this.f106381y = codeChallengeGenerator;
        this.z = controllerEnvironment;
        this.A = dapIntentHandler;
        this.B = dapIdentificationControllerModelExtension;
        this.C = deviceIdRepository;
        this.D = dialogsFactory;
        this.E = initialStepAndStateCalculator;
        this.F = inputData;
        this.G = lateIdentificationControllerModelExtension;
        this.H = merchantPermissionsControllerModelExtension;
        this.I = oktaIdentityVerificationControllerModelExtension;
        this.J = operationStateParser;
        this.K = otpDispatcher;
        this.L = parentStateDispatcher;
        this.M = passkeysControllerModelExtension;
        this.N = pushOtpControllerModelExtension;
        this.O = requestLocationControllerModelExtension;
        this.P = resendTimeProvider;
        this.Q = restrictedAccessRepository;
        this.R = revolutAccountsManager;
        this.S = revolutSsoDependenciesProvider;
        this.T = signatureControllerModelExtension;
        this.U = signOutRepository;
        this.V = silentAuthRepository;
        this.W = simBindingScreenFactory;
        this.X = simBindingParentStateReceiver;
        this.Y = simBindingControllerModelExtension;
        this.Z = ssoDeeplinkResultReceiver;
        this.f106368a0 = ssoServerErrorPasscodeRelatedToDialogMapper;
        this.f106369b0 = ssoServerErrorPasswordRelatedToDialogMapper;
        this.c0 = uiCustomization;
        this.f106370d0 = uriHelper;
        this.f106371e0 = userInfoFromAppProvider;
        this.f0 = userInfoRepository;
        this.g0 = welcomeMessageFactory;
        this.f106372h0 = new AtomicBoolean(false);
        this.i0 = codeChallengeGenerator.generate();
        this.j0 = new tll.t();
        this.l0 = d8l.d.a(this, new okl.i(this, 1));
        this.m0 = hx7.e.b(this, initialStepAndStateCalculator.a(this.i0));
    }

    public static void B3(n nVar, Evidence evidence) {
        nVar.j0.a(new ok7.b(13), new okl.k(nVar, evidence, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.sso.impl.ui.auth.n r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof okl.y
            if (r0 == 0) goto L13
            r0 = r6
            okl.y r0 = (okl.y) r0
            int r1 = r0.f226250w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226250w = r1
            goto L18
        L13:
            okl.y r0 = new okl.y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226250w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r6)
            com.revolut.feature.identity.auth.domain.model.IndividualIdentityId r6 = (com.revolut.feature.identity.auth.domain.model.IndividualIdentityId) r6
            if (r6 == 0) goto L56
            java.lang.String r3 = r6.f74763a
            goto L56
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            yhm.o.b(r6)
            qki.d r6 = r5.m0
            java.lang.Object r6 = r6.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State r6 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State) r6
            boolean r2 = r6 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.AccessRecovery
            if (r2 == 0) goto L59
            bjl.p0 r5 = r5.S
            r0.f226250w = r4
            rqk.k r5 = (rqk.k) r5
            java.lang.Object r3 = r5.a(r0)
            if (r3 != r1) goto L56
            return r1
        L56:
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L59:
            boolean r5 = r6 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.ExternalClientAuthentication
            if (r5 != 0) goto L70
            boolean r5 = r6 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication
            if (r5 != 0) goto L70
            boolean r5 = r6 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.OperationBoundAuthentication
            if (r5 != 0) goto L70
            boolean r5 = r6 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.SignIn
            if (r5 == 0) goto L6a
            goto L70
        L6a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.n.I2(com.revolut.sso.impl.ui.auth.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r10 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.sso.impl.ui.auth.n r9, gim.c r10) {
        /*
            uil.a r0 = r9.R
            boolean r1 = r10 instanceof okl.z
            if (r1 == 0) goto L15
            r1 = r10
            okl.z r1 = (okl.z) r1
            int r2 = r1.f226255x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f226255x = r2
            goto L1a
        L15:
            okl.z r1 = new okl.z
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f226255x
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2d
            yhm.o.b(r10)
            goto L98
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State$ExternalClientAuthentication r9 = r1.u
            yhm.o.b(r10)
            goto L5f
        L3b:
            yhm.o.b(r10)
            qki.d r9 = r9.m0
            java.lang.Object r9 = r9.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State r9 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State) r9
            boolean r10 = r9 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.ExternalClientAuthentication
            if (r10 == 0) goto La5
            r10 = r9
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State$ExternalClientAuthentication r10 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.ExternalClientAuthentication) r10
            r1.u = r10
            r1.f226255x = r5
            r10 = r0
            pjl.z0 r10 = (pjl.z0) r10
            java.lang.Object r10 = r10.h(r1)
            if (r10 != r2) goto L5f
            goto L97
        L5f:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L65:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L86
            java.lang.Object r3 = r10.next()
            r5 = r3
            com.revolut.sso.api.accounts.RevolutAccount r5 = (com.revolut.sso.api.accounts.RevolutAccount) r5
            r7 = r9
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State$ExternalClientAuthentication r7 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.ExternalClientAuthentication) r7
            com.revolut.sso.impl.domain.models.InitialAuthenticationCredential r7 = r7.f106262b
            boolean r8 = r7 instanceof com.revolut.sso.impl.domain.models.InitialAuthenticationCredential.Account
            if (r8 == 0) goto L65
            com.revolut.sso.impl.domain.models.InitialAuthenticationCredential$Account r7 = (com.revolut.sso.impl.domain.models.InitialAuthenticationCredential.Account) r7
            com.revolut.sso.api.accounts.RevolutAccount r7 = r7.f106153a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            if (r5 == 0) goto L65
            goto L87
        L86:
            r3 = r6
        L87:
            com.revolut.sso.api.accounts.RevolutAccount r3 = (com.revolut.sso.api.accounts.RevolutAccount) r3
            if (r3 == 0) goto Lbc
            r1.u = r6
            r1.f226255x = r4
            pjl.z0 r0 = (pjl.z0) r0
            java.lang.Object r10 = r0.l(r3, r1)
            if (r10 != r2) goto L98
        L97:
            return r2
        L98:
            com.revolut.sso.api.models.UserInfo r10 = (com.revolut.sso.api.models.UserInfo) r10
            if (r10 == 0) goto Lbc
            java.util.UUID r9 = r10.f105990a
            if (r9 == 0) goto Lbc
            java.lang.String r9 = r9.toString()
            return r9
        La5:
            boolean r10 = r9 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication
            if (r10 != 0) goto Lbc
            boolean r10 = r9 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.AccessRecovery
            if (r10 != 0) goto Lbc
            boolean r10 = r9 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.OperationBoundAuthentication
            if (r10 != 0) goto Lbc
            boolean r9 = r9 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.SignIn
            if (r9 == 0) goto Lb6
            goto Lbc
        Lb6:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.n.J2(com.revolut.sso.impl.ui.auth.n, gim.c):java.lang.Object");
    }

    public static final void K2(n nVar, e0 e0Var) {
        Challenge challenge = e0Var.f144443a;
        jkl.i iVar = challenge.f106098a;
        int i = okl.o.f226224b[iVar.ordinal()];
        if (i != 16 && i != 23 && i != 19 && i != 20) {
            nVar.q3(challenge, f0.f322471a);
            return;
        }
        if (yjl.d.c(iVar)) {
            nVar.l3(challenge);
        }
        nVar.D3(zi0.c.P(e0Var, false, null, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r10.p3(r11, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.sso.impl.ui.auth.n r10, com.revolut.sso.impl.domain.models.Claim r11, gkl.m r12, com.revolut.sso.api.models.Evidence r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.n.L2(com.revolut.sso.impl.ui.auth.n, com.revolut.sso.impl.domain.models.Claim, gkl.m, com.revolut.sso.api.models.Evidence, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r5.b3((java.util.List) r7, r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.sso.impl.ui.auth.n r5, jkl.i r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof okl.e1
            if (r0 == 0) goto L13
            r0 = r7
            okl.e1 r0 = (okl.e1) r0
            int r1 = r0.f226172w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226172w = r1
            goto L18
        L13:
            okl.e1 r0 = new okl.e1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226172w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            goto L46
        L36:
            yhm.o.b(r7)
            java.util.Set r6 = zhm.y0.b(r6)
            r0.f226172w = r4
            java.lang.Object r7 = r5.W2(r6, r0)
            if (r7 != r1) goto L46
            goto L58
        L46:
            java.util.List r7 = (java.util.List) r7
            nyd.j r6 = new nyd.j
            r2 = 21
            r4 = 0
            r6.<init>(r5, r4, r2)
            r0.f226172w = r3
            java.lang.Object r5 = r5.b3(r7, r6, r0)
            if (r5 != r1) goto L59
        L58:
            return r1
        L59:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.n.M2(com.revolut.sso.impl.ui.auth.n, jkl.i, gim.c):java.lang.Object");
    }

    public static /* synthetic */ Object Q2(n nVar, Claim claim, Evidence evidence, Set set, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            claim = null;
        }
        if ((i & 2) != 0) {
            evidence = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return nVar.P2(claim, evidence, set, continuation);
    }

    public static /* synthetic */ Object U2(n nVar, jkl.i iVar, String str, gim.i iVar2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return nVar.T2(iVar, str, (i & 4) == 0, iVar2);
    }

    public static final void f3(n nVar, AuthResult.Success success) {
        AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) ((j2) nVar.m0.f22677a).getValue();
        if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication)) {
            if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn)) {
                throw new NoWhenBranchMatchedException();
            }
            j3(nVar, new AuthenticationFlowContract$Step.PostAuthentication(success));
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", authenticationFlowContract$State.getClass().getName().concat(" state is not expected"), null, h0Var);
            nVar.X1(((col.i) nVar.M).c3());
        }
    }

    public static /* synthetic */ void j3(n nVar, AuthenticationFlowContract$Step authenticationFlowContract$Step) {
        nVar.i3(authenticationFlowContract$Step, TransitionAnimation.SLIDE_END_TO_START.f98395a);
    }

    public static String w3(AuthenticationFlowContract$State authenticationFlowContract$State) {
        Object next;
        Object next2;
        Parcelable pinEvidence;
        Iterator it8 = authenticationFlowContract$State.getI().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof PinEvidence) {
                break;
            }
        }
        PinEvidence pinEvidence2 = (PinEvidence) next;
        String str = pinEvidence2 != null ? pinEvidence2.f105968a : null;
        if (str != null) {
            pinEvidence = new PinEvidence(str);
        } else {
            Iterator it9 = authenticationFlowContract$State.getI().iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                if (next2 instanceof PasswordEvidence) {
                    break;
                }
            }
            pinEvidence = (Evidence) next2;
        }
        if (pinEvidence instanceof PasswordEvidence) {
            return ((PasswordEvidence) pinEvidence).f105961a;
        }
        if (pinEvidence instanceof PinEvidence) {
            return ((PinEvidence) pinEvidence).f105968a;
        }
        return null;
    }

    public static rl0.b x3(AuthenticationFlowContract$State authenticationFlowContract$State) {
        Object next;
        Iterator it8 = authenticationFlowContract$State.getI().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof WebAuthnEvidence) {
                break;
            }
        }
        if (next != null) {
            return b.a.f254907a;
        }
        String strW3 = w3(authenticationFlowContract$State);
        if (strW3 != null) {
            return new rl0.a(strW3);
        }
        return null;
    }

    public final void A3() {
        if (this.f106372h0.getAndSet(true)) {
            return;
        }
        n1 n1Var = this.f106374p;
        Continuation continuation = null;
        yji.l.a1(this, ((akl.h) n1Var.f226220a).f6023h, null, null, new m0(this, continuation, 2), 3);
        z1 z1Var = n1Var.e;
        yji.l.a1(this, new l1(new q0(z1Var, new of6.d(z1Var, this.v, (Continuation) null, this), 1), 0), null, null, new w(this, continuation, 10), 3);
        l2(new v(this, continuation, 11), new yi5.b(26));
    }

    public final void C3(Data data) {
        if (((AuthResult) data.component1()) instanceof AuthResult.ErrorResult) {
            data = new Data(null, new OtpInvalidException(), false, 5, null);
        }
        this.K.b(data);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D3(com.revolut.data.model.Data r6) {
        /*
            r5 = this;
            boolean r0 = r6.getLoading()
            java.lang.Object r1 = r6.getContent()
            gkl.h0 r1 = (gkl.h0) r1
            r2 = 0
            if (r1 == 0) goto L2b
            boolean r3 = r1 instanceof gkl.e0
            if (r3 == 0) goto L2b
            gkl.e0 r1 = (gkl.e0) r1
            com.revolut.sso.impl.domain.models.Challenge r1 = r1.f144443a
            jkl.i r3 = r1.f106098a
            mni.b r3 = yjl.d.e(r3)
            if (r3 != 0) goto L1e
            goto L2b
        L1e:
            mni.c r2 = new mni.c
            java.lang.String r4 = r1.e
            java.lang.String r1 = r1.d
            if (r1 != 0) goto L28
            java.lang.String r1 = ""
        L28:
            r2.<init>(r4, r1, r3)
        L2b:
            java.lang.Object r1 = r6.getContent()
            gkl.h0 r1 = (gkl.h0) r1
            if (r1 == 0) goto L43
            boolean r1 = r1 instanceof gkl.e0
            if (r1 == 0) goto L3c
            java.lang.Throwable r1 = r6.getError()
            goto L41
        L3c:
            com.revolut.otp.input.flow.common.OtpRetryFailedException r1 = new com.revolut.otp.input.flow.common.OtpRetryFailedException
            r1.<init>()
        L41:
            if (r1 != 0) goto L47
        L43:
            java.lang.Throwable r1 = r6.getError()
        L47:
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data
            r6.<init>(r2, r1, r0)
            mni.a r0 = r5.K
            r0.getClass()
            java.lang.String r1 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            vkm.z1 r0 = r0.f207510b
            r0.k(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.n.D3(com.revolut.data.model.Data):void");
    }

    public final void E3(Challenge challenge) {
        Evidence faceEvidence;
        jkl.i iVar = challenge.f106098a;
        String str = challenge.f106100c;
        int i = okl.o.f226224b[iVar.ordinal()];
        if (i != 8) {
            if (i != 9) {
                if (i != 11) {
                    throw new IllegalStateException("Expected biometric verification challenge but was method=" + challenge.f106098a + ", state=" + challenge.f106099b + ", id=" + str);
                }
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                faceEvidence = new DocumentEvidence(str);
            } else {
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                faceEvidence = new FaceOtpEvidence(str);
            }
        } else {
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            faceEvidence = new FaceEvidence(str);
        }
        h3(faceEvidence);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.Z.f135870a, null, null, new okl.s(this, null, 7), 3);
        A3();
    }

    @Override // yji.l
    public final void K1() {
        ((akl.h) this.f106374p.f226220a).clear();
        this.f106380x.b();
        this.f106372h0.set(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    @Override // yki.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0() {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.n.M0():void");
    }

    public final void N2(Evidence evidence) {
        qki.d dVar = this.m0;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        List listF2 = ((AuthenticationFlowContract$State) j2Var.getValue()).getI();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listF2) {
            Evidence evidence2 = (Evidence) obj2;
            if (evidence2.getClass() != evidence.getClass() && ((!(evidence instanceof PinEvidence) && !(evidence instanceof PasswordEvidence)) || (!(evidence2 instanceof PinEvidence) && !(evidence2 instanceof PasswordEvidence)))) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayListF0 = d0.F0(evidence, arrayList);
        if (j2Var2.getValue() instanceof AuthenticationFlowContract$State) {
            H2(dVar, new q(this, arrayListF0, 3));
            return;
        }
        AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) this.l0.d();
        String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
    }

    public final y0 O2(y0 y0Var) {
        return e3() ? y0.a(y0Var, null, true, 3) : y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P2(com.revolut.sso.impl.domain.models.Claim r12, com.revolut.sso.api.models.Evidence r13, java.util.Set r14, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof okl.p
            if (r0 == 0) goto L13
            r0 = r15
            okl.p r0 = (okl.p) r0
            int r1 = r0.f226228w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226228w = r1
            goto L18
        L13:
            okl.p r0 = new okl.p
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226228w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r15)
            r6 = r11
            goto L54
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            yhm.o.b(r15)
            tll.n r15 = r11.L
            tll.j r2 = tll.j.f272114a
            r15.a(r2)
            if (r13 == 0) goto L3f
            r11.N2(r13)
        L3f:
            jld.h r4 = new jld.h
            r10 = 0
            r5 = 19
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f226228w = r3
            java.lang.Object r15 = r11.p2(r0, r4)
            if (r15 != r1) goto L54
            return r1
        L54:
            r1 = r15
            com.revolut.sso.impl.domain.models.AuthResult r1 = (com.revolut.sso.impl.domain.models.AuthResult) r1
            qki.d r12 = r6.m0
            java.lang.Object r12 = r12.f22677a
            vkm.j2 r12 = (vkm.j2) r12
            java.lang.Object r12 = r12.getValue()
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State r12 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State) r12
            com.revolut.sso.impl.domain.models.Challenge r12 = r12.getF106299h()
            r13 = 0
            if (r12 == 0) goto L71
            jkl.i r12 = r12.f106098a
            mni.b r12 = yjl.d.e(r12)
            goto L72
        L71:
            r12 = r13
        L72:
            if (r12 == 0) goto L80
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r11.C3(r0)
        L80:
            ox0.v r12 = ox0.w.Companion
            r12.getClass()
            nq0.a$a r12 = nq0.a.Companion
            r12.getClass()
            ix0.g1.f169238b = r13
            r12 = 0
            r11.d0(r12, r12)
            tll.m r12 = r11.m3(r1)
            tll.n r13 = r6.L
            r13.a(r12)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.n.P2(com.revolut.sso.impl.domain.models.Claim, com.revolut.sso.api.models.Evidence, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final AuthAction R2(String str) {
        AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin origin;
        AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) ((j2) this.m0.f22677a).getValue();
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) {
            AuthenticationFlowContract$State.AccessRecovery accessRecovery = (AuthenticationFlowContract$State.AccessRecovery) authenticationFlowContract$State;
            return new AuthAction.AccessRecovery(accessRecovery.f106252a, accessRecovery.f106253b, accessRecovery.f, accessRecovery.f106256h, accessRecovery.i, accessRecovery.f106254c, accessRecovery.k, accessRecovery.f106258l, str);
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn) {
            AuthenticationFlowContract$State.SignIn signIn = (AuthenticationFlowContract$State.SignIn) authenticationFlowContract$State;
            return new AuthAction.SignIn(signIn.f106284a, signIn.f106285b, signIn.i, signIn.k, signIn.f106290l, signIn.f106286c, signIn.f106292n, signIn.o, str, signIn.f106291m, signIn.d, signIn.e, signIn.f, signIn.f106293p);
        }
        if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication)) {
            if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
                AuthenticationFlowContract$State.ExternalClientAuthentication externalClientAuthentication = (AuthenticationFlowContract$State.ExternalClientAuthentication) authenticationFlowContract$State;
                return new AuthAction.AuthoriseExternalClient(externalClientAuthentication.f106261a, externalClientAuthentication.f106262b, externalClientAuthentication.f106263c, externalClientAuthentication.d, externalClientAuthentication.e, externalClientAuthentication.f106265h, externalClientAuthentication.f106266j, externalClientAuthentication.k, str);
            }
            if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication)) {
                throw new NoWhenBranchMatchedException();
            }
            AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication signInWithRevolutIdAuthentication = (AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) authenticationFlowContract$State;
            return new AuthAction.SignInWithRevolutId(signInWithRevolutIdAuthentication.f106295a, signInWithRevolutIdAuthentication.f106296b, signInWithRevolutIdAuthentication.f106297c, signInWithRevolutIdAuthentication.d, signInWithRevolutIdAuthentication.f, signInWithRevolutIdAuthentication.e, signInWithRevolutIdAuthentication.i, signInWithRevolutIdAuthentication.k, signInWithRevolutIdAuthentication.f106301l, str);
        }
        AuthenticationFlowContract$State.OperationBoundAuthentication operationBoundAuthentication = (AuthenticationFlowContract$State.OperationBoundAuthentication) authenticationFlowContract$State;
        cjl.s sVar = operationBoundAuthentication.f106273c;
        String str2 = operationBoundAuthentication.f106271a;
        InitialAuthenticationCredential initialAuthenticationCredential = operationBoundAuthentication.f106272b;
        List list = operationBoundAuthentication.d;
        String str3 = operationBoundAuthentication.e;
        List list2 = operationBoundAuthentication.f106277l;
        Set set = operationBoundAuthentication.f106279n;
        Set set2 = operationBoundAuthentication.o;
        String str4 = operationBoundAuthentication.i;
        String str5 = operationBoundAuthentication.f;
        String str6 = operationBoundAuthentication.f106274g;
        AuthLocation authLocation = operationBoundAuthentication.f106282r;
        boolean z = operationBoundAuthentication.f106283s;
        AuthenticationFlowContract$InputData authenticationFlowContract$InputData = this.F;
        AuthenticationFlowContract$InputData.OperationBoundAuthentication operationBoundAuthentication2 = authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication ? (AuthenticationFlowContract$InputData.OperationBoundAuthentication) authenticationFlowContract$InputData : null;
        if (operationBoundAuthentication2 == null || (origin = operationBoundAuthentication2.f106228g) == null) {
            origin = AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin.Default.f106229a;
        }
        return new AuthAction.OperationBoundAuthentication(sVar, str2, initialAuthenticationCredential, list, str3, list2, set, set2, str, str4, str5, str6, authLocation, z, origin);
    }

    public final Object S2(boolean z, jkl.i iVar, Function2 function2, gim.i iVar2) {
        mh1.d dVar = new mh1.d(this, iVar, function2, (Continuation) null);
        Object objP2 = z ? p2(iVar2, new boe.k(18, null, dVar)) : dVar.invoke(iVar2);
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Evidence evidence = (Evidence) d0.o0(((AuthenticationFlowContract$State) ((j2) this.m0.f22677a).getValue()).getI());
        ((kql.h) this.Y).Z2(new ok7.b(12));
        Job job2 = this.j0.f272120a;
        if (job2 == null || !job2.isCancelled()) {
            return;
        }
        Continuation continuation = null;
        if (evidence == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Can't restart long polling because there is no latest evidence in state", null, h0Var);
        } else if (evidence instanceof SimBindingEvidence) {
            yji.l.b1(this, X1(((jol.c) this.D).i()), null, new w(this, continuation, 7), 3);
        } else {
            B3(this, evidence);
        }
    }

    public final Object T2(jkl.i iVar, String str, boolean z, gim.i iVar2) {
        if (z) {
            d0(true, false);
        }
        qki.d dVar = this.m0;
        if (((j2) dVar.f22677a).getValue() instanceof AuthenticationFlowContract$State) {
            H2(dVar, new x(this, iVar, 1));
            Object objB = this.f106374p.b(R2(str), iVar, iVar2);
            return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
        }
        AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) this.l0.d();
        String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        throw new IllegalStateException(m72.b.q(okl.m.p((j2) dVar.f22677a, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
    }

    public final void V2(ArrayList arrayList, UserInfo userInfo, Function0 function0) {
        String value;
        UUID uuid;
        if (!arrayList.contains(gkl.m.PUBLIC_KEY)) {
            function0.invoke();
            return;
        }
        qki.d dVar = this.m0;
        String clientId = o.a((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue(), this.S);
        String codeChallenge = ((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getF106295a();
        if (userInfo == null || (uuid = userInfo.f105990a) == null || (value = uuid.toString()) == null) {
            value = null;
        } else {
            Intrinsics.checkNotNullParameter(value, "value");
        }
        String str = value;
        a3l.b onComplete = new a3l.b(9, function0);
        zpl.g gVar = (zpl.g) this.T;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        gVar.T2(new xkl.e(gVar, str, clientId, codeChallenge, onComplete, (Continuation) null, 11), new yi5.b(27));
    }

    public final Object W2(Set set, gim.c cVar) {
        qki.d dVar = this.m0;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        if (!(j2Var.getValue() instanceof AuthenticationFlowContract$State)) {
            AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) this.l0.d();
            String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
            kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
            throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
        }
        H2(dVar, new a9j.n(this, 13, this, set));
        AuthAction authActionR2 = R2(null);
        Set setR6 = ((AuthenticationFlowContract$State) j2Var2.getValue()).getK();
        Set setO4 = ((AuthenticationFlowContract$State) j2Var2.getValue()).getF106301l();
        akl.h hVar = (akl.h) this.f106374p.f226220a;
        hVar.getClass();
        skm.p0 p0Var2 = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new a1a.c(9, hVar, authActionR2, setR6, setO4, (Continuation) null), cVar);
    }

    public final Object X2(boolean z, Set set, Function2 function2, gim.i iVar) {
        a1 a1Var = new a1(this, set, z, function2, (Continuation) null);
        Object objP2 = z ? p2(iVar, new boe.k(18, null, a1Var)) : a1Var.invoke(iVar);
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    public final a2 Z2(Set set) {
        return n2(new b0(this, set, null, 0), new whi.b(6));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlow a3(com.revolut.sso.impl.domain.models.Challenge r11, lni.b r12, java.util.ArrayList r13) {
        /*
            r10 = this;
            java.lang.String r1 = r11.d
            java.lang.String r11 = r11.e
            od0.a r0 = od0.a.f224253a
            boolean r0 = od0.a.e()
            r2 = 0
            if (r0 == 0) goto Le
            goto Lf
        Le:
            r11 = r2
        Lf:
            nkl.a r0 = r10.P
            r0.getClass()
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData r0 = r10.F
            boolean r3 = r0.b4()
            r7 = r3 ^ 1
            boolean r3 = r0.b4()
            if (r3 == 0) goto L26
            lni.j r0 = lni.j.SIGN_UP
        L24:
            r8 = r0
            goto L35
        L26:
            boolean r3 = r0 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData.SignIn
            if (r3 == 0) goto L2d
            lni.j r0 = lni.j.SIGN_IN
            goto L24
        L2d:
            boolean r0 = r0 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData.OperationBoundAuthentication
            if (r0 == 0) goto L34
            lni.j r0 = lni.j.REAUTHENTICATION
            goto L24
        L34:
            r8 = r2
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r3 = r10.e3()
            if (r3 == 0) goto L3f
            r9 = r0
            goto L40
        L3f:
            r9 = r2
        L40:
            com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlowContract$InputData r0 = new com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlowContract$InputData
            r3 = 60
            r2 = r11
            r6 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlow r11 = new com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlow
            r11.<init>(r0)
            okl.d r12 = new okl.d
            r13 = 19
            r12.<init>(r10, r13)
            java.lang.String r13 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            r11.H = r12
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.n.a3(com.revolut.sso.impl.domain.models.Challenge, lni.b, java.util.ArrayList):com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlow");
    }

    public final Object b3(List list, Function2 function2, gim.c cVar) {
        int size = list.size();
        if (size == 0) {
            Object objQ2 = Q2(this, null, null, null, cVar, 7);
            return objQ2 == fim.a.COROUTINE_SUSPENDED ? objQ2 : Unit.f186387a;
        }
        if (size != 1) {
            j3(this, new AuthenticationFlowContract$Step.ChooseChallenge(list));
            return Unit.f186387a;
        }
        Object objInvoke = function2.invoke(d0.b0(list), cVar);
        return objInvoke == fim.a.COROUTINE_SUSPENDED ? objInvoke : Unit.f186387a;
    }

    public final void c3(Function0 function0) {
        Challenge challengeS8 = ((AuthenticationFlowContract$State) ((j2) this.m0.f22677a).getValue()).getF106299h();
        Continuation continuation = null;
        jkl.i iVar = challengeS8 != null ? challengeS8.f106098a : null;
        switch (iVar == null ? -1 : okl.o.f226224b[iVar.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                function0.invoke();
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                yji.l.a1(this, X1(((jol.c) this.D).j(this.F.b4())), null, null, new ble.e0(1, continuation, function0), 3);
                return;
        }
    }

    public final void d3(a3 a3Var) {
        Claim claim;
        RevolutSsoApi$DefaultIdentifier revolutSsoApi$DefaultIdentifier;
        if (okl.o.f226223a[a3Var.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) ((j2) this.m0.f22677a).getValue();
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) {
            claim = ((AuthenticationFlowContract$State.AccessRecovery) authenticationFlowContract$State).f106254c;
        } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn) {
            claim = ((AuthenticationFlowContract$State.SignIn) authenticationFlowContract$State).f106286c;
        } else {
            if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication)) {
                throw new NoWhenBranchMatchedException();
            }
            claim = null;
        }
        int i = 6;
        if (claim instanceof Claim.Email) {
            n2(new v0(this, ((Claim.Email) claim).f106127a, null), new whi.b(i));
            return;
        }
        if (claim instanceof Claim.Phone) {
            n2(new x0(this, ((Claim.Phone) claim).f106131a, null), new whi.b(i));
            return;
        }
        if (claim == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "Revolut SSO", "No claim was provided. Fallback to default identifier", null, null, 16);
        } else {
            if (!(claim instanceof Claim.BioPublicKey) && !(claim instanceof Claim.Google) && !(claim instanceof Claim.IdentityId) && !(claim instanceof Claim.Password) && !(claim instanceof Claim.Pin) && !(claim instanceof Claim.PublicKey) && !(claim instanceof Claim.WebAuthn)) {
                throw new NoWhenBranchMatchedException();
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "Revolut SSO", p.a.p("Claim of ", claim.getClass().getName(), " type is not supported. Fallback to default identifier"), null, null, 16);
        }
        AuthenticationFlowContract$InputData authenticationFlowContract$InputData = this.F;
        if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.AccessRecovery) {
            revolutSsoApi$DefaultIdentifier = ((AuthenticationFlowContract$InputData.AccessRecovery) authenticationFlowContract$InputData).f106218a;
        } else if ((authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.ExternalClientAuthentication) || (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication)) {
            revolutSsoApi$DefaultIdentifier = null;
        } else if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignIn) {
            revolutSsoApi$DefaultIdentifier = ((AuthenticationFlowContract$InputData.SignIn) authenticationFlowContract$InputData).f106233b;
        } else {
            if (!(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignInWithRevolutId)) {
                throw new NoWhenBranchMatchedException();
            }
            revolutSsoApi$DefaultIdentifier = null;
        }
        if (revolutSsoApi$DefaultIdentifier instanceof RevolutSsoApi$DefaultIdentifier.Preferred) {
            j3(this, new AuthenticationFlowContract$Step.GetIdentifier((RevolutSsoApi$DefaultIdentifier.Preferred) revolutSsoApi$DefaultIdentifier));
            return;
        }
        if (revolutSsoApi$DefaultIdentifier instanceof RevolutSsoApi$DefaultIdentifier.Predefined.Phone) {
            String value = ((RevolutSsoApi$DefaultIdentifier.Predefined.Phone) revolutSsoApi$DefaultIdentifier).f105842a;
            Intrinsics.checkNotNullParameter(value, "value");
            n2(new x0(this, value, null), new whi.b(i));
        } else if (revolutSsoApi$DefaultIdentifier instanceof RevolutSsoApi$DefaultIdentifier.Predefined.Email) {
            String value2 = ((RevolutSsoApi$DefaultIdentifier.Predefined.Email) revolutSsoApi$DefaultIdentifier).f105841a;
            Intrinsics.checkNotNullParameter(value2, "value");
            n2(new v0(this, value2, null), new whi.b(i));
        } else {
            if (revolutSsoApi$DefaultIdentifier != null) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException(("Unable to navigate to 'Contact support' destination by claim " + (claim != null ? claim.getClass() : "null") + ". Default or preferred identifier are not provided either").toString());
        }
    }

    public final boolean e3() {
        return ((jte.d) ((rqk.k) this.S).f).c(RevolutSsoApi$Toggles.SsoBottomSheetReauthentication.f105881c) && (((j2) this.m0.f22677a).getValue() instanceof AuthenticationFlowContract$State.OperationBoundAuthentication);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    @Override // tll.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.n.f():boolean");
    }

    public final ConfirmWithOtpCodeFlow g3(String str, Challenge challenge, lni.b bVar) {
        String str2 = challenge.d;
        String str3 = challenge.e;
        od0.a aVar = od0.a.f224253a;
        lni.j jVar = null;
        if (!od0.a.e()) {
            str3 = null;
        }
        f0 f0Var = f0.f322471a;
        this.P.getClass();
        AuthenticationFlowContract$InputData authenticationFlowContract$InputData = this.F;
        if (authenticationFlowContract$InputData.b4()) {
            jVar = lni.j.SIGN_UP;
        } else if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignIn) {
            jVar = lni.j.SIGN_IN;
        } else if (authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication) {
            jVar = lni.j.REAUTHENTICATION;
        }
        ConfirmWithOtpCodeFlow confirmWithOtpCodeFlow = new ConfirmWithOtpCodeFlow(new ConfirmWithOtpCodeFlowContract$InputData(str2, str3, f0Var, bVar, jVar, 128));
        okl.e block = new okl.e(this, str, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        confirmWithOtpCodeFlow.H = block;
        return confirmWithOtpCodeFlow;
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.m0;
    }

    public final void h3(Evidence evidence) {
        okl.k startStep = new okl.k(this, evidence, 1);
        tll.t tVar = this.j0;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(startStep, "startStep");
        Job job2 = tVar.f272121b;
        if (job2 == null || !job2.d()) {
            tVar.f272121b = (Job) startStep.invoke();
        }
    }

    public final void i3(AuthenticationFlowContract$Step authenticationFlowContract$Step, TransitionAnimation transitionAnimation) {
        oki.h.t2(this, this.l0, authenticationFlowContract$Step, ((AuthenticationFlowContract$Step) this.l0.d()) instanceof AuthenticationFlowContract$Step.IdentifierInput, transitionAnimation, false, 8);
    }

    public final void k3(i0 i0Var) {
        String simpleName;
        qki.d dVar = this.m0;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) j2Var.getValue();
        boolean z = authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery;
        yki.i iVar = this.l0;
        if (z) {
            if (!(j2Var2.getValue() instanceof AuthenticationFlowContract$State)) {
                AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) iVar.d();
                simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
            }
            H2(dVar, new l0(this, 4));
            C2(i0Var);
            if (j2Var2.getValue() instanceof AuthenticationFlowContract$State) {
                H2(dVar, new l0(this, 5));
                return;
            }
            AuthenticationFlowContract$Step authenticationFlowContract$Step2 = (AuthenticationFlowContract$Step) iVar.d();
            simpleName = authenticationFlowContract$Step2 != null ? authenticationFlowContract$Step2.getClass().getSimpleName() : null;
            kotlin.jvm.internal.p0 p0Var2 = kotlin.jvm.internal.o0.f186429a;
            throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var2), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var2.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
            C2(i0Var);
            return;
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
            if (j2Var2.getValue() instanceof AuthenticationFlowContract$State) {
                H2(dVar, new l0(this, 6));
                C2(i0Var);
                return;
            } else {
                AuthenticationFlowContract$Step authenticationFlowContract$Step3 = (AuthenticationFlowContract$Step) iVar.d();
                simpleName = authenticationFlowContract$Step3 != null ? authenticationFlowContract$Step3.getClass().getSimpleName() : null;
                kotlin.jvm.internal.p0 p0Var3 = kotlin.jvm.internal.o0.f186429a;
                throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var3), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var3.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
            }
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn) {
            C2(i0Var);
            return;
        }
        if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication)) {
            throw new NoWhenBranchMatchedException();
        }
        if (j2Var2.getValue() instanceof AuthenticationFlowContract$State) {
            H2(dVar, new l0(this, 7));
            C2(i0Var);
        } else {
            AuthenticationFlowContract$Step authenticationFlowContract$Step4 = (AuthenticationFlowContract$Step) iVar.d();
            simpleName = authenticationFlowContract$Step4 != null ? authenticationFlowContract$Step4.getClass().getSimpleName() : null;
            kotlin.jvm.internal.p0 p0Var4 = kotlin.jvm.internal.o0.f186429a;
            throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var4), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var4.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
        }
    }

    public final void l3(Challenge challenge) {
        kotlin.time.b bVar;
        long j2;
        a2 a2Var = this.f106373k0;
        if (a2Var != null) {
            a2Var.f(null);
        }
        ChallengeDetails challengeDetails = challenge.f106101g;
        if (challengeDetails instanceof ChallengeDetails.Rcs) {
            j2 = ((ChallengeDetails.Rcs) challengeDetails).f106114a;
        } else if (!(challengeDetails instanceof ChallengeDetails.WhatsApp) || (bVar = ((ChallengeDetails.WhatsApp) challengeDetails).f106124a) == null) {
            return;
        } else {
            j2 = bVar.f187924a;
        }
        this.f106373k0 = l2(new chj.p(j2, this, challenge, (Continuation) null, 6), new yi5.b(26));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final tll.m m3(final AuthResult authResult) {
        boolean z = authResult instanceof AuthResult.EvidenceNotVerifiedYet;
        tll.t tVar = this.j0;
        if (!z) {
            Job job2 = tVar.f272120a;
            if (job2 != null) {
                job2.f(null);
            }
            tVar.f272120a = null;
            Job job3 = tVar.f272121b;
            if (job3 != null) {
                job3.f(null);
            }
            tVar.f272121b = null;
        }
        boolean z3 = authResult instanceof AuthResult.EvidenceRequired;
        ?? r62 = 0;
        ?? r64 = 0;
        ?? r67 = 0;
        ?? r610 = 0;
        ?? r611 = 0;
        ?? r612 = 0;
        tll.l lVar = tll.l.f272116a;
        if (z3) {
            final ?? r613 = r612 == true ? 1 : 0;
            c3(new Function0(this) { // from class: okl.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226209b;

                {
                    this.f226209b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (r613) {
                        case 0:
                            AuthResult.EvidenceRequired evidenceRequired = (AuthResult.EvidenceRequired) authResult;
                            this.f226209b.q3(evidenceRequired.f106077a, evidenceRequired.f106078b);
                            break;
                        default:
                            com.revolut.sso.impl.ui.auth.n nVar = this.f226209b;
                            boolean f106304p = ((AuthenticationFlowContract$State) ((j2) nVar.m0.f22677a).getValue()).getF106304p();
                            AuthResult authResult2 = authResult;
                            if (f106304p) {
                                com.revolut.sso.impl.ui.auth.n.j3(nVar, new AuthenticationFlowContract$Step.IdentityConfirmed((AuthResult.Success) authResult2));
                            } else {
                                nVar.r3((AuthResult.Success) authResult2);
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return lVar;
        }
        final int i = 1;
        if (authResult instanceof AuthResult.Success) {
            c3(new Function0(this) { // from class: okl.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226209b;

                {
                    this.f226209b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            AuthResult.EvidenceRequired evidenceRequired = (AuthResult.EvidenceRequired) authResult;
                            this.f226209b.q3(evidenceRequired.f106077a, evidenceRequired.f106078b);
                            break;
                        default:
                            com.revolut.sso.impl.ui.auth.n nVar = this.f226209b;
                            boolean f106304p = ((AuthenticationFlowContract$State) ((j2) nVar.m0.f22677a).getValue()).getF106304p();
                            AuthResult authResult2 = authResult;
                            if (f106304p) {
                                com.revolut.sso.impl.ui.auth.n.j3(nVar, new AuthenticationFlowContract$Step.IdentityConfirmed((AuthResult.Success) authResult2));
                            } else {
                                nVar.r3((AuthResult.Success) authResult2);
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return lVar;
        }
        boolean z4 = authResult instanceof AuthResult.SuccessDelegated;
        jol.b bVar = this.D;
        qki.d dVar = this.m0;
        if (z4) {
            AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue();
            if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
                k3(bjl.x.f16193a);
                return lVar;
            }
            if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn)) {
                throw new NoWhenBranchMatchedException();
            }
            RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("Delegated authentication is only supported as a separate use case");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
            yji.l.a1(this, X1(((jol.c) bVar).e("DIALOG_ID_GENERIC_ERROR")), null, null, null, 7);
            return lVar;
        }
        boolean z6 = authResult instanceof AuthResult.LoginRejected;
        tll.i iVar = tll.i.f272113a;
        if (z6) {
            AuthenticationFlowContract$State authenticationFlowContract$State2 = (AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue();
            if (authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) {
                k3(bjl.f0.f16165a);
                return iVar;
            }
            if (!(authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.AccessRecovery) && !(authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) && !(authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) && !(authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.SignIn)) {
                throw new NoWhenBranchMatchedException();
            }
            RevolutSSOException.IllegalState illegalState2 = new RevolutSSOException.IllegalState("Login rejected");
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalState2, h0Var2);
            y3();
            return iVar;
        }
        boolean z11 = authResult instanceof AuthResult.FeatureNotAvailable;
        tll.k kVar = tll.k.f272115a;
        if (z11) {
            C1(new FeatureNotAvailableDestination((TextClause) null, (Clause) null, (TextLocalisedClause) null, (FeatureNotAvailableDestination.Action) null, (FeatureNotAvailableDestination.Action) null, 63));
            return kVar;
        }
        boolean z12 = authResult instanceof AuthResult.CaptchaRequired;
        tll.j jVar = tll.j.f272114a;
        if (z12) {
            return jVar;
        }
        if (authResult instanceof AuthResult.ConfirmationRequired) {
            Evidence evidence = (Evidence) d0.o0(((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getI());
            if (evidence instanceof FaceEvidence) {
                t3(jkl.i.FACE);
                return jVar;
            }
            if (evidence instanceof FaceOtpEvidence) {
                t3(jkl.i.FACE_OTP);
                return jVar;
            }
            if (evidence instanceof DocumentEvidence) {
                t3(jkl.i.ID_DOC);
                return jVar;
            }
        } else {
            final int i2 = 2;
            if (authResult instanceof AuthResult.Unauthorised) {
                Challenge challengeS8 = ((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getF106299h();
                jkl.i iVar2 = challengeS8 != null ? challengeS8.f106098a : null;
                Evidence evidence2 = (Evidence) d0.o0(((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getI());
                if (iVar2 == jkl.i.FACE) {
                    ((jol.c) bVar).getClass();
                    Intrinsics.checkNotNullParameter("DIALOG_ID_SELFIE_CHECK_VERIFICATION_FAILED", "dialogId");
                    yji.l.a1(this, X1(O2(new y0("DIALOG_ID_SELFIE_CHECK_VERIFICATION_FAILED", new z(new TextLocalisedClause(R$string.revolut_sso_selfie_check_dialog_verification_failed_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_selfie_check_dialog_verification_failed_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_selfie_check_dialog_verification_failed_primary_button, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 4))), null, null, new g1(this, iVar2, , r611 == true ? 1 : 0), 3);
                    return kVar;
                }
                if (iVar2 == jkl.i.FACE_OTP) {
                    ((jol.c) bVar).getClass();
                    Intrinsics.checkNotNullParameter("DIALOG_ID_FACE_OTP_CHECK_VERIFICATION_FAILED", "dialogId");
                    yji.l.a1(this, X1(O2(new y0("DIALOG_ID_FACE_OTP_CHECK_VERIFICATION_FAILED", new z(new TextLocalisedClause(R$string.revolut_sso_selfie_check_dialog_verification_failed_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_selfie_check_dialog_verification_failed_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_selfie_check_dialog_verification_failed_primary_button, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 4))), null, null, new g1(this, iVar2, , i), 3);
                    return kVar;
                }
                if (iVar2 == jkl.i.ID_DOC) {
                    ((jol.c) bVar).getClass();
                    Intrinsics.checkNotNullParameter("DIALOG_ID_DOCUMENT_CHECK_VERIFICATION_FAILED", "dialogId");
                    yji.l.a1(this, X1(O2(new y0("DIALOG_ID_DOCUMENT_CHECK_VERIFICATION_FAILED", new z(new TextLocalisedClause(R$string.revolut_sso_document_check_dialog_verification_failed_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_document_check_dialog_verification_failed_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_document_check_dialog_verification_failed_primary_button, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 4))), null, null, new g1(this, iVar2, , i2), 3);
                    return kVar;
                }
                if (iVar2 == jkl.i.CARD_PIN || iVar2 == jkl.i.PIN || iVar2 == jkl.i.EMAIL || iVar2 == jkl.i.TELEPHONE || iVar2 == jkl.i.SMS || iVar2 == jkl.i.IN_SMS) {
                    return iVar;
                }
                if (iVar2 == jkl.i.PUSH) {
                    ((jol.c) bVar).getClass();
                    Intrinsics.checkNotNullParameter("DIALOG_ID_INCORRECT_CODE", "dialogId");
                    yji.l.a1(this, X1(O2(new y0("DIALOG_ID_INCORRECT_CODE", new z(new TextLocalisedClause(com.revolut.otp.input.R$string.revolut_sso_login_incorrect_code_title, null, null, 14), new TextLocalisedClause(com.revolut.otp.input.R$string.revolut_sso_login_incorrect_code_description, null, null, 14), new TextLocalisedClause(com.revolut.otp.input.R$string.revolut_sso_login_incorrect_code_action, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 4))), null, null, new m0(this, , i), 3);
                    return kVar;
                }
                if (iVar2 == jkl.i.QR_DELEGATED) {
                    return kVar;
                }
                if (evidence2 instanceof GoogleEvidence) {
                    yji.l.a1(this, X1(O2(((jol.c) bVar).c())), null, null, null, 7);
                    return kVar;
                }
                if (evidence2 instanceof WebAuthnEvidence) {
                    yji.l.a1(this, X1(O2(((jol.c) bVar).f())), null, null, null, 7);
                    return kVar;
                }
                y3();
                return kVar;
            }
            if (!z) {
                if (authResult instanceof AuthResult.CaptchaCanceled) {
                    return tll.h.f272112a;
                }
                if ((authResult instanceof AuthResult.Forbidden) || (authResult instanceof AuthResult.SessionTokenInvalid)) {
                    return iVar;
                }
                if (authResult instanceof AuthResult.SessionTokenExpired) {
                    yji.l.a1(this, X1(O2(((jol.c) bVar).h())), null, null, new w(this, , 6), 3);
                    return iVar;
                }
                if (authResult instanceof AuthResult.SocialAccountUnlinked) {
                    Evidence evidence3 = (Evidence) d0.o0(((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getI());
                    Integer numValueOf = evidence3 instanceof BankIdEvidence ? Integer.valueOf(R$string.revolut_sso_choose_verify_method_method_bankid) : evidence3 instanceof DAPEvidence ? Integer.valueOf(R$string.revolut_sso_choose_verify_method_method_dap) : null;
                    if (numValueOf != null) {
                        yji.l.b1(this, X1(((jol.c) bVar).k(numValueOf.intValue())), null, null, 7);
                        return iVar;
                    }
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Unexpected social account unlinked account name", null, h0Var3);
                    y3();
                    return iVar;
                }
                if (authResult instanceof AuthResult.TooManyChallenges) {
                    AuthResult.TooManyChallenges tooManyChallenges = (AuthResult.TooManyChallenges) authResult;
                    s3(tooManyChallenges.f106094a, tooManyChallenges.f106095b, tooManyChallenges.f106096c);
                    return iVar;
                }
                if (authResult instanceof AuthResult.ClaimRequired) {
                    AuthResult.ClaimRequired claimRequired = (AuthResult.ClaimRequired) authResult;
                    n3(claimRequired.f106073a, claimRequired.f106074b, (((j2) dVar.f22677a).getValue() instanceof AuthenticationFlowContract$State.AccessRecovery) || ((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getK().contains(((AuthResult.ClaimRequired) authResult).f106073a));
                    return lVar;
                }
                if (authResult instanceof AuthResult.ExistingAccountFound) {
                    UserInfo userInfo = ((AuthResult.ExistingAccountFound) authResult).f106079a;
                    if (((j2) dVar.f22677a).getValue() instanceof AuthenticationFlowContract$State) {
                        H2(dVar, new l0(this, 8));
                        j3(this, new AuthenticationFlowContract$Step.ExistingAccountFound(userInfo));
                        return lVar;
                    }
                    AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) this.l0.d();
                    String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
                    kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                    throw new IllegalStateException(m72.b.q(okl.m.p((j2) dVar.f22677a, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
                }
                if (authResult instanceof AuthResult.AuthenticationRejected) {
                    AuthResult.AuthenticationRejected authenticationRejected = (AuthResult.AuthenticationRejected) authResult;
                    Challenge challengeS82 = ((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getF106299h();
                    j3(this, new AuthenticationFlowContract$Step.AuthRejected(challengeS82 != null ? challengeS82.f106098a : null, authenticationRejected.f106068a, authenticationRejected.f106069b, R$string.revolut_sso_common_actions_retry));
                    return iVar;
                }
                if (authResult instanceof AuthResult.AuthenticationReviewing) {
                    j3(this, AuthenticationFlowContract$Step.ManualReview.f106346a);
                    return jVar;
                }
                if (authResult instanceof AuthResult.PermissionRequired) {
                    l2(new f1(this, (AuthResult.PermissionRequired) authResult, null), new yi5.b(26));
                    return lVar;
                }
                if (!(authResult instanceof AuthResult.LocationRequested)) {
                    throw new NoWhenBranchMatchedException();
                }
                AuthenticationFlowContract$InputData authenticationFlowContract$InputData = this.F;
                AuthenticationFlowContract$InputData.OperationBoundAuthentication operationBoundAuthentication = authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication ? (AuthenticationFlowContract$InputData.OperationBoundAuthentication) authenticationFlowContract$InputData : null;
                 = operationBoundAuthentication != null ? operationBoundAuthentication.f106228g : 0;
                if (( instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin.Default) || ( instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin.Delegated)) {
                    j3(this, AuthenticationFlowContract$Step.RequestLocation.f106355a);
                    return jVar;
                }
                if (!( instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin.OneTimeFaceSignIn) &&  != 0) {
                    throw new NoWhenBranchMatchedException();
                }
                y3();
                return iVar;
            }
            final Challenge challengeS83 = ((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getF106299h();
            Evidence evidence4 = (Evidence) d0.o0(((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getI());
            if ((challengeS83 != null ? challengeS83.f106098a : null) == jkl.i.BANK_ID && (evidence4 instanceof BankIdEvidence)) {
                B3(this, evidence4);
                return jVar;
            }
            if ((challengeS83 != null ? challengeS83.f106098a : null) == jkl.i.FACE && (evidence4 instanceof FaceEvidence)) {
                final ?? r614 = r610 == true ? 1 : 0;
                tVar.a(new Function0(this) { // from class: okl.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226196b;

                    {
                        this.f226196b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (r614) {
                            case 0:
                                com.revolut.sso.impl.ui.auth.n.j3(this.f226196b, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge(challengeS83));
                                break;
                            case 1:
                                com.revolut.sso.impl.ui.auth.n.j3(this.f226196b, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge(challengeS83));
                                break;
                            default:
                                com.revolut.sso.impl.ui.auth.n.j3(this.f226196b, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge(challengeS83));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, new okl.k(this, evidence4, r67 == true ? 1 : 0));
                return jVar;
            }
            if ((challengeS83 != null ? challengeS83.f106098a : null) == jkl.i.FACE_OTP && (evidence4 instanceof FaceOtpEvidence)) {
                tVar.a(new Function0(this) { // from class: okl.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226196b;

                    {
                        this.f226196b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                com.revolut.sso.impl.ui.auth.n.j3(this.f226196b, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge(challengeS83));
                                break;
                            case 1:
                                com.revolut.sso.impl.ui.auth.n.j3(this.f226196b, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge(challengeS83));
                                break;
                            default:
                                com.revolut.sso.impl.ui.auth.n.j3(this.f226196b, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge(challengeS83));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, new okl.k(this, evidence4, r64 == true ? 1 : 0));
                return jVar;
            }
            if ((challengeS83 != null ? challengeS83.f106098a : null) == jkl.i.ID_DOC && (evidence4 instanceof DocumentEvidence)) {
                tVar.a(new Function0(this) { // from class: okl.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226196b;

                    {
                        this.f226196b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                com.revolut.sso.impl.ui.auth.n.j3(this.f226196b, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge(challengeS83));
                                break;
                            case 1:
                                com.revolut.sso.impl.ui.auth.n.j3(this.f226196b, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge(challengeS83));
                                break;
                            default:
                                com.revolut.sso.impl.ui.auth.n.j3(this.f226196b, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationUnderReviewChallenge(challengeS83));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, new okl.k(this, evidence4, r62 == true ? 1 : 0));
                return jVar;
            }
            if ((challengeS83 != null ? challengeS83.f106098a : null) == jkl.i.IN_SMS && (evidence4 instanceof SimBindingEvidence)) {
                B3(this, evidence4);
                return jVar;
            }
            if ((challengeS83 != null ? challengeS83.f106098a : null) == jkl.i.QR_DELEGATED && (evidence4 instanceof QrDelegatedEvidence)) {
                B3(this, evidence4);
            }
        }
        return jVar;
    }

    public final void n3(gkl.m mVar, Claim claim, boolean z) {
        switch (okl.o.d[mVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                y3();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Claim " + mVar + " is not supported for submission", null, h0Var);
                return;
            case 8:
                if (claim != null) {
                    j3(this, new AuthenticationFlowContract$Step.LateIdentificationInfo(claim));
                    return;
                } else {
                    j3(this, new AuthenticationFlowContract$Step.CreateNewEmail(z));
                    return;
                }
            case 9:
                j3(this, AuthenticationFlowContract$Step.CreateNewPassword.f106313a);
                return;
            case 10:
                if (claim != null) {
                    j3(this, new AuthenticationFlowContract$Step.LateIdentificationInfo(claim));
                    return;
                } else {
                    j3(this, new AuthenticationFlowContract$Step.CreateNewPhone(z));
                    return;
                }
            case 11:
                j3(this, AuthenticationFlowContract$Step.CreateNewPasscode.f106312a);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Throwable th10;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Challenge challengeS8 = ((AuthenticationFlowContract$State) ((j2) this.m0.f22677a).getValue()).getF106299h();
        if ((challengeS8 != null ? yjl.d.e(challengeS8.f106098a) : null) != null) {
            th10 = throwable;
            C3(new Data(null, th10, false, 5, null));
        } else {
            th10 = throwable;
        }
        ox0.w.Companion.getClass();
        nq0.a.Companion.getClass();
        ix0.g1.f169238b = null;
        d0(false, false);
        tll.t tVar = this.j0;
        Job job2 = tVar.f272120a;
        if (job2 != null) {
            job2.f(null);
        }
        tVar.f272120a = null;
        Job job3 = tVar.f272121b;
        if (job3 != null) {
            job3.f(null);
        }
        tVar.f272121b = null;
        if (th10 instanceof SsoServerError.DeviceIdHardwareIdMismatch) {
            y3();
            this.C.clear();
            return true;
        }
        if (th10 instanceof SsoServerError.ExternalIdentityVerificationFailed) {
            yji.l.a1(this, X1(((jol.c) this.D).d()), null, null, null, 7);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, th10, h0Var);
            return true;
        }
        if (th10 instanceof SsoServerError) {
            y3();
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, th10, h0Var2);
            return true;
        }
        if (th10 instanceof CaptchaError) {
            this.L.a(tll.h.f272112a);
        } else {
            this.L.a(tll.k.f272115a);
        }
        if (this.l0.d() == null) {
            v3(false);
        }
        return false;
    }

    public final void o3(Claim claim) {
        l2(new oh4.i(this, claim, (Continuation) null, 12), new okl.h(claim, this, 1));
    }

    public final Object p3(Claim claim, gim.c cVar) {
        String simpleName;
        boolean z = claim instanceof Claim.Email;
        yki.i iVar = this.l0;
        qki.d dVar = this.m0;
        if (z || (claim instanceof Claim.Phone)) {
            j2 j2Var = (j2) dVar.f22677a;
            j2 j2Var2 = (j2) dVar.f22677a;
            Set setR6 = ((AuthenticationFlowContract$State) j2Var.getValue()).getK();
            HashSet hashSet = new HashSet();
            for (Object obj2 : setR6) {
                gkl.m mVar = (gkl.m) obj2;
                Claim.INSTANCE.getClass();
                if (mVar != Claim.Companion.a(claim)) {
                    hashSet.add(obj2);
                }
            }
            AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) j2Var2.getValue();
            if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) {
                if (!(j2Var2.getValue() instanceof AuthenticationFlowContract$State.AccessRecovery)) {
                    AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) iVar.d();
                    simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
                    kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                    throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.AccessRecovery.class).m(), "\n                Actual: ")).toString());
                }
                H2(dVar, new z0(this, claim, hashSet, 0));
            } else {
                if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn)) {
                    if ((authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) || (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) || (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication)) {
                        throw new IllegalStateException("Unexpected claim submission on ".concat(authenticationFlowContract$State.getClass().getName()).toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!(j2Var2.getValue() instanceof AuthenticationFlowContract$State.SignIn)) {
                    AuthenticationFlowContract$Step authenticationFlowContract$Step2 = (AuthenticationFlowContract$Step) iVar.d();
                    simpleName = authenticationFlowContract$Step2 != null ? authenticationFlowContract$Step2.getClass().getSimpleName() : null;
                    kotlin.jvm.internal.p0 p0Var2 = kotlin.jvm.internal.o0.f186429a;
                    throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var2), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var2.b(AuthenticationFlowContract$State.SignIn.class).m(), "\n                Actual: ")).toString());
                }
                H2(dVar, new z0(this, claim, hashSet, 1));
            }
            Object objQ2 = Q2(this, null, null, null, cVar, 7);
            return objQ2 == fim.a.COROUTINE_SUSPENDED ? objQ2 : Unit.f186387a;
        }
        if (claim instanceof Claim.Pin) {
            String secret = ((Claim.Pin) claim).f106132a;
            Intrinsics.checkNotNullParameter(secret, "secret");
            j2 j2Var3 = (j2) dVar.f22677a;
            j2 j2Var4 = (j2) dVar.f22677a;
            Set setH1 = d0.h1(((AuthenticationFlowContract$State) j2Var3.getValue()).getF106301l());
            setH1.remove(jkl.i.PIN);
            if (j2Var4.getValue() instanceof AuthenticationFlowContract$State) {
                H2(dVar, new okl.a1(this, setH1, 0));
                Object objQ22 = Q2(this, null, new PinEvidence(secret), null, cVar, 5);
                return objQ22 == fim.a.COROUTINE_SUSPENDED ? objQ22 : Unit.f186387a;
            }
            AuthenticationFlowContract$Step authenticationFlowContract$Step3 = (AuthenticationFlowContract$Step) iVar.d();
            simpleName = authenticationFlowContract$Step3 != null ? authenticationFlowContract$Step3.getClass().getSimpleName() : null;
            kotlin.jvm.internal.p0 p0Var3 = kotlin.jvm.internal.o0.f186429a;
            throw new IllegalStateException(m72.b.q(okl.m.p(j2Var4, p0Var3), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var3.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
        }
        if (!(claim instanceof Claim.Password)) {
            if ((claim instanceof Claim.BioPublicKey) || (claim instanceof Claim.Google) || (claim instanceof Claim.IdentityId) || (claim instanceof Claim.PublicKey) || (claim instanceof Claim.WebAuthn)) {
                throw new IllegalStateException(claim.getClass().getName().concat(" claim submission is not supported").toString());
            }
            throw new NoWhenBranchMatchedException();
        }
        String secret2 = ((Claim.Password) claim).f106130a;
        Intrinsics.checkNotNullParameter(secret2, "secret");
        j2 j2Var5 = (j2) dVar.f22677a;
        j2 j2Var6 = (j2) dVar.f22677a;
        Set setH12 = d0.h1(((AuthenticationFlowContract$State) j2Var5.getValue()).getF106301l());
        setH12.remove(jkl.i.PASSWORD);
        if (j2Var6.getValue() instanceof AuthenticationFlowContract$State) {
            H2(dVar, new okl.a1(this, setH12, 1));
            Object objQ23 = Q2(this, null, new PasswordEvidence(secret2), null, cVar, 5);
            return objQ23 == fim.a.COROUTINE_SUSPENDED ? objQ23 : Unit.f186387a;
        }
        AuthenticationFlowContract$Step authenticationFlowContract$Step4 = (AuthenticationFlowContract$Step) iVar.d();
        simpleName = authenticationFlowContract$Step4 != null ? authenticationFlowContract$Step4.getClass().getSimpleName() : null;
        kotlin.jvm.internal.p0 p0Var4 = kotlin.jvm.internal.o0.f186429a;
        throw new IllegalStateException(m72.b.q(okl.m.p(j2Var6, p0Var4), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var4.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q3(Challenge challenge, List list) {
        String str;
        Uri uri2;
        String scheme;
        Integer numM;
        qki.d dVar = this.m0;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        UserInfo userInfo = 0;
        userInfo = 0;
        userInfo = 0;
        userInfo = 0;
        userInfo = 0;
        if (!(j2Var.getValue() instanceof AuthenticationFlowContract$State)) {
            AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) this.l0.d();
            String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
            kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
            throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
        }
        H2(dVar, new a9j.n(this, 15, challenge, list));
        jkl.i iVar = challenge.f106098a;
        int i = 5;
        int i2 = 26;
        switch (okl.o.f226224b[iVar.ordinal()]) {
            case 1:
                j3(this, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$SimBinding(challenge));
                return;
            case 2:
            case 10:
            case 21:
            case 25:
            case 26:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Sign-in can't be finished: authentication method is not supported here", null, h0Var);
                y3();
                return;
            case 3:
                j3(this, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BankIdIdentityVerification(challenge));
                return;
            case 4:
                String clientId = o.a((AuthenticationFlowContract$State) j2Var2.getValue(), this.S);
                okl.s onAccept = new okl.s(this, userInfo, i);
                o10.c onReject = new o10.c(this, 21);
                xkl.i iVar2 = this.f106378t;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                Intrinsics.checkNotNullParameter(onAccept, "onAccept");
                Intrinsics.checkNotNullParameter(onReject, "onReject");
                if (challenge.e != null) {
                    iVar2.T2(new xkl.e(iVar2, clientId, challenge, onReject, onAccept, (Continuation) null, 0), new yi5.b(27));
                    return;
                }
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "BioSignatureControllerModelExtensionImpl", "No code provided to sign with bio signature", null, h0Var2);
                onReject.invoke();
                return;
            case 5:
                j3(this, AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$CardPIN.f106322a);
                return;
            case 6:
                j3(this, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$DAPIdentityVerification(challenge));
                return;
            case 7:
            case 16:
            case 19:
            case 20:
            case 23:
                j3(this, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$OtpInput(challenge));
                return;
            case 8:
            case 9:
            case 11:
                AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) j2Var2.getValue();
                if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) {
                    str = ((AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) authenticationFlowContract$State).e;
                } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
                    str = ((AuthenticationFlowContract$State.ExternalClientAuthentication) authenticationFlowContract$State).e;
                } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
                    str = ((AuthenticationFlowContract$State.OperationBoundAuthentication) authenticationFlowContract$State).e;
                } else {
                    if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = null;
                }
                gkl.k kVar = challenge.f106099b;
                int i3 = kVar == null ? -1 : okl.o.f226225c[kVar.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        E3(challenge);
                        return;
                    } else if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (iVar != jkl.i.FACE || str == null) {
                    j3(this, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge(challenge, null));
                    return;
                } else {
                    l2(new nyd.j(this, challenge, str, (Continuation) null), new yi5.b(i2));
                    return;
                }
            case 12:
                String str2 = challenge.f106100c;
                ChallengeDetails challengeDetails = challenge.f106101g;
                ChallengeDetails.Okta okta = challengeDetails instanceof ChallengeDetails.Okta ? (ChallengeDetails.Okta) challengeDetails : null;
                if (str2 != null && !kotlin.text.d0.W(str2) && okta != null) {
                    String str3 = okta.f106112b;
                    String str4 = okta.f106111a;
                    if (!kotlin.text.d0.W(str4) && !kotlin.text.d0.W(str3)) {
                        okl.d onResult = new okl.d(this, 20);
                        tnl.g gVar = (tnl.g) this.I;
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(onResult, "onResult");
                        if (kotlin.text.d0.W(str4)) {
                            str4 = null;
                        }
                        if (str4 != null && (uri2 = Uri.parse(str3)) != null && (scheme = uri2.getScheme()) != null) {
                            if (kotlin.text.d0.W(scheme)) {
                                scheme = null;
                            }
                            if (scheme != null) {
                                f70.a aVar = gVar.f272471m;
                                Activity activity = gVar.f272470l;
                                aVar.getClass();
                                Intrinsics.checkNotNullParameter(activity, "activity");
                                String packageName = CustomTabsClient.getPackageName(activity, null);
                                if (packageName == null || !CustomTabsClient.isAuthTabSupported(activity, packageName)) {
                                    packageName = null;
                                }
                                if (packageName != null) {
                                    Intent intent = new AuthTabIntent.Builder().build().intent;
                                    intent.setData(Uri.parse(str4));
                                    intent.setPackage(packageName);
                                    intent.putExtra("androidx.browser.auth.extra.REDIRECT_SCHEME", scheme);
                                    Intrinsics.checkNotNullExpressionValue(intent, "apply(...)");
                                    try {
                                        gVar.f272472n = onResult;
                                        gVar.A2(new ExternalDestination.ByIntent(intent, 1999));
                                        return;
                                    } catch (ActivityNotFoundException unused) {
                                        gVar.f272472n = null;
                                    } catch (SecurityException unused2) {
                                        gVar.f272472n = null;
                                    }
                                }
                            }
                        }
                        y3();
                        return;
                    }
                }
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Okta challenge doesn't have a valid id and authorization URL", null, h0Var3);
                y3();
                return;
            case 13:
            case 14:
                String str5 = challenge.d;
                if (str5 == null || (numM = kotlin.text.z.m(str5)) == null || iVar != jkl.i.PIN) {
                    numM = null;
                }
                AuthenticationFlowContract$InputData authenticationFlowContract$InputData = this.F;
                if (!(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.AccessRecovery) && !(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.ExternalClientAuthentication) && !(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignInWithRevolutId) && !(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.OperationBoundAuthentication)) {
                    if (!(authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignIn)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RevolutAccountSession revolutAccountSession = ((AuthenticationFlowContract$InputData.SignIn) authenticationFlowContract$InputData).f106232a;
                    if (revolutAccountSession != null) {
                        userInfo = revolutAccountSession.f105974b;
                    }
                }
                j3(this, new AuthenticationFlowContract$Step.PasswordInput(numM, this.g0.a(userInfo)));
                return;
            case 15:
                l2(new g(challenge, this, null), new yi5.b(i2));
                return;
            case 17:
                n2(new of6.d(this, challenge, (Continuation) userInfo, i), new whi.b(6));
                return;
            case 18:
                l2(new oh4.i(this, challenge, (Continuation) userInfo, 14), new yi5.b(i2));
                return;
            case 22:
                l2(new h(challenge, this, null), new yi5.b(i2));
                return;
            case 24:
                j3(this, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$QrDelegated(challenge));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void r3(AuthResult.Success success) {
        bjl.p pVar;
        AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) ((j2) this.m0.f22677a).getValue();
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) {
            AuthenticationFlowContract$InputData authenticationFlowContract$InputData = this.F;
            Intrinsics.i(authenticationFlowContract$InputData, "null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.InputData.AccessRecovery");
            AuthenticationFlowContract$InputData.AccessRecovery.Origin origin = ((AuthenticationFlowContract$InputData.AccessRecovery) authenticationFlowContract$InputData).f106219b;
            if (origin instanceof AuthenticationFlowContract$InputData.AccessRecovery.Origin.ForgotPasscode) {
                String str = success.f106091b;
                String simpleName = authenticationFlowContract$State.getClass().getSimpleName();
                List list = ((AuthenticationFlowContract$State.AccessRecovery) authenticationFlowContract$State).f;
                if (list.isEmpty()) {
                    throw new IllegalStateException(simpleName.concat(" state does not have evidences to get a secret").toString());
                }
                String strW3 = w3(authenticationFlowContract$State);
                if (strW3 == null) {
                    throw new IllegalStateException(d0.k0(list, null, simpleName.concat(" state does not contain a secret in evidences list ["), "]", 0, new okk.d(3), 25).toString());
                }
                pVar = new bjl.p(str, new rl0.a(strW3));
            } else {
                if (!(origin instanceof AuthenticationFlowContract$InputData.AccessRecovery.Origin.UnlockAppWithBiometrics)) {
                    throw new NoWhenBranchMatchedException();
                }
                pVar = new bjl.p(success.f106091b, b.a.f254907a);
            }
            C2(pVar);
        } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn) {
            V2(success.f106092c, success.d, new okl.f(0, success, this));
        } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
            C2(new bjl.s(success.f106091b, success.e));
        } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
            V2(success.f106092c, success.d, new okl.f(1, success, this));
        } else {
            if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication)) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = success.f106091b;
            String str3 = success.e;
            if (str3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            k3(new g0(str2, str3));
        }
        X().a();
    }

    @Override // yki.g
    public final yki.b s() {
        return this.l0;
    }

    public final void s3(jkl.i iVar, ZonedDateTime zonedDateTime, Set set) {
        jkl.i iVar2;
        if (iVar == null) {
            Challenge challengeS8 = ((AuthenticationFlowContract$State) ((j2) this.m0.f22677a).getValue()).getF106299h();
            iVar2 = challengeS8 != null ? challengeS8.f106098a : null;
        } else {
            iVar2 = iVar;
        }
        int i = iVar2 == null ? -1 : okl.o.f226224b[iVar2.ordinal()];
        if (i == 8 || i == 9 || i == 11 || i == 24) {
            j3(this, new AuthenticationFlowContract$Step.AuthRejected(iVar, zonedDateTime, set, R$string.revolut_sso_common_actions_retry));
        } else {
            j3(this, new AuthenticationFlowContract$Step.AuthRejected(iVar, zonedDateTime, set, R$string.revolut_sso_common_actions_retry));
        }
    }

    public final void t3(jkl.i iVar) {
        n2(new oh4.i(this, iVar, (Continuation) null, 15), new whi.b(6));
    }

    public final void u3(boolean z) {
        RevolutSsoApi$DefaultIdentifier.Preferred preferred;
        if (this.F.b4()) {
            C2(new a0(true));
            return;
        }
        String strGenerate = this.f106381y.generate();
        this.i0 = strGenerate;
        AuthenticationFlowContract$State authenticationFlowContract$StateA = this.E.a(strGenerate);
        if (authenticationFlowContract$StateA instanceof AuthenticationFlowContract$State.AccessRecovery) {
            C2(bjl.o.f16181a);
            return;
        }
        if (!(authenticationFlowContract$StateA instanceof AuthenticationFlowContract$State.SignIn)) {
            if (authenticationFlowContract$StateA instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
                k3(bjl.v.f16190a);
                return;
            } else if (authenticationFlowContract$StateA instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
                C2(r.f16184a);
                return;
            } else {
                if (!(authenticationFlowContract$StateA instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                k3(bjl.f0.f16165a);
                return;
            }
        }
        qki.d dVar = this.m0;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        boolean z3 = j2Var.getValue() instanceof AuthenticationFlowContract$State.SignIn;
        yki.i iVar = this.l0;
        if (!z3) {
            AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) iVar.d();
            String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
            kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
            throw new IllegalStateException(m72.b.q(okl.m.p(j2Var2, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.SignIn.class).m(), "\n                Actual: ")).toString());
        }
        H2(dVar, new q(this, (AuthenticationFlowContract$State.SignIn) authenticationFlowContract$StateA, 8));
        oki.h.r2(iVar);
        Object value = j2Var2.getValue();
        AuthenticationFlowContract$State.SignIn signIn = value instanceof AuthenticationFlowContract$State.SignIn ? (AuthenticationFlowContract$State.SignIn) value : null;
        Claim claim = signIn != null ? signIn.f106286c : null;
        if (claim instanceof Claim.Email) {
            preferred = RevolutSsoApi$DefaultIdentifier.Preferred.Email;
        } else if (claim instanceof Claim.Phone) {
            preferred = RevolutSsoApi$DefaultIdentifier.Preferred.Phone;
        } else {
            if (!(claim instanceof Claim.BioPublicKey) && !(claim instanceof Claim.Google) && !(claim instanceof Claim.IdentityId) && !(claim instanceof Claim.Password) && !(claim instanceof Claim.Pin) && !(claim instanceof Claim.PublicKey) && !(claim instanceof Claim.WebAuthn) && claim != null) {
                throw new NoWhenBranchMatchedException();
            }
            this.S.getClass();
            cjl.p[] elements = {cjl.p.PHONE, cjl.p.EMAIL};
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = okl.o.f[((cjl.p) d0.a0(kotlin.collections.d.y0(elements))).ordinal()];
            if (i == 1) {
                preferred = RevolutSsoApi$DefaultIdentifier.Preferred.Phone;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                preferred = RevolutSsoApi$DefaultIdentifier.Preferred.Email;
            }
        }
        j3(this, new AuthenticationFlowContract$Step.IdentifierInput(preferred, z));
    }

    public final void v3(boolean z) {
        qkl.g eVar;
        AuthenticationFlowContract$State currentState = (AuthenticationFlowContract$State) ((j2) this.m0.f22677a).getValue();
        yki.i iVar = this.l0;
        AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) iVar.d();
        iVar.c();
        qkl.j jVar = (qkl.j) this.o;
        jVar.getClass();
        AuthenticationFlowContract$InputData inputData = this.F;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        if (currentState instanceof AuthenticationFlowContract$State.AccessRecovery) {
            eVar = authenticationFlowContract$Step == null ? new qkl.f((Long) 1000L) : jVar.Z2(inputData, currentState);
        } else if (currentState instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
            eVar = new qkl.e(r.f16184a);
        } else if (currentState instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
            eVar = z ? new qkl.e(bjl.v.f16190a) : new qkl.e(u.f16189a);
        } else if (currentState instanceof AuthenticationFlowContract$State.SignIn) {
            eVar = jVar.Z2(inputData, currentState);
        } else {
            if (!(currentState instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = z ? new qkl.e(bjl.f0.f16165a) : new qkl.e(bjl.e0.f16164a);
        }
        if (eVar instanceof qkl.d) {
            oki.h.w2(iVar, AuthenticationFlowContract$Step.LogOutPrompt.f106345a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (eVar instanceof qkl.e) {
            k3(((qkl.e) eVar).f247027a);
            return;
        }
        if (!(eVar instanceof qkl.f)) {
            throw new NoWhenBranchMatchedException();
        }
        qkl.f fVar = (qkl.f) eVar;
        if (fVar.f247028a != null) {
            l2(new oh4.i(fVar, this, (Continuation) null, 16), new yi5.b(26));
        } else {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            iVar.n();
        }
    }

    public final void y3() {
        yji.l.a1(this, X1(((jol.c) this.D).e("DIALOG_ID_GENERIC_ERROR")), null, null, new w(this, null, 8), 3);
    }

    public final void z3() {
        ((jol.c) this.D).getClass();
        yji.l.b1(this, X1(new y0("DIALOG_ID_OKTA_VERIFICATION_FAILED", new z(new TextLocalisedClause(R$string.revolut_sso_okta_dialog_verification_failed_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_okta_dialog_verification_failed_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, 7);
    }
}
