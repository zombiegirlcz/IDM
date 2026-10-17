package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.b;
import imk.z;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import wik.m;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @NotNull
    public static final imk.g Companion = new imk.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wik.g f103563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lmk.a f103564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zja.a f103565c;
    public final m d;
    public final gte.a e;
    public final ajk.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f103566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public imk.f f103567h;

    public a(wik.g planHubModalsInteractor, lmk.a productOnboardingStateProvider, zja.a productArticleInteractor, m pricingPlanOffersInteractor, gte.a featureToggleInteractor, ajk.c bottomSheetNavigationResolver) {
        Intrinsics.checkNotNullParameter(planHubModalsInteractor, "planHubModalsInteractor");
        Intrinsics.checkNotNullParameter(productOnboardingStateProvider, "productOnboardingStateProvider");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationResolver, "bottomSheetNavigationResolver");
        this.f103563a = planHubModalsInteractor;
        this.f103564b = productOnboardingStateProvider;
        this.f103565c = productArticleInteractor;
        this.d = pricingPlanOffersInteractor;
        this.e = featureToggleInteractor;
        this.f = bottomSheetNavigationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a r5, com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenConfig r6, gim.c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof imk.i
            if (r0 == 0) goto L16
            r0 = r7
            imk.i r0 = (imk.i) r0
            int r1 = r0.f162517x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f162517x = r1
            goto L1b
        L16:
            imk.i r0 = new imk.i
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f162517x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductArticle r5 = r0.u
            yhm.o.b(r7)
            goto L5a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r7)
            com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductArticle r6 = r6.d
            if (r6 != 0) goto L3c
            goto L68
        L3c:
            zja.a r5 = r5.f103565c
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            java.lang.String r4 = r6.f102651a
            r2.<init>(r4)
            r7.<init>(r2)
            r0.u = r6
            r0.f162517x = r3
            kka.h r5 = (kka.h) r5
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r7 = r5.e(r7, r2, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            r5 = r6
        L5a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L68
            imk.e0 r6 = new imk.e0
            r6.<init>(r5)
            return r6
        L68:
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.d$a r5 = com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.d.a.f103571a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a.a(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a, com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenConfig, gim.c):java.lang.Object");
    }

    public final b b(PlanHubScreenConfig planHubScreenConfig) {
        Iterable iterable = (List) kii.e.n("PLAN_HUB_PRESENTED_MODALS", this.f103563a.f297914a);
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Pair pair = (Pair) y.r(y.z(y.n(d0.Q(planHubScreenConfig.f), new imk.e(0, d0.i1(iterable))), new ii4.b(this, 14)));
        return pair != null ? new z((String) pair.f186385a, (PricingPlanBottomSheetDescriptor.BottomSheet) pair.f186386b) : b.a.f103568a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x016d, code lost:
    
        if (r14 == r1) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(hha.d r10, com.revolut.data.model.Data r11, int r12, kmk.a r13, gim.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a.c(hha.d, com.revolut.data.model.Data, int, kmk.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kmk.a r13, gim.c r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof imk.j
            if (r0 == 0) goto L13
            r0 = r14
            imk.j r0 = (imk.j) r0
            int r1 = r0.f162518w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162518w = r1
            goto L18
        L13:
            imk.j r0 = new imk.j
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f162518w
            r3 = 1
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.e$a r5 = com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.e.a.f103572a
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r14)     // Catch: java.lang.Exception -> L9f
            goto L74
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            yhm.o.b(r14)
            kmk.a r14 = kmk.a.CANCELLED
            if (r13 == r14) goto L42
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L42:
            gte.a r13 = r12.e
            com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles$PlanHubBottomSheetPromo r14 = com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles.PlanHubBottomSheetPromo.f81003c
            boolean r13 = r13.a(r14)
            if (r13 == 0) goto L56
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L56:
            wik.m r13 = r12.d     // Catch: java.lang.Exception -> L9f
            r0.f162518w = r3     // Catch: java.lang.Exception -> L9f
            kjk.f r13 = r13.f297924b     // Catch: java.lang.Exception -> L9f
            kjk.o r13 = (kjk.o) r13     // Catch: java.lang.Exception -> L9f
            r13.getClass()     // Catch: java.lang.Exception -> L9f
            k7c.l0 r14 = new k7c.l0     // Catch: java.lang.Exception -> L9f
            r2 = 17
            r3 = 0
            r14.<init>(r13, r3, r2)     // Catch: java.lang.Exception -> L9f
            skm.p0 r13 = skm.p0.f264001a     // Catch: java.lang.Exception -> L9f
            elm.f r13 = elm.f.f127540b     // Catch: java.lang.Exception -> L9f
            java.lang.Object r14 = skm.e0.J(r13, r14, r0)     // Catch: java.lang.Exception -> L9f
            if (r14 != r1) goto L74
            return r1
        L74:
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt r14 = (com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt) r14     // Catch: java.lang.Exception -> L9f
            boolean r13 = r14 instanceof com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt.Available     // Catch: java.lang.Exception -> L9f
            if (r13 == 0) goto L8b
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data     // Catch: java.lang.Exception -> L9f
            imk.h0 r7 = new imk.h0     // Catch: java.lang.Exception -> L9f
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt$Available r14 = (com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt.Available) r14     // Catch: java.lang.Exception -> L9f
            r7.<init>(r14)     // Catch: java.lang.Exception -> L9f
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L9f
            return r6
        L8b:
            boolean r13 = r14 instanceof com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt.Unavailable     // Catch: java.lang.Exception -> L9f
            if (r13 == 0) goto L99
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data     // Catch: java.lang.Exception -> L9f
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L9f
            return r4
        L99:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L9f
            r13.<init>()     // Catch: java.lang.Exception -> L9f
            throw r13     // Catch: java.lang.Exception -> L9f
        L9f:
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a.d(kmk.a, gim.c):java.lang.Object");
    }
}
