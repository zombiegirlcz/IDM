package olh;

import fsl.c;
import kotlin.jvm.internal.Intrinsics;
import tzg.m;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f226412a;

    public b(m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f226412a = wealthAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // fsl.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof olh.a
            if (r0 == 0) goto L13
            r0 = r8
            olh.a r0 = (olh.a) r0
            int r1 = r0.f226411w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226411w = r1
            goto L1a
        L13:
            olh.a r0 = new olh.a
            gim.c r8 = (gim.c) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226411w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r8)
            goto L5c
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            yhm.o.b(r8)
            tzg.m r8 = r7.f226412a
            r2 = 3
            r4 = 0
            akg.n r8 = tzg.m.c(r8, r4, r4, r2)
            ngh.i r2 = new ngh.i
            r4 = 20
            r2.<init>(r4)
            ol6.b r4 = new ol6.b
            r5 = 2
            r4.<init>(r5)
            ol6.b r5 = new ol6.b
            r6 = 3
            r5.<init>(r6)
            jhi.b r8 = mo3.a.f(r8, r4, r2, r5)
            r0.f226411w = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers r8 = (com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers) r8
            com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData$PendingOrders$DisplayOptions r0 = new com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData$PendingOrders$DisplayOptions
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: olh.b.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
