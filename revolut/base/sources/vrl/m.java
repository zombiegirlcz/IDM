package vrl;

import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prl.h f291654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f291655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final prl.r f291656c;
    public final ybl.d d;
    public final p0i.b e;
    public final xua.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ang.f f291657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f291658h;

    public m(prl.h investOrdersRepository, ybl.b instrumentTickerInteractor, prl.r tradingOrdersRepository, ybl.d portfolioInteractor, p0i.b fxOrderInteractor, xua.a recurringPaymentInteractor, ang.f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(investOrdersRepository, "investOrdersRepository");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingOrdersRepository, "tradingOrdersRepository");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f291654a = investOrdersRepository;
        this.f291655b = instrumentTickerInteractor;
        this.f291656c = tradingOrdersRepository;
        this.d = portfolioInteractor;
        this.e = fxOrderInteractor;
        this.f = recurringPaymentInteractor;
        this.f291657g = userInteractor;
        this.f291658h = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f8, code lost:
    
        if (((ael.y) r5).g(r9, r0) != r1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (((ael.y) r5).g(r9, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f0, code lost:
    
        if (((ael.y) r5).g(r9, r0) != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
    
        if (r9 == r1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016c, code lost:
    
        if (((ael.y) r5).g(r9, r0) != r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019c, code lost:
    
        if (((ael.y) r5).g(r9, r0) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ca, code lost:
    
        if (((ael.y) r5).g(r9, r0) != r1) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vrl.m.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof vrl.k
            if (r0 == 0) goto L13
            r0 = r9
            vrl.k r0 = (vrl.k) r0
            int r1 = r0.f291645x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291645x = r1
            goto L18
        L13:
            vrl.k r0 = new vrl.k
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291645x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L82
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L5a
        L38:
            yhm.o.b(r9)
            prl.r r9 = r6.f291656c
            r9.getClass()
            java.lang.String r2 = "orderId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            com.revolut.trading.orders.data.network.services.TradingOrdersService r9 = r9.f239348a
            efm.b r7 = r9.cancelOrder(r7)
            pfm.r r7 = te0.w.g0(r7)
            r0.u = r8
            r0.f291645x = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L5a
            goto L81
        L5a:
            r7 = 0
            r0.u = r7
            r0.f291645x = r3
            kotlin.time.b$a r9 = kotlin.time.b.INSTANCE
            r2 = 1000(0x3e8, double:4.94E-321)
            pkm.e r9 = pkm.e.MILLISECONDS
            long r2 = kotlin.time.c.h(r2, r9)
            vrl.i r9 = new vrl.i
            r4 = 3
            r9.<init>(r4, r7)
            vc2.s r4 = new vc2.s
            r5 = 25
            r4.<init>(r6, r8, r7, r5)
            java.lang.Object r7 = a.a.y(r2, r9, r4, r0)
            if (r7 != r1) goto L7d
            goto L7f
        L7d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L7f:
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vrl.m.c(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final vkm.d d(String compoundId) {
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        prl.h hVar = this.f291654a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return hVar.d.b(new prl.c(compoundId), loadingStrategy);
    }

    public final Flow e(InvestOrdersParams params, w4l.k loadingStrategy, Function1 filter) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(filter, "filter");
        akg.n ordersFlow = nim.a.v(f(params, loadingStrategy), new v1.m(6, filter));
        Intrinsics.checkNotNullParameter(ordersFlow, "ordersFlow");
        return xam.a.h(new l(this, null), ordersFlow);
    }

    public final akg.n f(InvestOrdersParams params, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        prl.h hVar = this.f291654a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(hVar.f239331b.b(params, loadingStrategy), new pqg.v(8));
    }

    public final akg.n g(InvestOrdersParams params, long j2) {
        Intrinsics.checkNotNullParameter(params, "params");
        prl.h hVar = this.f291654a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        return nim.a.v(qe0.o.a(hVar.f239332c, params, j2, null, false, new pqg.v(9), 12), new pqg.v(8));
    }

    public final Object h(String str, gim.i iVar) {
        Object objD = this.f291654a.d.d(new prl.c(str), true, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }
}
