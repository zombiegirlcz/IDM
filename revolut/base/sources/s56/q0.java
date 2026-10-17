package s56;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DeFiBalance f259983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.remittances.impl.ui.send.amount.b f259984x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(DeFiBalance deFiBalance, com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f259983w = deFiBalance;
        this.f259984x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q0 q0Var = new q0(this.f259983w, this.f259984x, continuation);
        q0Var.v = obj2;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L25;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.u
            r3 = 3
            r4 = 2
            r5 = 1
            com.revolut.feature.defi.remittances.impl.ui.send.amount.b r6 = r8.f259984x
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r7 = r8.f259983w
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L27
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1b
            yhm.o.b(r9)
            goto L75
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            yhm.o.b(r9)
            goto L59
        L27:
            yhm.o.b(r9)
            goto L43
        L2b:
            yhm.o.b(r9)
            boolean r9 = ta6.a.E(r7)
            if (r9 == 0) goto L46
            s56.i0 r9 = r6.f71835s
            r8.v = r0
            r8.u = r5
            w4l.j r2 = w4l.j.f294644c
            java.lang.Object r9 = r9.h(r7, r2, r8)
            if (r9 != r1) goto L43
            goto L74
        L43:
            com.revolut.feature.transfer.core.models.FundingSource r9 = (com.revolut.feature.transfer.core.models.FundingSource) r9
            goto L5d
        L46:
            opf.z r9 = r6.u
            k1j.a r2 = k1j.a.DEFI
            java.lang.String r5 = r7.f71638g
            r8.v = r0
            r8.u = r4
            com.revolut.core.model.account.AccountId$Personal r4 = com.revolut.core.model.account.AccountId.Personal.f51414a
            java.lang.Object r9 = r9.d(r4, r8, r5, r2)
            if (r9 != r1) goto L59
            goto L74
        L59:
            if (r9 == 0) goto L78
            com.revolut.feature.transfer.core.models.FundingSource r9 = (com.revolut.feature.transfer.core.models.FundingSource) r9
        L5d:
            vo9.a r2 = r6.v
            com.revolut.core.model.account.AccountId r4 = r9.getK()
            yt9.g r2 = (yt9.g) r2
            com.revolut.feature.payments.api.mapper.PaymentPocketInfo r9 = r2.f(r9, r4)
            r2 = 0
            r8.v = r2
            r8.u = r3
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L78:
            java.lang.String r9 = r7.f71638g
            java.lang.String r0 = "DeFi funding source not found: "
            java.lang.String r9 = j6.a.q(r0, r9)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
