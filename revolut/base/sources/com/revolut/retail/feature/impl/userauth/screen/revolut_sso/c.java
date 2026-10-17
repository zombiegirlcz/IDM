package com.revolut.retail.feature.impl.userauth.screen.revolut_sso;

import c6b.j;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.network.exceptions.NetworkConnectException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.signin.api.models.SignInNotAllowedDueToAgeException;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlowContract$Step;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method;
import d8l.d;
import fwj.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mli.e;
import nii.y0;
import nii.z;
import oki.h;
import rl0.b;
import te0.w;
import twj.f;
import yji.l;
import yki.i;
import ywj.g;
import ywj.m;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements g {
    public final fh8.a A;
    public final gte.a B;
    public final i C;
    public final x60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RetailRevolutSsoFlowContract$InputData f101710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nkl.b f101711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xjl.i f101712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f101713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.retail.feature.api.userauth.navigation.a f101714t;
    public final e u;
    public final yva.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f101715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zm0.b f101716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final owj.b f101717y;
    public final r10.a z;

    public c(x60.a accountRegionConsumer, RetailRevolutSsoFlowContract$InputData inputData, nkl.b flowsFactory, xjl.i flowConfigurationInteractor, p userOnboardingInteractor, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, e userLogoutInteractor, yva.a referralCodeInteractor, j cobrandedCardsPromoCodeInteractor, zm0.b sessionController, owj.b combinedAuthenticationUiDependenciesProvider, r10.a ssoTokenExchangeRepository, fh8.a graduationNotAvailableScreenProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(accountRegionConsumer, "accountRegionConsumer");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowsFactory, "flowsFactory");
        Intrinsics.checkNotNullParameter(flowConfigurationInteractor, "flowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(referralCodeInteractor, "referralCodeInteractor");
        Intrinsics.checkNotNullParameter(cobrandedCardsPromoCodeInteractor, "cobrandedCardsPromoCodeInteractor");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(combinedAuthenticationUiDependenciesProvider, "combinedAuthenticationUiDependenciesProvider");
        Intrinsics.checkNotNullParameter(ssoTokenExchangeRepository, "ssoTokenExchangeRepository");
        Intrinsics.checkNotNullParameter(graduationNotAvailableScreenProvider, "graduationNotAvailableScreenProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = accountRegionConsumer;
        this.f101710p = inputData;
        this.f101711q = flowsFactory;
        this.f101712r = flowConfigurationInteractor;
        this.f101713s = userOnboardingInteractor;
        this.f101714t = userOnboardingNavigationProvider;
        this.u = userLogoutInteractor;
        this.v = referralCodeInteractor;
        this.f101715w = cobrandedCardsPromoCodeInteractor;
        this.f101716x = sessionController;
        this.f101717y = combinedAuthenticationUiDependenciesProvider;
        this.z = ssoTokenExchangeRepository;
        this.A = graduationNotAvailableScreenProvider;
        this.B = featureToggleInteractor;
        this.C = d.a(this, new yi3.d(this, 27));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r9.L2(r1) != r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r9.L2(r1) != r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c r9, com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode r10, gim.c r11) throws java.lang.Throwable {
        /*
            fwj.p r0 = r9.f101713s
            boolean r1 = r11 instanceof ywj.l
            if (r1 == 0) goto L15
            r1 = r11
            ywj.l r1 = (ywj.l) r1
            int r2 = r1.f317485x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f317485x = r2
            goto L1a
        L15:
            ywj.l r1 = new ywj.l
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f317485x
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L4c
            if (r3 == r7) goto L48
            if (r3 == r6) goto L42
            if (r3 == r5) goto L3e
            if (r3 != r4) goto L36
            cdd.c r10 = r1.u
            yhm.o.b(r11)
            goto La9
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            yhm.o.b(r11)
            goto L9b
        L42:
            cdd.c r10 = r1.u
            yhm.o.b(r11)
            goto L7a
        L48:
            yhm.o.b(r11)
            goto L6c
        L4c:
            yhm.o.b(r11)
            boolean r11 = r10 instanceof com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode.AutoWithPasscode
            if (r11 == 0) goto L83
            rl0.a r11 = new rl0.a
            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode$AutoWithPasscode r10 = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode.AutoWithPasscode) r10
            java.lang.String r3 = r10.f101719b
            r11.<init>(r3)
            r9.O2(r11)
            java.lang.String r11 = r10.f101718a
            java.lang.String r10 = r10.f101720c
            r1.f317485x = r7
            java.lang.Object r11 = r0.f(r11, r10, r7, r1)
            if (r11 != r2) goto L6c
            goto La8
        L6c:
            r10 = r11
            cdd.c r10 = (cdd.c) r10
            r1.u = r10
            r1.f317485x = r6
            java.lang.Object r11 = r9.L2(r1)
            if (r11 != r2) goto L7a
            goto La8
        L7a:
            ywj.h r11 = new ywj.h
            r11.<init>(r10, r8)
            r9.C2(r11)
            goto Lb1
        L83:
            boolean r11 = r10 instanceof com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode.AutoWithPasskey
            if (r11 == 0) goto Lb4
            rl0.b$a r11 = rl0.b.a.f254907a
            r9.O2(r11)
            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode$AutoWithPasskey r10 = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode.AutoWithPasskey) r10
            java.lang.String r11 = r10.f101721a
            java.lang.String r10 = r10.f101722b
            r1.f317485x = r5
            java.lang.Object r11 = r0.f(r11, r10, r7, r1)
            if (r11 != r2) goto L9b
            goto La8
        L9b:
            r10 = r11
            cdd.c r10 = (cdd.c) r10
            r1.u = r10
            r1.f317485x = r4
            java.lang.Object r11 = r9.L2(r1)
            if (r11 != r2) goto La9
        La8:
            return r2
        La9:
            ywj.h r11 = new ywj.h
            r11.<init>(r10, r8)
            r9.C2(r11)
        Lb1:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lb4:
            boolean r9 = r10 instanceof com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode.Default
            if (r9 == 0) goto Lc0
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Default sign in mode is not supported, check autoSignIn configuration"
            r9.<init>(r10)
            throw r9
        Lc0:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.I2(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c, com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
    
        if (r0 == r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0180, code lost:
    
        if (r0 == r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
    
        if (r0 == r7) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c r16, java.lang.String r17, bjl.i0 r18, com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method.Phone r19, boolean r20, gim.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.J2(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c, java.lang.String, bjl.i0, com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method$Phone, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r1.L2(r7) != r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c r11, bjl.n0 r12, java.lang.String r13, gim.c r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof ywj.p
            if (r0 == 0) goto L14
            r0 = r14
            ywj.p r0 = (ywj.p) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            ywj.p r0 = new ywj.p
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f317492x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.z
            r8 = 4
            r9 = 3
            r2 = 2
            r3 = 1
            r10 = 0
            if (r1 == 0) goto L59
            if (r1 == r3) goto L51
            if (r1 == r2) goto L4a
            if (r1 == r9) goto L41
            if (r1 != r8) goto L39
            cdd.c r12 = r7.f317491w
            bjl.n0 r13 = r7.u
            yhm.o.b(r14)
            r1 = r11
            goto La7
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            cdd.c r12 = r7.f317491w
            bjl.n0 r13 = r7.u
            yhm.o.b(r14)
            r1 = r11
            goto L98
        L4a:
            bjl.n0 r12 = r7.u
            yhm.o.b(r14)
            r1 = r11
            goto L83
        L51:
            java.lang.String r13 = r7.v
            bjl.n0 r12 = r7.u
            yhm.o.b(r14)
            goto L6d
        L59:
            yhm.o.b(r14)
            x60.a r14 = r11.o
            r7.u = r12
            r7.v = r13
            r7.z = r3
            x60.c r14 = (x60.c) r14
            java.lang.Object r14 = r14.b(r7)
            if (r14 != r0) goto L6d
            goto La6
        L6d:
            java.lang.String r3 = r12.f16178a
            rl0.b r4 = r12.f16179b
            wi0.b r6 = r12.d
            r7.u = r12
            r7.v = r10
            r7.z = r2
            r5 = 0
            r1 = r11
            r2 = r13
            java.lang.Object r14 = r1.N2(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L83
            goto La6
        L83:
            cdd.c r14 = (cdd.c) r14
            com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method r11 = r12.f16180c
            r7.u = r12
            r7.v = r10
            r7.f317491w = r14
            r7.z = r9
            java.lang.Object r11 = r1.M2(r11, r7)
            if (r11 != r0) goto L96
            goto La6
        L96:
            r13 = r12
            r12 = r14
        L98:
            r7.u = r13
            r7.v = r10
            r7.f317491w = r12
            r7.z = r8
            java.lang.Object r11 = r1.L2(r7)
            if (r11 != r0) goto La7
        La6:
            return r0
        La7:
            ywj.h r11 = new ywj.h
            com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method r13 = r13.f16180c
            r11.<init>(r12, r13)
            r1.C2(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.K2(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c, bjl.n0, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r7.a(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ywj.n
            if (r0 == 0) goto L13
            r0 = r7
            ywj.n r0 = (ywj.n) r0
            int r1 = r0.f317487w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317487w = r1
            goto L18
        L13:
            ywj.n r0 = new ywj.n
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317487w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L62
        L2b:
            r7 = move-exception
            goto L65
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L39
            goto L4b
        L39:
            r7 = move-exception
            goto L4e
        L3b:
            yhm.o.b(r7)
            yva.a r7 = r6.v     // Catch: java.lang.Exception -> L39
            r0.f317487w = r5     // Catch: java.lang.Exception -> L39
            cwa.j r7 = (cwa.j) r7     // Catch: java.lang.Exception -> L39
            java.lang.Object r7 = r7.b(r0)     // Catch: java.lang.Exception -> L39
            if (r7 != r1) goto L4b
            goto L61
        L4b:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L39
            goto L57
        L4e:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r5 = rd0.d.f253311a
            rd0.c r5 = rd0.c.ERROR
            rd0.d.a(r5, r3, r3, r7, r2)
        L57:
            c6b.j r7 = r6.f101715w     // Catch: java.lang.Exception -> L2b
            r0.f317487w = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2b
            goto L6e
        L65:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r7, r0)
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.L2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new yi5.b(26));
    }

    public final Object M2(RevolutSsoApi$SignUpOutputData$Authenticated$Method revolutSsoApi$SignUpOutputData$Authenticated$Method, gim.c cVar) throws Throwable {
        boolean z = revolutSsoApi$SignUpOutputData$Authenticated$Method instanceof RevolutSsoApi$SignUpOutputData$Authenticated$Method.Email;
        p pVar = this.f101713s;
        if (z) {
            Object objH = pVar.h(new o0j.h(((RevolutSsoApi$SignUpOutputData$Authenticated$Method.Email) revolutSsoApi$SignUpOutputData$Authenticated$Method).f105873a), cVar);
            return objH == fim.a.COROUTINE_SUSPENDED ? objH : Unit.f186387a;
        }
        if (!(revolutSsoApi$SignUpOutputData$Authenticated$Method instanceof RevolutSsoApi$SignUpOutputData$Authenticated$Method.Phone)) {
            if (revolutSsoApi$SignUpOutputData$Authenticated$Method == null) {
                return Unit.f186387a;
            }
            throw new NoWhenBranchMatchedException();
        }
        RevolutSsoApi$SignUpOutputData$Authenticated$Method.Phone phone = (RevolutSsoApi$SignUpOutputData$Authenticated$Method.Phone) revolutSsoApi$SignUpOutputData$Authenticated$Method;
        o0j.p phoneData = new o0j.p(phone.f105876c.f297794a, hx7.a.J(phone.f105875b), phone.f105874a);
        pVar.getClass();
        Intrinsics.checkNotNullParameter(phoneData, "phoneData");
        f fVar = (f) pVar.f138685a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(phoneData, "phoneData");
        pfm.h hVar = new pfm.h(new rzc.b(phoneData, fVar, 19), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        Object objA = nim.a.a(w.g0(hVar), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(java.lang.String r15, java.lang.String r16, rl0.b r17, boolean r18, wi0.b r19, gim.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.N2(java.lang.String, java.lang.String, rl0.b, boolean, wi0.b, gim.c):java.lang.Object");
    }

    public final void O2(rl0.b bVar) {
        boolean z = bVar instanceof rl0.a;
        zm0.b bVar2 = this.f101716x;
        if (z) {
            ((cn0.g) bVar2).l(new mm0.i(rl0.d.PASSCODE));
            ((cn0.g) bVar2).l(new mm0.h(((rl0.a) bVar).f254906a));
            return;
        }
        if (bVar instanceof b.a) {
            ((cn0.g) bVar2).l(new mm0.i(rl0.d.PASSKEY));
        } else if (bVar != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof SignInNotAllowedDueToAgeException) {
            i iVar = this.C;
            h.r2(iVar);
            h.t2(this, iVar, new RetailRevolutSsoFlowContract$Step.GraduationNotAvailableYet(((SignInNotAllowedDueToAgeException) throwable).f86688a), false, null, false, 12);
            return true;
        }
        if (throwable instanceof HandledNetworkException) {
            return true;
        }
        if (throwable instanceof NetworkConnectException) {
            return false;
        }
        l.b1(this, X1(new y0("sign_in_failed", new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 4)), null, new m(this, null, 1), 3);
        gom.e.f145194a.e(throwable);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.C;
    }
}
