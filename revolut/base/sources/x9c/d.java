package x9c;

import eub.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f303664a;

    public d(i revPointsOptInInteractor) {
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        this.f303664a = revPointsOptInInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey r5, com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof x9c.b
            if (r0 == 0) goto L13
            r0 = r7
            x9c.b r0 = (x9c.b) r0
            int r1 = r0.f303662y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303662y = r1
            goto L18
        L13:
            x9c.b r0 = new x9c.b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f303660w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303662y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey r6 = r0.v
            com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey r5 = r0.u
            yhm.o.b(r7)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            r0.u = r5
            r0.v = r6
            r0.f303662y = r3
            java.lang.Object r7 = r4.b(r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            m1c.r0 r7 = (m1c.r0) r7
            m1c.x0 r7 = r7.f201447a
            int[] r0 = x9c.a.f303659a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            if (r7 == r3) goto L5c
            r5 = 2
            if (r7 != r5) goto L56
            r5 = r6
            goto L5c
        L56:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L5c:
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r7.<init>(r5)
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x9c.d.a(com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey, com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof x9c.c
            if (r0 == 0) goto L13
            r0 = r5
            x9c.c r0 = (x9c.c) r0
            int r1 = r0.f303663w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303663w = r1
            goto L18
        L13:
            x9c.c r0 = new x9c.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303663w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r5 = 0
            eub.i r2 = r4.f303664a
            nyb.o r2 = (nyb.o) r2
            efm.d0 r5 = r2.e(r5)
            r0.f303663w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x9c.d.b(gim.c):java.lang.Object");
    }
}
