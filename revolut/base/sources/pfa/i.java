package pfa;

import android.net.Uri;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onh.b f235555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w51.a f235556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f235557c;
    public final l93.b d;
    public final swj.a e;
    public final uwj.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uia.a f235558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x9k.a f235559h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f235560j;
    public final gte.a k;

    public i(onh.b postActivationStatusProvider, w51.a appEntryPointInteractor, f80.a uriHelper, l93.b cardsInteractor, swj.a virtualCardPromptProvider, uwj.a localPromptsProvider, uia.a proPostActivationCommandFactory, aa5.a pcwNavigationFactory, x9k.a pcwAuthInteractor, a planSelectionDestinationResolver, m retailCreditOnboardingNavigationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(postActivationStatusProvider, "postActivationStatusProvider");
        Intrinsics.checkNotNullParameter(appEntryPointInteractor, "appEntryPointInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(virtualCardPromptProvider, "virtualCardPromptProvider");
        Intrinsics.checkNotNullParameter(localPromptsProvider, "localPromptsProvider");
        Intrinsics.checkNotNullParameter(proPostActivationCommandFactory, "proPostActivationCommandFactory");
        Intrinsics.checkNotNullParameter(pcwNavigationFactory, "pcwNavigationFactory");
        Intrinsics.checkNotNullParameter(pcwAuthInteractor, "pcwAuthInteractor");
        Intrinsics.checkNotNullParameter(planSelectionDestinationResolver, "planSelectionDestinationResolver");
        Intrinsics.checkNotNullParameter(retailCreditOnboardingNavigationProvider, "retailCreditOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f235555a = postActivationStatusProvider;
        this.f235556b = appEntryPointInteractor;
        this.f235557c = uriHelper;
        this.d = cardsInteractor;
        this.e = virtualCardPromptProvider;
        this.f = localPromptsProvider;
        this.f235558g = proPostActivationCommandFactory;
        this.f235559h = pcwAuthInteractor;
        this.i = planSelectionDestinationResolver;
        this.f235560j = retailCreditOnboardingNavigationProvider;
        this.k = featureToggleInteractor;
    }

    public static FeatureCommand b(Uri uri2) {
        s49.a aVar = s49.a.AS_TOP;
        return gc0.c.f(uri2 != null ? new MainScreenFeatureConfig.WithInnerConfiguration(aVar, new MainContainerInnerConfiguration(u49.a.f277275a, null, new BrowserCommand(uri2), 2)) : new MainScreenFeatureConfig.JustShow(aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(pfa.i r4, gfa.a r5, boolean r6, wi0.b r7, boolean r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof pfa.f
            if (r0 == 0) goto L13
            r0 = r9
            pfa.f r0 = (pfa.f) r0
            int r1 = r0.f235551w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235551w = r1
            goto L18
        L13:
            pfa.f r0 = new pfa.f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235551w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r8 = r0.u
            yhm.o.b(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r9)
            r0.u = r8
            r0.f235551w = r3
            java.lang.Object r9 = r4.f(r5, r6, r7, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            com.revolut.kompot.bridge.navigation.BridgeDestination r4 = zh9.u0.b(r9)
            if (r8 == 0) goto L4d
            hfa.b r5 = new hfa.b
            r5.<init>(r4)
            return r5
        L4d:
            hfa.a r5 = new hfa.a
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pfa.i.d(pfa.i, gfa.a, boolean, wi0.b, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(wi0.b r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof pfa.d
            if (r0 == 0) goto L13
            r0 = r9
            pfa.d r0 = (pfa.d) r0
            int r1 = r0.f235547w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235547w = r1
            goto L18
        L13:
            pfa.d r0 = new pfa.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235547w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L7f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            l93.b r9 = r7.d
            ha3.j r9 = (ha3.j) r9
            l93.f r2 = r9.f150411b
            r4 = 0
            ha3.x r2 = (ha3.x) r2
            ufm.i r2 = r2.s(r4)
            ha3.i r4 = new ha3.i
            r5 = 0
            r6 = 0
            r4.<init>(r9, r6, r5)
            ha1.s r9 = new ha1.s
            r5 = 6
            r9.<init>(r5, r4)
            ufm.i r4 = new ufm.i
            r5 = 0
            r4.<init>(r2, r9, r5)
            java.lang.String r9 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)
            p5e.h r2 = new p5e.h
            r5 = 17
            r2.<init>(r7, r8, r5)
            pfa.c r8 = new pfa.c
            r5 = 0
            r8.<init>(r2, r5)
            ufm.i r2 = new ufm.i
            r2.<init>(r4, r8, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            pfa.b r8 = new pfa.b
            r9 = 1
            r8.<init>(r7, r9)
            ufm.i r8 = ue0.e.D(r2, r8)
            r0.f235547w = r3
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L7f
            return r1
        L7f:
            java.lang.String r8 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pfa.i.a(wi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r8, wi0.b r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pfa.i.c(boolean, wi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            boolean r2 = r1 instanceof pfa.g
            if (r2 == 0) goto L17
            r2 = r1
            pfa.g r2 = (pfa.g) r2
            int r3 = r2.f235553x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f235553x = r3
            goto L1c
        L17:
            pfa.g r2 = new pfa.g
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f235553x
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            b93.e r2 = r2.u
            yhm.o.b(r1)
            r3 = r2
            goto L4e
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            yhm.o.b(r1)
            b93.e r1 = b93.e.VIRTUAL
            uwj.a r4 = r0.f
            ufm.i r4 = r4.a()
            r2.u = r1
            r2.f235553x = r5
            java.lang.Object r2 = nim.a.b(r4, r2)
            if (r2 != r3) goto L4c
            return r3
        L4c:
            r3 = r1
            r1 = r2
        L4e:
            r15 = r1
            com.revolut.retail.core.navigation.NaviCommand r15 = (com.revolut.retail.core.navigation.NaviCommand) r15
            com.revolut.analytics.tracking.v3.AnalyticsProduct$a r1 = com.revolut.analytics.tracking.v3.AnalyticsProduct.INSTANCE
            grl.k9 r2 = frl.a.k
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r18 = com.google.android.gms.internal.mlkit_vision_face.a.g(r1, r2, r2)
            com.revolut.feature.card_design.api.CardDesignFeatureConfig r2 = new com.revolut.feature.card_design.api.CardDesignFeatureConfig
            r24 = 0
            r25 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 536313854(0x1ff77ffe, float:1.04820314E-19)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pfa.i.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        if (r2 == r4) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gfa.a r17, boolean r18, wi0.b r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pfa.i.f(gfa.a, boolean, wi0.b, gim.c):java.lang.Object");
    }
}
