package ckf;

import elf.s0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends n implements s0 {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f24833l;

    public i(h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f24833l = commonDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof ckf.h
            if (r4 == 0) goto L13
            r4 = r6
            ckf.h r4 = (ckf.h) r4
            int r0 = r4.f24832w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f24832w = r0
            goto L1a
        L13:
            ckf.h r4 = new ckf.h
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f24832w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L4e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "DEFI_SEND_AGAIN"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 != 0) goto L3f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3f:
            klf.h0 r5 = r3.f24833l
            kotlinx.coroutines.flow.SharedFlow r5 = r5.d()
            r4.f24832w = r2
            java.lang.Object r6 = vkm.q.x(r5, r4)
            if (r6 != r0) goto L4e
            return r0
        L4e:
            tof.a3 r6 = (tof.a3) r6
            tof.l0 r4 = r6.Q1
            if (r4 == 0) goto L64
            java.lang.String r4 = r4.f272895a
            if (r4 != 0) goto L59
            goto L64
        L59:
            com.revolut.feature.defi.remittances.api.navigation.DeFiSendDestination r5 = new com.revolut.feature.defi.remittances.api.navigation.DeFiSendDestination
            r5.<init>(r4)
            r3.A2(r5)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L64:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ckf.i.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
