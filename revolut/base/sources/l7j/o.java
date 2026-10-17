package l7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.CommodityExchangeResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ CommodityExchangeResult.PocketActivationRequired v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f192682w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CommodityExchangeResult.PocketActivationRequired pocketActivationRequired, z zVar, Continuation continuation) {
        super(1, continuation);
        this.v = pocketActivationRequired;
        this.f192682w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, this.f192682w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (l7j.z.I2(r0, r10) == r2) goto L31;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            l7j.z r0 = r10.f192682w
            rea.m r1 = r0.f192701w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.u
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L25
            if (r3 == r6) goto L20
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r11)
            goto La9
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            yhm.o.b(r11)
            goto La0
        L25:
            yhm.o.b(r11)
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.CommodityExchangeResult$PocketActivationRequired r11 = r10.v
            java.lang.String r3 = r11.f99877g
            java.lang.String r7 = "andThen(...)"
            com.revolut.core.model.account.AccountId$Personal r8 = com.revolut.core.model.account.AccountId.Personal.f51414a
            if (r3 == 0) goto L61
            efm.d0 r11 = r1.h(r8, r3)
            l0c.s r3 = new l0c.s
            r5 = 19
            r3.<init>(r0, r5)
            l5i.b r5 = new l5i.b
            r9 = 12
            r5.<init>(r9, r3)
            r11.getClass()
            pfm.a r3 = new pfm.a
            r9 = 4
            r3.<init>(r11, r5, r9)
            pfm.a r11 = r1.i(r8)
            pfm.a r11 = r3.e(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r7)
            r10.u = r6
            java.lang.Object r11 = nim.a.a(r11, r10)
            if (r11 != r2) goto La0
            goto La8
        L61:
            xi0.b r3 = r11.f
            wd6.i r11 = r11.d
            int[] r9 = l7j.n.f192681a
            int r11 = r11.ordinal()
            r11 = r9[r11]
            if (r11 == r6) goto L84
            if (r11 == r5) goto L81
            if (r11 == r4) goto L79
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L79:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Trading pocket type doesn't require activation"
            r11.<init>(r0)
            throw r11
        L81:
            io3.l r11 = io3.l.MERCHANT
            goto L86
        L84:
            io3.l r11 = io3.l.CURRENT
        L86:
            java.lang.String r3 = r3.f306286a
            pfm.a r11 = r1.e(r8, r11, r3)
            pfm.a r1 = r1.i(r8)
            pfm.a r11 = r11.e(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r7)
            r10.u = r5
            java.lang.Object r11 = nim.a.a(r11, r10)
            if (r11 != r2) goto La0
            goto La8
        La0:
            r10.u = r4
            java.lang.Object r11 = l7j.z.I2(r0, r10)
            if (r11 != r2) goto La9
        La8:
            return r2
        La9:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l7j.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
