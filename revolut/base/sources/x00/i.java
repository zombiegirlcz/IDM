package x00;

import com.revolut.camerakit.validators.config.MrzValidatorConfig;
import dx.l;
import kotlin.jvm.internal.Intrinsics;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MrzValidatorConfig f301456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final di0.i f301457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e00.a f301458c;
    public final c00.g d;
    public final b e;
    public final l f;

    public i(MrzValidatorConfig config, di0.i textRecognizer, e00.a openCvImageConverter, c00.g matImageConverter, b mrzOcrParser, l previewMetadata) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(textRecognizer, "textRecognizer");
        Intrinsics.checkNotNullParameter(openCvImageConverter, "openCvImageConverter");
        Intrinsics.checkNotNullParameter(matImageConverter, "matImageConverter");
        Intrinsics.checkNotNullParameter(mrzOcrParser, "mrzOcrParser");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        this.f301456a = config;
        this.f301457b = textRecognizer;
        this.f301458c = openCvImageConverter;
        this.d = matImageConverter;
        this.e = mrzOcrParser;
        this.f = previewMetadata;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // xv.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r4, kotlin.coroutines.Continuation r5, xv.i r6, xv.m r7) {
        /*
            r3 = this;
            com.revolut.camerakit.validators.config.MrzValidatorConfig r4 = r3.f301456a
            boolean r4 = r4.f50931b
            boolean r6 = r5 instanceof x00.g
            if (r6 == 0) goto L17
            r6 = r5
            x00.g r6 = (x00.g) r6
            int r0 = r6.f301454w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L17
            int r0 = r0 - r1
            r6.f301454w = r0
            goto L1e
        L17:
            x00.g r6 = new x00.g
            gim.c r5 = (gim.c) r5
            r6.<init>(r3, r5)
        L1e:
            java.lang.Object r5 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f301454w
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L2d java.lang.UnsupportedOperationException -> L54
            goto L43
        L2d:
            r5 = move-exception
            goto L46
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            yhm.o.b(r5)
            r6.f301454w = r2     // Catch: java.lang.Throwable -> L2d java.lang.UnsupportedOperationException -> L54
            java.lang.Object r5 = r3.c(r7, r6)     // Catch: java.lang.Throwable -> L2d java.lang.UnsupportedOperationException -> L54
            if (r5 != r0) goto L43
            return r0
        L43:
            xv.q r5 = (xv.q) r5     // Catch: java.lang.Throwable -> L2d java.lang.UnsupportedOperationException -> L54
            return r5
        L46:
            x00.c r6 = new x00.c
            com.revolut.camerakit.validators.exceptions.CameraKitValidatorException r7 = new com.revolut.camerakit.validators.exceptions.CameraKitValidatorException
            java.lang.String r0 = "MRZ validation failed"
            r1 = 4
            r7.<init>(r0, r5, r1)
            r6.<init>(r7, r4)
            goto L59
        L54:
            x00.e r6 = new x00.e
            r6.<init>(r4)
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x00.i.b(java.util.List, kotlin.coroutines.Continuation, xv.i, xv.m):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xv.m r19, gim.c r20) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x00.i.c(xv.m, gim.c):java.lang.Object");
    }
}
