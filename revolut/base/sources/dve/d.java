package dve;

import com.revolut.feature.topup_screen.impl.data.network.service.japan.JapanInboundOpenBankingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JapanInboundOpenBankingService f118086a;

    public d(JapanInboundOpenBankingService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f118086a = service;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, gim.c r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof dve.b
            if (r2 == 0) goto L17
            r2 = r1
            dve.b r2 = (dve.b) r2
            int r3 = r2.f118084w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f118084w = r3
            goto L1c
        L17:
            dve.b r2 = new dve.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f118084w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L54
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            com.revolut.data.network.models.openbanking.AuthorizationRequestDto r6 = new com.revolut.data.network.models.openbanking.AuthorizationRequestDto
            r15 = 252(0xfc, float:3.53E-43)
            r16 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r18
            r8 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.f118084w = r5
            com.revolut.feature.topup_screen.impl.data.network.service.japan.JapanInboundOpenBankingService r1 = r0.f118086a
            java.lang.Object r1 = r1.getJapanOpenBankingAuthorizationContent(r6, r2)
            if (r1 != r3) goto L54
            return r3
        L54:
            tue.a r1 = (tue.a) r1
            java.lang.String r2 = r1.getHtml()
            if (r2 == 0) goto L70
            java.lang.String r2 = r1.getConsentId()
            if (r2 == 0) goto L70
            wte.b r2 = new wte.b
            java.lang.String r3 = r1.getHtml()
            java.lang.String r1 = r1.getConsentId()
            r2.<init>(r3, r1)
            return r2
        L70:
            java.lang.String r2 = r1.getAuthUrl()
            if (r2 == 0) goto L80
            wte.a r2 = new wte.a
            java.lang.String r1 = r1.getAuthUrl()
            r2.<init>(r1)
            return r2
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JapanInboundOpenBankingRepositoryImpl: response must contain either html with consentId or authUrl"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dve.d.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dj0.d r5, java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof dve.c
            if (r0 == 0) goto L13
            r0 = r8
            dve.c r0 = (dve.c) r0
            int r1 = r0.f118085w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f118085w = r1
            goto L18
        L13:
            dve.c r0 = new dve.c
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f118085w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r8)
            tue.d r8 = new tue.d
            jo3.a r5 = mo3.a.p(r5)
            tue.d$a r2 = new tue.d$a
            r2.<init>(r7)
            r8.<init>(r5, r6, r2)
            r0.f118085w = r3
            wj0.b r5 = new wj0.b
            java.lang.String r6 = "TOPUP_IDEMPOTENCY_TAG"
            r5.<init>(r6)
            com.revolut.feature.topup_screen.impl.data.network.service.japan.JapanInboundOpenBankingService r6 = r4.f118086a
            java.lang.Object r8 = r6.topUpViaJapanOpenBankingDirect(r8, r5, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            tue.c r8 = (tue.c) r8
            java.lang.String r5 = r8.getTransactionId()
            if (r5 == 0) goto L64
            wte.e r5 = new wte.e
            java.lang.String r6 = r8.getTransactionId()
            r5.<init>(r6)
            return r5
        L64:
            tue.b r5 = r8.getTopupMethodDetails()
            if (r5 == 0) goto L6f
            java.lang.String r5 = r5.getInstitutionId()
            goto L70
        L6f:
            r5 = 0
        L70:
            if (r5 == 0) goto L80
            wte.d r5 = new wte.d
            tue.b r6 = r8.getTopupMethodDetails()
            java.lang.String r6 = r6.getInstitutionId()
            r5.<init>(r6)
            return r5
        L80:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "JapanInboundOpenBankingRepositoryImpl: response must contain either transactionId or topupMethodDetails with institutionId"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dve.d.b(dj0.d, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
