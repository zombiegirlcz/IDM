package cul;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class c1 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f109081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109082c;
    public final /* synthetic */ Amount d;

    public /* synthetic */ c1(FlowCollector flowCollector, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Amount amount, int i) {
        this.f109080a = i;
        this.f109081b = flowCollector;
        this.f109082c = eVar;
        this.d = amount;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.f109080a
            switch(r0) {
                case 0: goto L62;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof cul.l2
            if (r0 == 0) goto L18
            r0 = r7
            cul.l2 r0 = (cul.l2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            cul.l2 r0 = new cul.l2
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            java.lang.Float r6 = (java.lang.Float) r6
            com.revolut.trading.orders.ui.invest.placement.screens.edit.e r7 = r5.f109082c
            gul.c r7 = r7.S
            kotlin.jvm.internal.Intrinsics.h(r6)
            float r6 = r6.floatValue()
            r7.getClass()
            com.revolut.shared.feature.market_data.models.domain.models.Amount r7 = r5.d
            com.revolut.shared.feature.market_data.models.domain.models.Amount r6 = gul.c.a(r7, r6)
            r7 = 3
            r2 = 0
            r4 = 0
            com.revolut.data.model.Data r6 = zi0.c.P(r6, r2, r4, r7)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f109081b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L61:
            return r1
        L62:
            boolean r0 = r7 instanceof cul.b1
            if (r0 == 0) goto L75
            r0 = r7
            cul.b1 r0 = (cul.b1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L75
            int r1 = r1 - r2
            r0.v = r1
            goto L7a
        L75:
            cul.b1 r0 = new cul.b1
            r0.<init>(r5, r7)
        L7a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L91
            if (r2 != r3) goto L89
            yhm.o.b(r7)
            goto Lbc
        L89:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L91:
            yhm.o.b(r7)
            java.lang.Float r6 = (java.lang.Float) r6
            com.revolut.trading.orders.ui.invest.placement.screens.edit.e r7 = r5.f109082c
            gul.c r7 = r7.S
            kotlin.jvm.internal.Intrinsics.h(r6)
            float r6 = r6.floatValue()
            r7.getClass()
            com.revolut.shared.feature.market_data.models.domain.models.Amount r7 = r5.d
            com.revolut.shared.feature.market_data.models.domain.models.Amount r6 = gul.c.a(r7, r6)
            r7 = 3
            r2 = 0
            r4 = 0
            com.revolut.data.model.Data r6 = zi0.c.P(r6, r2, r4, r7)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f109081b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto Lbc
            goto Lbe
        Lbc:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cul.c1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
