package nid;

import h4g.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zja.a f215678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qka.c f215679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f215680c;

    public d(zja.a productArticleInteractor, qka.c productArticleNavigationProvider, g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.f215678a = productArticleInteractor;
        this.f215679b = productArticleNavigationProvider;
        this.f215680c = shopsFeatureAvailabilityInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.core.navigation.FeatureCommand r12, boolean r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof nid.a
            if (r0 == 0) goto L13
            r0 = r14
            nid.a r0 = (nid.a) r0
            int r1 = r0.f215672y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215672y = r1
            goto L18
        L13:
            nid.a r0 = new nid.a
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f215670w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215672y
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            boolean r13 = r0.v
            com.revolut.retail.core.navigation.FeatureCommand r12 = r0.u
            yhm.o.b(r14)
        L2a:
            r3 = r12
            goto L4a
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            yhm.o.b(r14)
            h4g.g r14 = r11.f215680c
            boolean r14 = r14.e()
            r0.u = r12
            r0.v = r13
            r0.f215672y = r3
            java.lang.Object r14 = r11.b(r14, r0)
            if (r14 != r1) goto L2a
            return r1
        L4a:
            com.revolut.feature.product_article.api.models.ProductArticleParams r14 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r14
            if (r14 == 0) goto L6b
            com.revolut.retail.core.navigation.FeatureCommand r12 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r2 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            r5 = 0
            r7 = 6
            r4 = 0
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = 0
            r10 = 120(0x78, float:1.68E-43)
            qka.c r4 = r11.f215679b
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r6 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            r8 = 0
            r5 = r14
            r7 = r2
            com.revolut.kompot.bridge.navigation.KompotFeatureConfig r14 = cka.b.a(r4, r5, r6, r7, r8, r9, r10)
            r12.<init>(r14)
            r3 = r12
        L6b:
            if (r13 == 0) goto L7b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r12 = ibb.c.e
            r13 = 14
            r14 = 0
            com.revolut.retail.core.navigation.FeatureCommand r12 = jbb.a.a(r12, r14, r14, r14, r13)
            com.revolut.retail.core.navigation.CompositeCommand r12 = com.revolut.retail.core.navigation.a.c(r12, r3)
            return r12
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nid.d.a(com.revolut.retail.core.navigation.FeatureCommand, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof nid.b
            if (r0 == 0) goto L13
            r0 = r7
            nid.b r0 = (nid.b) r0
            int r1 = r0.f215674x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215674x = r1
            goto L18
        L13:
            nid.b r0 = new nid.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215674x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = r0.u
            yhm.o.b(r7)
            goto L88
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = r0.u
            yhm.o.b(r7)
            goto L5f
        L3a:
            yhm.o.b(r7)
            if (r6 == 0) goto L68
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.shops.api.model.ShopsProductArticleKey r2 = com.revolut.feature.shops.api.model.ShopsProductArticleKey.INTRO_LOYALTY
            r7.<init>(r2)
            r6.<init>(r7)
            com.revolut.feature.shops.api.model.ShopsProductArticleKey$a r7 = com.revolut.feature.shops.api.model.ShopsProductArticleKey.INSTANCE
            r7.getClass()
            java.util.List r7 = com.revolut.feature.shops.api.model.ShopsProductArticleKey.b()
            r0.u = r6
            r0.f215674x = r3
            java.lang.Object r7 = r5.c(r7, r0)
            if (r7 != r1) goto L5f
            goto L87
        L5f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L91
            return r6
        L68:
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.shops.api.model.ShopsProductArticleKey r2 = com.revolut.feature.shops.api.model.ShopsProductArticleKey.INTRO_CASHBACK
            r7.<init>(r2)
            r6.<init>(r7)
            com.revolut.feature.shops.api.model.ShopsProductArticleKey$a r7 = com.revolut.feature.shops.api.model.ShopsProductArticleKey.INSTANCE
            r7.getClass()
            java.util.List r7 = com.revolut.feature.shops.api.model.ShopsProductArticleKey.a()
            r0.u = r6
            r0.f215674x = r4
            java.lang.Object r7 = r5.c(r7, r0)
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L91
            return r6
        L91:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nid.d.b(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0087 -> B:21:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof nid.c
            if (r0 == 0) goto L13
            r0 = r10
            nid.c r0 = (nid.c) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            nid.c r0 = new nid.c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r9 = r0.f215677y
            int r2 = r0.f215676x
            java.util.Collection r4 = r0.f215675w
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r0.v
            java.util.Collection r6 = r0.u
            java.util.Collection r6 = (java.util.Collection) r6
            yhm.o.b(r10)
            goto L88
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            yhm.o.b(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r9, r2)
            r10.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r5 = r9
            r4 = r10
            r9 = r2
        L55:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L92
            java.lang.Object r10 = r5.next()
            java.lang.String r10 = (java.lang.String) r10
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            r7.<init>(r10)
            r6.<init>(r7)
            r10 = r4
            java.util.Collection r10 = (java.util.Collection) r10
            r0.u = r10
            r0.v = r5
            r0.f215675w = r10
            r0.f215676x = r2
            r0.f215677y = r9
            r0.B = r3
            zja.a r10 = r8.f215678a
            kka.h r10 = (kka.h) r10
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r7 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r10 = r10.e(r6, r7, r0)
            if (r10 != r1) goto L87
            return r1
        L87:
            r6 = r4
        L88:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r10.getClass()
            r4.add(r10)
            r4 = r6
            goto L55
        L92:
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r9 = zhm.d0.d0(r4)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nid.d.c(java.util.List, gim.c):java.lang.Object");
    }
}
