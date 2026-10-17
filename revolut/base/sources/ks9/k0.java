package ks9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qq9.d f189338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PaymentGroup f189339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f189340y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, qq9.d dVar, PaymentGroup paymentGroup, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.v = n0Var;
        this.f189338w = dVar;
        this.f189339x = paymentGroup;
        this.f189340y = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k0(this.v, this.f189338w, this.f189339x, this.f189340y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (ks9.n0.b3(r8, r6, r5, r4, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (ks9.n0.Z2(r8, r6, r5, r4, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            yhm.o.b(r8)
            goto L42
        L19:
            yhm.o.b(r8)
            ks9.n0 r8 = r7.v
            gte.a r1 = r8.f189361t
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalApi$Toggles$SettleUpBalance r4 = com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalApi$Toggles.SettleUpBalance.f92448c
            jte.d r1 = (jte.d) r1
            boolean r1 = r1.c(r4)
            java.util.ArrayList r4 = r7.f189340y
            com.revolut.feature.payments.groups.api.models.PaymentGroup r5 = r7.f189339x
            qq9.d r6 = r7.f189338w
            if (r1 == 0) goto L39
            r7.u = r3
            java.lang.Object r8 = ks9.n0.b3(r8, r6, r5, r4, r7)
            if (r8 != r0) goto L42
            goto L41
        L39:
            r7.u = r2
            java.lang.Object r8 = ks9.n0.Z2(r8, r6, r5, r4, r7)
            if (r8 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
