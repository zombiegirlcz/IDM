package nc8;

import kotlin.jvm.internal.Intrinsics;
import l80.e;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ic8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f214165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f214166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f214167c;
    public final hj8.a d;
    public final vx2.c e;

    public d(e dateProvider, n walletsInteractor, kbb.c juniorConfigurationInteractor, hj8.a juniorProfileInteractor, vx2.c juniorCardRequestHandler) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigurationInteractor, "juniorConfigurationInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorCardRequestHandler, "juniorCardRequestHandler");
        this.f214165a = dateProvider;
        this.f214166b = walletsInteractor;
        this.f214167c = juniorConfigurationInteractor;
        this.d = juniorProfileInteractor;
        this.e = juniorCardRequestHandler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (r15 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, com.revolut.retail.core.navigation.NaviCommand r13, kc8.a r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof nc8.b
            if (r0 == 0) goto L13
            r0 = r15
            nc8.b r0 = (nc8.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            nc8.b r0 = new nc8.b
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f214162x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r15)
            goto Lba
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kc8.a r14 = r0.f214161w
            com.revolut.retail.core.navigation.NaviCommand r13 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r15)
        L3c:
            r7 = r12
            r10 = r13
            goto L51
        L3f:
            yhm.o.b(r15)
            r0.u = r12
            r0.v = r13
            r0.f214161w = r14
            r0.z = r4
            java.lang.Object r15 = r11.c(r12, r13, r14, r0)
            if (r15 != r1) goto L3c
            goto Lb9
        L51:
            com.revolut.retail.core.navigation.NaviCommand r15 = (com.revolut.retail.core.navigation.NaviCommand) r15
            if (r15 != 0) goto Lc1
            int[] r12 = nc8.a.f214160a
            int r13 = r14.ordinal()
            r12 = r12[r13]
            if (r12 == r4) goto L6b
            if (r12 != r3) goto L65
            c93.e r12 = c93.e.VIRTUAL
        L63:
            r9 = r12
            goto L6e
        L65:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L6b:
            c93.e r12 = c93.e.PHYSICAL
            goto L63
        L6e:
            wsg.n r12 = r11.f214166b
            efm.r r12 = r12.b0(r7)
            n7h.c r13 = new n7h.c
            r14 = 17
            r13.<init>(r11, r14)
            efm.r r12 = pd.b.r(r12, r13)
            n87.r r13 = new n87.r
            r14 = 16
            r13.<init>(r14)
            r14 = 0
            efm.r r12 = m70.a.g(r12, r14, r13, r4)
            efm.d0 r12 = r12.firstOrError()
            n68.w r5 = new n68.w
            r6 = 1
            r8 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            nae.a r13 = new nae.a
            r15 = 26
            r13.<init>(r5, r15)
            r12.getClass()
            ufm.i r15 = new ufm.i
            r2 = 1
            r15.<init>(r12, r13, r2)
            java.lang.String r12 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r12)
            r0.u = r14
            r0.v = r14
            r0.f214161w = r14
            r0.z = r3
            java.lang.Object r15 = nim.a.b(r15, r0)
            if (r15 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            java.lang.String r12 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r12)
            com.revolut.retail.core.navigation.NaviCommand r15 = (com.revolut.retail.core.navigation.NaviCommand) r15
        Lc1:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: nc8.d.b(java.lang.String, com.revolut.retail.core.navigation.NaviCommand, kc8.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, com.revolut.retail.core.navigation.NaviCommand r9, kc8.a r10, gim.c r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof nc8.c
            if (r0 == 0) goto L13
            r0 = r11
            nc8.c r0 = (nc8.c) r0
            int r1 = r0.f214164w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214164w = r1
            goto L18
        L13:
            nc8.c r0 = new nc8.c
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214164w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L55
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r11)
            int[] r11 = nc8.a.f214160a
            int r10 = r10.ordinal()
            r10 = r11[r10]
            if (r10 == r3) goto L48
            r11 = 2
            if (r10 != r11) goto L42
            jc8.c r10 = jc8.c.VIRTUAL
            goto L4a
        L42:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L48:
            jc8.c r10 = jc8.c.PHYSICAL
        L4a:
            r0.f214164w = r3
            vx2.c r11 = r7.e
            java.lang.Object r11 = r11.a(r10, r8, r9, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r2 = r11
            com.revolut.kompot.common.ParcelableDestination r2 = (com.revolut.kompot.common.ParcelableDestination) r2
            if (r2 == 0) goto L6b
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r0 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            r5 = 0
            r6 = 61
            r1 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.<init>(r0)
            return r8
        L6b:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nc8.d.c(java.lang.String, com.revolut.retail.core.navigation.NaviCommand, kc8.a, gim.c):java.lang.Object");
    }
}
