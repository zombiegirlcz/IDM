package q87;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a f243040w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f243040w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(0, this.f243040w, continuation);
            default:
                return new y(1, this.f243040w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.u
            switch(r0) {
                case 0: goto L74;
                default: goto L5;
            }
        L5:
            com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a r0 = r7.f243040w
            b4h.e r1 = r0.f74602p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L2c
            if (r3 == r6) goto L28
            if (r3 == r5) goto L24
            if (r3 != r4) goto L1c
            yhm.o.b(r8)
            goto L71
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L24:
            yhm.o.b(r8)
            goto L5b
        L28:
            yhm.o.b(r8)
            goto L3c
        L2c:
            yhm.o.b(r8)
            tnb.k r8 = r1.a()
            r7.v = r6
            java.lang.Object r8 = vkm.q.x(r8, r7)
            if (r8 != r2) goto L3c
            goto L73
        L3c:
            eel.c r8 = (eel.c) r8
            if (r8 != 0) goto L71
            ybl.l r8 = r0.f74608x
            akg.n r8 = ybl.l.d(r8)
            q34.a r0 = new q34.a
            r3 = 27
            r0.<init>(r3)
            r3 = 0
            jhi.b r8 = mo3.a.g(r8, r3, r0, r6)
            r7.v = r5
            java.lang.Object r8 = vkm.q.x(r8, r7)
            if (r8 != r2) goto L5b
            goto L73
        L5b:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r8 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r8
            hel.b r8 = r8.f105106a
            hel.b r0 = hel.b.GB
            if (r8 != r0) goto L66
            eel.c r8 = eel.c.FIVE_YEAR
            goto L68
        L66:
            eel.c r8 = eel.c.ONE_DAY
        L68:
            r7.v = r4
            java.lang.Object r8 = r1.b(r8, r7)
            if (r8 != r2) goto L71
            goto L73
        L71:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L73:
            return r2
        L74:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            r2 = 1
            if (r1 == 0) goto L89
            if (r1 != r2) goto L81
            yhm.o.b(r8)
            goto La1
        L81:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L89:
            yhm.o.b(r8)
            com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a r8 = r7.f243040w
            ou5.b r1 = r8.u
            com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreenContract$InputData r8 = r8.o
            com.revolut.feature.global_markets.domain.Market r8 = r8.f74600a
            h87.f r8 = foh.i.I(r8)
            r7.v = r2
            java.lang.Object r8 = r1.D(r8, r7)
            if (r8 != r0) goto La1
            goto La3
        La1:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q87.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
