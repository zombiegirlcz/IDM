package ey5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (ey5.j.g3(r2, r1, r10) == r0) goto L15;
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
            ey5.j r2 = r10.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r11)
            goto L55
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            yhm.o.b(r11)
            goto L32
        L1e:
            yhm.o.b(r11)
            wsg.n r11 = r2.f130577m
            com.revolut.core.model.account.AccountId$Personal r1 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r11 = r11.y(r1)
            r10.u = r4
            java.lang.Object r11 = nim.a.b(r11, r10)
            if (r11 != r0) goto L32
            goto L54
        L32:
            io3.d r11 = (io3.d) r11
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoCommodityInvestBizFeatureConfig$BuyCollection r4 = new com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoCommodityInvestBizFeatureConfig$BuyCollection
            java.lang.Object r5 = r2.b3()
            ey5.c r5 = (ey5.c) r5
            java.lang.String r7 = r5.f130573a
            java.lang.String r8 = r11.f163147c
            long r5 = r11.i
            java.lang.String r9 = r11.f163145a
            r4.<init>(r5, r7, r8, r9)
            r1.<init>(r4)
            r10.u = r3
            java.lang.Object r11 = ey5.j.g3(r2, r1, r10)
            if (r11 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ey5.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
