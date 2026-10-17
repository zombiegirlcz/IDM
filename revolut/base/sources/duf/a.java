package duf;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f117967w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List list, Continuation continuation) {
        super(2, continuation);
        this.f117967w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f117967w, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r12.u
            r3 = 1
            if (r2 == 0) goto L1a
            if (r2 != r3) goto L12
            yhm.o.b(r13)
            goto La1
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            yhm.o.b(r13)
            java.util.List r13 = r12.f117967w
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r13 = r13.iterator()
        L2a:
            boolean r4 = r13.hasNext()
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L91
            java.lang.Object r4 = r13.next()
            k1j.b r4 = (k1j.b) r4
            java.util.List r7 = r4.f180284c
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L81
            java.lang.Object r9 = r7.next()
            r10 = r9
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r10 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper) r10
            boolean r11 = r10 instanceof com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper.SavingsBalanceWrapper
            if (r11 == 0) goto L6b
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper$SavingsBalanceWrapper r10 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper.SavingsBalanceWrapper) r10
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r10 = r10.f99439h
            pcd.s r10 = r10.f86460a
            java.lang.String r10 = r10.f234882b
            if (r10 == 0) goto L69
            int r10 = r10.length()
            if (r10 != 0) goto L67
            goto L69
        L67:
            r10 = r3
            goto L7b
        L69:
            r10 = r5
            goto L7b
        L6b:
            boolean r11 = r10 instanceof com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper.CreditCardBalanceWrapper
            if (r11 == 0) goto L67
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper$CreditCardBalanceWrapper r10 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper.CreditCardBalanceWrapper) r10
            com.revolut.feature.credit.card.models.CreditCard r10 = r10.i
            java.util.List r10 = r10.f69802q
            yw4.f r11 = yw4.f.POCKET_TRANSFER
            boolean r10 = r10.contains(r11)
        L7b:
            if (r10 == 0) goto L45
            r8.add(r9)
            goto L45
        L81:
            boolean r5 = r8.isEmpty()
            if (r5 != 0) goto L8b
            k1j.b r6 = k1j.b.a(r4, r8)
        L8b:
            if (r6 == 0) goto L2a
            r2.add(r6)
            goto L2a
        L91:
            r13 = 3
            com.revolut.data.model.Data r13 = zi0.c.P(r2, r5, r6, r13)
            r12.v = r6
            r12.u = r3
            java.lang.Object r13 = r0.emit(r13, r12)
            if (r13 != r1) goto La1
            return r1
        La1:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: duf.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
