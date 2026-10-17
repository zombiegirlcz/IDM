package com.revolut.feature.junior_onboarding.impl.ui.onboarding;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.junior_onboarding.impl.R$string;
import cu8.r0;
import d67.e;
import d67.g;
import d8l.d;
import di8.j;
import java.util.List;
import kbb.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements di8.b {
    public final JuniorOnboardingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f77001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rh8.a f77002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final uxj.a f77003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f77004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zja.a f77005t;
    public final lh8.c u;
    public final i v;

    public b(JuniorOnboardingFlowContract$InputData inputData, r0 kycRequiredActionTransformer, rh8.a accountCreationInteractor, uxj.a juniorUpgradeFactory, c juniorConfigInteractor, zja.a productArticleInteractor, lh8.c juniorOnboardingProductArticleFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(accountCreationInteractor, "accountCreationInteractor");
        Intrinsics.checkNotNullParameter(juniorUpgradeFactory, "juniorUpgradeFactory");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(juniorOnboardingProductArticleFactory, "juniorOnboardingProductArticleFactory");
        this.o = inputData;
        this.f77001p = kycRequiredActionTransformer;
        this.f77002q = accountCreationInteractor;
        this.f77003r = juniorUpgradeFactory;
        this.f77004s = juniorConfigInteractor;
        this.f77005t = productArticleInteractor;
        this.u = juniorOnboardingProductArticleFactory;
        this.v = d.a(this, new dgj.h(this, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r5.L2(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_onboarding.impl.ui.onboarding.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof di8.f
            if (r0 == 0) goto L13
            r0 = r6
            di8.f r0 = (di8.f) r0
            int r1 = r0.f114951w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114951w = r1
            goto L18
        L13:
            di8.f r0 = new di8.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114951w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L73
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L44
        L36:
            yhm.o.b(r6)
            cu8.r0 r6 = r5.f77001p
            r0.f114951w = r4
            java.lang.Object r6 = ks8.m.b(r6, r0)
            if (r6 != r1) goto L44
            goto L72
        L44:
            ks8.j r6 = (ks8.j) r6
            boolean r2 = r6 instanceof ks8.i
            if (r2 == 0) goto L62
            ks8.i r6 = (ks8.i) r6
            com.revolut.retail.core.navigation.FeatureCommand r6 = r6.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r5.C1(r6)
            di8.c r6 = di8.c.f114945a
            r5.C2(r6)
            yki.i r5 = r5.v
            oki.h.D2(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L62:
            ks8.j$a r2 = ks8.j.a.f189313a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 == 0) goto L76
            r0.f114951w = r3
            java.lang.Object r5 = r5.L2(r0)
            if (r5 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L76:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.onboarding.b.I2(com.revolut.feature.junior_onboarding.impl.ui.onboarding.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.junior_onboarding.impl.ui.onboarding.b r7, mh8.h r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof di8.i
            if (r0 == 0) goto L13
            r0 = r9
            di8.i r0 = (di8.i) r0
            int r1 = r0.f114957y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114957y = r1
            goto L18
        L13:
            di8.i r0 = new di8.i
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f114955w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114957y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = r0.v
            yhm.o.b(r9)
            goto L80
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour r8 = r0.u
            yhm.o.b(r9)
            goto L67
        L3b:
            yhm.o.b(r9)
            int[] r9 = di8.e.f114949b
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r4) goto L89
            if (r8 == r3) goto L56
            r9 = 3
            if (r8 != r9) goto L50
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$AlwaysShow r8 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.AlwaysShow.f81285a
            goto L58
        L50:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L56:
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r8 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
        L58:
            lh8.c r9 = r7.u
            r0.u = r8
            r0.f114957y = r4
            rh8.c0 r9 = (rh8.c0) r9
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L67
            goto L7c
        L67:
            com.revolut.feature.product_article.api.models.ProductArticleParams r9 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r9
            if (r9 != 0) goto L6c
            goto L89
        L6c:
            zja.a r7 = r7.f77005t
            r0.u = r5
            r0.v = r9
            r0.f114957y = r3
            kka.h r7 = (kka.h) r7
            java.lang.Object r7 = r7.e(r9, r8, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r6 = r9
            r9 = r7
            r7 = r6
        L80:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L89
            return r7
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.onboarding.b.J2(com.revolut.feature.junior_onboarding.impl.ui.onboarding.b, mh8.h, gim.c):java.lang.Object");
    }

    public final FullScreenPromptScreen K2(TextLocalisedQuantityClause textLocalisedQuantityClause) {
        FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(e.a(g.Companion, new TextLocalisedClause(R$string.rev_u18_accounts_limit_title, null, null, 14), textLocalisedQuantityClause, null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.junior_accounts_limit_close, null, null, 14), null, true, null, null, null, false, 16741324));
        di8.d block = new di8.d(this, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        fullScreenPromptScreen.H = block;
        return fullScreenPromptScreen;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r0 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r0 == r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.onboarding.b.L2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        n2(new j(this, null, 0), new whi.b(6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof di8.h
            if (r0 == 0) goto L13
            r0 = r6
            di8.h r0 = (di8.h) r0
            int r1 = r0.f114954w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114954w = r1
            goto L18
        L13:
            di8.h r0 = new di8.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114954w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            kbb.c r6 = r5.f77004s
            efm.r r6 = r6.I()
            dee.a0 r2 = new dee.a0
            r4 = 16
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f114954w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.onboarding.b.M2(gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
