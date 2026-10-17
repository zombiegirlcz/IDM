package i68;

import b23.l;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f158888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f158889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q78.e f158890c;

    public i(n walletInteractor, l juniorCardOrderCommandProvider, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorCardOrderCommandProvider, "juniorCardOrderCommandProvider");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f158888a = walletInteractor;
        this.f158889b = juniorCardOrderCommandProvider;
        this.f158890c = juniorAccountDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.core.navigation.NaviCommand r9, java.lang.String r10, java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof i68.f
            if (r0 == 0) goto L14
            r0 = r12
            i68.f r0 = (i68.f) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            i68.f r0 = new i68.f
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f158882x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r12)
            return r12
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            java.lang.String r11 = r7.f158881w
            java.lang.String r10 = r7.v
            com.revolut.retail.core.navigation.NaviCommand r9 = r7.u
            yhm.o.b(r12)
        L3d:
            r5 = r9
            r4 = r11
            goto L52
        L40:
            yhm.o.b(r12)
            r7.u = r9
            r7.v = r10
            r7.f158881w = r11
            r7.z = r3
            java.lang.Object r12 = r8.c(r10, r7)
            if (r12 != r0) goto L3d
            goto L69
        L52:
            psg.a r12 = (psg.a) r12
            java.lang.String r3 = r12.f239484a
            r9 = 0
            r7.u = r9
            r7.v = r9
            r7.f158881w = r9
            r7.z = r2
            b23.l r1 = r8.f158889b
            r6 = r5
            r2 = r10
            java.lang.Object r9 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L6a
        L69:
            return r0
        L6a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i68.i.a(com.revolut.retail.core.navigation.NaviCommand, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:8))(0)|7|9|51|(1:(1:(12:13|55|14|32|37|(1:39)|40|(1:43)|44|(1:47)|48|49)(2:20|21))(1:22))(3:23|(1:26)|30)|27|53|28|(10:31|32|37|(0)|40|(0)|44|(0)|48|49)|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        r12 = r0;
        r11 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof i68.g
            if (r0 == 0) goto L14
            r0 = r13
            i68.g r0 = (i68.g) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            i68.g r0 = new i68.g
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r5.f158885x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.z
            r7 = 2
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L46
            if (r1 == r2) goto L3e
            if (r1 != r7) goto L36
            com.revolut.retail.core.navigation.NaviCommand r11 = r5.f158884w
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L32
            goto L73
        L2f:
            r0 = move-exception
            r12 = r0
            goto L7b
        L32:
            r0 = move-exception
            r11 = r0
            goto L9b
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            java.lang.String r12 = r5.v
            java.lang.String r11 = r5.u
            yhm.o.b(r13)
            goto L5d
        L46:
            yhm.o.b(r13)
            r5.u = r11
            r5.v = r12
            r5.z = r2
            r4 = 0
            r6 = 6
            q78.e r1 = r10.f158890c
            r3 = 0
            r2 = r11
            java.lang.Object r13 = u68.b.b(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5c
            goto L6f
        L5c:
            r11 = r2
        L5d:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L32 java.lang.Throwable -> L78
            r5.u = r8     // Catch: java.util.concurrent.CancellationException -> L32 java.lang.Throwable -> L78
            r5.v = r8     // Catch: java.util.concurrent.CancellationException -> L32 java.lang.Throwable -> L78
            r5.f158884w = r13     // Catch: java.util.concurrent.CancellationException -> L32 java.lang.Throwable -> L78
            r5.z = r7     // Catch: java.util.concurrent.CancellationException -> L32 java.lang.Throwable -> L78
            java.lang.Object r11 = r10.a(r13, r11, r12, r5)     // Catch: java.util.concurrent.CancellationException -> L32 java.lang.Throwable -> L78
            if (r11 != r0) goto L70
        L6f:
            return r0
        L70:
            r9 = r13
            r13 = r11
            r11 = r9
        L73:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L32
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L32
            goto L81
        L78:
            r0 = move-exception
            r12 = r0
            r11 = r13
        L7b:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r13 = yhm.o.a(r12)
        L81:
            java.lang.Throwable r12 = yhm.m.a(r13)
            if (r12 == 0) goto L8a
            hx7.e.n(r12)
        L8a:
            boolean r12 = r13 instanceof yhm.n
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r8 = r13
        L90:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            if (r8 != 0) goto L95
            goto L96
        L95:
            r11 = r8
        L96:
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = zh9.u0.b(r11)
            return r11
        L9b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i68.i.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof i68.h
            if (r0 == 0) goto L13
            r0 = r7
            i68.h r0 = (i68.h) r0
            int r1 = r0.f158887w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158887w = r1
            goto L18
        L13:
            i68.h r0 = new i68.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f158887w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L55
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r7 = 0
            r2 = 4
            wsg.n r4 = r5.f158888a
            efm.r r6 = osg.b.a(r4, r6, r7, r2)
            i2l.n0 r7 = new i2l.n0
            r2 = 14
            r7.<init>(r2)
            i2l.n0 r2 = new i2l.n0
            r4 = 15
            r2.<init>(r4)
            efm.r r6 = m70.a.e(r6, r7, r2)
            r0.f158887w = r3
            java.lang.Object r7 = nim.a.c(r6, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            java.lang.String r6 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i68.i.c(java.lang.String, gim.c):java.lang.Object");
    }
}
