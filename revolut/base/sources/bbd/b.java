package bbd;

import dbd.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f14254a;

    public b(g repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f14254a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(vad.e r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof bbd.a
            if (r0 == 0) goto L13
            r0 = r7
            bbd.a r0 = (bbd.a) r0
            int r1 = r0.f14253w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14253w = r1
            goto L18
        L13:
            bbd.a r0 = new bbd.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f14253w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L5d
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            java.lang.String r7 = "product"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.lang.String r6 = r6.name()
            dbd.g r2 = r5.f14254a
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            x4l.c r7 = r2.f
            dbd.d r2 = new dbd.d
            r2.<init>(r6)
            vkm.d r6 = r7.c(r2, r3)
            r7 = 3
            jhi.b r6 = mo3.a.g(r6, r4, r4, r7)
            r0.f14253w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L6c
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r6 = r7.isEmpty()
            r6 = r6 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
        L6c:
            boolean r6 = pd.b.j(r4)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bbd.b.a(vad.e, gim.c):java.lang.Object");
    }
}
