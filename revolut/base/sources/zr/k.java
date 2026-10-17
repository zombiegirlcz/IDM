package zr;

import kotlin.jvm.internal.Intrinsics;
import lr.p;

/* JADX INFO: loaded from: classes17.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f324516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.a f324517b;

    public k(p biometricVerificationRepository, tr.a instructionDetailsValidator, cr.a uploadStatesResolver) {
        Intrinsics.checkNotNullParameter(biometricVerificationRepository, "biometricVerificationRepository");
        Intrinsics.checkNotNullParameter(instructionDetailsValidator, "instructionDetailsValidator");
        Intrinsics.checkNotNullParameter(uploadStatesResolver, "uploadStatesResolver");
        this.f324516a = biometricVerificationRepository;
        this.f324517b = uploadStatesResolver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zr.f
            if (r0 == 0) goto L13
            r0 = r8
            zr.f r0 = (zr.f) r0
            int r1 = r0.f324507w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324507w = r1
            goto L18
        L13:
            zr.f r0 = new zr.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324507w
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L29
            yhm.o.b(r8)
            goto L48
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            r0.f324507w = r5
            lr.k r8 = new lr.k
            lr.p r2 = r6.f324516a
            r8.<init>(r2, r7, r4, r3)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r7, r8, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            wr.b r8 = (wr.b) r8
            java.lang.String r7 = "instructions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            java.util.ArrayList r7 = r8.f299481a
            java.util.Iterator r7 = r7.iterator()
        L55:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r7.next()
            boolean r1 = r0 instanceof com.revolut.biometric_verification.api.models.BiometricVerificationStep.Document
            if (r1 == 0) goto L55
            r4 = r0
        L64:
            com.revolut.biometric_verification.api.models.BiometricVerificationStep$Document r4 = (com.revolut.biometric_verification.api.models.BiometricVerificationStep.Document) r4
            if (r4 != 0) goto L69
            goto L93
        L69:
            java.util.ArrayList r7 = r4.f50404c
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L73
        L71:
            r3 = r5
            goto L8b
        L73:
            java.util.Iterator r0 = r7.iterator()
        L77:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()
            com.revolut.biometric_verification.api.models.BiometricVerificationAcceptedDocument r1 = (com.revolut.biometric_verification.api.models.BiometricVerificationAcceptedDocument) r1
            java.util.ArrayList r1 = r1.f50373b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L77
        L8b:
            boolean r7 = r7.isEmpty()
            if (r3 == 0) goto L94
            if (r7 != 0) goto L94
        L93:
            return r8
        L94:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "All documents require at least one country to proceed"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zr.k.a(java.lang.String, gim.c):java.lang.Object");
    }
}
