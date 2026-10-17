package flf;

import elf.s0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f135955l;

    public c(h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f135955l = commonDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof flf.b
            if (r0 == 0) goto L13
            r0 = r15
            flf.b r0 = (flf.b) r0
            int r1 = r0.f135954x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135954x = r1
            goto L18
        L13:
            flf.b r0 = new flf.b
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135954x
            klf.h0 r3 = r14.f135955l
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.util.Map r0 = r0.u
            java.util.Map r0 = (java.util.Map) r0
            yhm.o.b(r15)
            goto L63
        L30:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L38:
            yhm.o.b(r15)
            goto L4c
        L3c:
            yhm.o.b(r15)
            kotlinx.coroutines.flow.SharedFlow r15 = r3.e()
            r0.f135954x = r5
            java.lang.Object r15 = vkm.q.x(r15, r0)
            if (r15 != r1) goto L4c
            goto L5f
        L4c:
            java.util.Map r15 = (java.util.Map) r15
            kotlinx.coroutines.flow.SharedFlow r2 = r3.d()
            r3 = r15
            java.util.Map r3 = (java.util.Map) r3
            r0.u = r3
            r0.f135954x = r4
            java.lang.Object r0 = vkm.q.x(r2, r0)
            if (r0 != r1) goto L60
        L5f:
            return r1
        L60:
            r13 = r0
            r0 = r15
            r15 = r13
        L63:
            tof.a3 r15 = (tof.a3) r15
            tof.w5 r15 = r15.f272624y
            java.lang.String r15 = r15.f273143a
            java.lang.Object r15 = r0.get(r15)
            r1 = r15
            io3.d r1 = (io3.d) r1
            if (r1 != 0) goto L75
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        L75:
            com.revolut.feature.pockets.api.navigation.PocketDetailsDestination r15 = new com.revolut.feature.pockets.api.navigation.PocketDetailsDestination
            com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData r0 = new com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData
            r11 = 0
            r12 = 4080(0xff0, float:5.717E-42)
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.<init>(r0)
            r14.A2(r15)
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.c.Z2(gim.c):java.lang.Object");
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
            boolean r4 = r6 instanceof flf.a
            if (r4 == 0) goto L13
            r4 = r6
            flf.a r4 = (flf.a) r4
            int r0 = r4.f135952w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f135952w = r0
            goto L1a
        L13:
            flf.a r4 = new flf.a
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f135952w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "ID_BANK_ACCOUNT_SWITCHING_SHARE_DETAILS"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L45
            r4.f135952w = r2
            java.lang.Object r4 = r3.Z2(r4)
            if (r4 != r0) goto L46
            return r0
        L45:
            r2 = 0
        L46:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.c.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
