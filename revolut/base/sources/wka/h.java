package wka;

import com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xka.s;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements yja.a {
    public final ProductArticleFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f298266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f298267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kka.a f298268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f298269s;

    public h(ProductArticleFlowContract$InputData inputData, boolean z, boolean z3, kka.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = inputData;
        this.f298266p = z;
        this.f298267q = z3;
        this.f298268r = productArticleInteractor;
        this.f298269s = d8l.d.a(this, new wde.f(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(wka.h r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof wka.f
            if (r0 == 0) goto L13
            r0 = r5
            wka.f r0 = (wka.f) r0
            int r1 = r0.f298264w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298264w = r1
            goto L18
        L13:
            wka.f r0 = new wka.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298264w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            kka.a r5 = r4.f298268r
            com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData r4 = r4.o
            com.revolut.feature.product_article.api.models.ProductArticleParams r2 = r4.f81264a
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour r4 = r4.f81265b
            r0.f298264w = r3
            kka.h r5 = (kka.h) r5
            java.lang.Object r5 = r5.e(r2, r4, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wka.h.I2(wka.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(wka.h r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof wka.g
            if (r0 == 0) goto L13
            r0 = r5
            wka.g r0 = (wka.g) r0
            int r1 = r0.f298265w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298265w = r1
            goto L18
        L13:
            wka.g r0 = new wka.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298265w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L54
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData r5 = r4.o
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = r5.f81264a
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference r5 = r5.f81274a
            boolean r2 = r5 instanceof com.revolut.feature.product_article.api.models.ProductArticleParams.ArticleReference.Key
            if (r2 == 0) goto L3f
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r5 = (com.revolut.feature.product_article.api.models.ProductArticleParams.ArticleReference.Key) r5
            goto L40
        L3f:
            r5 = 0
        L40:
            if (r5 == 0) goto L60
            com.revolut.feature.product_article.api.models.ProductArticleKey r5 = r5.f81277a
            if (r5 != 0) goto L47
            goto L60
        L47:
            kka.a r4 = r4.f298268r
            r0.f298265w = r3
            kka.h r4 = (kka.h) r4
            java.lang.Object r5 = r4.d(r5, r0)
            if (r5 != r1) goto L54
            return r1
        L54:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L60:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wka.h.J2(wka.h, gim.c):java.lang.Object");
    }

    public static yja.b K2(s sVar) {
        int i = c.f298261a[sVar.ordinal()];
        if (i == 1) {
            return yja.b.NOT_FOUND;
        }
        if (i == 2) {
            return yja.b.CLOSE_CLICK;
        }
        if (i == 3) {
            return yja.b.NEXT_CLICK;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yki.j
    public final void M0() {
        l2(new d(this, null), new yi5.b(26)).k(new b(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f298269s;
    }
}
