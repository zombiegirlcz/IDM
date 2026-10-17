package hze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r7 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r7 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c r0 = r6.v
            com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1e
            if (r3 == r5) goto L19
            if (r3 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            yhm.o.b(r7)
            goto L91
        L1e:
            yhm.o.b(r7)
            gte.a r7 = r0.f90989x
            com.revolut.feature.topup_screen.api.TopupApi$Toggles$TopUpCardOwnerVerification r3 = com.revolut.feature.topup_screen.api.TopupApi$Toggles.TopUpCardOwnerVerification.f90471c
            jte.d r7 = (jte.d) r7
            boolean r7 = r7.c(r3)
            if (r7 == 0) goto L5b
            r6.u = r5
            com.revolut.feature.topup_screen.api.descriptor.CardTopUpType r7 = r1.f90493a
            boolean r1 = r7 instanceof com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.PennyTopUp
            if (r1 == 0) goto L43
            com.revolut.feature.topup_screen.api.descriptor.CardTopUpType$PennyTopUp r7 = (com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.PennyTopUp) r7
            java.lang.String r7 = r7.f90488a
            java.lang.Object r7 = r0.M2(r7, r6)
            if (r7 != r2) goto L40
            goto L52
        L40:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            goto L52
        L43:
            boolean r1 = r7 instanceof com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.RegularTopUp
            if (r1 == 0) goto L55
            com.revolut.feature.topup_screen.api.descriptor.CardTopUpType$RegularTopUp r7 = (com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.RegularTopUp) r7
            java.lang.Object r7 = r0.P2(r7, r6)
            if (r7 != r2) goto L50
            goto L52
        L50:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L52:
            if (r7 != r2) goto L91
            goto L90
        L55:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L5b:
            r6.u = r4
            com.revolut.feature.topup_screen.api.descriptor.CardTopUpType r7 = r1.f90493a
            boolean r1 = r7 instanceof com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.RegularTopUp
            r3 = 0
            if (r1 == 0) goto L67
            com.revolut.feature.topup_screen.api.descriptor.CardTopUpType$RegularTopUp r7 = (com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.RegularTopUp) r7
            goto L68
        L67:
            r7 = r3
        L68:
            if (r7 != 0) goto L85
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected RegularTopUp for CPG top-up"
            r7.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r3, r3, r7, r1)
            ste.g r1 = new ste.g
            r1.<init>(r7)
            r0.C2(r1)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            goto L8e
        L85:
            java.lang.Object r7 = r0.O2(r7, r6)
            if (r7 != r2) goto L8c
            goto L8e
        L8c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L8e:
            if (r7 != r2) goto L91
        L90:
            return r2
        L91:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hze.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
