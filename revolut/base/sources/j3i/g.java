package j3i;

import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ChartLimitPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ChartLimitPickerController chartLimitPickerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = chartLimitPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.u
            com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerController r1 = r7.v
            switch(r0) {
                case 0: goto L9e;
                default: goto L7;
            }
        L7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            j3i.i r8 = r1.e3()
            com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b r8 = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) r8
            cli.y r0 = r8.v
            java.lang.Object r1 = r0.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            j3i.k r1 = (j3i.k) r1
            com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerControllerContract$Limit r1 = r1.f171197a
            r2 = 0
            if (r1 == 0) goto L3f
            boolean r3 = r1.f96988a
            if (r3 == 0) goto L2e
            float r1 = r1.f96989b
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L2f
        L2e:
            r1 = r2
        L2f:
            if (r1 == 0) goto L3f
            java.math.BigDecimal r3 = new java.math.BigDecimal
            float r1 = r1.floatValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            goto L40
        L3f:
            r3 = r2
        L40:
            r1 = 8
            if (r3 == 0) goto L60
            java.math.RoundingMode r4 = java.math.RoundingMode.DOWN
            java.math.BigDecimal r4 = r3.setScale(r1, r4)
            if (r4 == 0) goto L60
            int r5 = r4.signum()
            if (r5 != 0) goto L5b
            java.math.BigDecimal r4 = new java.math.BigDecimal
            java.math.BigInteger r5 = java.math.BigInteger.ZERO
            r6 = 0
            r4.<init>(r5, r6)
            goto L61
        L5b:
            java.math.BigDecimal r4 = r4.stripTrailingZeros()
            goto L61
        L60:
            r4 = r2
        L61:
            java.math.BigDecimal r5 = java.math.BigDecimal.ZERO
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 == 0) goto L6f
            r3 = 1
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r3, r1)
        L6f:
            j3i.l r1 = new j3i.l
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            j3i.k r0 = (j3i.k) r0
            com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerControllerContract$Limit r0 = r0.f171198b
            if (r0 == 0) goto L8a
            boolean r4 = r0.f96988a
            if (r4 == 0) goto L8a
            float r0 = r0.f96989b
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L8b
        L8a:
            r0 = r2
        L8b:
            if (r3 == 0) goto L95
            float r2 = r3.floatValue()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L95:
            r1.<init>(r0, r2)
            r8.C2(r1)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L9e:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            j3i.i r8 = r1.e3()
            com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b r8 = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) r8
            com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.a$a r0 = com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.a.C0592a.f96993a
            r8.C2(r0)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j3i.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
