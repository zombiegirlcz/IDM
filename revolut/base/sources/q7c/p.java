package q7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements b6c.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zja.a f242828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pak.h f242829b;

    public p(zja.a productArticleInteractor, pak.h revolutPayRevPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(revolutPayRevPointsAvailabilityInteractor, "revolutPayRevPointsAvailabilityInteractor");
        this.f242828a = productArticleInteractor;
        this.f242829b = revolutPayRevPointsAvailabilityInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q7c.o
            if (r0 == 0) goto L13
            r0 = r6
            q7c.o r0 = (q7c.o) r0
            int r1 = r0.f242827w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242827w = r1
            goto L18
        L13:
            q7c.o r0 = new q7c.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242827w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey r4 = com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey.IntroWithRevPoints
            r2.<init>(r4)
            r6.<init>(r2)
            r0.f242827w = r3
            zja.a r2 = r5.f242828a
            kka.h r2 = (kka.h) r2
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r4 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r2.e(r6, r4, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q7c.p.a(gim.c):java.lang.Object");
    }
}
