package com.revolut.feature.joint.impl.domain;

import ang.b;
import efm.d0;
import efm.r;
import g1i.i0;
import g3e.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qka.c;
import ufm.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements k38.a {

    @NotNull
    public static final InitialArticleNavigationDecoratorImpl$Companion Companion = new InitialArticleNavigationDecoratorImpl$Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zja.a f76506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f76507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f76508c;

    public a(l61.a userCompanyInteractor, zja.a productArticleInteractor, c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f76506a = productArticleInteractor;
        this.f76507b = productArticleNavigationProvider;
        d0 d0VarA = ((b) userCompanyInteractor).a();
        i0 i0Var = new i0(17, new h(6));
        d0VarA.getClass();
        r rVarCache = new i(d0VarA, i0Var, 1).x().cache();
        Intrinsics.checkNotNullExpressionValue(rVarCache, "cache(...)");
        this.f76508c = rVarCache;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g48.c
            if (r0 == 0) goto L13
            r0 = r6
            g48.c r0 = (g48.c) r0
            int r1 = r0.f140354x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140354x = r1
            goto L18
        L13:
            g48.c r0 = new g48.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140354x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = r0.u
            yhm.o.b(r6)
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            goto L46
        L38:
            yhm.o.b(r6)
            r0.f140354x = r3
            efm.r r6 = r5.f76508c
            java.lang.Object r6 = nim.a.c(r6, r0)
            if (r6 != r1) goto L46
            goto L62
        L46:
            java.lang.String r2 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference r6 = (com.revolut.feature.product_article.api.models.ProductArticleParams.ArticleReference) r6
            com.revolut.feature.product_article.api.models.ProductArticleParams r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            r2.<init>(r6)
            r0.u = r2
            r0.f140354x = r4
            zja.a r6 = r5.f76506a
            kka.h r6 = (kka.h) r6
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r3 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r6.e(r2, r3, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            r0 = r2
        L64:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6d
            return r0
        L6d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.domain.a.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.core.navigation.FeatureCommand r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof g48.d
            if (r0 == 0) goto L13
            r0 = r14
            g48.d r0 = (g48.d) r0
            int r1 = r0.f140360y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140360y = r1
            goto L18
        L13:
            g48.d r0 = new g48.d
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f140358w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140360y
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r5 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L40
            if (r2 == r3) goto L3a
            if (r2 != r4) goto L32
            com.revolut.feature.product_article.api.models.ProductArticleParams r13 = r0.v
            com.revolut.retail.core.navigation.NaviCommand r0 = r0.u
            yhm.o.b(r14)
            r4 = r13
            r7 = r0
            goto L6f
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            com.revolut.retail.core.navigation.NaviCommand r13 = r0.u
            yhm.o.b(r14)
            goto L50
        L40:
            yhm.o.b(r14)
            r0.u = r13
            r0.f140360y = r3
            efm.r r14 = r12.f76508c
            java.lang.Object r14 = nim.a.c(r14, r0)
            if (r14 != r1) goto L50
            goto L6c
        L50:
            java.lang.String r2 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r2)
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference r14 = (com.revolut.feature.product_article.api.models.ProductArticleParams.ArticleReference) r14
            com.revolut.feature.product_article.api.models.ProductArticleParams r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            r2.<init>(r14)
            r0.u = r13
            r0.v = r2
            r0.f140360y = r4
            zja.a r14 = r12.f76506a
            kka.h r14 = (kka.h) r14
            java.lang.Object r14 = r14.e(r2, r5, r0)
            if (r14 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r7 = r13
            r4 = r2
        L6f:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            if (r13 != 0) goto L78
            return r7
        L78:
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r6 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            r8 = 0
            r11 = 2
            r9 = r7
            r10 = r7
            r6.<init>(r7, r8, r9, r10, r11)
            r9 = 120(0x78, float:1.68E-43)
            qka.c r3 = r12.f76507b
            r7 = 0
            com.revolut.kompot.bridge.navigation.KompotFeatureConfig r13 = cka.b.a(r3, r4, r5, r6, r7, r8, r9)
            com.revolut.retail.core.navigation.FeatureCommand r13 = gc0.c.f(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.domain.a.b(com.revolut.retail.core.navigation.FeatureCommand, gim.c):java.lang.Object");
    }
}
