package com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method;

import cu8.r0;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rbh.k;
import rve.i;
import rze.b;
import rze.j;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final StoredMethodTopUpFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f91025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fk3.a f91026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oe6.a f91027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f91028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f91029t;
    public final n u;
    public final r0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.i f91030w;

    public a(StoredMethodTopUpFlowContract$InputData inputData, f80.a uriHelper, fk3.a configurationInteractor, oe6.a externalInstitutionsInteractor, i storedMethodInteractor, gte.a featureToggleInteractor, n walletInteractor, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(storedMethodInteractor, "storedMethodInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.o = inputData;
        this.f91025p = uriHelper;
        this.f91026q = configurationInteractor;
        this.f91027r = externalInstitutionsInteractor;
        this.f91028s = storedMethodInteractor;
        this.f91029t = featureToggleInteractor;
        this.u = walletInteractor;
        this.v = kycRequiredActionTransformer;
        this.f91030w = d.a(this, new rl8.d(this, 26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (nim.a.a(r9, r6) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof rze.k
            if (r0 == 0) goto L14
            r0 = r9
            rze.k r0 = (rze.k) r0
            int r1 = r0.f258602w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f258602w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            rze.k r0 = new rze.k
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f258602w
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L37
            if (r1 != r7) goto L2f
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L66
        L2c:
            r0 = move-exception
            r9 = r0
            goto L6c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L55
        L3b:
            yhm.o.b(r9)
            rve.i r1 = r8.f91028s     // Catch: java.lang.Throwable -> L2c
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData r9 = r8.o     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r9.f91018a     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r9.f91019b     // Catch: java.lang.Throwable -> L2c
            r5 = r2
            dj0.d r2 = r9.f91020c     // Catch: java.lang.Throwable -> L2c
            com.revolut.domain.models.topup.TopUpContext r9 = r9.d     // Catch: java.lang.Throwable -> L2c
            r6.f258602w = r5     // Catch: java.lang.Throwable -> L2c
            r5 = r9
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r0) goto L55
            goto L65
        L55:
            wsg.n r9 = r8.u     // Catch: java.lang.Throwable -> L2c
            com.revolut.core.model.account.AccountId$Personal r1 = com.revolut.core.model.account.AccountId.Personal.f51414a     // Catch: java.lang.Throwable -> L2c
            efm.b r9 = r9.j0(r1)     // Catch: java.lang.Throwable -> L2c
            r6.f258602w = r7     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = nim.a.a(r9, r6)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r0) goto L66
        L65:
            return r0
        L66:
            rze.g r9 = rze.g.f258598a     // Catch: java.lang.Throwable -> L2c
            r8.C2(r9)     // Catch: java.lang.Throwable -> L2c
            goto L83
        L6c:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r9, r0)
            rze.d r0 = new rze.d
            r0.<init>(r9)
            r8.C2(r0)
            yki.i r8 = r8.f91030w
            oki.h.D2(r8)
        L83:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.I2(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (nim.a.a(r9, r6) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof rze.m
            if (r0 == 0) goto L14
            r0 = r9
            rze.m r0 = (rze.m) r0
            int r1 = r0.f258604w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f258604w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            rze.m r0 = new rze.m
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f258604w
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L37
            if (r1 != r7) goto L2f
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L66
        L2c:
            r0 = move-exception
            r9 = r0
            goto L6c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L55
        L3b:
            yhm.o.b(r9)
            rve.i r1 = r8.f91028s     // Catch: java.lang.Throwable -> L2c
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData r9 = r8.o     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r9.f91018a     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r9.f91019b     // Catch: java.lang.Throwable -> L2c
            r5 = r2
            dj0.d r2 = r9.f91020c     // Catch: java.lang.Throwable -> L2c
            com.revolut.domain.models.topup.TopUpContext r9 = r9.d     // Catch: java.lang.Throwable -> L2c
            r6.f258604w = r5     // Catch: java.lang.Throwable -> L2c
            r5 = r9
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r0) goto L55
            goto L65
        L55:
            wsg.n r9 = r8.u     // Catch: java.lang.Throwable -> L2c
            com.revolut.core.model.account.AccountId$Personal r1 = com.revolut.core.model.account.AccountId.Personal.f51414a     // Catch: java.lang.Throwable -> L2c
            efm.b r9 = r9.j0(r1)     // Catch: java.lang.Throwable -> L2c
            r6.f258604w = r7     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = nim.a.a(r9, r6)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r0) goto L66
        L65:
            return r0
        L66:
            rze.g r9 = rze.g.f258598a     // Catch: java.lang.Throwable -> L2c
            r8.C2(r9)     // Catch: java.lang.Throwable -> L2c
            goto L83
        L6c:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r9, r0)
            rze.h r0 = new rze.h
            r0.<init>(r9)
            r8.C2(r0)
            yki.i r8 = r8.f91030w
            oki.h.D2(r8)
        L83:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.J2(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r7.M2(r1) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (r7.M2(r1) == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a r7, gim.c r8) {
        /*
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData r0 = r7.o
            boolean r1 = r8 instanceof rze.p
            if (r1 == 0) goto L15
            r1 = r8
            rze.p r1 = (rze.p) r1
            int r2 = r1.f258606w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f258606w = r2
            goto L1a
        L15:
            rze.p r1 = new rze.p
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f258606w
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3f
            if (r3 == r6) goto L3b
            if (r3 == r5) goto L37
            if (r3 != r4) goto L2f
            yhm.o.b(r8)
            goto L8f
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r8)
            goto L83
        L3b:
            yhm.o.b(r8)
            goto L5f
        L3f:
            yhm.o.b(r8)
            gte.a r8 = r7.f91029t
            com.revolut.feature.topup_screen.api.TopupApi$Toggles$EarlyCredit r3 = com.revolut.feature.topup_screen.api.TopupApi$Toggles.EarlyCredit.f90461c
            jte.d r8 = (jte.d) r8
            boolean r8 = r8.c(r3)
            if (r8 == 0) goto L86
            oe6.a r8 = r7.f91027r
            dj0.d r3 = r0.f91020c
            java.lang.String r4 = r0.f91018a
            r1.f258606w = r6
            xg6.j r8 = (xg6.j) r8
            java.io.Serializable r8 = r8.b(r3, r1, r4)
            if (r8 != r2) goto L5f
            goto L8e
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7a
            yki.i r7 = r7.f91030w
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$Step$EarlyCredit r8 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$Step$EarlyCredit
            dj0.d r1 = r0.f91020c
            java.lang.String r0 = r0.f91018a
            r8.<init>(r1, r0)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r0 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.w2(r7, r8, r0)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L7a:
            r1.f258606w = r5
            java.lang.Object r7 = r7.M2(r1)
            if (r7 != r2) goto L83
            goto L8e
        L83:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L86:
            r1.f258606w = r4
            java.lang.Object r7 = r7.M2(r1)
            if (r7 != r2) goto L8f
        L8e:
            return r2
        L8f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.K2(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof rze.l
            if (r0 == 0) goto L13
            r0 = r13
            rze.l r0 = (rze.l) r0
            int r1 = r0.f258603w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f258603w = r1
            goto L18
        L13:
            rze.l r0 = new rze.l
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f258603w
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData r3 = r12.o
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r13)
            goto L84
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L34:
            yhm.o.b(r13)
            goto L5a
        L38:
            yhm.o.b(r13)
            dj0.d r13 = r3.f91020c
            wsg.n r2 = r12.u
            r2.getClass()
            java.lang.String r6 = "amount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r6)
            long r6 = r13.f115082a
            xi0.b r13 = r13.f115083b
            java.lang.String r13 = r13.f306286a
            pfm.r r13 = r2.o0(r6, r13)
            r0.f258603w = r5
            java.lang.Object r13 = nim.a.a(r13, r0)
            if (r13 != r1) goto L5a
            goto L83
        L5a:
            java.lang.String r7 = r3.f91018a
            java.lang.String r13 = r3.f91019b
            dj0.d r8 = r3.f91020c
            com.revolut.domain.models.topup.TopUpContext r9 = r3.d
            r0.f258603w = r4
            rve.i r2 = r12.f91028s
            oe6.a r3 = r2.f257770a
            xg6.j r3 = (xg6.j) r3
            r3.m(r13)
            gve.b r6 = r2.f257771b
            r6.getClass()
            gve.a r5 = new gve.a
            r10 = 0
            r11 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r5, r0)
            if (r13 != r1) goto L84
        L83:
            return r1
        L84:
            com.revolut.domain.models.openbanking.TopupUrlData r13 = (com.revolut.domain.models.openbanking.TopupUrlData) r13
            com.revolut.retail.core.navigation.ActivityNavigateCommand r0 = new com.revolut.retail.core.navigation.ActivityNavigateCommand
            com.revolut.retail.core.navigation.ImplicitActivityDestination r1 = new com.revolut.retail.core.navigation.ImplicitActivityDestination
            java.lang.String r13 = r13.f60407a
            f80.a r2 = r12.f91025p
            f80.b r2 = (f80.b) r2
            android.net.Uri r6 = r2.g(r13)
            r7 = 14
            java.lang.String r2 = "android.intent.action.VIEW"
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10 = 0
            r11 = 1022(0x3fe, float:1.432E-42)
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.revolut.retail.core.navigation.FinishCommand r13 = new com.revolut.retail.core.navigation.FinishCommand
            r1 = 7
            r13.<init>(r2, r2, r2, r1)
            com.revolut.retail.core.navigation.CompositeCommand r13 = com.revolut.retail.core.navigation.a.c(r13, r0)
            com.revolut.kompot.bridge.navigation.BridgeDestination r13 = zh9.u0.b(r13)
            rze.f r0 = new rze.f
            r0.<init>(r13)
            r12.C2(r0)
            yki.i r13 = r12.f91030w
            oki.h.D2(r13)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.L2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new k(this, null, 22), new j(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (L2(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rze.q
            if (r0 == 0) goto L13
            r0 = r8
            rze.q r0 = (rze.q) r0
            int r1 = r0.f258607w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f258607w = r1
            goto L18
        L13:
            rze.q r0 = new rze.q
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f258607w
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData r3 = r7.o
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)
            goto L5d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            yhm.o.b(r8)
            goto L50
        L38:
            yhm.o.b(r8)
            java.lang.String r8 = r3.f91019b
            com.revolut.domain.models.openbanking.instructions.InstructionsDomain r2 = com.revolut.domain.models.openbanking.instructions.InstructionsDomain.AddMoneyLinked
            r0.f258607w = r5
            oe6.a r5 = r7.f91027r
            xg6.j r5 = (xg6.j) r5
            r71.a r5 = r5.f305582a
            w21.o r5 = (w21.o) r5
            java.lang.Object r8 = r5.c(r8, r2, r0)
            if (r8 != r1) goto L50
            goto L5c
        L50:
            com.revolut.domain.models.openbanking.instructions.InstitutionInstructions r8 = (com.revolut.domain.models.openbanking.instructions.InstitutionInstructions) r8
            if (r8 != 0) goto L60
            r0.f258607w = r4
            java.lang.Object r8 = r7.L2(r0)
            if (r8 != r1) goto L5d
        L5c:
            return r1
        L5d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L60:
            com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$Step$Instructions r2 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$Step$Instructions
            java.lang.String r0 = r3.f91019b
            r2.<init>(r0, r8)
            com.revolut.kompot.navigable.TransitionAnimation$FADE r4 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r5 = 0
            r6 = 8
            yki.i r1 = r7.f91030w
            r3 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.M2(gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91030w;
    }
}
