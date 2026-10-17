package n00;

import kge.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements p {
    public static final /* synthetic */ KProperty[] e = {o0.f186429a.j(new h0(c.class, "fourCornersDetectorValue", "getFourCornersDetectorValue()Lcom/revolut/camerakit/vision_framework/FourCornersDetector;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00.c f210840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qw.a f210841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx0.a f210842c;
    public final d d;

    public c(d fourCornersDetector, m00.c maskCropProvider, qw.a imageFormatConverter, jx0.a resultProcessor) {
        Intrinsics.checkNotNullParameter(fourCornersDetector, "fourCornersDetector");
        Intrinsics.checkNotNullParameter(maskCropProvider, "maskCropProvider");
        Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
        Intrinsics.checkNotNullParameter(resultProcessor, "resultProcessor");
        this.f210840a = maskCropProvider;
        this.f210841b = imageFormatConverter;
        this.f210842c = resultProcessor;
        this.d = fourCornersDetector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xv.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r3, kotlin.coroutines.Continuation r4, xv.i r5, xv.m r6) {
        /*
            r2 = this;
            boolean r3 = r4 instanceof n00.a
            if (r3 == 0) goto L13
            r3 = r4
            n00.a r3 = (n00.a) r3
            int r5 = r3.f210836w
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r3.f210836w = r5
            goto L1a
        L13:
            n00.a r3 = new n00.a
            gim.c r4 = (gim.c) r4
            r3.<init>(r2, r4)
        L1a:
            java.lang.Object r4 = r3.u
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r0 = r3.f210836w
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            yhm.o.b(r4)     // Catch: java.lang.Throwable -> L29
            goto L3f
        L29:
            r3 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            yhm.o.b(r4)
            r3.f210836w = r1     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r2.c(r6, r3)     // Catch: java.lang.Throwable -> L29
            if (r4 != r5) goto L3f
            return r5
        L3f:
            xv.q r4 = (xv.q) r4     // Catch: java.lang.Throwable -> L29
            return r4
        L42:
            l00.b r4 = new l00.b
            com.revolut.camerakit.validators.exceptions.CameraKitValidatorException r5 = new com.revolut.camerakit.validators.exceptions.CameraKitValidatorException
            java.lang.String r6 = "Document fit calculation failed"
            r0 = 4
            r5.<init>(r6, r3, r0)
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n00.c.b(java.util.List, kotlin.coroutines.Continuation, xv.i, xv.m):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xv.m r20, gim.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n00.c.c(xv.m, gim.c):java.lang.Object");
    }
}
