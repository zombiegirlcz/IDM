package kv;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import vkm.v1;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes16.dex */
public final class p {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.c f189905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw.a f189906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw.h f189907c;
    public final d4m.a d;
    public final d4m.a e;

    public p(xv.c cameraCoreDelegate, xw.a fileSignatureCalculator, yw.h cameraSettings, d4m.a faceExtractor, qw.a cameraKitImageFormatConverter, d4m.a faceLiveValidator) {
        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
        Intrinsics.checkNotNullParameter(fileSignatureCalculator, "fileSignatureCalculator");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(faceExtractor, "faceExtractor");
        Intrinsics.checkNotNullParameter(cameraKitImageFormatConverter, "cameraKitImageFormatConverter");
        Intrinsics.checkNotNullParameter(faceLiveValidator, "faceLiveValidator");
        this.f189905a = cameraCoreDelegate;
        this.f189906b = fileSignatureCalculator;
        this.f189907c = cameraSettings;
        this.d = faceExtractor;
        this.e = faceLiveValidator;
    }

    public static final ByteBuffer b(p pVar, ByteBuffer byteBuffer, String str) {
        if (str == null) {
            return byteBuffer;
        }
        byte[] bArrArray = byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(zhm.p.v(bArrArray, bytes));
        Intrinsics.h(byteBufferWrap);
        return byteBufferWrap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r11.invoke(r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r9 != r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[PHI: r10
      0x008e: PHI (r10v3 boolean) = (r10v2 boolean), (r10v5 boolean) binds: [B:37:0x008b, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(kv.p r9, boolean r10, kv.j r11, gim.c r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof kv.n
            if (r0 == 0) goto L13
            r0 = r12
            kv.n r0 = (kv.n) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            kv.n r0 = new kv.n
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f189902x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L57
            if (r2 == r7) goto L53
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3f
            if (r2 == r3) goto L38
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Throwable r9 = r0.f189901w
            yhm.o.b(r12)
            goto Lbe
        L3f:
            yhm.o.b(r12)
            goto La3
        L43:
            boolean r10 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L49
            goto L8e
        L49:
            r11 = move-exception
            goto La6
        L4b:
            boolean r10 = r0.u
            kv.j r11 = r0.v
            yhm.o.b(r12)
            goto L81
        L53:
            yhm.o.b(r12)
            goto L69
        L57:
            yhm.o.b(r12)
            if (r10 != 0) goto L6c
            r0.v = r8
            r0.u = r10
            r0.z = r7
            java.lang.Object r9 = r11.invoke(r0)
            if (r9 != r1) goto L69
            goto Lbc
        L69:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L6c:
            skm.w1 r12 = skm.w1.f264016b
            kv.o r2 = new kv.o
            r7 = 0
            r2.<init>(r9, r8, r7)
            r0.v = r11
            r0.u = r10
            r0.z = r6
            java.lang.Object r12 = skm.e0.J(r12, r2, r0)
            if (r12 != r1) goto L81
            goto Lbc
        L81:
            r0.v = r8     // Catch: java.lang.Throwable -> L49
            r0.u = r10     // Catch: java.lang.Throwable -> L49
            r0.z = r5     // Catch: java.lang.Throwable -> L49
            java.lang.Object r11 = r11.invoke(r0)     // Catch: java.lang.Throwable -> L49
            if (r11 != r1) goto L8e
            goto Lbc
        L8e:
            skm.w1 r11 = skm.w1.f264016b
            kv.o r12 = new kv.o
            r2 = 1
            r12.<init>(r9, r8, r2)
            r0.v = r8
            r0.u = r10
            r0.z = r4
            java.lang.Object r9 = skm.e0.J(r11, r12, r0)
            if (r9 != r1) goto La3
            goto Lbc
        La3:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        La6:
            skm.w1 r12 = skm.w1.f264016b
            kv.o r2 = new kv.o
            r4 = 1
            r2.<init>(r9, r8, r4)
            r0.v = r8
            r0.f189901w = r11
            r0.u = r10
            r0.z = r3
            java.lang.Object r9 = skm.e0.J(r12, r2, r0)
            if (r9 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            r9 = r11
        Lbe:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kv.p.c(kv.p, boolean, kv.j, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kv.i
            if (r0 == 0) goto L13
            r0 = r5
            kv.i r0 = (kv.i) r0
            int r1 = r0.f189892w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189892w = r1
            goto L18
        L13:
            kv.i r0 = new kv.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189892w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            xv.c r5 = r4.f189905a     // Catch: java.lang.Throwable -> L27
            r0.f189892w = r3     // Catch: java.lang.Throwable -> L27
            kotlin.Unit r5 = r5.g()     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L4b
        L46:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.o.a(r5)
        L4b:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kv.p.a(gim.c):java.lang.Object");
    }

    public final y d(CameraCaptureSettings cameraCaptureSettings, xv.l lVar) {
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
        return rd0.e.e(new v1(new k(cameraCaptureSettings, this, lVar, null)), h0.f322473a, new im2.b(3, 5, null));
    }
}
