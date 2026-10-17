package com.revolut.sso.impl.ui.combined_authentication.flow;

import a5h.g;
import akl.d;
import bjl.j;
import bjl.n;
import bjl.p0;
import cjl.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.restricted_access.api.FeatureNotAvailableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;
import com.revolut.sso.api.models.BankIdEvidence;
import com.revolut.sso.api.models.DAPEvidence;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.GoogleEvidence;
import com.revolut.sso.api.models.PasswordEvidence;
import com.revolut.sso.api.models.PinEvidence;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.api.models.WebAuthnEvidence;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.Identifier;
import com.revolut.sso.impl.domain.models.SsoServerError;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step;
import gkl.g1;
import gkl.h1;
import gkl.i1;
import gkl.j1;
import gkl.k1;
import gu2.e;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mlk.b0;
import mll.f;
import mll.f0;
import mll.r;
import mp.p;
import oki.h;
import rqk.k;
import tll.t;
import vc.o;
import vkm.j2;
import yji.l;
import yki.i;
import zhm.d0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends h implements mll.c {
    public final iql.a A;
    public final d B;
    public final col.c C;
    public final UICustomization D;
    public final f80.a E;
    public final t F;
    public final qki.d G;
    public final i H;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RevolutSsoApi$InputData$CombinedAuthentication f106425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ywj.i f106426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xjl.h f106427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final uil.a f106428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p0 f106429t;
    public final e u;
    public final g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dm0.d f106430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jol.b f106431x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fkg.a f106432y;
    public final fkl.i z;

    public c(p bankIdIntentHandler, RevolutSsoApi$InputData$CombinedAuthentication flowInputData, ywj.i revolutSsoCodeChallengeGenerator, xjl.h clientDeeplinkRestoreManager, uil.a revolutAccountsManager, p0 revolutSsoDependenciesProvider, e captchaViewControllerExtension, g signUpRepository, dm0.d deviceIdRepository, jol.b dialogsFactory, fkg.a dapIntentHandler, fkl.i ssoDeeplinkResultReceiver, iql.a authenticationFlowFactory, d authenticationRepository, col.c passkeysControllerModelExtension, UICustomization uiCustomization, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(bankIdIntentHandler, "bankIdIntentHandler");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(revolutSsoCodeChallengeGenerator, "revolutSsoCodeChallengeGenerator");
        Intrinsics.checkNotNullParameter(clientDeeplinkRestoreManager, "clientDeeplinkRestoreManager");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
        Intrinsics.checkNotNullParameter(signUpRepository, "signUpRepository");
        Intrinsics.checkNotNullParameter(deviceIdRepository, "deviceIdRepository");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(dapIntentHandler, "dapIntentHandler");
        Intrinsics.checkNotNullParameter(ssoDeeplinkResultReceiver, "ssoDeeplinkResultReceiver");
        Intrinsics.checkNotNullParameter(authenticationFlowFactory, "authenticationFlowFactory");
        Intrinsics.checkNotNullParameter(authenticationRepository, "authenticationRepository");
        Intrinsics.checkNotNullParameter(passkeysControllerModelExtension, "passkeysControllerModelExtension");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = bankIdIntentHandler;
        this.f106425p = flowInputData;
        this.f106426q = revolutSsoCodeChallengeGenerator;
        this.f106427r = clientDeeplinkRestoreManager;
        this.f106428s = revolutAccountsManager;
        this.f106429t = revolutSsoDependenciesProvider;
        this.u = captchaViewControllerExtension;
        this.v = signUpRepository;
        this.f106430w = deviceIdRepository;
        this.f106431x = dialogsFactory;
        this.f106432y = dapIntentHandler;
        this.z = ssoDeeplinkResultReceiver;
        this.A = authenticationFlowFactory;
        this.B = authenticationRepository;
        this.C = passkeysControllerModelExtension;
        this.D = uiCustomization;
        this.E = uriHelper;
        this.F = new t();
        m70.a.c(t0.f186434a);
        this.G = hx7.e.b(this, new CombinedAuthenticationFlowContract$State("", null, h0.f322473a, null));
        this.H = d8l.d.a(this, new f(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.sso.impl.ui.combined_authentication.flow.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof mll.j
            if (r0 == 0) goto L13
            r0 = r5
            mll.j r0 = (mll.j) r0
            int r1 = r0.f207066w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207066w = r1
            goto L18
        L13:
            mll.j r0 = new mll.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207066w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r4.a3()
            jkl.i r5 = jkl.i.QR_DELEGATED
            r0.f207066w = r3
            java.lang.Object r5 = r4.Q2(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            com.revolut.sso.impl.domain.models.Challenge r5 = (com.revolut.sso.impl.domain.models.Challenge) r5
            if (r5 == 0) goto L51
            com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step$EvidenceRequired r4 = new com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step$EvidenceRequired
            jkl.i r0 = jkl.i.QR_DELEGATED
            java.util.List r0 = zhm.u.c(r0)
            r1 = 0
            r4.<init>(r1, r5, r0)
            return r4
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Couldn't create QR-code delegated challenge"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.I2(com.revolut.sso.impl.ui.combined_authentication.flow.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.sso.impl.ui.combined_authentication.flow.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof mll.v
            if (r0 == 0) goto L13
            r0 = r5
            mll.v r0 = (mll.v) r0
            int r1 = r0.f207079w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207079w = r1
            goto L18
        L13:
            mll.v r0 = new mll.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207079w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r4.a3()
            jkl.i r5 = jkl.i.BANK_ID
            r0.f207079w = r3
            java.lang.Object r5 = r4.Q2(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            com.revolut.sso.impl.domain.models.Challenge r5 = (com.revolut.sso.impl.domain.models.Challenge) r5
            r0 = 0
            if (r5 != 0) goto L5b
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r5 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r1 = "Couldn't create BankId delegated challenge"
            r5.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r0, r0, r5, r1)
            d3(r4)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L5b:
            com.revolut.sso.impl.domain.models.ChallengeDetails r5 = r5.f106101g
            boolean r1 = r5 instanceof com.revolut.sso.impl.domain.models.ChallengeDetails.BankId
            if (r1 == 0) goto L64
            com.revolut.sso.impl.domain.models.ChallengeDetails$BankId r5 = (com.revolut.sso.impl.domain.models.ChallengeDetails.BankId) r5
            goto L65
        L64:
            r5 = r0
        L65:
            if (r5 == 0) goto L6a
            java.lang.String r5 = r5.f106106a
            goto L6b
        L6a:
            r5 = r0
        L6b:
            if (r5 != 0) goto L83
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r5 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r1 = "BankId challenge doesn't have a deeplink to launch"
            r5.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r0, r0, r5, r1)
            d3(r4)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L83:
            mp.p r1 = r4.o
            android.content.Intent r5 = r1.i(r5, r3)
            if (r5 != 0) goto La1
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r5 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r1 = "Couldn't get intent to launch BankId app"
            r5.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r0, r0, r5, r1)
            d3(r4)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        La1:
            com.revolut.kompot.common.ExternalDestination$ByIntent r1 = new com.revolut.kompot.common.ExternalDestination$ByIntent
            r1.<init>(r5, r0)
            r4.C1(r1)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.J2(com.revolut.sso.impl.ui.combined_authentication.flow.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.sso.impl.ui.combined_authentication.flow.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof mll.w
            if (r0 == 0) goto L13
            r0 = r5
            mll.w r0 = (mll.w) r0
            int r1 = r0.f207080w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207080w = r1
            goto L18
        L13:
            mll.w r0 = new mll.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207080w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r4.a3()
            jkl.i r5 = jkl.i.DAP
            r0.f207080w = r3
            java.lang.Object r5 = r4.Q2(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            com.revolut.sso.impl.domain.models.Challenge r5 = (com.revolut.sso.impl.domain.models.Challenge) r5
            r0 = 0
            if (r5 != 0) goto L5b
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r5 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r1 = "Couldn't create DAP delegated challenge"
            r5.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r0, r0, r5, r1)
            d3(r4)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L5b:
            com.revolut.sso.impl.domain.models.ChallengeDetails r5 = r5.f106101g
            boolean r1 = r5 instanceof com.revolut.sso.impl.domain.models.ChallengeDetails.DAP
            if (r1 == 0) goto L64
            com.revolut.sso.impl.domain.models.ChallengeDetails$DAP r5 = (com.revolut.sso.impl.domain.models.ChallengeDetails.DAP) r5
            goto L65
        L64:
            r5 = r0
        L65:
            if (r5 == 0) goto L6a
            java.lang.String r5 = r5.f106108a
            goto L6b
        L6a:
            r5 = r0
        L6b:
            if (r5 != 0) goto L83
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r5 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r1 = "DAP challenge doesn't have a deeplink to launch"
            r5.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r0, r0, r5, r1)
            d3(r4)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L83:
            fkg.a r1 = r4.f106432y
            java.lang.String r2 = "https://play.google.com/store/apps/details?id=hu.gov.dap.app"
            android.content.Intent r5 = r1.n(r5, r2)
            if (r5 != 0) goto La3
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r5 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r1 = "Couldn't get intent to launch DAP app"
            r5.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r0, r0, r5, r1)
            d3(r4)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        La3:
            com.revolut.kompot.common.ExternalDestination$ByIntent r1 = new com.revolut.kompot.common.ExternalDestination$ByIntent
            r1.<init>(r5, r0)
            r4.C1(r1)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.K2(com.revolut.sso.impl.ui.combined_authentication.flow.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r14 == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.sso.impl.ui.combined_authentication.flow.c r13, gim.c r14) {
        /*
            qki.d r0 = r13.G
            boolean r1 = r14 instanceof mll.x
            if (r1 == 0) goto L15
            r1 = r14
            mll.x r1 = (mll.x) r1
            int r2 = r1.f207081w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f207081w = r2
            goto L1a
        L15:
            mll.x r1 = new mll.x
            r1.<init>(r13, r14)
        L1a:
            java.lang.Object r14 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f207081w
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L40
            if (r3 == r6) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            yhm.o.b(r14)
            goto Lb0
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            yhm.o.b(r14)
            goto L65
        L3c:
            yhm.o.b(r14)
            goto L51
        L40:
            yhm.o.b(r14)
            r13.a3()
            jkl.i r14 = jkl.i.WEB_AUTHN
            r1.f207081w = r6
            java.lang.Object r14 = r13.Q2(r14, r1)
            if (r14 != r2) goto L51
            goto Laf
        L51:
            com.revolut.sso.impl.domain.models.Challenge r14 = (com.revolut.sso.impl.domain.models.Challenge) r14
            if (r14 != 0) goto L58
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L58:
            col.c r3 = r13.C
            r1.f207081w = r5
            col.i r3 = (col.i) r3
            java.lang.Object r14 = r3.d3(r14, r6, r1)
            if (r14 != r2) goto L65
            goto Laf
        L65:
            col.a r14 = (col.a) r14
            if (r14 == 0) goto Lba
            com.revolut.sso.api.models.WebAuthnEvidence r14 = r14.f25571a
            mk5.s r3 = new mk5.s
            r5 = 9
            r3.<init>(r13, r14, r5)
            r13.H2(r0, r3)
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            com.revolut.sso.impl.domain.models.AuthAction$SignIn r5 = new com.revolut.sso.impl.domain.models.AuthAction$SignIn
            java.lang.Object r3 = r0.getValue()
            com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State r3 = (com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State) r3
            java.lang.String r6 = r3.f106405a
            java.lang.Object r0 = r0.getValue()
            com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State r0 = (com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State) r0
            java.util.Set r0 = r0.f106407c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r8 = zhm.d0.d1(r0)
            r11 = 0
            r12 = 16352(0x3fe0, float:2.2914E-41)
            r7 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            gkl.i r0 = new gkl.i
            r3 = 0
            r0.<init>(r3, r14, r3)
            gu2.e r14 = r13.u
            mll.y r6 = new mll.y
            r6.<init>(r13, r5, r0, r3)
            r1.f207081w = r4
            java.lang.Object r14 = fkl.c.b(r14, r6, r1)
            if (r14 != r2) goto Lb0
        Laf:
            return r2
        Lb0:
            com.revolut.sso.impl.domain.models.AuthResult r14 = (com.revolut.sso.impl.domain.models.AuthResult) r14
            rl0.b$a r0 = rl0.b.a.f254907a
            r13.V2(r14, r0)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        Lba:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.L2(com.revolut.sso.impl.ui.combined_authentication.flow.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.sso.impl.ui.combined_authentication.flow.c r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof mll.z
            if (r0 == 0) goto L13
            r0 = r8
            mll.z r0 = (mll.z) r0
            int r1 = r0.f207085w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207085w = r1
            goto L18
        L13:
            mll.z r0 = new mll.z
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207085w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L40
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            r7.a3()
            jkl.i r8 = jkl.i.UAE_PASS
            r0.f207085w = r3
            java.lang.Object r8 = r7.Q2(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            com.revolut.sso.impl.domain.models.Challenge r8 = (com.revolut.sso.impl.domain.models.Challenge) r8
            r0 = 0
            if (r8 != 0) goto L5b
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r8 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r1 = "Couldn't create UAE PASS challenge"
            r8.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r0, r0, r8, r1)
            d3(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L5b:
            com.revolut.sso.impl.domain.models.ChallengeDetails r8 = r8.f106101g
            boolean r1 = r8 instanceof com.revolut.sso.impl.domain.models.ChallengeDetails.UaePass
            if (r1 == 0) goto L64
            com.revolut.sso.impl.domain.models.ChallengeDetails$UaePass r8 = (com.revolut.sso.impl.domain.models.ChallengeDetails.UaePass) r8
            goto L65
        L64:
            r8 = r0
        L65:
            if (r8 != 0) goto L7d
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r8 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r1 = "UAE PASS challenge doesn't have details"
            r8.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r0, r0, r8, r1)
            d3(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L7d:
            yki.i r1 = r7.H
            com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step$UaePass r2 = new com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step$UaePass
            java.lang.String r0 = r8.f106117a
            java.lang.String r8 = r8.f106118b
            r2.<init>(r0, r8)
            r5 = 0
            r6 = 12
            r3 = 1
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.M2(com.revolut.sso.impl.ui.combined_authentication.flow.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N2(com.revolut.sso.impl.ui.combined_authentication.flow.c r6, com.revolut.sso.impl.domain.models.Claim.Email r7, com.revolut.sso.api.models.GoogleEvidence r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof mll.a0
            if (r0 == 0) goto L13
            r0 = r9
            mll.a0 r0 = (mll.a0) r0
            int r1 = r0.f207041x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207041x = r1
            goto L18
        L13:
            mll.a0 r0 = new mll.a0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207041x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.sso.impl.domain.models.Claim$Email r7 = r0.u
            yhm.o.b(r9)
            goto L58
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r9)
            r6.a3()
            qki.d r9 = r6.G
            mk5.s r2 = new mk5.s
            r4 = 10
            r2.<init>(r6, r8, r4)
            r6.H2(r9, r2)
            gu2.e r9 = r6.u
            lr.l r2 = new lr.l
            r4 = 29
            r5 = 0
            r2.<init>(r6, r8, r5, r4)
            r0.u = r7
            r0.f207041x = r3
            java.lang.Object r9 = fkl.c.b(r9, r2, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            gkl.k1 r9 = (gkl.k1) r9
            r6.W2(r9, r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.N2(com.revolut.sso.impl.ui.combined_authentication.flow.c, com.revolut.sso.impl.domain.models.Claim$Email, com.revolut.sso.api.models.GoogleEvidence, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(com.revolut.sso.impl.ui.combined_authentication.flow.c r6, com.revolut.sso.impl.domain.models.Claim r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof mll.b0
            if (r0 == 0) goto L13
            r0 = r8
            mll.b0 r0 = (mll.b0) r0
            int r1 = r0.f207045x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207045x = r1
            goto L18
        L13:
            mll.b0 r0 = new mll.b0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207045x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.sso.impl.domain.models.Claim r7 = r0.u
            com.revolut.sso.impl.domain.models.Claim r7 = (com.revolut.sso.impl.domain.models.Claim) r7
            yhm.o.b(r8)
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r8)
            r6.a3()
            gu2.e r8 = r6.u
            mll.c0 r2 = new mll.c0
            r4 = 0
            r5 = 0
            r2.<init>(r6, r7, r4, r5)
            r4 = r7
            com.revolut.sso.impl.domain.models.Claim r4 = (com.revolut.sso.impl.domain.models.Claim) r4
            r0.u = r4
            r0.f207045x = r3
            java.lang.Object r8 = fkl.c.b(r8, r2, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            gkl.k1 r8 = (gkl.k1) r8
            r6.W2(r8, r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.O2(com.revolut.sso.impl.ui.combined_authentication.flow.c, com.revolut.sso.impl.domain.models.Claim, gim.c):java.lang.Object");
    }

    public static final Object P2(c cVar, Evidence evidence, gim.i iVar) {
        qki.d dVar = cVar.G;
        Set set = ((CombinedAuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).f106407c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            Evidence evidence2 = (Evidence) obj2;
            if (evidence2.getClass() != evidence.getClass() && ((!(evidence instanceof PinEvidence) && !(evidence instanceof PasswordEvidence)) || (!(evidence2 instanceof PinEvidence) && !(evidence2 instanceof PasswordEvidence)))) {
                arrayList.add(obj2);
            }
        }
        cVar.H2(dVar, new jeg.i(15, d0.F0(evidence, arrayList)));
        Object objP2 = cVar.p2(iVar, new f0(cVar, new AuthAction.SignIn(((CombinedAuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).f106405a, null, u.c(evidence), null, null, null, 16352), new gkl.i(null, evidence, null), null));
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    public static void d3(c cVar) {
        cVar.c3(new iz1.g(2, 27, null));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (this.f106425p.f105849c == RevolutSsoApi$InputData$CombinedAuthentication.b.TWO_BUTTONS_UI) {
            l2(new b(this, null), new yi5.b(26));
        } else {
            l.a1(this, this.z.f135870a, null, null, new mhd.p0(this, continuation, 11), 3);
        }
    }

    @Override // yji.l
    public final void K1() {
        this.f106427r.b();
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(jkl.i r17, gim.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof mll.k
            if (r2 == 0) goto L17
            r2 = r1
            mll.k r2 = (mll.k) r2
            int r3 = r2.f207067w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f207067w = r3
            goto L1c
        L17:
            mll.k r2 = new mll.k
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f207067w
            qki.d r5 = r0.G
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L36
            if (r4 != r6) goto L2e
            yhm.o.b(r1)
            goto L74
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            yhm.o.b(r1)
            com.revolut.sso.impl.domain.models.AuthAction$SignIn r8 = new com.revolut.sso.impl.domain.models.AuthAction$SignIn
            java.lang.Object r1 = r5.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State r1 = (com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State) r1
            java.lang.String r9 = r1.f106405a
            java.lang.Object r1 = r5.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State r1 = (com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State) r1
            java.util.Set r1 = r1.f106407c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r11 = zhm.d0.d1(r1)
            r14 = 0
            r15 = 16352(0x3fe0, float:2.2914E-41)
            r10 = 0
            r12 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            mll.l r1 = new mll.l
            r4 = r17
            r1.<init>(r0, r8, r4, r7)
            r2.f207067w = r6
            gu2.e r4 = r0.u
            java.lang.Object r1 = fkl.c.b(r4, r1, r2)
            if (r1 != r3) goto L74
            return r3
        L74:
            gkl.h0 r1 = (gkl.h0) r1
            boolean r2 = r1 instanceof gkl.e0
            if (r2 == 0) goto L88
            ml3.y r2 = new ml3.y
            gkl.e0 r1 = (gkl.e0) r1
            r3 = 4
            r2.<init>(r1, r3)
            r0.H2(r5, r2)
            com.revolut.sso.impl.domain.models.Challenge r1 = r1.f144443a
            return r1
        L88:
            boolean r2 = r1 instanceof gkl.f0
            if (r2 == 0) goto La2
            com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step$AuthRejected r2 = new com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step$AuthRejected
            gkl.f0 r1 = (gkl.f0) r1
            java.time.ZonedDateTime r3 = r1.f144446b
            java.util.Set r1 = r1.f144447c
            r2.<init>(r7, r3, r1)
            r5 = 0
            r6 = 12
            yki.i r1 = r0.H
            r3 = 1
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            return r7
        La2:
            boolean r0 = r1 instanceof gkl.d0
            if (r0 != 0) goto Lb1
            boolean r0 = r1 instanceof gkl.g0
            if (r0 == 0) goto Lab
            goto Lb1
        Lab:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Lb1:
            d3(r16)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.Q2(jkl.i, gim.c):java.lang.Object");
    }

    public final RevolutSsoApi$DefaultIdentifier.Preferred R2() {
        ((k) this.f106429t).getClass();
        q qVar = q.PHONE;
        q qVar2 = q.EMAIL;
        q[] elements = {qVar, qVar2, q.GOOGLE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        if (setY0.contains(qVar)) {
            return RevolutSsoApi$DefaultIdentifier.Preferred.Phone;
        }
        if (setY0.contains(qVar2)) {
            return RevolutSsoApi$DefaultIdentifier.Preferred.Email;
        }
        RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("No available identifiers to choose from. Fall back to phone");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
        return RevolutSsoApi$DefaultIdentifier.Preferred.Phone;
    }

    public final CombinedAuthenticationFlowContract$Step S2() {
        int i = mll.i.f207065b[this.f106425p.f105849c.ordinal()];
        if (i == 1) {
            return CombinedAuthenticationFlowContract$Step.SingleVideoTwoButtons.f106420a;
        }
        if (i == 2) {
            return CombinedAuthenticationFlowContract$Step.UnifiedAuthentication.f106424a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final j T2() {
        Identifier identifier = ((CombinedAuthenticationFlowContract$State) ((j2) this.G.f22677a).getValue()).f106406b;
        Identifier.Phone phone = identifier instanceof Identifier.Phone ? (Identifier.Phone) identifier : null;
        if (phone != null) {
            return new j(phone.f106151b, phone.f106150a, phone.f106152c);
        }
        return null;
    }

    public final void U2(Claim claim, SsoServerError ssoServerError) {
        boolean z = ssoServerError instanceof SsoServerError.AuthenticationRejected;
        i iVar = this.H;
        if (z) {
            SsoServerError.AuthenticationRejected authenticationRejected = (SsoServerError.AuthenticationRejected) ssoServerError;
            h.t2(this, iVar, new CombinedAuthenticationFlowContract$Step.AuthRejected(claim, authenticationRejected.f106162a, authenticationRejected.f106163b), true, null, false, 12);
            return;
        }
        if (ssoServerError instanceof SsoServerError.AuthenticationReviewing) {
            throw new IllegalStateException("Unexpected sign-up error", ssoServerError);
        }
        if (ssoServerError instanceof SsoServerError.CaptchaRequired) {
            throw new IllegalStateException("Unsatisfied captcha requirement. The request must be wrapped by withCaptchaRequiredHandling()");
        }
        if ((ssoServerError instanceof SsoServerError.ConfirmationRequired) || (ssoServerError instanceof SsoServerError.EvidenceNotVerifiedYet)) {
            throw new IllegalStateException("Unexpected sign-up error", ssoServerError);
        }
        if (ssoServerError instanceof SsoServerError.DeviceIdHardwareIdMismatch) {
            c3(new mll.q(this, null, 0));
            return;
        }
        boolean z3 = ssoServerError instanceof SsoServerError.ExternalIdentityVerificationFailed;
        jol.b bVar = this.f106431x;
        if (z3) {
            l.a1(this, X1(((jol.c) bVar).d()), null, null, null, 7);
            return;
        }
        if (ssoServerError instanceof SsoServerError.Forbidden) {
            c3(new mll.q(this, null, 1));
            return;
        }
        if (ssoServerError instanceof SsoServerError.LoginRejected) {
            h.t2(this, iVar, new CombinedAuthenticationFlowContract$Step.AuthRejected(claim, null, h0.f322473a), true, null, false, 12);
            return;
        }
        if (ssoServerError instanceof SsoServerError.FeatureNotAvailable) {
            C1(new FeatureNotAvailableDestination((TextClause) null, (Clause) null, (TextLocalisedClause) null, (FeatureNotAvailableDestination.Action) null, (FeatureNotAvailableDestination.Action) null, 63));
            return;
        }
        if ((ssoServerError instanceof SsoServerError.AccountIsNotRelatedToUser) || (ssoServerError instanceof SsoServerError.IdentityInUse) || (ssoServerError instanceof SsoServerError.ChallengeNoLongerAvailable) || (ssoServerError instanceof SsoServerError.CodeExpiredOrInvalid) || (ssoServerError instanceof SsoServerError.EmailIsTheSame) || (ssoServerError instanceof SsoServerError.PasscodeContainsBirthDate) || (ssoServerError instanceof SsoServerError.PasscodeContainsCurrentDate) || (ssoServerError instanceof SsoServerError.PasscodeContainsIndividualCreatedDate) || (ssoServerError instanceof SsoServerError.PasscodeIsNotStrong) || (ssoServerError instanceof SsoServerError.PasscodeIsTheSame) || (ssoServerError instanceof SsoServerError.PasswordInvalid) || (ssoServerError instanceof SsoServerError.PasswordIsTheSame) || (ssoServerError instanceof SsoServerError.PasswordNotStrongEnough) || (ssoServerError instanceof SsoServerError.PasswordTooLong) || (ssoServerError instanceof SsoServerError.PhoneIsTheSame) || (ssoServerError instanceof SsoServerError.PhoneResidencyMismatch) || (ssoServerError instanceof SsoServerError.CountryMismatch) || (ssoServerError instanceof SsoServerError.LocationDistance) || (ssoServerError instanceof SsoServerError.LocationRequired) || (ssoServerError instanceof SsoServerError.SsoRequired)) {
            throw new IllegalStateException("Unexpected sign-up error", ssoServerError);
        }
        if ((ssoServerError instanceof SsoServerError.SessionTokenAuthFailed) || (ssoServerError instanceof SsoServerError.SessionTokenExpired) || (ssoServerError instanceof SsoServerError.SessionTokenInvalid)) {
            l.a1(this, X1(((jol.c) bVar).h()), null, null, new mll.q(this, null, 2), 3);
            return;
        }
        boolean z4 = ssoServerError instanceof SsoServerError.SocialAccountUnlinked;
        qki.d dVar = this.G;
        if (z4) {
            Evidence evidence = (Evidence) d0.n0(((CombinedAuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).f106407c);
            Integer numValueOf = evidence instanceof BankIdEvidence ? Integer.valueOf(R$string.revolut_sso_choose_verify_method_method_bankid) : evidence instanceof DAPEvidence ? Integer.valueOf(R$string.revolut_sso_choose_verify_method_method_dap) : null;
            if (numValueOf != null) {
                l.b1(this, X1(((jol.c) bVar).k(numValueOf.intValue())), null, null, 7);
                return;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Unexpected social account unlinked account name", null, h0Var);
            d3(this);
            return;
        }
        if (ssoServerError instanceof SsoServerError.TooManyChallenges) {
            SsoServerError.TooManyChallenges tooManyChallenges = (SsoServerError.TooManyChallenges) ssoServerError;
            h.t2(this, iVar, new CombinedAuthenticationFlowContract$Step.AuthRejected(claim, tooManyChallenges.f106198b, tooManyChallenges.f106199c), true, null, false, 12);
        } else {
            if (!(ssoServerError instanceof SsoServerError.Unauthorised)) {
                throw new NoWhenBranchMatchedException();
            }
            Evidence evidence2 = (Evidence) d0.n0(((CombinedAuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).f106407c);
            if (evidence2 instanceof GoogleEvidence) {
                l.b1(this, X1(((jol.c) bVar).c()), null, null, 7);
            } else if (evidence2 instanceof WebAuthnEvidence) {
                l.b1(this, X1(((jol.c) bVar).f()), null, null, 7);
            } else {
                d3(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V2(com.revolut.sso.impl.domain.models.AuthResult r12, rl0.b.a r13) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.V2(com.revolut.sso.impl.domain.models.AuthResult, rl0.b$a):void");
    }

    public final void W2(k1 k1Var, Claim claim) {
        boolean z = k1Var instanceof g1;
        i iVar = this.H;
        if (z) {
            h.t2(this, iVar, new CombinedAuthenticationFlowContract$Step.ClaimRequired(((g1) k1Var).f144452a), true, null, false, 12);
            return;
        }
        if (k1Var instanceof h1) {
            h1 h1Var = (h1) k1Var;
            Challenge challenge = h1Var.f144453a;
            o.q(this, challenge);
            h.t2(this, iVar, new CombinedAuthenticationFlowContract$Step.EvidenceRequired(claim, challenge, h1Var.f144454b), true, null, false, 12);
            return;
        }
        if (k1Var instanceof i1) {
            U2(claim, ((i1) k1Var).f144458a);
        } else {
            if (!(k1Var instanceof j1)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, iVar, CombinedAuthenticationFlowContract$Step.Social.f106421a, true, null, false, 12);
        }
    }

    public final AuthenticationFlow X2(AuthenticationFlowContract$InputData.SignIn signIn) {
        ryc.a aVar = new ryc.a(((CombinedAuthenticationFlowContract$State) ((j2) this.G.f22677a).getValue()).f106405a, (yil.a) new b0(this, 6));
        this.A.getClass();
        AuthenticationFlow authenticationFlowA = iql.a.a(signIn, aVar, this.D);
        mll.e block = new mll.e(this, 5);
        Intrinsics.checkNotNullParameter(block, "block");
        authenticationFlowA.H = block;
        return authenticationFlowA;
    }

    public final AuthenticationFlow Y2(AuthenticationFlowContract$InputData.SignIn signIn) {
        ryc.a aVar = new ryc.a(((CombinedAuthenticationFlowContract$State) ((j2) this.G.f22677a).getValue()).f106405a, (yil.a) new b0(this, 6));
        this.A.getClass();
        AuthenticationFlow authenticationFlowA = iql.a.a(signIn, aVar, this.D);
        r block = new r(1, 0, c.class, this, "handleSignInResultAfterSignUpFlow", "handleSignInResultAfterSignUpFlow(Lcom/revolut/sso/api/login/RevolutSsoApi$OutputData$SignIn;)V");
        Intrinsics.checkNotNullParameter(block, "block");
        authenticationFlowA.H = block;
        return authenticationFlowA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.sso.impl.domain.models.Claim r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mll.t
            if (r0 == 0) goto L13
            r0 = r6
            mll.t r0 = (mll.t) r0
            int r1 = r0.f207077w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207077w = r1
            goto L18
        L13:
            mll.t r0 = new mll.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207077w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            mll.u r6 = new mll.u
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.f207077w = r3
            java.lang.Object r6 = r4.p2(r0, r6)
            if (r6 != r1) goto L41
            return r1
        L41:
            aii.u r6 = (aii.u) r6
            r4.C1(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.combined_authentication.flow.c.Z2(com.revolut.sso.impl.domain.models.Claim, gim.c):java.lang.Object");
    }

    public final void a3() {
        H2(this.G, new mll.e(this, 0));
    }

    public final void b3() {
        a3();
        h.r2(this.H);
        h.t2(this, this.H, CombinedAuthenticationFlowContract$Step.UnifiedAuthentication.f106424a, false, TransitionAnimation.NONE.f98393a, false, 8);
    }

    public final void c3(Function2 function2) {
        l.a1(this, X1(((jol.c) this.f106431x).e("DIALOG_ID_GENERIC_ERROR")), null, null, function2, 3);
    }

    @Override // tll.e
    public final boolean f() {
        if (this.f106425p.f != n.SignIn) {
            return false;
        }
        i iVar = this.H;
        if (!(iVar.d() instanceof CombinedAuthenticationFlowContract$Step.OpenSignIn) || iVar.c()) {
            return false;
        }
        a3();
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.a();
        h.t2(this, this.H, S2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
        return true;
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.G;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.H;
    }
}
