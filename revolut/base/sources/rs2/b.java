package rs2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gl3.f f256939a;

    public b(gl3.f contactsDataSource) {
        Intrinsics.checkNotNullParameter(contactsDataSource, "contactsDataSource");
        this.f256939a = contactsDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rs2.b r7, gim.c r8) {
        /*
            gl3.f r0 = r7.f256939a
            boolean r1 = r8 instanceof rs2.a
            if (r1 == 0) goto L15
            r1 = r8
            rs2.a r1 = (rs2.a) r1
            int r2 = r1.f256938w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f256938w = r2
            goto L1a
        L15:
            rs2.a r1 = new rs2.a
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f256938w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r8)
            goto L85
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            r8 = 0
            sfm.b r3 = r0.c(r8)
            sfm.b r8 = r0.a(r8)
            efm.r r8 = efm.r.merge(r3, r8)
            java.lang.String r0 = "merge(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            efm.r r8 = te0.w.f0(r8)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            rnd.d0 r3 = new rnd.d0
            r5 = 19
            r3.<init>(r5)
            rpi.d r5 = new rpi.d
            r6 = 20
            r5.<init>(r3, r6)
            efm.d0 r8 = r8.collectInto(r0, r5)
            rrd.l r0 = new rrd.l
            r3 = 3
            r0.<init>(r7, r3)
            rpi.d r7 = new rpi.d
            r3 = 21
            r7.<init>(r0, r3)
            r8.getClass()
            ufm.i r0 = new ufm.i
            r3 = 1
            r0.<init>(r8, r7, r3)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            r1.f256938w = r4
            java.lang.Object r8 = nim.a.b(r0, r1)
            if (r8 != r2) goto L85
            return r2
        L85:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rs2.b.a(rs2.b, gim.c):java.lang.Object");
    }
}
