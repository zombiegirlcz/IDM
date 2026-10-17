package com.revolut.trading.orders.ui.invest.placement.screens.review;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function1 {
    public nel.n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f106978w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Continuation continuation) {
        super(1, continuation);
        this.f106978w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.f106978w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (com.revolut.trading.orders.ui.invest.placement.screens.review.o.L2(r6, r1, r8) == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[PHI: r1 r9
      0x0058: PHI (r1v4 'instrument' nel.n) = (r1v3 'instrument' nel.n), (r1v6 'instrument' nel.n) binds: [B:22:0x0055, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r9v5 java.lang.Object) = (r9v4 java.lang.Object), (r9v0 java.lang.Object) binds: [B:22:0x0055, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            com.revolut.trading.orders.ui.invest.placement.screens.review.o r6 = r8.f106978w
            if (r1 == 0) goto L31
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            yhm.o.b(r9)
            goto Lc2
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            nel.n r1 = r8.u
            yhm.o.b(r9)
            goto L58
        L27:
            nel.n r1 = r8.u
            yhm.o.b(r9)
            goto L4d
        L2d:
            yhm.o.b(r9)
            goto L3e
        L31:
            yhm.o.b(r9)
            r8.v = r5
            java.lang.Object r9 = com.revolut.trading.orders.ui.invest.placement.screens.review.o.I2(r6, r8)
            if (r9 != r0) goto L3e
            goto Lba
        L3e:
            nel.n r9 = (nel.n) r9
            r8.u = r9
            r8.v = r4
            java.lang.Object r1 = com.revolut.trading.orders.ui.invest.placement.screens.review.o.M2(r6, r9, r8)
            if (r1 != r0) goto L4c
            goto Lba
        L4c:
            r1 = r9
        L4d:
            r8.u = r1
            r8.v = r3
            java.lang.Object r9 = com.revolut.trading.orders.ui.invest.placement.screens.review.o.J2(r6, r8)
            if (r9 != r0) goto L58
            goto Lba
        L58:
            jel.c r9 = (jel.c) r9
            lul.h r3 = r6.z
            cli.y r4 = r6.g0
            java.lang.Object r4 = r4.f22677a
            vkm.j2 r4 = (vkm.j2) r4
            java.lang.Object r4 = r4.getValue()
            hul.h r4 = (hul.h) r4
            com.revolut.trading.orders.ui.invest.placement.models.InvestOrderDraft r4 = r4.f155719a
            bfl.g r4 = r4.f106847a
            r3.getClass()
            java.lang.String r3 = "instrument"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "tradeSide"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            nel.z r3 = r1.f214597c
            nel.z r5 = nel.z.FUND
            r7 = 0
            if (r3 != r5) goto La0
            bfl.g r3 = bfl.g.BUY
            if (r4 != r3) goto La0
            com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning$FundLiquidityOrderPlacementWarning r3 = new com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning$FundLiquidityOrderPlacementWarning
            boolean r4 = r9 instanceof jel.b0
            if (r4 == 0) goto L8d
            jel.b0 r9 = (jel.b0) r9
            goto L8e
        L8d:
            r9 = r7
        L8e:
            if (r9 == 0) goto L9b
            jel.j0 r9 = r9.f173415h
            if (r9 == 0) goto L9b
            jel.r0 r9 = r9.f173484c
            if (r9 == 0) goto L9b
            java.lang.Boolean r9 = r9.f173556c
            goto L9c
        L9b:
            r9 = r7
        L9c:
            r3.<init>(r9)
            goto Lae
        La0:
            nel.t r9 = r1.k
            nel.q r3 = nel.q.f214610b
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r3)
            if (r9 == 0) goto Lad
            com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep$OrderPlacementWarning$OtcExchangeOrderPlacementWarning r3 = com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract.ModalStep.OrderPlacementWarning.OtcExchangeOrderPlacementWarning.f106960a
            goto Lae
        Lad:
            r3 = r7
        Lae:
            if (r3 != 0) goto Lbb
            r8.u = r7
            r8.v = r2
            java.lang.Object r9 = com.revolut.trading.orders.ui.invest.placement.screens.review.o.L2(r6, r1, r8)
            if (r9 != r0) goto Lc2
        Lba:
            return r0
        Lbb:
            com.revolut.kompot.navigable.vc.modal.a r9 = r6.f106983h0
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r9, r3, r0)
        Lc2:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.review.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
