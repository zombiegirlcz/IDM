package asj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8944w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b bVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f8944w = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f8944w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (skm.e0.h(r1, r8) == r0) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 2
            r3 = 1
            com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b r4 = r8.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r9)
            goto L79
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            yhm.o.b(r9)
            goto L3c
        L1e:
            yhm.o.b(r9)
            pzi.b r9 = r4.u
            com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData r1 = r4.f101543t
            com.revolut.core.model.account.AccountId r1 = r1.getF101537b()
            grj.i r9 = (grj.i) r9
            efm.r r9 = r9.d(r1)
            vkm.d r9 = rd0.e.b(r9)
            r8.u = r3
            java.lang.Object r9 = vkm.q.x(r9, r8)
            if (r9 != r0) goto L3c
            goto L78
        L3c:
            java.util.List r9 = (java.util.List) r9
            kotlin.jvm.internal.Intrinsics.h(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = zhm.w.t(r9, r3)
            r1.<init>(r3)
            java.util.Iterator r9 = r9.iterator()
        L52:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r9.next()
            qzi.a r3 = (qzi.a) r3
            asj.m r5 = new asj.m
            r6 = 1
            r7 = 0
            r5.<init>(r4, r3, r7, r6)
            r3 = 3
            kotlinx.coroutines.CoroutineScope r6 = r8.f8944w
            skm.h0 r3 = skm.e0.g(r6, r7, r7, r5, r3)
            r1.add(r3)
            goto L52
        L70:
            r8.u = r2
            java.lang.Object r9 = skm.e0.h(r1, r8)
            if (r9 != r0) goto L79
        L78:
            return r0
        L79:
            aii.o r9 = r4.l1()
            com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.a$b r0 = com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.a.b.f101512b
            aii.n r9 = r9.M0(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: asj.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
