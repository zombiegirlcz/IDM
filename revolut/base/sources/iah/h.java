package iah;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ DepositInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a f160029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TransferSubjectId f160030x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DepositInfo depositInfo, com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a aVar, TransferSubjectId transferSubjectId, Continuation continuation) {
        super(1, continuation);
        this.v = depositInfo;
        this.f160029w = aVar;
        this.f160030x = transferSubjectId;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f160029w, this.f160030x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r8 == r1) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a r0 = r7.f160029w
            m1h.a r0 = r0.f95546p
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            yhm.o.b(r8)
            goto L63
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            yhm.o.b(r8)
            goto L57
        L23:
            yhm.o.b(r8)
            goto L3f
        L27:
            yhm.o.b(r8)
            com.revolut.feature.wealth.api.navigation.models.DepositInfo r8 = r7.v
            boolean r2 = r8 instanceof com.revolut.feature.wealth.api.navigation.models.DepositInfo.OneOffDeposit
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r6 = r7.f160030x
            if (r2 == 0) goto L42
            com.revolut.feature.wealth.api.navigation.models.DepositInfo$OneOffDeposit r8 = (com.revolut.feature.wealth.api.navigation.models.DepositInfo.OneOffDeposit) r8
            dj0.d r8 = r8.f95319a
            r7.u = r5
            java.lang.Object r8 = r0.c(r6, r8, r7)
            if (r8 != r1) goto L3f
            goto L62
        L3f:
            nii.m0 r8 = (nii.m0) r8
            return r8
        L42:
            boolean r2 = r8 instanceof com.revolut.feature.wealth.api.navigation.models.DepositInfo.RecurringDeposit
            if (r2 == 0) goto L66
            com.revolut.feature.wealth.api.navigation.models.DepositInfo$RecurringDeposit r8 = (com.revolut.feature.wealth.api.navigation.models.DepositInfo.RecurringDeposit) r8
            java.lang.String r2 = r8.e
            if (r2 != 0) goto L5a
            dj0.d r8 = r8.f95321a
            r7.u = r4
            java.lang.Object r8 = r0.b(r6, r8, r7)
            if (r8 != r1) goto L57
            goto L62
        L57:
            nii.m0 r8 = (nii.m0) r8
            return r8
        L5a:
            r7.u = r3
            java.lang.Object r8 = r0.a()
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            nii.m0 r8 = (nii.m0) r8
            return r8
        L66:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: iah.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
