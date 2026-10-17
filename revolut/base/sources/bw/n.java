package bw;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.d f19153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f19154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw.h f19155c;
    public final qw.a d;

    public n(xv.d cameraFramesProvider, Executor executor, yw.h settings, qw.a imageUtils, h exifMetadataRetriever, e compressionFormatProvider) {
        Intrinsics.checkNotNullParameter(cameraFramesProvider, "cameraFramesProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(imageUtils, "imageUtils");
        Intrinsics.checkNotNullParameter(exifMetadataRetriever, "exifMetadataRetriever");
        Intrinsics.checkNotNullParameter(compressionFormatProvider, "compressionFormatProvider");
        this.f19153a = cameraFramesProvider;
        this.f19154b = executor;
        this.f19155c = settings;
        this.d = imageUtils;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xv.l r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof bw.k
            if (r0 == 0) goto L13
            r0 = r10
            bw.k r0 = (bw.k) r0
            int r1 = r0.f19148x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19148x = r1
            goto L18
        L13:
            bw.k r0 = new bw.k
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f19148x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yw.j r9 = r0.u
            yhm.o.b(r10)
            goto L6c
        L38:
            yhm.o.b(r10)
            yw.h r10 = r8.f19155c
            yw.d r10 = r10.b()
            yw.c r10 = r10.f317230a
            yw.j r10 = r10.f317229c
            if (r9 == 0) goto L4d
            xv.n r9 = r9.b()
            if (r9 != 0) goto L71
        L4d:
            xv.d r9 = r8.f19153a
            aw.u r9 = (aw.u) r9
            bw.f r2 = r9.f10210a
            bw.q r2 = (bw.q) r2
            vkm.z1 r2 = r2.e
            a3i.i r5 = new a3i.i
            r6 = 24
            r5.<init>(r2, r9, r6)
            r0.u = r10
            r0.f19148x = r4
            java.lang.Object r9 = vkm.q.x(r5, r0)
            if (r9 != r1) goto L69
            goto L98
        L69:
            r7 = r10
            r10 = r9
            r9 = r7
        L6c:
            xv.n r10 = (xv.n) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L71:
            r0.u = r10
            r0.f19148x = r3
            skm.l r2 = new skm.l
            kotlin.coroutines.Continuation r3 = fim.h.b(r0)
            r2.<init>(r4, r3)
            r2.u()
            bw.m r3 = new bw.m
            r3.<init>(r8, r9, r10, r2)
            java.util.concurrent.Executor r9 = r8.f19154b
            r9.execute(r3)
            java.lang.Object r9 = r2.t()
            if (r9 != r1) goto L96
            java.lang.String r10 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r10)
        L96:
            if (r9 != r1) goto L99
        L98:
            return r1
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bw.n.a(xv.l, gim.c):java.lang.Object");
    }
}
