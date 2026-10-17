package ti0;

import c10.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3m.a f271397b;

    public c(d faceDetectorAndExtractor, q3m.a model) {
        Intrinsics.checkNotNullParameter(faceDetectorAndExtractor, "faceDetectorAndExtractor");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f271396a = faceDetectorAndExtractor;
        this.f271397b = model;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ch0.a r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ti0.b
            if (r0 == 0) goto L13
            r0 = r8
            ti0.b r0 = (ti0.b) r0
            int r1 = r0.f271395w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271395w = r1
            goto L18
        L13:
            ti0.b r0 = new ti0.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271395w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r8)
            goto L56
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            yhm.o.b(r8)
            int r8 = r7.e
            if (r8 != r4) goto L84
            e10.q r8 = new e10.q
            java.nio.ByteBuffer r2 = r7.f24097a
            int r5 = r7.f24098b
            int r7 = r7.f24099c
            r8.<init>(r2, r5, r7)
            r0.f271395w = r4
            c10.d r7 = r6.f271396a
            kotlinx.coroutines.CoroutineDispatcher r2 = r7.f20311b
            btd.e r4 = new btd.e
            r5 = 25
            r4.<init>(r7, r8, r3, r5)
            java.lang.Object r8 = skm.e0.J(r2, r4, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = zhm.d0.d0(r8)
            e10.j r7 = (e10.j) r7
            if (r7 == 0) goto L83
            dh0.b r8 = new dh0.b
            android.graphics.Rect r0 = new android.graphics.Rect
            e10.a r1 = r7.f121815a
            float r2 = r1.f121791a
            int r2 = (int) r2
            float r3 = r1.f121792b
            int r3 = (int) r3
            float r4 = r1.f121793c
            int r4 = (int) r4
            float r1 = r1.d
            int r1 = (int) r1
            r0.<init>(r2, r3, r4, r1)
            java.lang.String r1 = "face"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            dh0.a r1 = new dh0.a
            r1.<init>(r7)
            r8.<init>(r0, r1)
            return r8
        L83:
            return r3
        L84:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Only RGBA is supported"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ti0.c.a(ch0.a, gim.c):java.lang.Object");
    }
}
