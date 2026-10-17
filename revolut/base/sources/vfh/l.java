package vfh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends hdh.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vrl.b f288656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vrl.g f288657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.d f288658n;

    public l(vrl.b fetchOrderLimitsByPortfolioInteractor, vrl.g investOrdersInteractor, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(fetchOrderLimitsByPortfolioInteractor, "fetchOrderLimitsByPortfolioInteractor");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f288656l = fetchOrderLimitsByPortfolioInteractor;
        this.f288657m = investOrdersInteractor;
        this.f288658n = portfolioInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable b3(vfh.l r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof vfh.h
            if (r0 == 0) goto L13
            r0 = r7
            vfh.h r0 = (vfh.h) r0
            int r1 = r0.f288650w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288650w = r1
            goto L18
        L13:
            vfh.h r0 = new vfh.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288650w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L62
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r7)
            vrl.g r5 = r5.f288657m
            com.revolut.trading.orders.domain.models.InvestOrdersParams$OrdersByCurrency r7 = new com.revolut.trading.orders.domain.models.InvestOrdersParams$OrdersByCurrency
            xi0.a r2 = xi0.b.Companion
            r2.getClass()
            xi0.b r6 = xi0.a.a(r6)
            r2 = 30
            r7.<init>(r6, r4, r4, r2)
            w4l.i r6 = w4l.i.f294643c
            vrl.m r5 = (vrl.m) r5
            akg.n r5 = r5.f(r7, r6)
            q87.q r6 = new q87.q
            r7 = 11
            r6.<init>(r5, r7)
            r5 = 3
            jhi.b r5 = mo3.a.g(r6, r4, r4, r5)
            r0.f288650w = r3
            java.lang.Object r7 = vkm.q.z(r5, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L84
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r7.iterator()
        L71:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L83
            java.lang.Object r7 = r6.next()
            boolean r0 = r7 instanceof com.revolut.retail.trading.core.domain.orders.InvestFundOrder
            if (r0 == 0) goto L71
            r5.add(r7)
            goto L71
        L83:
            return r5
        L84:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vfh.l.b3(vfh.l, java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable c3(vfh.l r5, java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof vfh.i
            if (r0 == 0) goto L13
            r0 = r8
            vfh.i r0 = (vfh.i) r0
            int r1 = r0.f288651w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288651w = r1
            goto L18
        L13:
            vfh.i r0 = new vfh.i
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288651w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto L5a
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r8)
            ybl.d r5 = r5.f288658n
            kel.j r8 = new kel.j
            r8.<init>(r6, r7)
            w4l.i r6 = w4l.i.f294643c
            ael.y r5 = (ael.y) r5
            vkm.d r5 = r5.c(r8, r6)
            zfd.e r5 = zi0.c.w(r5)
            vea.b r6 = new vea.b
            r7 = 10
            r6.<init>(r7)
            jhi.b r5 = mo3.a.g(r5, r4, r6, r3)
            r0.f288651w = r3
            java.lang.Object r8 = vkm.q.z(r5, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            boolean r5 = r8 instanceof kel.n
            if (r5 == 0) goto L61
            kel.n r8 = (kel.n) r8
            return r8
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vfh.l.c3(vfh.l, java.lang.String, java.lang.String, gim.c):java.io.Serializable");
    }

    @Override // hdh.f
    public final void Z2(hdh.h request, kul.b proceed) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        V2(new uvf.b(this, request, proceed, (Continuation) null, 19), new vdl.a(this, 21));
    }
}
