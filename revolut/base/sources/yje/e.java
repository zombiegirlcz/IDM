package yje;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f314450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv5.b f314451b;

    public e(f01.c uiKitResources, tv5.b currencyDiscoveryInteractor) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        this.f314450a = uiKitResources;
        this.f314451b = currencyDiscoveryInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.time.Instant r18, gim.c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof yje.c
            if (r2 == 0) goto L17
            r2 = r1
            yje.c r2 = (yje.c) r2
            int r3 = r2.D
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.D = r3
            goto L1c
        L17:
            yje.c r2 = new yje.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.B
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.D
            r5 = 1
            if (r4 == 0) goto L41
            if (r4 != r5) goto L39
            int r3 = r2.A
            yje.e r4 = r2.z
            yje.e r6 = r2.f314448y
            java.lang.String r7 = r2.f314447x
            kotlin.Pair[] r8 = r2.f314446w
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r9 = r2.v
            kotlin.Pair[] r2 = r2.u
            yhm.o.b(r1)
            goto L8e
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            yhm.o.b(r1)
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r9 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.tab.crypto.impl.ui.stories.ZeroCryptoFeesPromoArticleProviderImpl$ZeroFeesArticleKey r1 = com.revolut.feature.tab.crypto.impl.ui.stories.ZeroCryptoFeesPromoArticleProviderImpl$ZeroFeesArticleKey.DEFAULT
            r9.<init>(r1)
            r1 = 2
            kotlin.Pair[] r8 = new kotlin.Pair[r1]
            com.revolut.core.ui_kit.models.TimeClause r10 = new com.revolut.core.ui_kit.models.TimeClause
            long r11 = r18.toEpochMilli()
            com.revolut.core.ui_kit.models.TimeClause$Format$DateLong r13 = com.revolut.core.ui_kit.models.TimeClause.Format.DateLong.f57962b
            r15 = 0
            r16 = 12
            r14 = 0
            r10.<init>(r11, r13, r14, r15, r16)
            f01.c r1 = r0.f314450a
            java.lang.CharSequence r1 = r1.b(r10)
            java.lang.String r1 = r1.toString()
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r6 = "date"
            r4.<init>(r6, r1)
            r1 = 0
            r8[r1] = r4
            r2.u = r8
            r2.v = r9
            r2.f314446w = r8
            java.lang.String r7 = "count_tokens"
            r2.f314447x = r7
            r2.f314448y = r0
            r2.z = r0
            r2.A = r5
            r2.D = r5
            java.lang.Object r1 = r0.b(r2)
            if (r1 != r3) goto L8a
            return r3
        L8a:
            r4 = r0
            r6 = r4
            r3 = r5
            r2 = r8
        L8e:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4.getClass()
            r4 = 10
            int r1 = r1 / r4
            int r1 = r1 * r4
            r6.getClass()
            if (r1 < r4) goto La1
            r5 = r1
        La1:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r7, r1)
            r8[r3] = r4
            java.util.Map r1 = zhm.r0.k(r2)
            com.revolut.feature.product_article.api.models.ProductArticleParams r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            r2.<init>(r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yje.e.a(java.time.Instant, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof yje.d
            if (r0 == 0) goto L13
            r0 = r6
            yje.d r0 = (yje.d) r0
            int r1 = r0.f314449w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f314449w = r1
            goto L18
        L13:
            yje.d r0 = new yje.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f314449w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            tv5.a$b r6 = tv5.a.b.f274717a
            tv5.b r2 = r5.f314451b
            xv5.h r2 = (xv5.h) r2
            efm.r r6 = r2.a(r6)
            vkm.d r6 = rd0.e.b(r6)
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f314449w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yje.e.b(gim.c):java.lang.Object");
    }
}
