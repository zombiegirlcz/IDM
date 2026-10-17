package di0;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.b f114869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eh0.c f114870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f114871c;
    public final AtomicBoolean d;
    public final Lazy e;

    public i(ci0.a mlKitInputImageCreator, ei0.b moduleInstaller, e textRecognizerClientProvider, eh0.c supportedScript) {
        Intrinsics.checkNotNullParameter(mlKitInputImageCreator, "mlKitInputImageCreator");
        Intrinsics.checkNotNullParameter(moduleInstaller, "moduleInstaller");
        Intrinsics.checkNotNullParameter(textRecognizerClientProvider, "textRecognizerClientProvider");
        Intrinsics.checkNotNullParameter(supportedScript, "supportedScript");
        this.f114869a = moduleInstaller;
        this.f114870b = supportedScript;
        this.f114871c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = j.b(new d8e.a(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof di0.g
            if (r0 == 0) goto L13
            r0 = r6
            di0.g r0 = (di0.g) r0
            int r1 = r0.f114866x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114866x = r1
            goto L18
        L13:
            di0.g r0 = new di0.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114866x
            java.util.concurrent.atomic.AtomicBoolean r3 = r5.f114871c
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.u
            yhm.o.b(r6)
            goto L6a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.d
            boolean r6 = r6.getAndSet(r4)
            if (r6 != 0) goto L73
            int[] r6 = di0.f.f114864a
            eh0.c r2 = r5.f114870b
            int r2 = r2.ordinal()
            r6 = r6[r2]
            if (r6 == r4) goto L56
            r2 = 2
            if (r6 != r2) goto L50
            fh0.b r6 = fh0.b.TEXT_RECOGNITION_JAPANESE
            goto L58
        L50:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L56:
            fh0.b r6 = fh0.b.TEXT_RECOGNITION
        L58:
            fh0.b[] r6 = new fh0.b[]{r6}
            r0.u = r3
            r0.f114866x = r4
            ei0.b r2 = r5.f114869a
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            r0 = r3
        L6a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0.set(r6)
        L73:
            boolean r6 = r3.get()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: di0.i.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.graphics.Bitmap r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof di0.h
            if (r0 == 0) goto L13
            r0 = r7
            di0.h r0 = (di0.h) r0
            int r1 = r0.f114868x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114868x = r1
            goto L18
        L13:
            di0.h r0 = new di0.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114868x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L7a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            android.graphics.Bitmap r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f114868x = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r1) goto L46
            goto L79
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L85
            kotlin.Lazy r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            com.google.mlkit.vision.text.TextRecognizer r7 = (com.google.mlkit.vision.text.TextRecognizer) r7
            java.lang.String r2 = "bitmap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            r2 = 0
            com.google.mlkit.vision.common.InputImage r6 = com.google.mlkit.vision.common.InputImage.a(r6, r2)
            java.lang.String r2 = "fromBitmap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            com.google.android.gms.tasks.Task r6 = r7.process(r6)
            java.lang.String r7 = "process(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r7 = 0
            r0.u = r7
            r0.f114868x = r3
            java.lang.Object r7 = jh.d.b(r6, r0)
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            com.google.mlkit.vision.text.Text r7 = (com.google.mlkit.vision.text.Text) r7
            di0.c r6 = new di0.c
            kotlin.jvm.internal.Intrinsics.h(r7)
            r6.<init>(r7)
            return r6
        L85:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Text recognition is not available at this moment"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: di0.i.b(android.graphics.Bitmap, gim.c):java.lang.Object");
    }
}
