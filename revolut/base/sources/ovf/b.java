package ovf;

import kotlin.jvm.internal.Intrinsics;
import qka.c;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements puf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ouf.a f230180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f230181b;

    public b(ouf.a transportInteractor, c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f230180a = transportInteractor;
        this.f230181b = productArticleNavigationProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.core.navigation.FeatureCommand r18, gim.c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof ovf.a
            if (r2 == 0) goto L17
            r2 = r1
            ovf.a r2 = (ovf.a) r2
            int r3 = r2.f230179x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f230179x = r3
            goto L1c
        L17:
            ovf.a r2 = new ovf.a
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f230179x
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            com.revolut.retail.core.navigation.FeatureCommand r2 = r2.u
            yhm.o.b(r1)
            r16 = r2
            r2 = r1
            r1 = r16
            goto L5e
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            yhm.o.b(r1)
            r1 = r18
            r2.u = r1
            r2.f230179x = r5
            ouf.a r4 = r0.f230180a
            ivf.r r4 = (ivf.r) r4
            suf.h r4 = r4.f168858a
            r4.getClass()
            suf.c r5 = new suf.c
            r7 = 0
            r5.<init>(r4, r6, r7)
            skm.p0 r4 = skm.p0.f264001a
            elm.f r4 = elm.f.f127540b
            java.lang.Object r2 = skm.e0.J(r4, r5, r2)
            if (r2 != r3) goto L5e
            return r3
        L5e:
            com.revolut.feature.transport.models.user.TransportEligibilityState r2 = (com.revolut.feature.transport.models.user.TransportEligibilityState) r2
            com.revolut.feature.transport.models.user.TransportTerms r3 = r2.f92738b
            if (r3 == 0) goto L6f
            com.revolut.feature.transport.api.navigation.TransportTermsDestination r1 = new com.revolut.feature.transport.api.navigation.TransportTermsDestination
            r1.<init>(r3)
            com.revolut.retail.core.navigation.FeatureCommand r6 = zh9.u0.f(r1)
        L6d:
            r8 = r6
            goto L76
        L6f:
            cxf.a r2 = r2.f92737a
            cxf.a r3 = cxf.a.REGISTERED
            if (r2 != r3) goto L6d
            r8 = r1
        L76:
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.product_article.api.models.ProductArticleParams r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r3 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.transport.models.article.TransportArticles r4 = com.revolut.feature.transport.models.article.TransportArticles.ONBOARDING
            r3.<init>(r4)
            r2.<init>(r3)
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r7 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            r10 = 0
            r12 = 6
            r9 = 0
            r11 = r8
            r7.<init>(r8, r9, r10, r11, r12)
            r14 = 0
            r15 = 120(0x78, float:1.68E-43)
            qka.c r9 = r0.f230181b
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r11 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            r13 = 0
            r10 = r2
            r12 = r7
            com.revolut.kompot.bridge.navigation.KompotFeatureConfig r2 = cka.b.a(r9, r10, r11, r12, r13, r14, r15)
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ovf.b.a(com.revolut.retail.core.navigation.FeatureCommand, gim.c):java.lang.Object");
    }
}
