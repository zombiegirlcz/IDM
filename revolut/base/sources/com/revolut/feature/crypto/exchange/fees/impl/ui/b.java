package com.revolut.feature.crypto.exchange.fees.impl.ui;

import com.revolut.data.model.Data;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.crypto.exchange.fees.impl.ui.c r0 = r7.v
            cli.y r1 = r0.v
            java.lang.Object r2 = r7.u
            com.revolut.data.model.Data r2 = (com.revolut.data.model.Data) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            java.lang.Object r8 = r2.getContent()
            java.util.List r8 = (java.util.List) r8
            r3 = 0
            if (r8 == 0) goto L3c
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = zhm.w.t(r8, r5)
            r4.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L27:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r8.next()
            com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees r5 = (com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees) r5
            com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem$Details r6 = new com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem$Details
            r6.<init>(r5)
            r4.add(r6)
            goto L27
        L3c:
            r4 = r3
        L3d:
            if (r4 == 0) goto Lb0
            lf5.b r8 = r0.o
            int[] r5 = zf5.k.f321878a
            int r8 = r8.ordinal()
            r8 = r5[r8]
            r5 = 4
            if (r8 != r5) goto L70
            java.util.Iterator r8 = r4.iterator()
        L50:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L64
            java.lang.Object r5 = r8.next()
            r6 = r5
            com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem$Details r6 = (com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem.Details) r6
            com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees r6 = r6.f70837a
            boolean r6 = r6.f70810b
            if (r6 == 0) goto L50
            r3 = r5
        L64:
            com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem$Details r3 = (com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem.Details) r3
            if (r3 != 0) goto Lb0
            java.lang.Object r8 = zhm.d0.d0(r4)
            com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem$Details r8 = (com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem.Details) r8
        L6e:
            r3 = r8
            goto Lb0
        L70:
            com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode r8 = r0.f70841p
            boolean r5 = r8 instanceof com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode.TradeMore
            if (r5 != 0) goto L8d
            boolean r5 = r8 instanceof com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode.UpgradePlan
            if (r5 == 0) goto L7d
            com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode$UpgradePlan r8 = (com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode.UpgradePlan) r8
            goto L7e
        L7d:
            r8 = r3
        L7e:
            if (r8 == 0) goto L86
            boolean r8 = r8.f70813a
            r5 = 1
            if (r8 != r5) goto L86
            goto L8d
        L86:
            java.lang.Object r8 = zhm.d0.d0(r4)
            com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem$Details r8 = (com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem.Details) r8
            goto L6e
        L8d:
            java.util.Iterator r8 = r4.iterator()
        L91:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto La5
            java.lang.Object r5 = r8.next()
            r6 = r5
            com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem$Details r6 = (com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem.Details) r6
            com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees r6 = r6.f70837a
            boolean r6 = r6.f70810b
            if (r6 == 0) goto L91
            r3 = r5
        La5:
            com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem$Details r3 = (com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem.Details) r3
            if (r3 != 0) goto Lb0
            java.lang.Object r8 = zhm.d0.d0(r4)
            com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem$Details r8 = (com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem.Details) r8
            goto L6e
        Lb0:
            zf5.n r8 = new zf5.n
            r5 = 0
            r8.<init>(r2, r3, r5)
            r0.H2(r1, r8)
            if (r4 == 0) goto Lc5
            ua2.r r8 = new ua2.r
            r2 = 20
            r8.<init>(r2, r4)
            r0.H2(r1, r8)
        Lc5:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.exchange.fees.impl.ui.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
