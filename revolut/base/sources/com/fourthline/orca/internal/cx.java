package com.fourthline.orca.internal;

import com.fourthline.vision.QrScanner;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class cx implements u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x71 f27582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dx f27583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f27584c;
    private final ab1 d;
    private QrScanner e;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27587c;
        int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f27587c = obj2;
            this.e |= Integer.MIN_VALUE;
            return cx.this.a(null, null, this);
        }
    }

    public cx(x71 targetTaxationCountry, dx extractTinResultRepository, Function1 tinPresenceValidator, ab1 tinValidator) {
        Intrinsics.checkNotNullParameter(targetTaxationCountry, "targetTaxationCountry");
        Intrinsics.checkNotNullParameter(extractTinResultRepository, "extractTinResultRepository");
        Intrinsics.checkNotNullParameter(tinPresenceValidator, "tinPresenceValidator");
        Intrinsics.checkNotNullParameter(tinValidator, "tinValidator");
        this.f27582a = targetTaxationCountry;
        this.f27583b = extractTinResultRepository;
        this.f27584c = tinPresenceValidator;
        this.d = tinValidator;
    }

    private final QrScanner a() {
        QrScanner qrScanner = this.e;
        if (qrScanner != null) {
            return qrScanner;
        }
        QrScanner qrScanner2 = new QrScanner();
        this.e = qrScanner2;
        return qrScanner2;
    }

    @Override // com.fourthline.orca.internal.u41
    public void reset() {
        QrScanner qrScanner = this.e;
        if (qrScanner != null) {
            qrScanner.close();
        }
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.u41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.dp r5, com.fourthline.orca.internal.g51 r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.cx.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.cx$a r0 = (com.fourthline.orca.internal.cx.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.cx$a r0 = new com.fourthline.orca.internal.cx$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27587c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f27586b
            com.fourthline.orca.internal.g51 r5 = (com.fourthline.orca.internal.g51) r5
            java.lang.Object r5 = r0.f27585a
            com.fourthline.orca.internal.dp r5 = (com.fourthline.orca.internal.dp) r5
            yhm.o.b(r7)
            goto L75
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r7)
            kotlin.jvm.functions.Function1 r7 = r4.f27584c
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8a
            com.fourthline.orca.internal.mq0 r7 = r5.h()
            com.fourthline.orca.internal.yo r5 = r5.j()
            kotlin.jvm.functions.Function1 r5 = r5.e(r3)
            r7.a(r5)
            com.fourthline.vision.QrScanner r5 = r4.a()
            com.fourthline.vision.document.DocumentScannerStepResult r6 = r6.d()
            com.fourthline.vision.ScannerImage r6 = r6.getImage()
            android.graphics.Bitmap r6 = r6.getCropped()
            r7 = 0
            r0.f27585a = r7
            r0.f27586b = r7
            r0.e = r3
            java.lang.Object r7 = r5.scan(r6, r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L8a
            com.fourthline.orca.internal.ab1 r5 = r4.d
            com.fourthline.orca.internal.za1 r5 = r5.a(r7)
            com.fourthline.orca.internal.za1 r6 = com.fourthline.orca.internal.za1.f35552a
            if (r5 != r6) goto L8a
            com.fourthline.orca.internal.dx r5 = r4.f27583b
            com.fourthline.orca.internal.x71 r6 = r4.f27582a
            r5.a(r7, r6)
        L8a:
            com.fourthline.orca.internal.u41$a r5 = com.fourthline.orca.internal.u41.a.f33954b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.cx.a(com.fourthline.orca.internal.dp, com.fourthline.orca.internal.g51, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
