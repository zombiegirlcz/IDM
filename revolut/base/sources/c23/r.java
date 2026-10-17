package c23;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.c f20631w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z, com.revolut.feature.card_order_new.impl.kompot.c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = z;
        this.f20631w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.v, this.f20631w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r1.Z2(r7, r3, r4, r6) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            r3 = 1
            com.revolut.feature.card_order_new.impl.kompot.c r4 = r6.f20631w
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L70
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L4f
        L1e:
            yhm.o.b(r7)
            boolean r7 = r6.v
            if (r7 == 0) goto L46
            com.revolut.feature.checkout.models.CheckoutParams$CardOrder r7 = new com.revolut.feature.checkout.models.CheckoutParams$CardOrder
            b93.f$a r1 = new b93.f$a
            r3 = 0
            r5 = 7
            r1.<init>(r3, r5)
            com.revolut.kompot.navigable.flow.FlowStateWrapper r3 = r4.A2()
            com.revolut.kompot.navigable.flow.FlowState r3 = r3.f98429a
            com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State r3 = (com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State) r3
            pi3.h r3 = r3.e
            com.revolut.kompot.navigable.flow.FlowStateWrapper r5 = r4.A2()
            com.revolut.kompot.navigable.flow.FlowState r5 = r5.f98429a
            com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State r5 = (com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State) r5
            com.revolut.core.model.account.AccountId r5 = r5.f65055j
            r7.<init>(r1, r3, r5)
            goto L51
        L46:
            r6.u = r3
            java.lang.Object r7 = com.revolut.feature.card_order_new.impl.kompot.c.O2(r4, r6)
            if (r7 != r0) goto L4f
            goto L6f
        L4f:
            com.revolut.feature.checkout.models.CheckoutParams$CardOrder r7 = (com.revolut.feature.checkout.models.CheckoutParams.CardOrder) r7
        L51:
            qh3.c r1 = r4.u
            com.revolut.kompot.navigable.flow.FlowStateWrapper r3 = r4.A2()
            com.revolut.kompot.navigable.flow.FlowState r3 = r3.f98429a
            com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State r3 = (com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State) r3
            com.revolut.retail.core.navigation.NaviCommand r3 = r3.f
            com.revolut.kompot.navigable.flow.FlowStateWrapper r4 = r4.A2()
            com.revolut.kompot.navigable.flow.FlowState r4 = r4.f98429a
            com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State r4 = (com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State) r4
            com.revolut.analytics.tracking.v3.AnalyticsProduct r4 = r4.f65062s
            r6.u = r2
            java.lang.Object r7 = r1.Z2(r7, r3, r4, r6)
            if (r7 != r0) goto L70
        L6f:
            return r0
        L70:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c23.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
