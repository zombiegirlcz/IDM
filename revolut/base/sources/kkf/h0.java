package kkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mre.c f184711m;

    public h0(klf.h0 commonDataSource, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f184710l = commonDataSource;
        this.f184711m = termsNavigationFactory;
    }

    public final cmf.p Z2() {
        kjk.x xVar = new kjk.x(8);
        klf.h0 h0Var = this.f184710l;
        int i = 24;
        return new cmf.p(new t38.e(h0Var.h(xVar), i, new iyg.b0(h0Var.j(), i), new ael.l0(3, this, h0.class, "buildBlock", "buildBlock(ZLcom/revolut/core/model/country/CountryCode;)Ljava/util/List;", 4, 9)), new ka9.b(29), zhm.u.c(this), "CryptoCardDisclaimer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kkf.f0
            if (r0 == 0) goto L13
            r0 = r6
            kkf.f0 r0 = (kkf.f0) r0
            int r1 = r0.f184675x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184675x = r1
            goto L18
        L13:
            kkf.f0 r0 = new kkf.f0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184675x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kkf.h0 r0 = r0.u
            yhm.o.b(r6)
            goto L6b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            goto L4a
        L38:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f184710l
            kotlinx.coroutines.flow.Flow r6 = r6.j()
            r0.f184675x = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4a
            goto L69
        L4a:
            do3.n r6 = (do3.n) r6
            wi0.b r6 = do3.q.y(r6)
            com.revolut.feature.terms.api.model.TermsScope$a r2 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r2.getClass()
            com.revolut.feature.terms.api.model.TermsScope r2 = com.revolut.feature.terms.api.model.TermsScope.o
            mre.c r4 = r5.f184711m
            rre.d r4 = (rre.d) r4
            ufm.i r6 = r4.c(r2, r6)
            r0.u = r5
            r0.f184675x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            r0 = r5
        L6b:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r0.A2(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.h0.b3(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_EXTRAS_CRYPTO_CARD_PERSONAL_TERMS") ? c3((gim.c) continuation) : Intrinsics.f(str, "ID_EXTRAS_CRYPTO_CARD_CRYPTO_TERMS") ? b3((gim.c) continuation) : Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kkf.g0
            if (r0 == 0) goto L13
            r0 = r6
            kkf.g0 r0 = (kkf.g0) r0
            int r1 = r0.f184694x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184694x = r1
            goto L18
        L13:
            kkf.g0 r0 = new kkf.g0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184694x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kkf.h0 r0 = r0.u
            yhm.o.b(r6)
            goto L6b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            goto L4a
        L38:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f184710l
            kotlinx.coroutines.flow.Flow r6 = r6.j()
            r0.f184694x = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4a
            goto L69
        L4a:
            do3.n r6 = (do3.n) r6
            wi0.b r6 = do3.q.y(r6)
            com.revolut.feature.terms.api.model.TermsScope$a r2 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r2.getClass()
            com.revolut.feature.terms.api.model.TermsScope r2 = com.revolut.feature.terms.api.model.TermsScope.S
            mre.c r4 = r5.f184711m
            rre.d r4 = (rre.d) r4
            ufm.i r6 = r4.c(r2, r6)
            r0.u = r5
            r0.f184694x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            r0 = r5
        L6b:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r0.A2(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.h0.c3(gim.c):java.lang.Object");
    }
}
