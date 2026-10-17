package jlf;

import elf.s0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f175755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gqa.b f175756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f175757n;

    public r(h0 commonDataSource, gqa.b pushToCardStatusChecker, p destinationProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(pushToCardStatusChecker, "pushToCardStatusChecker");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        this.f175755l = commonDataSource;
        this.f175756m = pushToCardStatusChecker;
        this.f175757n = destinationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof jlf.q
            if (r5 == 0) goto L13
            r5 = r7
            jlf.q r5 = (jlf.q) r5
            int r6 = r5.f175754y
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.f175754y = r6
            goto L1a
        L13:
            jlf.q r5 = new jlf.q
            gim.c r7 = (gim.c) r7
            r5.<init>(r4, r7)
        L1a:
            java.lang.Object r6 = r5.f175752w
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r0 = r5.f175754y
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3f
            if (r0 == r2) goto L39
            if (r0 != r1) goto L31
            jlf.r r5 = r5.v
            yhm.o.b(r6)
            goto L83
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            tof.a3 r0 = r5.u
            yhm.o.b(r6)
            goto L69
        L3f:
            yhm.o.b(r6)
            goto L55
        L43:
            yhm.o.b(r6)
            klf.h0 r6 = r4.f175755l
            kotlinx.coroutines.flow.SharedFlow r6 = r6.d()
            r5.f175754y = r3
            java.lang.Object r6 = vkm.q.x(r6, r5)
            if (r6 != r7) goto L55
            goto L81
        L55:
            r0 = r6
            tof.a3 r0 = (tof.a3) r0
            gqa.b r6 = r4.f175756m
            pfm.z r6 = r6.a()
            r5.u = r0
            r5.f175754y = r2
            java.lang.Object r6 = nim.a.b(r6, r5)
            if (r6 != r7) goto L69
            goto L81
        L69:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            boolean r6 = r6.booleanValue()
            r2 = 0
            r5.u = r2
            r5.v = r4
            r5.f175754y = r1
            jlf.p r1 = r4.f175757n
            java.lang.Object r6 = r1.a(r0, r6, r5)
            if (r6 != r7) goto L82
        L81:
            return r7
        L82:
            r5 = r4
        L83:
            aii.u r6 = (aii.u) r6
            r5.A2(r6)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jlf.r.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
