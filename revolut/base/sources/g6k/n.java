package g6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public TransferRequestApprovalData.MoneyRequestApproval u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoneyRequest f140999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f141000x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MoneyRequest moneyRequest, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f140999w = moneyRequest;
        this.f141000x = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.f140999w, this.f141000x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (g6k.r.Z2(r6, r2, r8) == r0) goto L29;
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
            int r1 = r8.v
            com.revolut.domain.models.moneyrequest.MoneyRequest r2 = r8.f140999w
            r3 = 2
            r4 = 1
            r5 = 0
            g6k.r r6 = r8.f141000x
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            yhm.o.b(r9)
            goto L8c
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$MoneyRequestApproval r1 = r8.u
            yhm.o.b(r9)
            goto L3c
        L24:
            yhm.o.b(r9)
            com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$MoneyRequestApproval r1 = new com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$MoneyRequestApproval
            r1.<init>(r2)
            g6k.m r9 = new g6k.m
            r9.<init>(r6, r1, r5)
            r8.u = r1
            r8.v = r4
            java.lang.Object r9 = r6.Y2(r8, r9)
            if (r9 != r0) goto L3c
            goto L8b
        L3c:
            utf.b r9 = (utf.b) r9
            if (r9 != 0) goto L42
            r9 = -1
            goto L4a
        L42:
            int[] r7 = g6k.l.f140997a
            int r9 = r9.ordinal()
            r9 = r7[r9]
        L4a:
            if (r9 == r4) goto L81
            if (r9 == r3) goto L6e
            r0 = 3
            if (r9 != r0) goto L68
            wv9.c r9 = r6.o
            v6k.c r9 = (v6k.c) r9
            nii.y0 r9 = r9.f(r2)
            kotlinx.coroutines.flow.Flow r9 = r6.L2(r9)
            g6k.p r1 = new g6k.p
            r1.<init>(r2, r6, r5)
            yji.n.j2(r6, r9, r5, r1, r0)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L68:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L6e:
            com.revolut.retail.core.navigation.FeatureCommand r9 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.transfer_request_approval.api.navigation.ManualTransferFeatureConfig r0 = new com.revolut.feature.transfer_request_approval.api.navigation.ManualTransferFeatureConfig
            r0.<init>(r1)
            r9.<init>(r0)
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = zh9.u0.b(r9)
            aii.n r9 = r6.A2(r9)
            return r9
        L81:
            r8.u = r5
            r8.v = r3
            java.lang.Object r9 = g6k.r.Z2(r6, r2, r8)
            if (r9 != r0) goto L8c
        L8b:
            return r0
        L8c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g6k.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
