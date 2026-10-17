package buf;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ a1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferRequestApprovalData.MoneyRequestApproval f18836w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(a1 a1Var, TransferRequestApprovalData.MoneyRequestApproval moneyRequestApproval, Continuation continuation) {
        super(1, continuation);
        this.v = a1Var;
        this.f18836w = moneyRequestApproval;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t0(this.v, this.f18836w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r7 == r0) goto L17;
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
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$MoneyRequestApproval r2 = r6.f18836w
            buf.a1 r3 = r6.v
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            yhm.o.b(r7)
            goto L47
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L2e
        L20:
            yhm.o.b(r7)
            com.revolut.domain.models.moneyrequest.MoneyRequest r7 = r2.f92452b
            r6.u = r5
            java.lang.Object r7 = buf.a1.y2(r3, r7, r6)
            if (r7 != r0) goto L2e
            goto L46
        L2e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4a
            kuf.d r7 = r3.v
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r1 = r3.C2()
            com.revolut.domain.models.moneyrequest.MoneyRequest r2 = r2.f92452b
            r6.u = r4
            java.io.Serializable r7 = r7.Z2(r1, r2, r6)
            if (r7 != r0) goto L47
        L46:
            return r0
        L47:
            k71.i r7 = (k71.i) r7
            return r7
        L4a:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
