package com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication;

import aza.g;
import cn0.c;
import cn0.e;
import d8l.d;
import hn0.n;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements bb7.b {
    public final BiometricAuthenticationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f74656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zm0.b f74657q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f74658r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final oe9.a f74659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f74660t;
    public final i u;

    public b(BiometricAuthenticationFlowContract$InputData inputData, c passcodeMetadataProvider, zm0.b sessionController, n securityRepositoryInteractor, oe9.a passcodeVerificationDispatcher, e primaryAuthCredentialsTypeProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(passcodeMetadataProvider, "passcodeMetadataProvider");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(securityRepositoryInteractor, "securityRepositoryInteractor");
        Intrinsics.checkNotNullParameter(passcodeVerificationDispatcher, "passcodeVerificationDispatcher");
        Intrinsics.checkNotNullParameter(primaryAuthCredentialsTypeProvider, "primaryAuthCredentialsTypeProvider");
        this.o = inputData;
        this.f74656p = passcodeMetadataProvider;
        this.f74657q = sessionController;
        this.f74658r = securityRepositoryInteractor;
        this.f74659s = passcodeVerificationDispatcher;
        this.f74660t = primaryAuthCredentialsTypeProvider;
        this.u = d.a(this, new b7d.c(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof bb7.d
            if (r0 == 0) goto L13
            r0 = r11
            bb7.d r0 = (bb7.d) r0
            int r1 = r0.f14178w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14178w = r1
            goto L18
        L13:
            bb7.d r0 = new bb7.d
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f14178w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L48
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2f:
            yhm.o.b(r11)
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            r8 = 6
            r9 = 0
            oe9.d r5 = oe9.d.f224567a
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f14178w = r3
            oe9.a r11 = r10.f74659s
            java.lang.Object r11 = r11.a(r4, r0)
            if (r11 != r1) goto L48
            return r1
        L48:
            com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.BiometricAuthenticationFlowContract$InputData r11 = r10.o
            com.revolut.retail.core.navigation.NaviCommand r11 = r11.f74652a
            if (r11 == 0) goto L55
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = zh9.u0.b(r11)
            r10.C1(r11)
        L55:
            qa7.b r11 = qa7.b.f243971a
            r10.C2(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b.I2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new g(this, null, 9), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
