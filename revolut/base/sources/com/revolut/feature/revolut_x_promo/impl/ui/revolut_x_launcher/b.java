package com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher;

import ang.f;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements x5c.b {
    public final o5c.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j5c.a f84272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zja.a f84273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f84274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f84275s;

    public b(o5c.a cryptoExchangeEligibilityInteractor, j5c.a promoNavigationExtension, zja.a productArticleInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(cryptoExchangeEligibilityInteractor, "cryptoExchangeEligibilityInteractor");
        Intrinsics.checkNotNullParameter(promoNavigationExtension, "promoNavigationExtension");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = cryptoExchangeEligibilityInteractor;
        this.f84272p = promoNavigationExtension;
        this.f84273q = productArticleInteractor;
        this.f84274r = userInteractor;
        this.f84275s = d.a(this, new x2g.b(this, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof x5c.d
            if (r0 == 0) goto L13
            r0 = r6
            x5c.d r0 = (x5c.d) r0
            int r1 = r0.f302936x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302936x = r1
            goto L18
        L13:
            x5c.d r0 = new x5c.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302936x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.revolut_x_promo.impl.articles.CryptoExchangeArticleKey r5 = r0.u
            yhm.o.b(r6)
            goto L79
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            goto L4b
        L38:
            yhm.o.b(r6)
            ang.f r6 = r5.f84274r
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.f302936x = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L4b
            goto L77
        L4b:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            do3.n r6 = (do3.n) r6
            wi0.b r6 = do3.q.y(r6)
            com.revolut.feature.revolut_x_promo.impl.articles.CryptoExchangeArticleKey r2 = new com.revolut.feature.revolut_x_promo.impl.articles.CryptoExchangeArticleKey
            java.lang.String r6 = r6.f297794a
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            r4 = 3
            r2.<init>(r6, r4)
            zja.a r5 = r5.f84273q
            r0.u = r2
            r0.f302936x = r3
            kka.h r5 = (kka.h) r5
            java.lang.Object r6 = r5.d(r2, r0)
            if (r6 != r1) goto L78
        L77:
            return r1
        L78:
            r5 = r2
        L79:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L85
            com.revolut.feature.revolut_x_promo.impl.articles.CryptoExchangeArticleKey r5 = com.revolut.feature.revolut_x_promo.impl.articles.CryptoExchangeArticleKey.a(r5)
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b.I2(com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f84275s;
    }
}
