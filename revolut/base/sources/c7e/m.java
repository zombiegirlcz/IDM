package c7e;

import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f21964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f21964w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, this.f21964w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if (r10 == r2) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            h93.f0 r0 = r9.f21964w
            java.lang.String r1 = r0.f150110a
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.u
            r4 = 2
            r5 = 1
            r6 = 0
            c7e.n r7 = r9.v
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r10)
            goto L9b
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            yhm.o.b(r10)
            goto L50
        L24:
            yhm.o.b(r10)
            xua.a r10 = r7.u
            yua.q r10 = (yua.q) r10
            efm.r r10 = r10.p(r1, r5)
            efm.r r10 = zi0.c.J(r10)
            c2f.m r3 = new c2f.m
            r8 = 17
            r3.<init>(r8)
            efm.r r10 = m70.a.g(r10, r3, r6, r4)
            efm.d0 r10 = r10.firstOrError()
            java.lang.String r3 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
            r9.u = r5
            java.lang.Object r10 = nim.a.b(r10, r9)
            if (r10 != r2) goto L50
            goto L9a
        L50:
            java.util.List r10 = (java.util.List) r10
            kotlin.jvm.internal.Intrinsics.h(r10)
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L88
            g9e.b r10 = r7.v
            ice.p r10 = (ice.p) r10
            r10.getClass()
            java.lang.String r10 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r10)
            com.revolut.feature.subscriptions.impl.flow.SubscriptionsFlow r10 = new com.revolut.feature.subscriptions.impl.flow.SubscriptionsFlow
            com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination$InputData r0 = new com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination$InputData
            com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination$StartType$CardSubscriptionList r2 = new com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination$StartType$CardSubscriptionList
            b9e.d r3 = b9e.d.Unlink
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r10.<init>(r0)
            c69.v r0 = new c69.v
            r1 = 5
            r0.<init>(r7, r1)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r1 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            r7.N2(r10, r1, r0)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L88:
            c7e.l r10 = new c7e.l
            r1 = 1
            r10.<init>(r7, r0, r6, r1)
            r9.u = r4
            nki.a r0 = r7.e
            java.lang.String r1 = "unlinkCard"
            java.lang.Object r10 = pu7.a.B(r0, r1, r10, r9)
            if (r10 != r2) goto L9b
        L9a:
            return r2
        L9b:
            kotlin.Unit r10 = (kotlin.Unit) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c7e.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
