package gl9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d3j.b f144580l;

    public c(d3j.b beneficiaryInteractor) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        this.f144580l = beneficiaryInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // gl9.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(il9.c r4, com.revolut.feature.transfer.models.ScannedBillDetails r5, il9.l r6, kotlin.coroutines.Continuation r7) {
        /*
            r3 = this;
            boolean r6 = r7 instanceof gl9.b
            if (r6 == 0) goto L13
            r6 = r7
            gl9.b r6 = (gl9.b) r6
            int r0 = r6.f144579w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f144579w = r0
            goto L1a
        L13:
            gl9.b r6 = new gl9.b
            gim.c r7 = (gim.c) r7
            r6.<init>(r3, r7)
        L1a:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f144579w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r7)
            boolean r7 = r4 instanceof il9.f
            if (r7 == 0) goto L46
            il9.f r4 = (il9.f) r4
            r6.f144579w = r2
            java.lang.Object r4 = r3.b3(r4, r5, r6)
            if (r4 != r0) goto L43
            return r0
        L43:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L46:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gl9.c.Z2(il9.c, com.revolut.feature.transfer.models.ScannedBillDetails, il9.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(il9.f r20, com.revolut.feature.transfer.models.ScannedBillDetails r21, gim.c r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            boolean r3 = r2 instanceof gl9.a
            if (r3 == 0) goto L19
            r3 = r2
            gl9.a r3 = (gl9.a) r3
            int r4 = r3.f144578y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f144578y = r4
            goto L1e
        L19:
            gl9.a r3 = new gl9.a
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f144576w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f144578y
            r6 = 1
            if (r5 == 0) goto L3c
            if (r5 != r6) goto L34
            com.revolut.feature.transfer.models.ScannedBillDetails r1 = r3.v
            il9.f r3 = r3.u
            yhm.o.b(r2)
            r16 = r1
            r1 = r3
            goto L63
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            yhm.o.b(r2)
            java.lang.String r2 = r1.f162181b
            w4l.h r5 = w4l.h.f294642c
            d3j.b r7 = r0.f144580l
            efm.r r2 = r7.j(r2, r5)
            efm.d0 r2 = r2.firstOrError()
            java.lang.String r5 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r3.u = r1
            r5 = r21
            r3.v = r5
            r3.f144578y = r6
            java.lang.Object r2 = nim.a.b(r2, r3)
            if (r2 != r4) goto L61
            return r4
        L61:
            r16 = r5
        L63:
            java.lang.String r3 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.revolut.data.model.Data r2 = (com.revolut.data.model.Data) r2
            java.lang.Object r2 = zi0.c.I(r2)
            r3 = r2
            f5j.a r3 = (f5j.a) r3
            com.revolut.feature.transfer.core.models.TransferFlowType$Default r4 = com.revolut.feature.transfer.core.models.TransferFlowType.Default.f92257b
            java.lang.String r2 = r1.d
            r5 = 0
            if (r2 == 0) goto L7e
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference$SimpleNote r6 = new com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference$SimpleNote
            r6.<init>(r2)
            goto L7f
        L7e:
            r6 = r5
        L7f:
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r2 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            dj0.d r1 = r1.f162182c
            r7 = 2
            r2.<init>(r1, r5, r7)
            m1l.a r7 = m1l.a.SCHEDULE_ENABLED
            com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r8 = new com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData
            r9 = 0
            r1 = 7
            r8.<init>(r9, r5, r1)
            r5 = r6
            r6 = r2
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData r2 = new com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData
            r15 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r18 = 49024(0xbf80, float:6.8697E-41)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferBridgeFeatureConfig$BridgeDestination r1 = new com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferBridgeFeatureConfig$BridgeDestination
            r1.<init>(r2)
            r0.A2(r1)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gl9.c.b3(il9.f, com.revolut.feature.transfer.models.ScannedBillDetails, gim.c):java.lang.Object");
    }
}
