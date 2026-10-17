package f1g;

import kotlin.jvm.internal.Intrinsics;
import nyb.k;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hyf.a f131267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f131268b;

    public d(hyf.a featureInteractor, k revPointsInteractor) {
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        this.f131267a = featureInteractor;
        this.f131268b = revPointsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof f1g.b
            if (r0 == 0) goto L13
            r0 = r6
            f1g.b r0 = (f1g.b) r0
            int r1 = r0.f131265w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131265w = r1
            goto L18
        L13:
            f1g.b r0 = new f1g.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f131265w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            hyf.a r6 = r5.f131267a
            c1g.m r6 = (c1g.m) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L6a
            r0.f131265w = r3
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Double r6 = (java.lang.Double) r6
            if (r6 == 0) goto L68
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.travel.experiences.impl.articles.ExperiencesArticles r2 = com.revolut.feature.travel.experiences.impl.articles.ExperiencesArticles.INTRO_WITH_POINTS_VARIABLE
            r1.<init>(r2)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r2 = "format(...)"
            java.lang.String r4 = "%.0f"
            java.lang.String r6 = a0.d.v(r6, r3, r4, r2)
            java.lang.String r2 = "multiplier"
            java.util.Map r6 = a0.d.x(r2, r6)
            r0.<init>(r1, r6)
            return r0
        L68:
            r6 = 0
            return r6
        L6a:
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.travel.experiences.impl.articles.ExperiencesArticles r1 = com.revolut.feature.travel.experiences.impl.articles.ExperiencesArticles.INTRO_WITH_CASHBACK
            r0.<init>(r1)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f1g.d.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof f1g.c
            if (r0 == 0) goto L13
            r0 = r7
            f1g.c r0 = (f1g.c) r0
            int r1 = r0.f131266w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131266w = r1
            goto L18
        L13:
            f1g.c r0 = new f1g.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f131266w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L83
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            w4l.h r7 = w4l.h.f294642c
            java.lang.String r2 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            nyb.k r4 = r6.f131268b
            jxb.f r4 = r4.f220804a
            jxb.l r4 = (jxb.l) r4
            r4.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            w4l.f r2 = r4.f
            kotlin.Unit r4 = kotlin.Unit.f186387a
            efm.r r7 = r2.e(r4, r7)
            efm.d0 r7 = r7.firstOrError()
            f0d.k r2 = new f0d.k
            r4 = 8
            r2.<init>(r4)
            ey7.a r4 = new ey7.a
            r5 = 21
            r4.<init>(r2, r5)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            f0d.k r7 = new f0d.k
            r4 = 9
            r7.<init>(r4)
            zhm.h0 r4 = zhm.h0.f322473a
            pfm.z r7 = ue0.e.I(r2, r4, r7)
            r0.f131266w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L83
            return r1
        L83:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            java.util.Optional r7 = (java.util.Optional) r7
            java.lang.Object r7 = le.u1.l(r7)
            r0 = r7
            java.lang.Double r0 = (java.lang.Double) r0
            hyf.a r0 = r6.f131267a
            c1g.m r0 = (c1g.m) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L9c
            return r7
        L9c:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f1g.d.b(gim.c):java.lang.Object");
    }
}
