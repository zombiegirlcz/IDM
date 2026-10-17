package gm7;

import g9i.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ll7.m;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f144787l;

    public d(m mtaRepository) {
        Intrinsics.checkNotNullParameter(mtaRepository, "mtaRepository");
        this.f144787l = mtaRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r6v0, types: [gm7.d, java.lang.Object, yji.n] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [boe.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(gm7.d r6, boe.k r7, gim.c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof gm7.b
            if (r0 == 0) goto L16
            r0 = r8
            gm7.b r0 = (gm7.b) r0
            int r1 = r0.f144786x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f144786x = r1
            goto L1b
        L16:
            gm7.b r0 = new gm7.b
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144786x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            skm.a2 r6 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L55
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            yhm.o.b(r8)
            gm7.c r8 = new gm7.c
            r8.<init>(r6, r4)
            yi5.b r2 = new yi5.b
            r5 = 27
            r2.<init>(r5)
            skm.a2 r6 = r6.T2(r8, r2)
            r0.u = r6     // Catch: java.lang.Throwable -> L2d
            r0.f144786x = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L55
            return r1
        L55:
            r6.f(r4)
            return r8
        L59:
            r6.f(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gm7.d.Z2(gm7.d, boe.k, gim.c):java.lang.Object");
    }

    public final void b3(Function1 onResult, Function1 operation) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(operation, "operation");
        T2(new a(this, onResult, operation, null), new s(1, this, d.class, "errorHandler", "errorHandler(Ljava/lang/Throwable;)Z", 0, 16));
    }
}
