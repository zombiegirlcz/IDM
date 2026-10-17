package hg2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff2.c f152075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co9.b f152076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f152077c;

    public h(ff2.c upiQrCodeRepository, co9.b paymentCounterpartyInteractor, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(upiQrCodeRepository, "upiQrCodeRepository");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f152075a = upiQrCodeRepository;
        this.f152076b = paymentCounterpartyInteractor;
        this.f152077c = uriHelper;
    }

    public static vkm.d c(h hVar) {
        hVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ff2.c cVar = hVar.f152075a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return cVar.d.b(Unit.f186387a, loadingStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, java.lang.String r11, dj0.d r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.Map r16, gim.c r17) {
        /*
            r9 = this;
            r0 = r17
            boolean r1 = r0 instanceof hg2.f
            if (r1 == 0) goto L15
            r1 = r0
            hg2.f r1 = (hg2.f) r1
            int r2 = r1.C
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.C = r2
            goto L1a
        L15:
            hg2.f r1 = new hg2.f
            r1.<init>(r9, r0)
        L1a:
            java.lang.Object r0 = r1.A
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.C
            r4 = 1
            if (r3 == 0) goto L45
            if (r3 != r4) goto L3d
            java.util.Map r10 = r1.z
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r11 = r1.f152071y
            java.lang.String r14 = r1.f152070x
            java.lang.String r13 = r1.f152069w
            dj0.d r12 = r1.v
            java.lang.String r1 = r1.u
            yhm.o.b(r0)
            r7 = r10
            r6 = r11
            r11 = r1
        L39:
            r3 = r12
            r4 = r13
            r5 = r14
            goto L68
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L45:
            yhm.o.b(r0)
            r1.u = r11
            r1.v = r12
            r1.f152069w = r13
            r1.f152070x = r14
            r1.f152071y = r15
            r3 = r16
            java.util.Map r3 = (java.util.Map) r3
            r1.z = r3
            r1.C = r4
            co9.b r3 = r9.f152076b
            java.lang.Object r10 = r3.a(r10, r1)
            if (r10 != r2) goto L63
            return r2
        L63:
            r0 = r10
            r6 = r15
            r7 = r16
            goto L39
        L68:
            r1 = r0
            com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo r1 = (com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo) r1
            if (r1 == 0) goto L7a
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer$InputData$ToAlias r0 = new com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer$InputData$ToAlias
            if (r11 != 0) goto L73
            java.lang.String r11 = ""
        L73:
            r2 = r11
            r8 = 64
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L7a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "UPI QR Scan with counterparty error: Couldn't find counterparty"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hg2.h.a(java.lang.String, java.lang.String, dj0.d, java.lang.String, java.lang.String, java.lang.String, java.util.Map, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r24, java.lang.String r25, boolean r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hg2.h.b(gim.c, java.lang.String, boolean):java.lang.Object");
    }
}
