package s8a;

import kotlin.jvm.internal.Intrinsics;
import mp.p;
import n8a.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f260961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj0.a f260962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f260963c;
    public final fkg.a d;

    public l(b0 repository, wj0.a idempotencyKeyHolder, p streetModePaymentLocationInteractor, fkg.a qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(streetModePaymentLocationInteractor, "streetModePaymentLocationInteractor");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f260961a = repository;
        this.f260962b = idempotencyKeyHolder;
        this.f260963c = streetModePaymentLocationInteractor;
        this.d = qrCodeGenerator;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b0 -> B:29:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, gim.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8a.l.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.pix.api.model.PixQrCodeScheduleData r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s8a.j
            if (r0 == 0) goto L13
            r0 = r7
            s8a.j r0 = (s8a.j) r0
            int r1 = r0.f260958x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260958x = r1
            goto L18
        L13:
            s8a.j r0 = new s8a.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260958x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L79
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.pix.api.model.PixQrCodeScheduleData r6 = r0.u
            yhm.o.b(r7)
            goto L53
        L38:
            yhm.o.b(r7)
            wj0.b r7 = new wj0.b
            java.lang.String r2 = "QR_TRANSFER_IDEMPOTENCY_KEY"
            r7.<init>(r2)
            mp.p r2 = r5.f260963c
            pfm.a r7 = r2.r(r7)
            r0.u = r6
            r0.f260958x = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L53
            goto L78
        L53:
            r7 = 0
            r0.u = r7
            r0.f260958x = r3
            n8a.b0 r2 = r5.f260961a
            r2.getClass()
            mhd.o0 r3 = new mhd.o0
            r4 = 22
            r3.<init>(r2, r6, r7, r4)
            n3j.w r6 = new n3j.w
            r6.<init>(r3, r2, r7)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r7, r6, r0)
            if (r6 != r1) goto L74
            goto L76
        L74:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L76:
            if (r6 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s8a.l.b(com.revolut.feature.pix.api.model.PixQrCodeScheduleData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.pix.api.model.PixQrCodeTransferData r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s8a.k
            if (r0 == 0) goto L13
            r0 = r7
            s8a.k r0 = (s8a.k) r0
            int r1 = r0.f260960x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260960x = r1
            goto L18
        L13:
            s8a.k r0 = new s8a.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260960x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.pix.api.model.PixQrCodeTransferData r6 = r0.u
            yhm.o.b(r7)
            goto L53
        L38:
            yhm.o.b(r7)
            wj0.b r7 = new wj0.b
            java.lang.String r2 = "QR_TRANSFER_IDEMPOTENCY_KEY"
            r7.<init>(r2)
            mp.p r2 = r5.f260963c
            pfm.a r7 = r2.r(r7)
            r0.u = r6
            r0.f260960x = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L53
            goto L73
        L53:
            r7 = 0
            r0.u = r7
            r0.f260960x = r3
            n8a.b0 r2 = r5.f260961a
            r2.getClass()
            mhd.o0 r3 = new mhd.o0
            r4 = 23
            r3.<init>(r2, r6, r7, r4)
            n3j.w r6 = new n3j.w
            r6.<init>(r3, r2, r7)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r7, r6, r0)
            if (r6 != r1) goto L74
        L73:
            return r1
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s8a.l.c(com.revolut.feature.pix.api.model.PixQrCodeTransferData, gim.c):java.lang.Object");
    }
}
