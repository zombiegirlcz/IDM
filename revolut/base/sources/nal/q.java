package nal;

import com.revolut.shared.feature.suspicious_transaction.api.models.RequestSuccessDialog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.shared.feature.suspicious_transaction.impl.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RequestSuccessDialog f213940w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar, RequestSuccessDialog requestSuccessDialog, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f213940w = requestSuccessDialog;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, this.f213940w, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.shared.feature.suspicious_transaction.impl.flow.a r0 = r8.v
            cal.a r1 = r0.v
            java.lang.Object r2 = r8.u
            nii.n1 r2 = (nii.n1) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r9)
            boolean r9 = r2 instanceof nii.l1
            com.revolut.shared.feature.suspicious_transaction.api.models.RequestSuccessDialog r3 = r8.f213940w
            if (r9 == 0) goto L26
            com.revolut.shared.feature.suspicious_transaction.api.models.RequestSuccessDialog$Button r9 = r3.f104912c
            if (r9 == 0) goto L1e
            java.lang.String r9 = r9.f104914b
            r0.S2(r9)
            goto Lb4
        L1e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r9.<init>(r0)
            throw r9
        L26:
            boolean r9 = r2 instanceof nii.k1
            if (r9 == 0) goto La5
            com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$InputData r9 = r0.f105001t
            java.lang.String r9 = r9.f104984a
            r2 = r1
            ife.b r2 = (ife.b) r2
            r2.getClass()
            java.lang.String r4 = "transactionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            e8c.a r2 = r2.f161006b
            k7c.d0 r2 = r2.f123630a
            ne0.j r5 = r2.f181950a
            java.lang.String r6 = "PENDING_PAYMENT_TOKEN_EXISTS_MEMORY_CACHE_ID"
            java.lang.Object r5 = r5.get(r6)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            r7 = 0
            if (r5 == 0) goto L75
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            ne0.j r4 = r2.f181950a
            java.lang.String r5 = "PENDING_TRANSACTION_ID_MEMORY_CACHE_ID"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r4, r9)
            if (r9 == 0) goto L6c
            ne0.j r9 = r2.f181950a
            java.lang.String r4 = "PENDING_COMMAND_MEMORY_CACHE_ID"
            java.lang.Object r9 = r9.get(r4)
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            goto L6d
        L6c:
            r9 = r7
        L6d:
            if (r9 == 0) goto L75
            ne0.j r2 = r2.f181950a
            r2.remove(r6)
            goto L76
        L75:
            r9 = r7
        L76:
            if (r9 == 0) goto L7e
            r2 = 7
            com.revolut.retail.core.navigation.CompositeCommand r9 = r6.b.g(r7, r7, r7, r2, r9)
            goto L7f
        L7e:
            r9 = r7
        L7f:
            if (r9 == 0) goto L8a
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r9)
            r0.C1(r1)
            goto Lb4
        L8a:
            com.revolut.shared.feature.suspicious_transaction.api.models.RequestSuccessDialog$Button r9 = r3.f104912c
            if (r9 == 0) goto L90
            java.lang.String r7 = r9.f104914b
        L90:
            if (r7 != 0) goto La1
            com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$SuspiciousTransactionFlowState r9 = r0.B
            java.lang.String r9 = r9.f104999a
            r2 = 1
            ife.b r1 = (ife.b) r1
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = r1.a(r9, r2)
            r0.C1(r9)
            goto Lb4
        La1:
            r0.S2(r7)
            goto Lb4
        La5:
            boolean r9 = r2 instanceof nii.j1
            if (r9 != 0) goto Lb4
            boolean r9 = r2 instanceof nii.m1
            if (r9 == 0) goto Lae
            goto Lb4
        Lae:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        Lb4:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nal.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
