package pze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.L2(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.K2(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            yhm.o.b(r6)
            goto L3c
        L19:
            yhm.o.b(r6)
            com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b r6 = r5.v
            gte.a r1 = r6.f91015w
            com.revolut.feature.topup_screen.api.TopupApi$Toggles$TopUpCardOwnerVerification r4 = com.revolut.feature.topup_screen.api.TopupApi$Toggles.TopUpCardOwnerVerification.f90471c
            jte.d r1 = (jte.d) r1
            boolean r1 = r1.c(r4)
            if (r1 == 0) goto L33
            r5.u = r3
            java.lang.Object r6 = com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.L2(r6, r5)
            if (r6 != r0) goto L3c
            goto L3b
        L33:
            r5.u = r2
            java.lang.Object r6 = com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.K2(r6, r5)
            if (r6 != r0) goto L3c
        L3b:
            return r0
        L3c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pze.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
