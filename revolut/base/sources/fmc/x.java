package fmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f136365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qka.c f136366b;

    public x(z spareChangeProductArticleKeyProvider, qka.c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(spareChangeProductArticleKeyProvider, "spareChangeProductArticleKeyProvider");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f136365a = spareChangeProductArticleKeyProvider;
        this.f136366b = productArticleNavigationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.core.navigation.FeatureCommand r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof fmc.w
            if (r0 == 0) goto L13
            r0 = r11
            fmc.w r0 = (fmc.w) r0
            int r1 = r0.f136364y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136364y = r1
            goto L18
        L13:
            fmc.w r0 = new fmc.w
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f136362w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136364y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qka.c r10 = r0.v
            com.revolut.retail.core.navigation.FeatureCommand r0 = r0.u
            yhm.o.b(r11)
            r2 = r10
            r4 = r0
            goto L65
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            yhm.o.b(r11)
            r0.u = r10
            qka.c r11 = r9.f136366b
            r0.v = r11
            r0.f136364y = r3
            fmc.z r2 = r9.f136365a
            java.lang.Object r2 = r2.f136369b
            qmc.b r2 = (qmc.b) r2
            vkm.q0 r2 = r2.a()
            fkh.f r3 = new fkh.f
            r4 = 10
            r3.<init>(r4)
            akg.n r2 = nim.a.v(r2, r3)
            r3 = 3
            r4 = 0
            jhi.b r2 = mo3.a.g(r2, r4, r4, r3)
            java.lang.Object r0 = vkm.q.x(r2, r0)
            if (r0 != r1) goto L62
            return r1
        L62:
            r4 = r10
            r2 = r11
            r11 = r0
        L65:
            com.revolut.feature.product_article.api.models.ProductArticleKey r11 = (com.revolut.feature.product_article.api.models.ProductArticleKey) r11
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r10 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r10.<init>(r11)
            com.revolut.feature.product_article.api.models.ProductArticleParams r11 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            r11.<init>(r10)
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r3 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            r6 = 0
            r8 = 4
            r5 = r4
            r7 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            r7 = 0
            r8 = 120(0x78, float:1.68E-43)
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r4 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            r5 = r3
            r3 = r11
            com.revolut.kompot.bridge.navigation.KompotFeatureConfig r10 = cka.b.a(r2, r3, r4, r5, r6, r7, r8)
            com.revolut.retail.core.navigation.FeatureCommand r11 = new com.revolut.retail.core.navigation.FeatureCommand
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.x.a(com.revolut.retail.core.navigation.FeatureCommand, gim.c):java.lang.Object");
    }
}
