package bi0;

import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.b f15362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f15363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15364c;
    public boolean d;
    public final hlm.c e;

    public e(MsBarcodeDetectorSettings settings, g barcodeScannerFactory, ei0.b moduleInstaller, ci0.a mlKitInputImageCreator) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(barcodeScannerFactory, "barcodeScannerFactory");
        Intrinsics.checkNotNullParameter(moduleInstaller, "moduleInstaller");
        Intrinsics.checkNotNullParameter(mlKitInputImageCreator, "mlKitInputImageCreator");
        this.f15362a = moduleInstaller;
        this.f15363b = j.b(new bc1.b(barcodeScannerFactory, settings));
        this.e = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bi0.a
            if (r0 == 0) goto L13
            r0 = r6
            bi0.a r0 = (bi0.a) r0
            int r1 = r0.f15354x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15354x = r1
            goto L18
        L13:
            bi0.a r0 = new bi0.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f15354x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.mlkit.vision.barcode.BarcodeScanner r0 = r0.u
            yhm.o.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            kotlin.Lazy r6 = r5.f15363b
            java.lang.Object r6 = r6.getValue()
            com.google.mlkit.vision.barcode.BarcodeScanner r6 = (com.google.mlkit.vision.barcode.BarcodeScanner) r6
            r0.u = r6
            r0.f15354x = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r4 = r0
            r0 = r6
            r6 = r4
        L4a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L55
            if (r0 == 0) goto L55
            return r0
        L55:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Barcode detection is not available"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.e.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof bi0.b
            if (r0 == 0) goto L13
            r0 = r9
            bi0.b r0 = (bi0.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            bi0.b r0 = new bi0.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f15356x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            bi0.e r1 = r0.v
            hlm.a r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L76
        L2f:
            r9 = move-exception
            goto L8f
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            int r2 = r0.f15355w
            hlm.a r6 = r0.u
            yhm.o.b(r9)
            r9 = r6
            goto L55
        L42:
            yhm.o.b(r9)
            hlm.c r9 = r8.e
            r0.u = r9
            r2 = 0
            r0.f15355w = r2
            r0.z = r4
            java.lang.Object r6 = r9.lock(r5, r0)
            if (r6 != r1) goto L55
            goto L71
        L55:
            boolean r6 = r8.d     // Catch: java.lang.Throwable -> L7f
            if (r6 != 0) goto L84
            r8.d = r4     // Catch: java.lang.Throwable -> L7f
            ei0.b r4 = r8.f15362a     // Catch: java.lang.Throwable -> L7f
            fh0.b r6 = fh0.b.BARCODE     // Catch: java.lang.Throwable -> L7f
            fh0.b[] r6 = new fh0.b[]{r6}     // Catch: java.lang.Throwable -> L7f
            r0.u = r9     // Catch: java.lang.Throwable -> L7f
            r0.v = r8     // Catch: java.lang.Throwable -> L7f
            r0.f15355w = r2     // Catch: java.lang.Throwable -> L7f
            r0.z = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r4.a(r6, r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 != r1) goto L72
        L71:
            return r1
        L72:
            r1 = r0
            r0 = r9
            r9 = r1
            r1 = r8
        L76:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2f
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r1.f15364c = r9     // Catch: java.lang.Throwable -> L2f
            goto L85
        L7f:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L8f
        L84:
            r0 = r9
        L85:
            boolean r9 = r8.f15364c     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L2f
            r0.unlock(r5)
            return r9
        L8f:
            r0.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.e.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.graphics.Bitmap r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof bi0.d
            if (r0 == 0) goto L13
            r0 = r8
            bi0.d r0 = (bi0.d) r0
            int r1 = r0.f15361x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15361x = r1
            goto L18
        L13:
            bi0.d r0 = new bi0.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f15361x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L6c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            android.graphics.Bitmap r7 = r0.u
            yhm.o.b(r8)
            goto L47
        L39:
            yhm.o.b(r8)
            r0.u = r7
            r0.f15361x = r5
            java.lang.Object r8 = r6.a(r0)
            if (r8 != r1) goto L47
            goto L6b
        L47:
            com.google.mlkit.vision.barcode.BarcodeScanner r8 = (com.google.mlkit.vision.barcode.BarcodeScanner) r8
            java.lang.String r2 = "bitmap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            r2 = 0
            com.google.mlkit.vision.common.InputImage r7 = com.google.mlkit.vision.common.InputImage.a(r7, r2)
            java.lang.String r2 = "fromBitmap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            com.google.android.gms.tasks.Task r7 = r8.process(r7)
            java.lang.String r8 = "process(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.u = r3
            r0.f15361x = r4
            java.lang.Object r8 = jh.d.b(r7, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            java.util.List r8 = (java.util.List) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            java.lang.Object r7 = zhm.d0.d0(r8)
            fh.a r7 = (fh.a) r7
            if (r7 == 0) goto L7e
            com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode r7 = l9.l.G(r7)
            return r7
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.e.c(android.graphics.Bitmap, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0176, code lost:
    
        if (r1 == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ch0.a r26, gim.c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.e.d(ch0.a, gim.c):java.lang.Object");
    }
}
