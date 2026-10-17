package hw3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f156083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f156084b;

    public r(f0 pdfDocumentReader, g0 pdfPasswordUnlockAvailabilityProvider, y fileTypeDetector) {
        Intrinsics.checkNotNullParameter(pdfDocumentReader, "pdfDocumentReader");
        Intrinsics.checkNotNullParameter(pdfPasswordUnlockAvailabilityProvider, "pdfPasswordUnlockAvailabilityProvider");
        Intrinsics.checkNotNullParameter(fileTypeDetector, "fileTypeDetector");
        this.f156083a = pdfDocumentReader;
        this.f156084b = fileTypeDetector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof hw3.q
            if (r0 == 0) goto L13
            r0 = r9
            hw3.q r0 = (hw3.q) r0
            int r1 = r0.f156082w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156082w = r1
            goto L18
        L13:
            hw3.q r0 = new hw3.q
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156082w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            goto L68
        L27:
            r6 = move-exception
            goto L70
        L29:
            r6 = move-exception
            goto L76
        L2b:
            r6 = move-exception
            goto L7c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r9)
            hw3.y r9 = r5.f156084b     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            r9.getClass()     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            hw3.o r9 = hw3.y.a(r6)     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            hw3.o r2 = hw3.o.PDF     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            r4 = 0
            if (r9 == r2) goto L4c
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$Error r6 = new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$Error     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            r6.<init>(r4)     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            return r6
        L4c:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            r2 = 35
            if (r9 < r2) goto L54
            r9 = r3
            goto L55
        L54:
            r9 = 0
        L55:
            if (r9 != 0) goto L5d
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$Error r6 = new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$Error     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            r6.<init>(r4)     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            return r6
        L5d:
            hw3.f0 r9 = r5.f156083a     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            r0.f156082w = r3     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r9 = r9.d(r6, r7, r8, r0)     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            if (r9 != r1) goto L68
            return r1
        L68:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$Success r6 = new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$Success     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            r6.<init>(r9)     // Catch: java.lang.Exception -> L27 com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L29 java.util.concurrent.CancellationException -> L2b
            return r6
        L70:
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$Error r7 = new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$Error
            r7.<init>(r6)
            goto L7b
        L76:
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$PasswordIncorrect r7 = new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentUnlockResult$PasswordIncorrect
            r7.<init>(r6)
        L7b:
            return r7
        L7c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hw3.r.a(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
