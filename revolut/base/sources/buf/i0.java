package buf;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ a1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferRequestApprovalData.GroupBillsApproval f18808w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(a1 a1Var, TransferRequestApprovalData.GroupBillsApproval groupBillsApproval, Continuation continuation) {
        super(1, continuation);
        this.v = a1Var;
        this.f18808w = groupBillsApproval;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.v, this.f18808w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r5.d3(r6, r7, r8, r9, r11) == r0) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$GroupBillsApproval r2 = r11.f18808w
            buf.a1 r3 = r11.v
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            yhm.o.b(r12)
            goto L6c
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            yhm.o.b(r12)
            goto L2c
        L20:
            yhm.o.b(r12)
            r11.u = r5
            java.lang.Object r12 = buf.a1.z2(r3, r2, r11)
            if (r12 != r0) goto L2c
            goto L6b
        L2c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L6f
            kuf.d r5 = r3.v
            qq9.d r6 = qq9.d.TRANSFER
            com.revolut.feature.payments.groups.api.models.PaymentGroup r7 = r2.f92451c
            java.util.List r12 = r2.d
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r12 = r12.iterator()
        L47:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r12.next()
            r2 = r1
            com.revolut.feature.payments.groups.models.GroupMemberSettleInfo r2 = (com.revolut.feature.payments.groups.models.GroupMemberSettleInfo) r2
            boolean r2 = r2.f79505c
            if (r2 == 0) goto L47
            r8.add(r1)
            goto L47
        L5c:
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r12 = r3.C2()
            com.revolut.feature.transfer.core.models.FundingSource r9 = r12.f92455a
            r11.u = r4
            r10 = r11
            java.lang.Object r12 = r5.d3(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L6c
        L6b:
            return r0
        L6c:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L6f:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
