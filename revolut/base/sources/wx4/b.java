package wx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zja.a f300755a;

    public b(zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.f300755a = productArticleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.product_article.api.models.ProductArticleKey r8, java.util.Map r9, com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof wx4.a
            if (r0 == 0) goto L13
            r0 = r11
            wx4.a r0 = (wx4.a) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            wx4.a r0 = new wx4.a
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f300753x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            zja.a r3 = r7.f300755a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            boolean r8 = r0.f300752w
            com.revolut.feature.product_article.api.models.ProductArticleParams r9 = r0.v
            yhm.o.b(r11)
            goto L7b
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.revolut.feature.product_article.api.models.ProductArticleParams r8 = r0.v
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r10 = r0.u
            yhm.o.b(r11)
            r9 = r8
            goto L64
        L42:
            yhm.o.b(r11)
            if (r8 != 0) goto L48
            goto L86
        L48:
            com.revolut.feature.product_article.api.models.ProductArticleParams r11 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r2.<init>(r8)
            r11.<init>(r2, r9)
            r0.u = r10
            r0.v = r11
            r0.z = r5
            r9 = r3
            kka.h r9 = (kka.h) r9
            java.lang.Object r8 = r9.d(r8, r0)
            if (r8 != r1) goto L62
            goto L7a
        L62:
            r9 = r11
            r11 = r8
        L64:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r8 = r11.booleanValue()
            r0.u = r6
            r0.v = r9
            r0.f300752w = r8
            r0.z = r4
            kka.h r3 = (kka.h) r3
            java.lang.Object r11 = r3.e(r9, r10, r0)
            if (r11 != r1) goto L7b
        L7a:
            return r1
        L7b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            if (r8 == 0) goto L86
            if (r10 == 0) goto L86
            return r9
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wx4.b.a(com.revolut.feature.product_article.api.models.ProductArticleKey, java.util.Map, com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown, gim.c):java.lang.Object");
    }
}
