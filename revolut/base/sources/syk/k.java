package syk;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingAccountType f266690w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, TradingAccountType tradingAccountType, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f266690w = tradingAccountType;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f266690w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (((ael.y) r8).g(r1, r7) == r0) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType r2 = r7.f266690w
            syk.o r3 = r7.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            yhm.o.b(r8)
            goto L7b
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            yhm.o.b(r8)
            goto L3c
        L21:
            yhm.o.b(r8)
            ybl.k r8 = r3.f266696b
            akg.n r8 = ybl.k.h(r8, r2, r6, r4)
            zfd.e r8 = zi0.c.w(r8)
            r1 = 3
            jhi.b r8 = mo3.a.g(r8, r6, r6, r1)
            r7.u = r5
            java.lang.Object r8 = vkm.q.z(r8, r7)
            if (r8 != r0) goto L3c
            goto L7a
        L3c:
            od0.i r8 = (od0.i) r8
            if (r8 == 0) goto L4a
            java.lang.Object r8 = r8.f224257a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r8 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r8
            if (r8 == 0) goto L4a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r6 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(r8)
        L4a:
            if (r6 != 0) goto L63
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot find portfolio for trading account "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            hx7.e.n(r8)
            goto L7b
        L63:
            ybl.d r8 = r3.f266695a
            java.util.UUID r1 = r6.f105210a
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r7.u = r4
            ael.y r8 = (ael.y) r8
            java.lang.Object r8 = r8.g(r1, r7)
            if (r8 != r0) goto L7b
        L7a:
            return r0
        L7b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: syk.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
