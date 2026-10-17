package lmb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function1 {
    public h u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a f196938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f196939x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a aVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.f196938w = aVar;
        this.f196939x = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.f196938w, this.f196939x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r12 == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r12 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6 A[EDGE_INSN: B:42:0x00a6->B:38:0x00a6 BREAK  A[LOOP:0: B:33:0x0097->B:44:?], SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a r0 = r11.f196938w
            com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r11.v
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L2b
            if (r3 == r6) goto L27
            if (r3 == r5) goto L23
            if (r3 != r4) goto L1b
            lmb.h r1 = r11.u
            yhm.o.b(r12)
            goto L91
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            yhm.o.b(r12)
            goto L55
        L27:
            yhm.o.b(r12)
            goto L40
        L2b:
            yhm.o.b(r12)
            boolean r12 = r1 instanceof com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination.Bank
            if (r12 == 0) goto L43
            lmb.i r12 = r0.f83310p
            r3 = r1
            com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination$Bank r3 = (com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination.Bank) r3
            r11.v = r6
            java.lang.Object r12 = r12.Z2(r3, r11)
            if (r12 != r2) goto L40
            goto L8d
        L40:
            lmb.h r12 = (lmb.h) r12
            goto L57
        L43:
            boolean r12 = r1 instanceof com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination.Fund
            if (r12 == 0) goto Lae
            lmb.k r12 = r0.f83311q
            r3 = r1
            com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination$Fund r3 = (com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination.Fund) r3
            r11.v = r5
            java.lang.Object r12 = r12.Z2(r3, r11)
            if (r12 != r2) goto L55
            goto L8d
        L55:
            lmb.h r12 = (lmb.h) r12
        L57:
            lmb.r r3 = new lmb.r
            r8 = 0
            r3.<init>(r0, r12, r7, r8)
            kotlinx.coroutines.CoroutineScope r9 = r11.f196939x
            skm.h0 r3 = skm.e0.g(r9, r7, r7, r3, r4)
            boolean r1 = r1.getF83235h()
            if (r1 != 0) goto L73
            lmb.r r1 = new lmb.r
            r1.<init>(r0, r12, r7, r6)
            skm.h0 r1 = skm.e0.g(r9, r7, r7, r1, r4)
            goto L74
        L73:
            r1 = r7
        L74:
            skm.g0[] r5 = new skm.g0[r5]
            r5[r8] = r3
            r5[r6] = r1
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.util.List r1 = kotlin.collections.d.L(r5)
            r11.u = r12
            r11.v = r4
            java.lang.Object r1 = skm.e0.h(r1, r11)
            if (r1 != r2) goto L8e
        L8d:
            return r2
        L8e:
            r10 = r1
            r1 = r12
            r12 = r10
        L91:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L97:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r12.next()
            boolean r3 = r2 instanceof aii.u
            if (r3 == 0) goto L97
            r7 = r2
        La6:
            aii.u r7 = (aii.u) r7
            vkm.j2 r12 = r0.A
            r12.setValue(r7)
            return r1
        Lae:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lmb.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
