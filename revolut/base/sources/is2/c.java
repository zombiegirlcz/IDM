package is2;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SelectPaymentToBlockScreen f168080w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SelectPaymentToBlockScreen selectPaymentToBlockScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f168080w = selectPaymentToBlockScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f168080w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f168080w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.u
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen r1 = r6.f168080w
            switch(r0) {
                case 0: goto L72;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r6.v
            tof.a3 r0 = (tof.a3) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            is2.i r7 = r1.T2()
            kotlin.jvm.internal.Intrinsics.h(r0)
            tof.j5 r1 = r0.f272605o1
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b r7 = (com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b) r7
            r7.getClass()
            java.lang.String r2 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$InputData r2 = r7.f64270s
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$ScreenType r2 = r2.f64262b
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$ScreenType$BlockMerchant r3 = com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r3)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L49
            gte.a r2 = r7.f64273x
            com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked r5 = com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked.f91958c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r5)
            if (r2 == 0) goto L49
            if (r1 == 0) goto L42
            tof.j1 r1 = r1.o
            goto L43
        L42:
            r1 = r4
        L43:
            tof.j1 r2 = tof.j1.ALLOWED
            if (r1 != r2) goto L53
            r3 = 1
            goto L53
        L49:
            if (r1 == 0) goto L53
            java.lang.Boolean r1 = r1.f272856n
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
        L53:
            if (r3 == 0) goto L5f
            aqd.g r1 = new aqd.g
            r2 = 5
            r1.<init>(r0, r2)
            r7.x2(r1)
            goto L6f
        L5f:
            ikf.g r1 = new ikf.g
            r2 = 13
            r1.<init>(r7, r0, r4, r2)
            whi.b r0 = new whi.b
            r2 = 6
            r0.<init>(r2)
            r7.n2(r1, r0)
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L72:
            java.lang.Object r0 = r6.v
            java.lang.String r0 = (java.lang.String) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            is2.i r7 = r1.T2()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b r7 = (com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b) r7
            r7.getClass()
            java.lang.String r1 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            ik3.a r1 = new ik3.a
            r2 = 7
            r1.<init>(r0, r2)
            r7.x2(r1)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: is2.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
