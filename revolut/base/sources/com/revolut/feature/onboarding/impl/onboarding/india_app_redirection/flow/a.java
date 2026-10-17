package com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow;

import bb9.e;
import com.revolut.feature.onboarding.impl.playbilling.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;
import za9.d;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements za9.a {

    @NotNull
    public static final d Companion = new d();
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f78443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f78444q;

    public a(b onboardingPlayBillingInteractor, e redirectionPromptProvider) {
        Intrinsics.checkNotNullParameter(onboardingPlayBillingInteractor, "onboardingPlayBillingInteractor");
        Intrinsics.checkNotNullParameter(redirectionPromptProvider, "redirectionPromptProvider");
        this.o = onboardingPlayBillingInteractor;
        this.f78443p = redirectionPromptProvider;
        this.f78444q = d8l.d.a(this, new yz4.b(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof za9.e
            if (r0 == 0) goto L13
            r0 = r6
            za9.e r0 = (za9.e) r0
            int r1 = r0.f320590w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320590w = r1
            goto L18
        L13:
            za9.e r0 = new za9.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320590w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            wm3.j r6 = new wm3.j
            r2 = 27
            r4 = 0
            r6.<init>(r5, r4, r2)
            r0.f320590w = r3
            java.lang.Object r6 = r5.p2(r0, r6)
            if (r6 != r1) goto L43
            return r1
        L43:
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            java.lang.Throwable r6 = yhm.m.a(r5)
            if (r6 != 0) goto L66
            java.lang.String r5 = (java.lang.String) r5
            wi0.a r6 = wi0.b.Companion
            r6.getClass()
            wi0.b r5 = wi0.a.a(r5)
            boolean r5 = com.bumptech.glide.d.s(r5)
            if (r5 == 0) goto L5f
            goto L66
        L5f:
            com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.IndiaAppRedirectionFlowContract$Step$ChangeCountry r5 = new com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.IndiaAppRedirectionFlowContract$Step$ChangeCountry
            r6 = 0
            r5.<init>(r6)
            return r5
        L66:
            com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.IndiaAppRedirectionFlowContract$Step$DownloadIndiaApp r5 = com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.IndiaAppRedirectionFlowContract$Step.DownloadIndiaApp.f78442a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a.I2(com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new z9m.a(this, null, 2), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78444q;
    }
}
