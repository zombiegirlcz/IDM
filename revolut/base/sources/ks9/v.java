package ks9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends yji.n implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b9k.f f189386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k61.a f189387m;

    public v(b9k.f interactor, k61.a transferInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        this.f189386l = interactor;
        this.f189387m = transferInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(ks9.v r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof ks9.t
            if (r0 == 0) goto L16
            r0 = r5
            ks9.t r0 = (ks9.t) r0
            int r1 = r0.f189384w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f189384w = r1
            goto L1b
        L16:
            ks9.t r0 = new ks9.t
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189384w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)
            goto L44
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            b9k.f r4 = r4.f189386l
            efm.d0 r4 = r4.p()
            r0.f189384w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.v.Z2(ks9.v, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(ks9.v r4, oq9.c0 r5, do3.n r6, gim.c r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof ks9.u
            if (r0 == 0) goto L16
            r0 = r7
            ks9.u r0 = (ks9.u) r0
            int r1 = r0.f189385w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f189385w = r1
            goto L1b
        L16:
            ks9.u r0 = new ks9.u
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189385w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L53
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r7)
            java.lang.String r7 = yh5.b.l(r5)
            if (r7 == 0) goto L65
            int r2 = r7.length()
            if (r2 != 0) goto L42
            goto L65
        L42:
            k61.a r5 = r4.f189387m
            k61.i r5 = (k61.i) r5
            efm.d0 r5 = r5.f(r7)
            r0.f189385w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            com.revolut.domain.models.moneyrequest.TransferLinkDetails r7 = (com.revolut.domain.models.moneyrequest.TransferLinkDetails) r7
            com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig$Details$ByTransferLink r5 = new com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig$Details$ByTransferLink
            kotlin.jvm.internal.Intrinsics.h(r7)
            r5.<init>(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.c(r5)
            r4.A2(r5)
            goto L74
        L65:
            com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreen r7 = new com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreen
            com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreenContract$InputData r0 = new com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreenContract$InputData
            r0.<init>(r5, r6)
            r7.<init>(r0)
            r5 = 0
            r6 = 3
            yji.n.O2(r4, r7, r5, r6)
        L74:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.v.b3(ks9.v, oq9.c0, do3.n, gim.c):java.lang.Object");
    }
}
