package uyh;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f284408x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f284407w = dVar;
        this.f284408x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t0 t0Var = new t0(this.f284407w, this.f284408x, continuation);
        t0Var.v = obj2;
        return t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (r9.T2(r12, r1) == r8) goto L40;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.Object r0 = r12.v
            r7 = r0
            java.util.List r7 = (java.util.List) r7
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r0 = r12.u
            com.revolut.feature_crypto_order_flow.impl.exchange.d r9 = r12.f284407w
            r10 = 2
            r1 = 1
            r11 = 0
            if (r0 == 0) goto L27
            if (r0 == r1) goto L21
            if (r0 != r10) goto L19
            yhm.o.b(r13)
            goto Lbc
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L21:
            yhm.o.b(r13)
            r0 = r13
            goto La1
        L27:
            yhm.o.b(r13)
            uyh.b1 r0 = r9.H
            cli.y r2 = r9.K
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            uyh.j r2 = (uyh.j) r2
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r2 = r2.f284369a
            if (r2 == 0) goto L43
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r2 = r2.f96690b
            if (r2 == 0) goto L43
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier r2 = r2.e
            goto L44
        L43:
            r2 = r11
        L44:
            kotlin.jvm.internal.Intrinsics.h(r7)
            r12.v = r7
            r12.u = r1
            r0.getClass()
            boolean r1 = r2 instanceof com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract.MoneyDetails.BalanceIdentifier.LoyaltyAccount
            if (r1 == 0) goto L55
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier$LoyaltyAccount r2 = (com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract.MoneyDetails.BalanceIdentifier.LoyaltyAccount) r2
            goto L56
        L55:
            r2 = r11
        L56:
            if (r2 != 0) goto L5a
        L58:
            r0 = r11
            goto L9e
        L5a:
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L6b
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6b
            goto L8c
        L6b:
            java.util.Iterator r1 = r1.iterator()
        L6f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r1.next()
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r3 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper) r3
            boolean r4 = r3 instanceof com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper.RevPointsAccountBalanceWrapper
            if (r4 == 0) goto L6f
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper$RevPointsAccountBalanceWrapper r3 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper.RevPointsAccountBalanceWrapper) r3
            java.lang.String r3 = r3.f99435h
            java.lang.String r4 = r2.f96686a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 == 0) goto L6f
            goto L58
        L8c:
            czh.k r0 = r0.f284353a
            xi0.b r1 = r12.f284408x
            java.util.List r2 = zhm.u.c(r1)
            wd6.e r3 = wd6.e.BUY
            wd6.h r4 = wd6.h.MARKET
            r5 = 0
            r6 = r12
            java.lang.Object r0 = r0.b(r1, r2, r3, r4, r5, r6)
        L9e:
            if (r0 != r8) goto La1
            goto Lbb
        La1:
            r4 = r0
            czh.e r4 = (czh.e) r4
            sc7.b r1 = new sc7.b
            r6 = 12
            xi0.b r5 = r12.f284408x
            r3 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r12.v = r11
            r12.u = r10
            java.util.Set r0 = com.revolut.feature_crypto_order_flow.impl.exchange.d.M
            java.lang.Object r0 = r2.T2(r12, r1)
            if (r0 != r8) goto Lbc
        Lbb:
            return r8
        Lbc:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uyh.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
