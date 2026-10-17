package vrb;

import cli.y;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vq5.x;
import vrl.y0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends oki.h implements b {
    public final CfdClosePositionsSelectorContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lal.a f291557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f291558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.b f291559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final prb.c f291560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wj0.a f291561t;
    public final p2b.c u;
    public a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f291562w;

    public l(CfdClosePositionsSelectorContract$InputData inputData, lal.a openPositionsInteractor, y0 tradingPlaceOrderInteractor, ybl.b instrumentTickerInteractor, prb.c placeOrderRequestMapper, wj0.a idempotencyKeyHolder, p2b.c cfdMarketPriceCalculator, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(openPositionsInteractor, "openPositionsInteractor");
        Intrinsics.checkNotNullParameter(tradingPlaceOrderInteractor, "tradingPlaceOrderInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(placeOrderRequestMapper, "placeOrderRequestMapper");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(cfdMarketPriceCalculator, "cfdMarketPriceCalculator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f291557p = openPositionsInteractor;
        this.f291558q = tradingPlaceOrderInteractor;
        this.f291559r = instrumentTickerInteractor;
        this.f291560s = placeOrderRequestMapper;
        this.f291561t = idempotencyKeyHolder;
        this.u = cfdMarketPriceCalculator;
        this.f291562w = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(vrb.l r19, java.util.Set r20, dj0.d r21, gim.c r22) {
        /*
            r0 = r19
            r1 = r22
            r0.getClass()
            boolean r2 = r1 instanceof vrb.j
            if (r2 == 0) goto L1a
            r2 = r1
            vrb.j r2 = (vrb.j) r2
            int r3 = r2.f291555w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f291555w = r3
            goto L1f
        L1a:
            vrb.j r2 = new vrb.j
            r2.<init>(r0, r1)
        L1f:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f291555w
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            yhm.o.b(r1)
            goto Laf
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            yhm.o.b(r1)
            r1 = r20
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r6 = 0
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r6)
            java.lang.String r6 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            java.util.Iterator r6 = r1.iterator()
        L4d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L65
            java.lang.Object r7 = r6.next()
            kel.n r7 = (kel.n) r7
            java.math.BigDecimal r7 = r7.f183174b
            java.math.BigDecimal r4 = r4.add(r7)
            java.lang.String r7 = "add(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            goto L4d
        L65:
            prb.c r8 = r0.f291560s
            java.lang.Object r1 = zhm.d0.a0(r1)
            kel.n r1 = (kel.n) r1
            java.lang.String r9 = r1.e
            boolean r1 = d9.e1.G(r4)
            if (r1 == 0) goto L79
            bfl.g r1 = bfl.g.SELL
        L77:
            r10 = r1
            goto L7c
        L79:
            bfl.g r1 = bfl.g.BUY
            goto L77
        L7c:
            dfl.x r11 = new dfl.x
            java.math.BigDecimal r1 = r4.abs()
            java.lang.String r4 = "abs(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r11.<init>(r1)
            java.lang.String r15 = L2(r20)
            r17 = 0
            r18 = 400(0x190, float:5.6E-43)
            r13 = 0
            r14 = 0
            r16 = 0
            r12 = r21
            k4l.z r1 = prb.b.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            vrl.y0 r4 = r0.f291558q
            com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorContract$InputData r0 = r0.o
            java.lang.String r0 = r0.f83402b
            ufm.i r0 = r4.a(r0, r1)
            r2.f291555w = r5
            java.lang.Object r1 = nim.a.b(r0, r2)
            if (r1 != r3) goto Laf
            return r3
        Laf:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vrb.l.I2(vrb.l, java.util.Set, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(vrb.l r10, kotlinx.coroutines.CoroutineScope r11, java.util.Set r12, dj0.d r13, gim.c r14) {
        /*
            r10.getClass()
            boolean r0 = r14 instanceof vrb.k
            if (r0 == 0) goto L16
            r0 = r14
            vrb.k r0 = (vrb.k) r0
            int r1 = r0.f291556w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f291556w = r1
            goto L1b
        L16:
            vrb.k r0 = new vrb.k
            r0.<init>(r10, r14)
        L1b:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291556w
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)
            goto L6f
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            yhm.o.b(r14)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r14 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r12, r2)
            r14.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
        L47:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r12.next()
            r6 = r2
            kel.n r6 = (kel.n) r6
            vq5.w r4 = new vq5.w
            r9 = 1
            r5 = r10
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r10 = 3
            skm.h0 r10 = skm.e0.g(r11, r8, r8, r4, r10)
            r14.add(r10)
            r10 = r5
            goto L47
        L66:
            r0.f291556w = r3
            java.lang.Object r14 = skm.e0.h(r14, r0)
            if (r14 != r1) goto L6f
            return r1
        L6f:
            java.util.List r14 = (java.util.List) r14
            r10 = r14
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L78:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L87
            java.lang.Object r11 = r10.next()
            boolean r12 = r11 instanceof k4l.m
            if (r12 == 0) goto L78
            goto L88
        L87:
            r11 = r8
        L88:
            boolean r10 = r11 instanceof k4l.m
            if (r10 != 0) goto L8d
            goto L8e
        L8d:
            r8 = r11
        L8e:
            k4l.m r8 = (k4l.m) r8
            if (r8 == 0) goto L93
            return r8
        L93:
            java.lang.Object r10 = zhm.d0.b0(r14)
            java.lang.String r11 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            k4l.p r10 = (k4l.p) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vrb.l.J2(vrb.l, kotlinx.coroutines.CoroutineScope, java.util.Set, dj0.d, gim.c):java.lang.Object");
    }

    public static String L2(Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((kel.n) it8.next()).f183173a.f183145a);
        }
        return a0.d.n("IDEMPOTENCY_TAG_PLACE_ORDER_FROM_ADVANCED_CHART_", arrayList.hashCode());
    }

    public static String M2(kel.n nVar) {
        return j6.a.q("IDEMPOTENCY_TAG_PLACE_ORDER_FROM_ADVANCED_CHART_", nVar.f183173a.f183145a);
    }

    public final void K2() {
        CfdClosePositionsSelectorContract$InputData cfdClosePositionsSelectorContract$InputData = this.o;
        this.v = yji.l.b1(this, c8g.c.d(nim.a.v(this.f291557p.w(cfdClosePositionsSelectorContract$InputData.f83401a, cfdClosePositionsSelectorContract$InputData.f83402b), new vq0.g(11)), new x(this, 3)), null, new vfg.m(this, null, 29), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        K2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f291562w;
    }
}
