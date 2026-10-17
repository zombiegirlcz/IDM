package com.revolut.feature.junior_onboarding.impl.ui.app_invite;

import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import te8.z;
import y8a.g;
import yh8.c;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements yh8.b {

    @NotNull
    public static final c Companion = new c();
    public final JuniorOnboardingDestination.AppInvite.InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f76983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r70.c f76984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kbb.c f76985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z f76986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ai8.a f76987t;
    public final yki.a u;

    public b(JuniorOnboardingDestination.AppInvite.InputData inputData, c70.a clipboard, r70.c hapticEngine, kbb.c juniorConfigInteractor, z juniorProductsInteractor, ai8.a juniorAppInviteDescriptionItemProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(juniorAppInviteDescriptionItemProvider, "juniorAppInviteDescriptionItemProvider");
        this.o = inputData;
        this.f76983p = clipboard;
        this.f76984q = hapticEngine;
        this.f76985r = juniorConfigInteractor;
        this.f76986s = juniorProductsInteractor;
        this.f76987t = juniorAppInviteDescriptionItemProvider;
        g gVar = new g(this, 28);
        this.u = d.a(this, JuniorAppInviteFlowContract$Step.Prompt.f76982a, f0.f322471a, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_onboarding.impl.ui.app_invite.b r6, gim.c r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof yh8.e
            if (r0 == 0) goto L16
            r0 = r7
            yh8.e r0 = (yh8.e) r0
            int r1 = r0.f313883w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f313883w = r1
            goto L1b
        L16:
            yh8.e r0 = new yh8.e
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f313883w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            te8.z r7 = r6.f76986s
            r2 = 0
            r4 = 0
            efm.r r7 = r7.a(r4, r2)
            vkm.d r7 = rd0.e.b(r7)
            yd8.a r2 = new yd8.a
            r5 = 11
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.f313883w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            java.util.Map r7 = (java.util.Map) r7
            com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$AppInvite$InputData r6 = r6.o
            java.lang.String r6 = r6.f76962b
            java.lang.Object r6 = r7.get(r6)
            if (r6 == 0) goto L9f
            of8.b r6 = (of8.b) r6
            pf8.m r7 = r6.f224755m
            of8.a r7 = r7.f235520a
            boolean r7 = i26.l.j(r7)
            if (r7 != 0) goto L7b
            pf8.m r7 = r6.f224754l
            of8.a r7 = r7.f235520a
            boolean r7 = i26.l.j(r7)
            if (r7 == 0) goto L78
            goto L7b
        L78:
            com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step$Description$CardProductState$Disabled r7 = com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract.Step.Description.CardProductState.Disabled.f76980a
            goto L7d
        L7b:
            com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step$Description$CardProductState$Enabled r7 = com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract.Step.Description.CardProductState.Enabled.f76981a
        L7d:
            pf8.n r0 = r6.f
            of8.a r0 = r0.f235521a
            boolean r0 = i26.l.j(r0)
            if (r0 == 0) goto L8a
            com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step$Description$AdditionalProductState$SavingsEnabled r6 = com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract.Step.Description.AdditionalProductState.SavingsEnabled.f76978a
            goto L99
        L8a:
            pf8.p r6 = r6.e
            of8.a r6 = r6.f235523a
            boolean r6 = i26.l.j(r6)
            if (r6 == 0) goto L97
            com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step$Description$AdditionalProductState$VaultsEnabled r6 = com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract.Step.Description.AdditionalProductState.VaultsEnabled.f76979a
            goto L99
        L97:
            com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step$Description$AdditionalProductState$Disabled r6 = com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract.Step.Description.AdditionalProductState.Disabled.f76977a
        L99:
            com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step$Description r0 = new com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step$Description
            r0.<init>(r7, r6)
            return r0
        L9f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "JuniorAppInviteFlowModel. Junior products not found"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.app_invite.b.I2(com.revolut.feature.junior_onboarding.impl.ui.app_invite.b, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
