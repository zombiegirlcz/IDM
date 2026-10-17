package rh8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements lh8.c {

    @NotNull
    private static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f254326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f254327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f254328c;
    public final zja.a d;

    public c0(ang.f userInteractor, gte.a featureToggleInteractor, kbb.c juniorConfigInteractor, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.f254326a = userInteractor;
        this.f254327b = featureToggleInteractor;
        this.f254328c = juniorConfigInteractor;
        this.d = productArticleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof rh8.y
            if (r0 == 0) goto L13
            r0 = r6
            rh8.y r0 = (rh8.y) r0
            int r1 = r0.f254377w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254377w = r1
            goto L18
        L13:
            rh8.y r0 = new rh8.y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254377w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            kbb.c r6 = r5.f254328c
            r2 = 0
            efm.r r6 = r6.O(r2)
            rd3.k r2 = new rd3.k
            r4 = 26
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f254377w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration r6 = (com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration) r6
            int r0 = r6.f76899b
            int r6 = r6.d
            int r6 = r6 - r3
            java.lang.String r1 = "-"
            java.lang.String r6 = a0.d.i(r0, r1, r6)
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.String r1 = "ageRange"
            r0.<init>(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rh8.c0.a(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof rh8.z
            if (r0 == 0) goto L13
            r0 = r9
            rh8.z r0 = (rh8.z) r0
            int r1 = r0.f254380y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254380y = r1
            goto L18
        L13:
            rh8.z r0 = new rh8.z
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f254378w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254380y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r0 = r0.v
            yhm.o.b(r9)
            goto L90
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = r0.v
            com.revolut.feature.junior_onboarding.impl.navigation.JuniorOnboardingProductArticleKey r2 = (com.revolut.feature.junior_onboarding.impl.navigation.JuniorOnboardingProductArticleKey) r2
            com.revolut.feature.junior_onboarding.impl.navigation.JuniorOnboardingProductArticleKey r2 = r0.u
            yhm.o.b(r9)
            goto L6a
        L42:
            yhm.o.b(r9)
            goto L52
        L46:
            yhm.o.b(r9)
            r0.f254380y = r5
            java.io.Serializable r9 = r8.d(r0)
            if (r9 != r1) goto L52
            goto L8c
        L52:
            wi0.b r9 = (wi0.b) r9
            com.revolut.feature.junior_onboarding.impl.navigation.JuniorOnboardingProductArticleKey r2 = new com.revolut.feature.junior_onboarding.impl.navigation.JuniorOnboardingProductArticleKey
            r2.<init>(r9)
            r0.u = r2
            r0.v = r6
            r0.f254380y = r4
            zja.a r9 = r8.d
            kka.h r9 = (kka.h) r9
            java.lang.Object r9 = r9.d(r2, r0)
            if (r9 != r1) goto L6a
            goto L8c
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L73
            goto L74
        L73:
            r2 = r6
        L74:
            if (r2 != 0) goto L7b
            com.revolut.feature.junior_onboarding.impl.navigation.JuniorOnboardingProductArticleKey r2 = new com.revolut.feature.junior_onboarding.impl.navigation.JuniorOnboardingProductArticleKey
            r2.<init>(r6)
        L7b:
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r9 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r9.<init>(r2)
            r0.u = r6
            r0.v = r9
            r0.f254380y = r3
            java.io.Serializable r0 = r8.a(r0)
            if (r0 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r7 = r0
            r0 = r9
            r9 = r7
        L90:
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.util.Map r9 = zhm.q0.c(r9)
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            r1.<init>(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rh8.c0.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof rh8.a0
            if (r0 == 0) goto L13
            r0 = r6
            rh8.a0 r0 = (rh8.a0) r0
            int r1 = r0.f254320w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254320w = r1
            goto L18
        L13:
            rh8.a0 r0 = new rh8.a0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254320w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L2a
            goto L5a
        L2a:
            r6 = move-exception
            goto L77
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L2a
            return r6
        L38:
            yhm.o.b(r6)
            gte.a r6 = r5.f254327b     // Catch: java.lang.Exception -> L2a
            com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles$JuniorCountrySpecificOnboardingProductArticles r2 = com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles.JuniorCountrySpecificOnboardingProductArticles.f76947c     // Catch: java.lang.Exception -> L2a
            jte.d r6 = (jte.d) r6     // Catch: java.lang.Exception -> L2a
            boolean r6 = r6.c(r2)     // Catch: java.lang.Exception -> L2a
            if (r6 == 0) goto L51
            r0.f254320w = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r5.b(r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L50
            goto L59
        L50:
            return r6
        L51:
            r0.f254320w = r4     // Catch: java.lang.Exception -> L2a
            java.io.Serializable r6 = r5.d(r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            wi0.a r0 = wi0.b.Companion     // Catch: java.lang.Exception -> L2a
            r0.getClass()     // Catch: java.lang.Exception -> L2a
            wi0.b r0 = wi0.b.X0     // Catch: java.lang.Exception -> L2a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 == 0) goto L6a
            com.revolut.feature.junior_onboarding.impl.navigation.JuniorProductArticleKey r6 = com.revolut.feature.junior_onboarding.impl.navigation.JuniorProductArticleKey.ACCOUNT_CREATION_JP     // Catch: java.lang.Exception -> L2a
            goto L6c
        L6a:
            com.revolut.feature.junior_onboarding.impl.navigation.JuniorProductArticleKey r6 = com.revolut.feature.junior_onboarding.impl.navigation.JuniorProductArticleKey.ACCOUNT_CREATION     // Catch: java.lang.Exception -> L2a
        L6c:
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams     // Catch: java.lang.Exception -> L2a
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key     // Catch: java.lang.Exception -> L2a
            r1.<init>(r6)     // Catch: java.lang.Exception -> L2a
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2a
            return r0
        L77:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rh8.c0.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rh8.b0
            if (r0 == 0) goto L13
            r0 = r5
            rh8.b0 r0 = (rh8.b0) r0
            int r1 = r0.f254322w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254322w = r1
            goto L18
        L13:
            rh8.b0 r0 = new rh8.b0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254322w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f254326a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f254322w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            do3.n r5 = (do3.n) r5
            wi0.b r5 = do3.q.y(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh8.c0.d(gim.c):java.io.Serializable");
    }
}
