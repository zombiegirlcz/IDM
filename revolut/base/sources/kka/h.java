package kka;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import java.time.LocalDate;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ska.k;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f184563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ska.e f184564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f184565c;
    public final z1 d;

    public h(k productArticleRepository, ska.e productArticleConfigRepository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(productArticleRepository, "productArticleRepository");
        Intrinsics.checkNotNullParameter(productArticleConfigRepository, "productArticleConfigRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f184563a = productArticleRepository;
        this.f184564b = productArticleConfigRepository;
        this.f184565c = dateProvider;
        this.d = q.b(64, 5, null);
    }

    public static String a(ProductArticleParams.ArticleReference articleReference) {
        String strE;
        String str;
        if (articleReference instanceof ProductArticleParams.ArticleReference.Id) {
            strE = ((ProductArticleParams.ArticleReference.Id) articleReference).f81276a;
            str = "articleId=";
        } else {
            if (!(articleReference instanceof ProductArticleParams.ArticleReference.Key)) {
                throw new NoWhenBranchMatchedException();
            }
            strE = tz4.d.e(((ProductArticleParams.ArticleReference.Key) articleReference).f81277a);
            str = "articleKey=";
        }
        return j6.a.q(str, strE);
    }

    public static String b(ProductArticleParams productArticleParams) {
        ProductArticleParams.ArticleReference articleReference = productArticleParams.f81274a;
        if (articleReference instanceof ProductArticleParams.ArticleReference.Id) {
            return ((ProductArticleParams.ArticleReference.Id) articleReference).f81276a;
        }
        if (articleReference instanceof ProductArticleParams.ArticleReference.Key) {
            return tz4.d.e(((ProductArticleParams.ArticleReference.Key) articleReference).f81277a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(com.revolut.feature.product_article.api.models.ProductArticleParams.ArticleReference r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kka.c
            if (r0 == 0) goto L13
            r0 = r7
            kka.c r0 = (kka.c) r0
            int r1 = r0.f184555w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184555w = r1
            goto L18
        L13:
            kka.c r0 = new kka.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184555w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L4f
        L28:
            r6 = move-exception
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            kotlinx.coroutines.flow.Flow r6 = r5.f(r6)     // Catch: java.lang.Throwable -> L28
            kd8.f r7 = new kd8.f     // Catch: java.lang.Throwable -> L28
            r2 = 26
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L28
            jhi.b r6 = mo3.a.g(r6, r4, r7, r3)     // Catch: java.lang.Throwable -> L28
            r0.f184555w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = vkm.q.x(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L28
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L5a
        L54:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r6)
        L5a:
            boolean r6 = r7 instanceof yhm.n
            if (r6 == 0) goto L5f
            goto L60
        L5f:
            r4 = r7
        L60:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kka.h.c(com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.product_article.api.models.ProductArticleKey r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kka.d
            if (r0 == 0) goto L13
            r0 = r6
            kka.d r0 = (kka.d) r0
            int r1 = r0.f184556w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184556w = r1
            goto L18
        L13:
            kka.d r0 = new kka.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184556w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r6.<init>(r5)
            r0.f184556w = r3
            java.io.Serializable r6 = r4.c(r6, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            if (r6 == 0) goto L43
            goto L44
        L43:
            r3 = 0
        L44:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kka.h.d(com.revolut.feature.product_article.api.models.ProductArticleKey, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.product_article.api.models.ProductArticleParams r7, com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof kka.e
            if (r0 == 0) goto L13
            r0 = r9
            kka.e r0 = (kka.e) r0
            int r1 = r0.f184558x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184558x = r1
            goto L18
        L13:
            kka.e r0 = new kka.e
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184558x
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasShownWithinPeriod r8 = r0.u
            yhm.o.b(r9)
            goto L67
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r9)
            goto L50
        L39:
            yhm.o.b(r9)
            boolean r9 = r8 instanceof com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.AlwaysShow
            if (r9 == 0) goto L41
            goto L87
        L41:
            boolean r9 = r8 instanceof com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown
            if (r9 == 0) goto L55
            r0.u = r4
            r0.f184558x = r5
            java.time.LocalDate r9 = r6.i(r7)
            if (r9 != r1) goto L50
            goto L66
        L50:
            if (r9 != 0) goto L53
            goto L87
        L53:
            r5 = 0
            goto L87
        L55:
            boolean r9 = r8 instanceof com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasShownWithinPeriod
            if (r9 == 0) goto L8c
            r9 = r8
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasShownWithinPeriod r9 = (com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasShownWithinPeriod) r9
            r0.u = r9
            r0.f184558x = r3
            java.time.LocalDate r9 = r6.i(r7)
            if (r9 != r1) goto L67
        L66:
            return r1
        L67:
            java.time.LocalDate r9 = (java.time.LocalDate) r9
            if (r9 == 0) goto L83
            l80.e r7 = r6.f184565c
            l80.f r7 = (l80.f) r7
            java.time.LocalDate r7 = r7.e()
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasShownWithinPeriod r8 = (com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasShownWithinPeriod) r8
            java.time.Period r8 = r8.f81287a
            java.time.LocalDate r7 = r7.minus(r8)
            boolean r7 = r9.isBefore(r7)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
        L83:
            boolean r5 = pd.b.k(r4)
        L87:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L8c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kka.h.e(com.revolut.feature.product_article.api.models.ProductArticleParams, com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Flow f(ProductArticleParams.ArticleReference articleReference) {
        if (articleReference instanceof ProductArticleParams.ArticleReference.Id) {
            return zi0.c.i(((ProductArticleParams.ArticleReference.Id) articleReference).f81276a);
        }
        if (!(articleReference instanceof ProductArticleParams.ArticleReference.Key)) {
            throw new NoWhenBranchMatchedException();
        }
        ska.e eVar = this.f184564b;
        eVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(eVar.e.b(Unit.f186387a, loadingStrategy), new f(articleReference, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r9, com.revolut.feature.product_article.api.models.ProductArticleParams r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof kka.g
            if (r0 == 0) goto L13
            r0 = r11
            kka.g r0 = (kka.g) r0
            int r1 = r0.f184562y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184562y = r1
            goto L18
        L13:
            kka.g r0 = new kka.g
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f184560w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184562y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r11)
            goto L93
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            yhm.o.b(r11)
            goto L7c
        L3a:
            boolean r9 = r0.u
            com.revolut.feature.product_article.api.models.ProductArticleParams r10 = r0.v
            yhm.o.b(r11)
            goto L54
        L42:
            yhm.o.b(r11)
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference r11 = r10.f81274a
            r0.v = r10
            r0.u = r9
            r0.f184562y = r5
            java.io.Serializable r11 = r8.c(r11, r0)
            if (r11 != r1) goto L54
            goto L92
        L54:
            java.lang.String r11 = (java.lang.String) r11
            r2 = 0
            if (r11 == 0) goto L61
            nka.q r6 = new nka.q
            java.util.Map r7 = r10.f81275b
            r6.<init>(r11, r7)
            goto L62
        L61:
            r6 = r2
        L62:
            if (r6 == 0) goto L96
            ska.k r10 = r8.f184563a
            if (r9 == 0) goto L7f
            r0.v = r2
            r0.u = r9
            r0.f184562y = r4
            x4l.c r9 = r10.f263799g
            java.lang.Object r9 = r9.d(r6, r5, r0)
            if (r9 != r1) goto L77
            goto L79
        L77:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L79:
            if (r9 != r1) goto L7c
            goto L92
        L7c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L7f:
            r0.v = r2
            r0.u = r9
            r0.f184562y = r3
            x4l.c r9 = r10.f
            java.lang.Object r9 = r9.d(r6, r5, r0)
            if (r9 != r1) goto L8e
            goto L90
        L8e:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L90:
            if (r9 != r1) goto L93
        L92:
            return r1
        L93:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L96:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference r10 = r10.f81274a
            java.lang.String r10 = a(r10)
            java.lang.String r11 = "Product article not found: "
            java.lang.String r10 = j6.a.q(r11, r10)
            r9.<init>(r10)
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r11 = rd0.d.f253311a
            rd0.c r11 = rd0.c.ERROR
            rd0.d.a(r11, r2, r2, r9, r10)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kka.h.g(boolean, com.revolut.feature.product_article.api.models.ProductArticleParams, gim.c):java.lang.Object");
    }

    public final Object h(yja.b bVar, gim.i iVar) throws Throwable {
        Object objEmit = this.d.emit(bVar, iVar);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }

    public final LocalDate i(ProductArticleParams productArticleParams) {
        String str;
        String strB = b(productArticleParams);
        mk0.a aVar = this.f184564b.d;
        int i = ska.a.f263781a;
        Map map = (Map) aVar.a(new tk0.f("PRODUCT_ARTICLE_SHOWN_TIME"));
        if (map == null || (str = (String) map.get(strB)) == null) {
            return null;
        }
        return oc.c.I(Long.parseLong(str));
    }
}
