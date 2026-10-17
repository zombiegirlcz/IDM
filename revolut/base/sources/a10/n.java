package a10;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class n implements p {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f463c = new i(0.3f, 0.28f, 0.62f, 0.42f);
    public static final i d = new i(0.62f, 0.28f, 0.99f, 0.42f);
    public static final i e = new i(0.22f, 0.86f, 0.33f, 0.99f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final di0.i f464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qw.a f465b;

    public n(di0.i textRecognizer, qw.a imageFormatConverter) {
        Intrinsics.checkNotNullParameter(textRecognizer, "textRecognizer");
        Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
        this.f464a = textRecognizer;
        this.f465b = imageFormatConverter;
    }

    public static Rect d(i iVar, Bitmap bitmap) {
        return new Rect((int) (bitmap.getWidth() * iVar.f455a), (int) (bitmap.getHeight() * iVar.f456b), (int) Math.ceil(bitmap.getWidth() * iVar.f457c), (int) Math.ceil(bitmap.getHeight() * iVar.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xv.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r5, kotlin.coroutines.Continuation r6, xv.i r7, xv.m r8) {
        /*
            r4 = this;
            boolean r7 = r6 instanceof a10.l
            if (r7 == 0) goto L13
            r7 = r6
            a10.l r7 = (a10.l) r7
            int r0 = r7.f459w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f459w = r0
            goto L1a
        L13:
            a10.l r7 = new a10.l
            gim.c r6 = (gim.c) r6
            r7.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r7.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f459w
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L68
        L29:
            r5 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L3c:
            boolean r6 = r5.hasNext()
            r1 = 0
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r5.next()
            boolean r3 = r6 instanceof l00.c
            if (r3 == 0) goto L3c
            goto L4d
        L4c:
            r6 = r1
        L4d:
            l00.c r6 = (l00.c) r6
            if (r6 != 0) goto L5f
            a10.f r5 = new a10.f
            com.revolut.camerakit.validators.exceptions.CameraKitValidatorException r6 = new com.revolut.camerakit.validators.exceptions.CameraKitValidatorException
            java.lang.String r7 = "Document fit validation result is missing"
            r8 = 6
            r6.<init>(r7, r1, r8)
            r5.<init>(r6)
            return r5
        L5f:
            r7.f459w = r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r4.e(r8, r6, r7)     // Catch: java.lang.Throwable -> L29
            if (r6 != r0) goto L68
            return r0
        L68:
            a10.h r6 = (a10.h) r6     // Catch: java.lang.Throwable -> L29
            return r6
        L6b:
            a10.f r6 = new a10.f
            com.revolut.camerakit.validators.exceptions.CameraKitValidatorException r7 = new com.revolut.camerakit.validators.exceptions.CameraKitValidatorException
            java.lang.String r8 = "My Number card validation failed"
            r0 = 4
            r7.<init>(r8, r5, r0)
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.n.b(java.util.List, kotlin.coroutines.Continuation, xv.i, xv.m):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(android.graphics.Bitmap r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a10.k
            if (r0 == 0) goto L13
            r0 = r6
            a10.k r0 = (a10.k) r0
            int r1 = r0.f458w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f458w = r1
            goto L18
        L13:
            a10.k r0 = new a10.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f458w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f458w = r3
            di0.i r6 = r4.f464a
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            di0.c r6 = (di0.c) r6
            java.util.ArrayList r5 = r6.a()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L4c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r5.next()
            eh0.b r0 = (eh0.b) r0
            di0.b r0 = (di0.b) r0
            java.util.ArrayList r0 = r0.a()
            zhm.a0.x(r0, r6)
            goto L4c
        L62:
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L71:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r6.next()
            eh0.a r0 = (eh0.a) r0
            di0.a r0 = (di0.a) r0
            com.google.mlkit.vision.text.Text$Line r0 = r0.f114860a
            java.lang.String r0 = r0.j()
            java.lang.String r1 = "getText(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r5.add(r0)
            goto L71
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.n.c(android.graphics.Bitmap, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d A[LOOP:0: B:34:0x0197->B:36:0x019d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0357 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xv.m r21, l00.c r22, gim.c r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.n.e(xv.m, l00.c, gim.c):java.lang.Object");
    }
}
