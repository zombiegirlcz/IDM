package uti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zja.a f283115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mti.b f283116b;

    public g(zja.a productArticleInteractor, mti.b asftConfigInteractor) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(asftConfigInteractor, "asftConfigInteractor");
        this.f283115a = productArticleInteractor;
        this.f283116b = asftConfigInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof uti.e
            if (r0 == 0) goto L13
            r0 = r7
            uti.e r0 = (uti.e) r0
            int r1 = r0.f283112w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283112w = r1
            goto L18
        L13:
            uti.e r0 = new uti.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283112w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L6b
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            w4l.h r7 = w4l.h.f294642c
            java.lang.String r2 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            mti.b r5 = r6.f283116b
            pti.k r5 = r5.f208844a
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            x4l.c r2 = r5.e
            kotlin.Unit r5 = kotlin.Unit.f186387a
            vkm.d r7 = r2.b(r5, r7)
            urd.y r2 = new urd.y
            r5 = 16
            r2.<init>(r5)
            cxe.u r7 = nim.a.y(r7, r2)
            up5.k r2 = new up5.k
            r5 = 29
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.f283112w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r7 = (java.lang.String) r7
            int r0 = r7.length()
            if (r0 != 0) goto L74
            return r4
        L74:
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            r1.<init>(r7)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uti.g.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof uti.f
            if (r0 == 0) goto L13
            r0 = r8
            uti.f r0 = (uti.f) r0
            int r1 = r0.f283114x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283114x = r1
            goto L18
        L13:
            uti.f r0 = new uti.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283114x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = r0.u
            yhm.o.b(r8)
            goto L6b
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L39
            goto L47
        L39:
            r8 = move-exception
            goto L4a
        L3b:
            yhm.o.b(r8)
            r0.f283114x = r4     // Catch: java.lang.Exception -> L39
            java.lang.Object r8 = r7.a(r0)     // Catch: java.lang.Exception -> L39
            if (r8 != r1) goto L47
            goto L67
        L47:
            com.revolut.feature.product_article.api.models.ProductArticleParams r8 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r8     // Catch: java.lang.Exception -> L39
            goto L54
        L4a:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r5, r5, r8, r2)
            r8 = r5
        L54:
            if (r8 != 0) goto L57
            goto L73
        L57:
            r0.u = r8
            r0.f283114x = r3
            zja.a r2 = r7.f283115a
            kka.h r2 = (kka.h) r2
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r3 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r0 = r2.e(r8, r3, r0)
            if (r0 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r0
            r0 = r8
            r8 = r6
        L6b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L74
        L73:
            return r5
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uti.g.b(gim.c):java.lang.Object");
    }
}
