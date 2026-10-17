package ql1;

import kl.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f247038a;

    public d(c0 aaniQrCodeRepository) {
        Intrinsics.checkNotNullParameter(aaniQrCodeRepository, "aaniQrCodeRepository");
        this.f247038a = aaniQrCodeRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r25, gim.c r26) throws java.lang.Throwable {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            boolean r2 = r1 instanceof ql1.c
            if (r2 == 0) goto L17
            r2 = r1
            ql1.c r2 = (ql1.c) r2
            int r3 = r2.f247037w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f247037w = r3
            goto L1c
        L17:
            ql1.c r2 = new ql1.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f247037w
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L34
            if (r4 != r6) goto L2c
            yhm.o.b(r1)
            goto L4e
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            r2.f247037w = r6
            njj.n0 r1 = new njj.n0
            r4 = 4
            kl.c0 r7 = r0.f247038a
            r8 = r25
            r1.<init>(r7, r8, r5, r4)
            skm.p0 r4 = skm.p0.f264001a
            elm.f r4 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r4, r1, r2)
            if (r1 != r3) goto L4e
            return r3
        L4e:
            com.revolut.feature.apm.aani.impl.data.models.AaniQrScanDetails r1 = (com.revolut.feature.apm.aani.impl.data.models.AaniQrScanDetails) r1
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$Destination r2 = new com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$Destination
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection$Outgoing r8 = new com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection$Outgoing
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient$Outgoing r3 = r1.f61111a
            com.revolut.feature.apm.aani.impl.data.models.AaniQrScanParams r4 = r1.f61113c
            dj0.d r7 = r4.f61114a
            if (r7 != 0) goto L5e
            r7 = r6
            goto L5f
        L5e:
            r7 = 0
        L5f:
            r8.<init>(r3, r7, r6)
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r12 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            dj0.d r3 = r4.f61114a
            r4 = 2
            r12.<init>(r3, r5, r4)
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.apm.aani.api.R$string.apm_descriptor_transfer_aani_amount_title
            r4 = 14
            r9.<init>(r3, r5, r5, r4)
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.apm.aani.api.R$string.apm_descriptor_transfer_aani_review_title
            r10.<init>(r3, r5, r5, r4)
            com.revolut.feature.apm.aani.impl.common.ApmTransferDestinationAani r11 = r1.f61112b
            java.lang.String r1 = r1.d
            if (r1 == 0) goto L85
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData$PaymentReference$PaymentIntent r5 = new com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData$PaymentReference$PaymentIntent
            r5.<init>(r1)
        L85:
            r13 = r5
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData r7 = new com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData
            r22 = 0
            r23 = 30656(0x77c0, float:4.2958E-41)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.<init>(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ql1.d.a(java.lang.String, gim.c):java.lang.Object");
    }
}
