package owi;

import dwi.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zja.a f230459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f230460b;

    public g(zja.a productArticleInteractor, e0 airportLoungesProductArticleInteractor) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(airportLoungesProductArticleInteractor, "airportLoungesProductArticleInteractor");
        this.f230459a = productArticleInteractor;
        this.f230460b = airportLoungesProductArticleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof owi.e
            if (r0 == 0) goto L13
            r0 = r9
            owi.e r0 = (owi.e) r0
            int r1 = r0.f230456w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230456w = r1
            goto L18
        L13:
            owi.e r0 = new owi.e
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230456w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            goto L70
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L30:
            yhm.o.b(r9)
            w4l.h r9 = w4l.h.f294642c
            java.lang.String r2 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            dwi.e0 r5 = r8.f230460b
            hwi.m0 r5 = r5.f120420a
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            x4l.c r2 = r5.d
            kotlin.Unit r5 = kotlin.Unit.f186387a
            vkm.d r9 = r2.b(r5, r9)
            zfd.e r9 = zi0.c.w(r9)
            r2 = 3
            jhi.b r9 = mo3.a.g(r9, r4, r4, r2)
            java.lang.String r5 = "LoungePassProductArticleParamsProvider"
            java.lang.String r6 = "Failed to obtain product article id"
            java.util.Set r5 = m72.b.w(r5, r6)
            otd.a r6 = new otd.a
            r7 = 1
            r6.<init>(r2, r7, r4)
            vkm.y r9 = rd0.e.e(r9, r5, r6)
            r0.f230456w = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L70
            return r1
        L70:
            java.lang.String r9 = (java.lang.String) r9
            int r0 = r9.length()
            if (r0 != 0) goto L79
            return r4
        L79:
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            r1.<init>(r9)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: owi.g.a(gim.c):java.lang.Object");
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
            boolean r0 = r8 instanceof owi.f
            if (r0 == 0) goto L13
            r0 = r8
            owi.f r0 = (owi.f) r0
            int r1 = r0.f230458x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230458x = r1
            goto L18
        L13:
            owi.f r0 = new owi.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230458x
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
            r0.f230458x = r4     // Catch: java.lang.Exception -> L39
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
            r0.f230458x = r3
            zja.a r2 = r7.f230459a
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
        throw new UnsupportedOperationException("Method not decompiled: owi.g.b(gim.c):java.lang.Object");
    }
}
