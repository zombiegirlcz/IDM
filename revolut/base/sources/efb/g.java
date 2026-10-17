package efb;

import com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName;
import dp4.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements web.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zeb.g f125309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pre.c f125310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mre.c f125311c;
    public final zja.a d;
    public final zjh.i e;

    public g(zeb.g repository, pre.c termsInteractor, mre.c termsNavigationFactory, zja.a productArticleInteractor, zjh.i unacceptedTermsFilter) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(unacceptedTermsFilter, "unacceptedTermsFilter");
        this.f125309a = repository;
        this.f125310b = termsInteractor;
        this.f125311c = termsNavigationFactory;
        this.d = productArticleInteractor;
        this.e = unacceptedTermsFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof efb.d
            if (r0 == 0) goto L13
            r0 = r7
            efb.d r0 = (efb.d) r0
            int r1 = r0.f125305y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125305y = r1
            goto L18
        L13:
            efb.d r0 = new efb.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f125303w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125305y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r6 = r0.v
            java.util.Iterator r2 = r0.u
            yhm.o.b(r7)
            goto L3f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
            r2 = r6
            r6 = r7
        L3f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L65
            java.lang.Object r7 = r2.next()
            com.revolut.feature.terms.api.model.TermsScope r7 = (com.revolut.feature.terms.api.model.TermsScope) r7
            r0.u = r2
            r0.v = r6
            r0.f125305y = r3
            pre.c r4 = r5.f125310b
            pfm.a r7 = pre.c.c(r4, r7)
            java.lang.Object r7 = nim.a.a(r7, r0)
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            if (r7 != r4) goto L60
            goto L62
        L60:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L62:
            if (r7 != r1) goto L3f
            return r1
        L65:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: efb.g.a(java.util.List, gim.c):java.lang.Object");
    }

    public final jhi.k b(ReverywhereMiniAppName miniAppName, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        zeb.g gVar = this.f125309a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.u(new p(miniAppName, this, (Continuation) null, 14), gVar.e.b(Unit.f186387a, loadingStrategy));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof efb.e
            if (r0 == 0) goto L13
            r0 = r6
            efb.e r0 = (efb.e) r0
            int r1 = r0.f125306w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125306w = r1
            goto L18
        L13:
            efb.e r0 = new efb.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125306w
            com.revolut.feature.retail.reverywhere.impl.onboarding.AirportTransfersProductArticleKey r3 = com.revolut.feature.retail.reverywhere.impl.onboarding.AirportTransfersProductArticleKey.f82897a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            r0.f125306w = r4
            zja.a r6 = r5.d
            kka.h r6 = (kka.h) r6
            java.lang.Object r6 = r6.d(r3, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4f
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r6.<init>(r3)
            return r6
        L4f:
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            java.lang.String r0 = "d0751105-9851-449a-a8b8-c8c37b450bc9"
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: efb.g.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName r7, java.lang.String r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof efb.f
            if (r0 == 0) goto L13
            r0 = r9
            efb.f r0 = (efb.f) r0
            int r1 = r0.f125308x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125308x = r1
            goto L18
        L13:
            efb.f r0 = new efb.f
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125308x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            goto L73
        L2b:
            r7 = move-exception
            goto L77
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            goto L54
        L3b:
            yhm.o.b(r9)
            w4l.j r9 = w4l.j.f294644c     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            jhi.k r7 = r6.b(r7, r9)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            r9 = 3
            jhi.b r7 = mo3.a.g(r7, r5, r5, r9)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            r0.u = r8     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            r0.f125308x = r3     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            java.lang.Object r9 = vkm.q.x(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            if (r9 != r1) goto L54
            goto L72
        L54:
            xeb.a r9 = (xeb.a) r9     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            java.util.Map r7 = r9.f304568c     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            java.lang.Object r7 = r7.get(r8)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            com.revolut.feature.terms.api.model.TermsScope r7 = (com.revolut.feature.terms.api.model.TermsScope) r7     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            if (r7 == 0) goto L76
            mre.c r8 = r6.f125311c     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            rre.d r8 = (rre.d) r8     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            ufm.i r7 = r8.c(r7, r5)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            r0.u = r5     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            r0.f125308x = r4     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            java.lang.Object r9 = nim.a.b(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            if (r9 != r1) goto L73
        L72:
            return r1
        L73:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L76
            return r9
        L76:
            return r5
        L77:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: efb.g.d(com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName, java.lang.String, gim.c):java.lang.Object");
    }
}
