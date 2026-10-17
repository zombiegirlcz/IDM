package com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book;

import bwk.m;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f104041w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, float f, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f104041w = f;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f104041w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (bwk.m.J2(r4, r5, r6, r10.f104041w, r8, r10) == r0) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            r2 = 2
            r3 = 1
            bwk.m r4 = r10.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r11)
            goto L60
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            yhm.o.b(r11)
            goto L36
        L1e:
            yhm.o.b(r11)
            vkm.d r11 = bwk.m.I2(r4)
            jhi.b r1 = bwk.m.K2(r4)
            j23.b r11 = yh5.b.d(r11, r1)
            r10.u = r3
            java.lang.Object r11 = vkm.q.x(r11, r10)
            if (r11 != r0) goto L36
            goto L5f
        L36:
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r1 = r11.f186385a
            r8 = r1
            nel.w0 r8 = (nel.w0) r8
            java.lang.Object r11 = r11.f186386b
            r5 = r11
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r5 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r5
            boolean r11 = r8.a()
            if (r11 != 0) goto L52
            com.revolut.kompot.navigable.vc.modal.a r11 = r4.f19386y
            com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookControllerContract$ModalStep$UnableToTrade r0 = com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookControllerContract$ModalStep.UnableToTrade.f104037a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r11, r0, r1)
            goto L60
        L52:
            bfl.g r6 = bfl.g.BUY
            r10.u = r2
            float r7 = r10.f104041w
            r9 = r10
            java.lang.Object r11 = bwk.m.J2(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L60
        L5f:
            return r0
        L60:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
