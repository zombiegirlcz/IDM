package com.revolut.retail.feature.impl.userauth.flow;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.onboarding.api.onboarding.OnboardingLanguageChangePromptDestination;
import cwj.i;
import cwj.j;
import fwj.p;
import h30.q;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mm0.m;
import mm0.n;
import mm0.o;
import oki.h;
import org.jetbrains.annotations.NotNull;
import v60.g;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends h implements cwj.e {

    @NotNull
    public static final i Companion = new i();
    public final g A;
    public final bng.b B;
    public final b90.e C;
    public final f86.a D;
    public final sf0.h E;
    public final v60.e F;
    public final uc.d G;
    public final cwj.a H;
    public final mli.e I;
    public final zm0.c J;
    public final AtomicBoolean K;
    public final qki.d L;
    public final yki.i M;
    public final UserOnboardingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f101675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ing.b f101676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f101677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hxj.b f101678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bjl.f f101679t;
    public final fkl.i u;
    public final fwj.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.retail.feature.api.userauth.navigation.a f101680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jte.c f101681x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final xoj.a f101682y;
    public final dl0.a z;

    public f(UserOnboardingFlowContract$InputData inputData, p userOnboardingInteractor, ing.b legacyUserStorage, q userOnboardingPhoneDataHelper, hxj.b userOnboardingAddressHelper, bjl.f otpContentInteractor, fkl.i ssoDeeplinkResultHandler, fwj.b onboardingLogoutInteractor, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, jte.c experimentsFetchingInteractor, xoj.a featuresInteractor, dl0.a checkUSLocaleInteractor, g restrictedAccessRepository, bng.b accountLockManager, b90.e notificationsStatusProvider, f86.a deviceLockProtectionChecker, sf0.h serverErrorParser, v60.e serverErrorsProvider, uc.d userOnboardingDeviceFingerprintManager, cwj.a activationAnimationCoordinator, mli.e userLogoutInteractor, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(legacyUserStorage, "legacyUserStorage");
        Intrinsics.checkNotNullParameter(userOnboardingPhoneDataHelper, "userOnboardingPhoneDataHelper");
        Intrinsics.checkNotNullParameter(userOnboardingAddressHelper, "userOnboardingAddressHelper");
        Intrinsics.checkNotNullParameter(otpContentInteractor, "otpContentInteractor");
        Intrinsics.checkNotNullParameter(ssoDeeplinkResultHandler, "ssoDeeplinkResultHandler");
        Intrinsics.checkNotNullParameter(onboardingLogoutInteractor, "onboardingLogoutInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(experimentsFetchingInteractor, "experimentsFetchingInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(checkUSLocaleInteractor, "checkUSLocaleInteractor");
        Intrinsics.checkNotNullParameter(restrictedAccessRepository, "restrictedAccessRepository");
        Intrinsics.checkNotNullParameter(accountLockManager, "accountLockManager");
        Intrinsics.checkNotNullParameter(notificationsStatusProvider, "notificationsStatusProvider");
        Intrinsics.checkNotNullParameter(deviceLockProtectionChecker, "deviceLockProtectionChecker");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(userOnboardingDeviceFingerprintManager, "userOnboardingDeviceFingerprintManager");
        Intrinsics.checkNotNullParameter(activationAnimationCoordinator, "activationAnimationCoordinator");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.o = inputData;
        this.f101675p = userOnboardingInteractor;
        this.f101676q = legacyUserStorage;
        this.f101677r = userOnboardingPhoneDataHelper;
        this.f101678s = userOnboardingAddressHelper;
        this.f101679t = otpContentInteractor;
        this.u = ssoDeeplinkResultHandler;
        this.v = onboardingLogoutInteractor;
        this.f101680w = userOnboardingNavigationProvider;
        this.f101681x = experimentsFetchingInteractor;
        this.f101682y = featuresInteractor;
        this.z = checkUSLocaleInteractor;
        this.A = restrictedAccessRepository;
        this.B = accountLockManager;
        this.C = notificationsStatusProvider;
        this.D = deviceLockProtectionChecker;
        this.E = serverErrorParser;
        this.F = serverErrorsProvider;
        this.G = userOnboardingDeviceFingerprintManager;
        this.H = activationAnimationCoordinator;
        this.I = userLogoutInteractor;
        this.J = sessionProvider;
        this.K = new AtomicBoolean(false);
        this.L = hx7.e.b(this, L2());
        this.M = d8l.d.a(this, new cwj.h(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        if (r10.N2(r0) == r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0105, code lost:
    
        if (r10.p2(r0, r11) == r2) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.impl.userauth.flow.f r10, q89.f r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.flow.f.I2(com.revolut.retail.feature.impl.userauth.flow.f, q89.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.impl.userauth.flow.f r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.flow.f.J2(com.revolut.retail.feature.impl.userauth.flow.f, gim.c):java.lang.Object");
    }

    public static UserOnboardingFlowContract$State L2() {
        wi0.b.Companion.getClass();
        return new UserOnboardingFlowContract$State(null, null, new Address(null, null, null, null, null, "GB", null, null, null, null, null, null, null, null, null, 32735, null));
    }

    public final void K2() {
        if (this.z.a(nz8.d.p(((UserOnboardingFlowContract$State) ((j2) this.L.f22677a).getValue()).f101655c).f297794a)) {
            C1(new OnboardingLanguageChangePromptDestination(false));
        } else {
            l2(new j(this, null, 5), new cwj.g(this, 0));
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new cn0.d(this, null, 23), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cwj.l
            if (r0 == 0) goto L13
            r0 = r6
            cwj.l r0 = (cwj.l) r0
            int r1 = r0.f109841w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109841w = r1
            goto L18
        L13:
            cwj.l r0 = new cwj.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109841w
            qki.d r3 = r5.L
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            goto L4f
        L29:
            r6 = move-exception
            goto L5d
        L2b:
            r6 = move-exception
            goto L6a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            yhm.o.b(r6)
            hxj.b r6 = r5.f101678s     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r2 = r3.f22677a     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            vkm.j2 r2 = (vkm.j2) r2     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$State r2 = (com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$State) r2     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$State$PhoneData r2 = r2.f101654b     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            r0.f109841w = r4     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            java.io.Serializable r6 = r6.a(r2, r0)     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            if (r6 != r1) goto L4f
            return r1
        L4f:
            com.revolut.feature.address.models.Address r6 = (com.revolut.feature.address.models.Address) r6     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            avj.p r0 = new avj.p     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            r1 = 2
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            r5.H2(r3, r0)     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2b
            goto L67
        L5d:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
        L67:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.flow.f.M2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (M2(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cwj.m
            if (r0 == 0) goto L13
            r0 = r6
            cwj.m r0 = (cwj.m) r0
            int r1 = r0.f109842w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109842w = r1
            goto L18
        L13:
            cwj.m r0 = new cwj.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109842w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L4b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L42
        L36:
            yhm.o.b(r6)
            r0.f109842w = r4
            java.lang.Object r6 = r5.O2(r0)
            if (r6 != r1) goto L42
            goto L4a
        L42:
            r0.f109842w = r3
            java.lang.Object r6 = r5.M2(r0)
            if (r6 != r1) goto L4b
        L4a:
            return r1
        L4b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.flow.f.N2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof cwj.n
            if (r0 == 0) goto L13
            r0 = r5
            cwj.n r0 = (cwj.n) r0
            int r1 = r0.f109843w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109843w = r1
            goto L18
        L13:
            cwj.n r0 = new cwj.n
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109843w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L56
        L29:
            r5 = move-exception
            goto L63
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            h30.q r5 = r4.f101677r     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            rfm.l r5 = r5.z0()     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.f109843w = r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = nim.a.b(r5, r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            o0j.p r5 = (o0j.p) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            qki.d r0 = r4.L     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            cul.n0 r1 = new cul.n0     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 14
            r1.<init>(r5, r2)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r4.H2(r0, r1)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L60
        L56:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
        L60:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L63:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.flow.f.O2(gim.c):java.lang.Object");
    }

    public final boolean P2() {
        o oVarD = ((cn0.g) this.J).d();
        if ((oVarD instanceof mm0.p) || (oVarD instanceof n)) {
            return true;
        }
        if ((oVarD instanceof m) || oVarD.equals(o.a.f207118b)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof cwj.o
            if (r0 == 0) goto L13
            r0 = r5
            cwj.o r0 = (cwj.o) r0
            int r1 = r0.f109844w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109844w = r1
            goto L18
        L13:
            cwj.o r0 = new cwj.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109844w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            fwj.p r5 = r4.f101675p
            efm.r r5 = r5.e()
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r0.f109844w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.flow.f.Q2(gim.c):java.lang.Object");
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.L;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.M;
    }
}
