package com.revolut.feature.security_hub.limits;

import android.os.Bundle;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import fsi.b;
import fsi.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.t0;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import sri.m;
import swc.e;
import swc.f;
import swc.i;
import swc.j;
import vkm.q;
import vkm.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends c implements qf0.a {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f85794h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qf0.c f85795j;
    public final t0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f85796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cl3.a f85797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f85798n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a2 f85799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f85800q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CoroutineScope appCoroutineScope, m navigator, qf0.c exceptionsOverseer, t0 statusDialogDisplayerDelegate, i securityHubLimitsErrorParser, cl3.a contactsInteractor, f securityHubDialogToShowCache, e securityHubLimitErrorNameMapper) {
        super(new b("SecurityHubLimitsGuardian"));
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        Intrinsics.checkNotNullParameter(statusDialogDisplayerDelegate, "statusDialogDisplayerDelegate");
        Intrinsics.checkNotNullParameter(securityHubLimitsErrorParser, "securityHubLimitsErrorParser");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(securityHubDialogToShowCache, "securityHubDialogToShowCache");
        Intrinsics.checkNotNullParameter(securityHubLimitErrorNameMapper, "securityHubLimitErrorNameMapper");
        this.f85794h = appCoroutineScope;
        this.i = navigator;
        this.f85795j = exceptionsOverseer;
        this.k = statusDialogDisplayerDelegate;
        this.f85796l = securityHubLimitsErrorParser;
        this.f85797m = contactsInteractor;
        this.f85798n = securityHubDialogToShowCache;
        this.o = securityHubLimitErrorNameMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(com.revolut.feature.security_hub.limits.a r6, com.revolut.feature.security_hub.limits.SecurityHubLimitsGuardian$DialogPayload r7, nii.n1 r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof swc.n
            if (r0 == 0) goto L13
            r0 = r9
            swc.n r0 = (swc.n) r0
            int r1 = r0.f266193x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266193x = r1
            goto L18
        L13:
            swc.n r0 = new swc.n
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266193x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            sri.m r6 = r0.u
            yhm.o.b(r9)
            goto L74
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r9)
            com.revolut.feature.security_hub.limits.SecurityHubLimitsGuardian$DialogPayload$MyLimit r9 = com.revolut.feature.security_hub.limits.SecurityHubLimitsGuardian$DialogPayload.MyLimit.f85791a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r7, r9)
            if (r9 == 0) goto L46
            boolean r7 = r8 instanceof nii.m1
            if (r7 == 0) goto L89
            com.revolut.feature.security_hub.api.SecurityHubStartScreen$TransactionsLimits r7 = com.revolut.feature.security_hub.api.SecurityHubStartScreen.TransactionsLimits.f85391a
            r6.Q(r7)
            goto L89
        L46:
            com.revolut.feature.security_hub.limits.SecurityHubLimitsGuardian$DialogPayload$NonHoldableStreetMode r9 = com.revolut.feature.security_hub.limits.SecurityHubLimitsGuardian$DialogPayload.NonHoldableStreetMode.f85792a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r7, r9)
            if (r9 == 0) goto L58
            boolean r7 = r8 instanceof nii.m1
            if (r7 == 0) goto L89
            com.revolut.feature.security_hub.api.SecurityHubStartScreen$WealthProtection r7 = com.revolut.feature.security_hub.api.SecurityHubStartScreen.WealthProtection.f85392a
            r6.Q(r7)
            goto L89
        L58:
            boolean r9 = r7 instanceof com.revolut.feature.security_hub.limits.SecurityHubLimitsGuardian$DialogPayload.OtherUserLimit
            if (r9 == 0) goto L8c
            boolean r8 = r8 instanceof nii.l1
            if (r8 == 0) goto L89
            sri.m r8 = r6.i
            com.revolut.feature.security_hub.limits.SecurityHubLimitsGuardian$DialogPayload$OtherUserLimit r7 = (com.revolut.feature.security_hub.limits.SecurityHubLimitsGuardian$DialogPayload.OtherUserLimit) r7
            java.lang.String r7 = r7.getF85793a()
            r0.u = r8
            r0.f266193x = r3
            java.lang.Object r9 = r6.O(r7, r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            r6 = r8
        L74:
            r1 = r9
            zm3.a r1 = (zm3.a) r1
            com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig$PaymentsProfileChat r0 = new com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig$PaymentsProfileChat
            r4 = 1
            r2 = 0
            r3 = 0
            r5 = 22
            r0.<init>(r1, r2, r3, r4, r5)
            com.revolut.retail.core.navigation.FeatureCommand r7 = new com.revolut.retail.core.navigation.FeatureCommand
            r7.<init>(r0)
            r6.c(r7)
        L89:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L8c:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.limits.a.N(com.revolut.feature.security_hub.limits.a, com.revolut.feature.security_hub.limits.SecurityHubLimitsGuardian$DialogPayload, nii.n1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof swc.k
            if (r0 == 0) goto L13
            r0 = r6
            swc.k r0 = (swc.k) r0
            int r1 = r0.f266188w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266188w = r1
            goto L18
        L13:
            swc.k r0 = new swc.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266188w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            cl3.a r6 = r4.f85797m
            wl3.h r6 = (wl3.h) r6
            rfm.z r2 = r6.b(r5)
            ufm.n r5 = r6.g(r5)
            rfm.l r5 = r2.l(r5)
            java.lang.String r6 = "switchIfEmpty(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.f266188w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.limits.a.O(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    @Override // qf0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(java.lang.Exception r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            swc.i r5 = r3.f85796l
            r5.getClass()
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4 instanceof com.revolut.core.network.exceptions.NetworkException
            r1 = 0
            if (r0 == 0) goto L92
            r0 = r4
            com.revolut.core.network.exceptions.NetworkException r0 = (com.revolut.core.network.exceptions.NetworkException) r0
            java.lang.String r0 = r0.d
            if (r0 == 0) goto L92
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            kg.o r5 = r5.f266187a     // Catch: java.lang.Throwable -> L2a
            com.revolut.core.network.exceptions.NetworkException r4 = (com.revolut.core.network.exceptions.NetworkException) r4     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r4.d     // Catch: java.lang.Throwable -> L2a
            kotlin.jvm.internal.Intrinsics.h(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<swc.g> r0 = swc.g.class
            java.lang.Object r4 = r5.c(r4, r0)     // Catch: java.lang.Throwable -> L2a
            swc.g r4 = (swc.g) r4     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r4 = move-exception
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.n r4 = yhm.o.a(r4)
        L31:
            boolean r5 = r4 instanceof yhm.n
            if (r5 == 0) goto L36
            r4 = r1
        L36:
            swc.g r4 = (swc.g) r4
            if (r4 == 0) goto L43
            int r5 = r4.getCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L44
        L43:
            r5 = r1
        L44:
            if (r5 != 0) goto L47
            goto L4f
        L47:
            int r0 = r5.intValue()
            r2 = 4055(0xfd7, float:5.682E-42)
            if (r0 == r2) goto L87
        L4f:
            if (r5 != 0) goto L52
            goto L5b
        L52:
            int r0 = r5.intValue()
            r2 = 4056(0xfd8, float:5.684E-42)
            if (r0 != r2) goto L5b
            goto L87
        L5b:
            if (r5 != 0) goto L5e
            goto L69
        L5e:
            int r0 = r5.intValue()
            r2 = 4070(0xfe6, float:5.703E-42)
            if (r0 != r2) goto L69
            swc.b r4 = swc.b.f266180a
            goto L93
        L69:
            if (r5 != 0) goto L6c
            goto L92
        L6c:
            int r5 = r5.intValue()
            r0 = 4057(0xfd9, float:5.685E-42)
            if (r5 != r0) goto L92
            java.lang.String r5 = r4.getOwnerCode()
            java.lang.String r4 = r4.getOwnerName()
            if (r5 == 0) goto L92
            if (r4 == 0) goto L92
            swc.c r0 = new swc.c
            r0.<init>(r4, r5)
            r4 = r0
            goto L93
        L87:
            swc.a r5 = new swc.a
            java.lang.String r4 = r4.getLimitName()
            r5.<init>(r4)
            r4 = r5
            goto L93
        L92:
            r4 = r1
        L93:
            if (r4 == 0) goto La9
            swc.f r5 = r3.f85798n
            r5.getClass()
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            vkm.j2 r5 = r5.f266183a
            r5.getClass()
            r5.g(r1, r4)
            r4 = 1
            goto Laa
        La9:
            r4 = 0
        Laa:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.limits.a.P(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void Q(SecurityHubStartScreen securityHubStartScreen) {
        this.i.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SecurityHubDestination(securityHubStartScreen, false, (String) null, true, 22), false, (Integer) null, 0, 61)));
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        this.k.getClass();
    }

    @Override // fsi.c, fsi.a
    public final void onDestroy() {
        super.onDestroy();
        this.k.e();
    }

    @Override // fsi.a
    public final void onResume() {
        this.f85800q = q.G(t1.F(new q0(new vkm.t0(this.f85798n.f266183a, 1), new swc.m(this, null, 1), 1)), this.f85794h);
    }

    @Override // fsi.a
    public final void onStart() {
        t0 t0Var = this.k;
        t0Var.c();
        this.f85799p = q.G(new q0(new mii.c(rd0.e.b(t0Var.f216224h), 2), new swc.m(this, null, 0), 1), this.f85794h);
        this.f85795j.b(this);
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        this.f85795j.a(this);
        a2 a2Var = this.f85799p;
        if (a2Var != null) {
            a2Var.f(null);
        }
        a2 a2Var2 = this.f85800q;
        if (a2Var2 != null) {
            a2Var2.f(null);
        }
        this.k.f();
    }
}
