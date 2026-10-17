package ifj;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;
import dfj.l2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements fej.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f161030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zja.a f161031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f161032c;
    public final qka.c d;

    public f(gte.a featureToggleInteractor, zja.a productArticleInteractor, l2 esimProductArticlesInteractor, qka.c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(esimProductArticlesInteractor, "esimProductArticlesInteractor");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f161030a = featureToggleInteractor;
        this.f161031b = productArticleInteractor;
        this.f161032c = esimProductArticlesInteractor;
        this.d = productArticleNavigationProvider;
    }

    public static FeatureCommand e() {
        return new FeatureCommand(new EsimFeatureConfig.Home(null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ifj.a
            if (r0 == 0) goto L13
            r0 = r7
            ifj.a r0 = (ifj.a) r0
            int r1 = r0.f161020y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161020y = r1
            goto L18
        L13:
            ifj.a r0 = new ifj.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f161018w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161020y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r2 = r0.v
            java.util.Iterator r5 = r0.u
            yhm.o.b(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            kotlin.enums.EnumEntries r7 = com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey.a()
            if (r7 == 0) goto L45
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L45
        L43:
            r3 = r4
            goto L6c
        L45:
            java.util.Iterator r7 = r7.iterator()
            r5 = r7
            r2 = r4
        L4b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L43
            java.lang.Object r7 = r5.next()
            com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey r7 = (com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey) r7
            r0.u = r5
            r0.v = r2
            r0.f161020y = r3
            java.lang.Object r7 = r6.f(r7, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4b
        L6c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ifj.f.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:37:0x0081, B:41:0x008b, B:43:0x008f, B:45:0x00bf, B:20:0x0040, B:33:0x006c, B:30:0x005f), top: B:52:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:37:0x0081, B:41:0x008b, B:43:0x008f, B:45:0x00bf, B:20:0x0040, B:33:0x006c, B:30:0x005f), top: B:52:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ifj.f.c(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:35:0x0097, B:39:0x00a1, B:41:0x00a5, B:20:0x004b), top: B:51:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.revolut.kompot.navigable.TransitionAnimation] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r18v0, types: [ifj.f] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.kompot.navigable.TransitionAnimation] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.revolut.kompot.navigable.TransitionAnimation] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r19, com.revolut.kompot.navigable.TransitionAnimation r20, gim.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ifj.f.d(boolean, com.revolut.kompot.navigable.TransitionAnimation, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ifj.d
            if (r0 == 0) goto L13
            r0 = r6
            ifj.d r0 = (ifj.d) r0
            int r1 = r0.f161027w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161027w = r1
            goto L18
        L13:
            ifj.d r0 = new ifj.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161027w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r2.<init>(r5)
            r6.<init>(r2)
            r0.f161027w = r3
            zja.a r5 = r4.f161031b
            kka.h r5 = (kka.h) r5
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r5.e(r6, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ifj.f.f(com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(znj.a r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ifj.e
            if (r0 == 0) goto L13
            r0 = r7
            ifj.e r0 = (ifj.e) r0
            int r1 = r0.f161029x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161029x = r1
            goto L18
        L13:
            ifj.e r0 = new ifj.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161029x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            znj.a r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey r7 = r6.f323831a
            r0.u = r6
            r0.f161029x = r4
            java.lang.Object r7 = r5.f(r7, r0)
            if (r7 != r1) goto L48
            goto L61
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L64
            com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey r6 = r6.f323831a
            com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey r7 = com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey.DEFAULT
            if (r6 != r7) goto L63
            r6 = 0
            r0.u = r6
            r0.f161029x = r3
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            return r6
        L63:
            r4 = 0
        L64:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ifj.f.g(znj.a, gim.c):java.lang.Object");
    }
}
