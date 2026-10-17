package vgf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf0.u0 f289085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mde.e f289086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lde.n f289087c;
    public final pff.a d;

    public e(wf0.u0 helpCenterRepository, mde.e sharedHelpDestinationProvider, lde.n sharedHelpWidgetsInteractor, pff.a transactionTroubleshooterInteractor) {
        Intrinsics.checkNotNullParameter(helpCenterRepository, "helpCenterRepository");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        Intrinsics.checkNotNullParameter(transactionTroubleshooterInteractor, "transactionTroubleshooterInteractor");
        this.f289085a = helpCenterRepository;
        this.f289086b = sharedHelpDestinationProvider;
        this.f289087c = sharedHelpWidgetsInteractor;
        this.d = transactionTroubleshooterInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tof.a3 r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof vgf.c
            if (r0 == 0) goto L13
            r0 = r10
            vgf.c r0 = (vgf.c) r0
            int r1 = r0.f289074x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289074x = r1
            goto L18
        L13:
            vgf.c r0 = new vgf.c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289074x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            goto La8
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            tof.a3 r9 = r0.u
            yhm.o.b(r10)
            goto L74
        L3a:
            yhm.o.b(r10)
            java.lang.String r10 = r9.f272581b
            lde.n r2 = r8.f289087c
            boolean r2 = r2.c()
            w4l.i r6 = w4l.i.f294643c
            pff.a r7 = r8.d
            vkm.d r10 = r7.a(r10, r5, r2, r6)
            zfd.e r10 = zi0.c.w(r10)
            vea.b r2 = new vea.b
            r6 = 24
            r2.<init>(r6)
            jhi.b r10 = mo3.a.g(r10, r5, r2, r4)
            vge.f1 r2 = new vge.f1
            r6 = 3
            r7 = 2
            r2.<init>(r6, r7, r5)
            zhm.h0 r6 = zhm.h0.f322473a
            vkm.y r10 = rd0.e.e(r10, r6, r2)
            r0.u = r9
            r0.f289074x = r4
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L74
            goto La7
        L74:
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L95
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig$TransactionTroubleshooting r1 = new com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig$TransactionTroubleshooting
            java.lang.String r3 = r9.f272581b
            r5 = 0
            r2 = 61
            r4 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.<init>(r1)
            r10.<init>(r0)
            return r10
        L95:
            mde.e r10 = r8.f289086b
            java.lang.String r9 = r9.f272581b
            ufm.b r9 = r10.e(r9, r5)
            r0.u = r5
            r0.f289074x = r3
            java.lang.Object r10 = nim.a.b(r9, r0)
            if (r10 != r1) goto La8
        La7:
            return r1
        La8:
            java.lang.String r9 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            aii.u r10 = (aii.u) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vgf.e.a(tof.a3, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        if (r13 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(tof.a3 r11, java.lang.String r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vgf.e.b(tof.a3, java.lang.String, gim.c):java.lang.Object");
    }
}
