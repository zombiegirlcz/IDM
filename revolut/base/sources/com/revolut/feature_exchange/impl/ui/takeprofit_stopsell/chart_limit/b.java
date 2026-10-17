package com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit;

import au6.u;
import cli.y;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountController;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountControllerContract$InputData;
import com.revolut.feature_market_data_impl.data.model.OrderQuoteLimitsParams;
import i4i.g;
import j3i.i;
import j3i.k;
import j3i.o;
import j3i.p;
import j3i.t;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import kgm.c;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import w4l.j;
import wd6.e;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements i {

    @NotNull
    public static final o Companion = new o();
    public final TakeProfitStopLossParams o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f96994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jx0.a f96995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u80.t f96996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f96997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f96998t;
    public final BigDecimal u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f96999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j2 f97000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f97001y;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(com.revolut.feature_exchange.api.models.TakeProfitStopLossParams r17, j3i.t r18, jx0.a r19, u80.t r20, j60.a r21, kgm.c r22) {
        /*
            r16 = this;
            r0 = r16
            r6 = r17
            r2 = r18
            r1 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.String r7 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.lang.String r7 = "stateMapper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            java.lang.String r7 = "takeProfitStopLossChartInteractor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            java.lang.String r7 = "ratesMoneyUtils"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            java.lang.String r7 = "bottomDialogControllerExtension"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
            java.lang.String r7 = "orderQuoteFeeAndLimitsInteractor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            r0.<init>()
            r0.o = r6
            r0.f96994p = r2
            r0.f96995q = r1
            r0.f96996r = r3
            r0.f96997s = r4
            r0.f96998t = r5
            r3 = 1
            r1 = 8
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r3, r1)
            r0.u = r1
            com.revolut.data.model.Data r11 = new com.revolut.data.model.Data
            r7 = r11
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 1
            r7.<init>(r8, r9, r10, r11, r12)
            j3i.j r12 = new j3i.j
            float r1 = r6.d
            xi0.b r3 = r6.f96825a
            r12.<init>(r1, r3)
            xi0.b r13 = r6.f96826b
            r0i.c r14 = r6.f96827c
            wd6.e r15 = r6.e
            j3i.k r1 = new j3i.k
            java.lang.String r10 = "WEEK"
            r11 = r7
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 0
            r5 = 12
            r3 = 0
            cli.y r1 = mra.d.b(r0, r1, r2, r3, r4, r5)
            r0.v = r1
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            j3i.k r1 = (j3i.k) r1
            java.lang.String r1 = r1.f171199c
            vkm.j2 r1 = vkm.q.c(r1)
            r0.f96999w = r1
            com.revolut.feature.exchange.models.TakeProfitStopLoss r1 = r6.f96829h
            r2 = 0
            if (r1 == 0) goto L8c
            java.lang.Double r3 = r1.f72160b
            goto L8d
        L8c:
            r3 = r2
        L8d:
            if (r3 != 0) goto L97
            if (r1 == 0) goto L93
            java.lang.Double r2 = r1.f72161c
        L93:
            if (r2 != 0) goto L97
            r1 = 1
            goto L98
        L97:
            r1 = 0
        L98:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            vkm.j2 r1 = vkm.q.c(r1)
            r0.f97000x = r1
            j2c.n r1 = new j2c.n
            r2 = 3
            r1.<init>(r0, r2)
            com.revolut.kompot.navigable.vc.modal.a r1 = hx7.e.a(r0, r1)
            r0.f97001y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b.<init>(com.revolut.feature_exchange.api.models.TakeProfitStopLossParams, j3i.t, jx0.a, u80.t, j60.a, kgm.c):void");
    }

    @Override // yji.l
    public final void I1() {
        TakeProfitStopLossParams takeProfitStopLossParams = this.o;
        Pair ccyPair = new Pair(takeProfitStopLossParams.f.f115083b, takeProfitStopLossParams.f96828g.f115083b);
        e ccyPairSide = e.BUY;
        e orderSide = takeProfitStopLossParams.f96827c == r0i.c.TP_SL ? e.SELL : ((k) ((j2) this.v.f22677a).getValue()).f171201h;
        long j2 = takeProfitStopLossParams.f.f115082a;
        c cVar = this.f96998t;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(ccyPair, "ccyPair");
        Intrinsics.checkNotNullParameter(ccyPairSide, "ccyPairSide");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        g gVar = (g) ((n4i.a) cVar.f184018b);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(ccyPair, "ccyPair");
        Intrinsics.checkNotNullParameter(ccyPairSide, "ccyPairSide");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        l.b1(this, q.P(rd0.e.b(m70.a.g(gVar.e.e(new OrderQuoteLimitsParams(ccyPair, ccyPairSide.name(), orderSide.name(), j2), j.f294644c), null, new j0g.b(17), 1)), 1), null, new p(this, null, 0), 3);
    }

    public final ChartLimitPickerControllerContract$Limit I2(k59.c cVar, Float f) {
        Pair pair;
        TakeProfitStopLossParams takeProfitStopLossParams = this.o;
        if (takeProfitStopLossParams.e == e.SELL) {
            k59.b bVar = cVar.f181471b;
            pair = new Pair(bVar.f181468b, bVar.f181467a);
        } else {
            k59.b bVar2 = cVar.f181471b;
            pair = new Pair(bVar2.d, bVar2.f181469c);
        }
        boolean z = true;
        float fFloatValue = f != null ? f.floatValue() : (((takeProfitStopLossParams.f96827c == r0i.c.TP_SL ? 10.0f : 5.0f) / 100.0f) + 1) * takeProfitStopLossParams.d;
        TakeProfitStopLoss takeProfitStopLoss = takeProfitStopLossParams.f96829h;
        if ((takeProfitStopLoss != null ? takeProfitStopLoss.f72160b : null) == null) {
            if ((takeProfitStopLoss != null ? takeProfitStopLoss.f72161c : null) != null) {
                z = false;
            }
        }
        float f4 = 100;
        return new ChartLimitPickerControllerContract$Limit(fFloatValue, ((float) ((k59.a) pair.f186386b).f181466b) - f4, ((float) ((k59.a) pair.f186385a).f181466b) - f4, z);
    }

    public final ChartLimitPickerControllerContract$Limit J2(k59.c cVar, Float f) {
        Pair pair;
        TakeProfitStopLossParams takeProfitStopLossParams = this.o;
        if (takeProfitStopLossParams.e == e.SELL) {
            k59.b bVar = cVar.f181471b;
            pair = new Pair(bVar.d, bVar.f181469c);
        } else {
            k59.b bVar2 = cVar.f181471b;
            pair = new Pair(bVar2.f181468b, bVar2.f181467a);
        }
        r0i.c cVar2 = r0i.c.LIMIT;
        boolean z = true;
        float fFloatValue = f != null ? f.floatValue() : takeProfitStopLossParams.d * ((-0.05f) + 1);
        TakeProfitStopLoss takeProfitStopLoss = takeProfitStopLossParams.f96829h;
        if ((takeProfitStopLoss != null ? takeProfitStopLoss.f72161c : null) == null) {
            if ((takeProfitStopLoss != null ? takeProfitStopLoss.f72160b : null) != null) {
                z = false;
            }
        }
        float f4 = 100;
        return new ChartLimitPickerControllerContract$Limit(fFloatValue, ((float) ((k59.a) pair.f186386b).f181466b) - f4, ((float) ((k59.a) pair.f186385a).f181466b) - f4, z);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f97001y;
    }

    public final TPSLAmountController K2(ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit, xi0.b bVar, g3i.a aVar, hw0.q qVar) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(chartLimitPickerControllerContract$Limit.f96989b));
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale = bigDecimal.setScale(8, roundingMode);
        if (Intrinsics.f(scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros(), BigDecimal.ZERO)) {
            bigDecimal = BigDecimal.valueOf(1L, 8);
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Intrinsics.h(bigDecimal);
        int iScale = this.f96996r.c(bigDecimal).scale();
        ref$IntRef.f186408a = iScale;
        long jLongValue = bigDecimal.setScale(iScale, roundingMode).movePointRight(iScale).longValue();
        y yVar = this.v;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(((k) j2Var.getValue()).e.f171195a));
        int i = ref$IntRef.f186408a;
        long jLongValue2 = bigDecimal2.setScale(i, roundingMode).movePointRight(i).longValue();
        if (jLongValue2 <= 0) {
            ref$IntRef.f186408a = 8;
            jLongValue = bigDecimal.setScale(8, roundingMode).movePointRight(8).longValue();
            BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(((k) j2Var2.getValue()).e.f171195a));
            int i2 = ref$IntRef.f186408a;
            jLongValue2 = bigDecimal3.setScale(i2, roundingMode).movePointRight(i2).longValue();
        }
        TPSLAmountController tPSLAmountController = new TPSLAmountController(new TPSLAmountControllerContract$InputData(aVar, jLongValue, jLongValue2, bVar, ref$IntRef.f186408a, chartLimitPickerControllerContract$Limit.f96990c, chartLimitPickerControllerContract$Limit.d, ((k) j2Var2.getValue()).f, ((k) j2Var2.getValue()).f171200g, ((k) j2Var2.getValue()).f171201h));
        j2c.o block = new j2c.o(this, 1, qVar, ref$IntRef);
        Intrinsics.checkNotNullParameter(block, "block");
        tPSLAmountController.H = block;
        return tPSLAmountController;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(new t38.e(this.f96999w, 24, this.f97000x, new u(3, 4, (Continuation) null)), new iw6.l(continuation, this, 5)), null, new p(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
