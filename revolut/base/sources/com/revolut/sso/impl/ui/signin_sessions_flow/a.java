package com.revolut.sso.impl.ui.signin_sessions_flow;

import akl.i0;
import aza.g;
import bjl.p0;
import bql.b;
import bql.d;
import col.c;
import gu2.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import xjl.i;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d(0);
    public final akl.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f106743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f106744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f106745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i0 f106746s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uil.a f106747t;
    public final p0 u;
    public volatile boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.i f106748w;

    public a(akl.d authenticationRepository, e captchaViewControllerExtension, i configurationInteractor, c passkeysControllerModelExtension, i0 pendingAuthenticationRepository, uil.a revolutAccountsManager, p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(authenticationRepository, "authenticationRepository");
        Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(passkeysControllerModelExtension, "passkeysControllerModelExtension");
        Intrinsics.checkNotNullParameter(pendingAuthenticationRepository, "pendingAuthenticationRepository");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        this.o = authenticationRepository;
        this.f106743p = captchaViewControllerExtension;
        this.f106744q = configurationInteractor;
        this.f106745r = passkeysControllerModelExtension;
        this.f106746s = pendingAuthenticationRepository;
        this.f106747t = revolutAccountsManager;
        this.u = revolutSsoDependenciesProvider;
        this.f106748w = d8l.d.a(this, new bql.c(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.sso.impl.ui.signin_sessions_flow.a r5, com.revolut.sso.api.models.RevolutAccountSession r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof bql.f
            if (r0 == 0) goto L13
            r0 = r7
            bql.f r0 = (bql.f) r0
            int r1 = r0.f17850w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17850w = r1
            goto L18
        L13:
            bql.f r0 = new bql.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17850w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            b94.s r7 = new b94.s
            r2 = 18
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.f17850w = r3
            nki.a r5 = r5.k
            java.lang.String r6 = "handleChosenSession"
            java.lang.Object r7 = pu7.a.B(r5, r6, r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L50
            boolean r5 = r7.booleanValue()
            goto L51
        L50:
            r5 = 0
        L51:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.signin_sessions_flow.a.I2(com.revolut.sso.impl.ui.signin_sessions_flow.a, com.revolut.sso.api.models.RevolutAccountSession, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (skm.k0.b(300, r1) == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.sso.impl.ui.signin_sessions_flow.a r6, gim.c r7) {
        /*
            yki.i r0 = r6.f106748w
            boolean r1 = r7 instanceof bql.h
            if (r1 == 0) goto L15
            r1 = r7
            bql.h r1 = (bql.h) r1
            int r2 = r1.f17855x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f17855x = r2
            goto L1a
        L15:
            bql.h r1 = new bql.h
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f17855x
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            java.util.List r6 = r1.u
            java.util.List r6 = (java.util.List) r6
            yhm.o.b(r7)
            goto L71
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            yhm.o.b(r7)
            goto L55
        L3c:
            yhm.o.b(r7)
            uil.a r7 = r6.f106747t
            bjl.p0 r6 = r6.u
            rqk.k r6 = (rqk.k) r6
            r6.getClass()
            cjl.b r6 = cjl.b.RETAIL
            r1.f17855x = r5
            pjl.z0 r7 = (pjl.z0) r7
            java.lang.Object r7 = r7.i(r6, r1)
            if (r7 != r2) goto L55
            goto L70
        L55:
            r6 = r7
            java.util.List r6 = (java.util.List) r6
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L7c
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            r1.u = r7
            r1.f17855x = r4
            r3 = 300(0x12c, double:1.48E-321)
            java.lang.Object r7 = skm.k0.b(r3, r1)
            if (r7 != r2) goto L71
        L70:
            return r2
        L71:
            com.revolut.sso.impl.ui.signin_sessions_flow.SignInSessionsFlowContract$Step$ShowSessions r7 = new com.revolut.sso.impl.ui.signin_sessions_flow.SignInSessionsFlowContract$Step$ShowSessions
            r7.<init>(r6)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r6 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.z2(r0, r7, r6)
            goto L7f
        L7c:
            oki.h.D2(r0)
        L7f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.signin_sessions_flow.a.J2(com.revolut.sso.impl.ui.signin_sessions_flow.a, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new g(this, null, 26), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106748w;
    }
}
