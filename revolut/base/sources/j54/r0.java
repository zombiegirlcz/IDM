package j54;

import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r0 extends yji.n implements i0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CreditApplicationFlowContract$InputData f171550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rz3.c f171551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rz3.c f171552n;
    public final xq3.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ii4.o f171553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f171554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f171555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f171556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ib7.j f171557t;

    public r0(CreditApplicationFlowContract$InputData inputData, rz3.c creditApplicationRouter, rz3.c creditApplicationControllerFactory, xq3.j creditApplicationLifecycleInteractor, ii4.o spinnerInteractor, ang.f userInteractor, v lifecycleExtension, f cancellationExtension, ib7.j kompotPluginActionResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(creditApplicationControllerFactory, "creditApplicationControllerFactory");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(spinnerInteractor, "spinnerInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(lifecycleExtension, "lifecycleExtension");
        Intrinsics.checkNotNullParameter(cancellationExtension, "cancellationExtension");
        Intrinsics.checkNotNullParameter(kompotPluginActionResolver, "kompotPluginActionResolver");
        this.f171550l = inputData;
        this.f171551m = creditApplicationRouter;
        this.f171552n = creditApplicationControllerFactory;
        this.o = creditApplicationLifecycleInteractor;
        this.f171553p = spinnerInteractor;
        this.f171554q = userInteractor;
        this.f171555r = lifecycleExtension;
        this.f171556s = cancellationExtension;
        this.f171557t = kompotPluginActionResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof j54.j0
            if (r0 == 0) goto L13
            r0 = r7
            j54.j0 r0 = (j54.j0) r0
            int r1 = r0.f171519w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171519w = r1
            goto L18
        L13:
            j54.j0 r0 = new j54.j0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171519w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r6.f171554q
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            j3f.d r2 = new j3f.d
            r4 = 16
            r2.<init>(r4)
            j4e.c r4 = new j4e.c
            r5 = 5
            r4.<init>(r5, r2)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f171519w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.r0.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (j54.i0.h0(r5, (it3.d) r6, r8, r0, 1) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j54.k0
            if (r0 == 0) goto L13
            r0 = r6
            j54.k0 r0 = (j54.k0) r0
            int r1 = r0.f171522x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171522x = r1
            goto L18
        L13:
            j54.k0 r0 = new j54.k0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171522x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r8 = r0.u
            yhm.o.b(r6)
            goto L48
        L38:
            yhm.o.b(r6)
            r0.u = r8
            r0.f171522x = r4
            xq3.j r6 = r5.o
            java.lang.Object r6 = r6.f(r7, r0)
            if (r6 != r1) goto L48
            goto L54
        L48:
            it3.d r6 = (it3.d) r6
            r0.u = r8
            r0.f171522x = r3
            java.lang.Object r6 = j54.i0.h0(r5, r6, r8, r0, r4)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.r0.b3(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:(1:(1:13)(2:14|15))(3:16|56|17)|54|55)(1:21))(6:22|(1:(1:25)(2:26|27))(2:28|(3:30|(2:31|(2:33|(1:61)(1:62))(2:60|36))|37)(1:38))|39|(1:41)|(1:44)|53)|45|58|46|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        if (d3(r9, r10, r11, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        r7 = r11;
        r11 = r9;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (e3(r10, r9, r0) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(it3.d r9, it3.d r10, boolean r11, gim.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof j54.l0
            if (r0 == 0) goto L13
            r0 = r12
            j54.l0 r0 = (j54.l0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            j54.l0 r0 = new j54.l0
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f171525x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r12)
            goto Lc4
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            boolean r9 = r0.f171524w
            it3.d r10 = r0.v
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L40
            goto Lc4
        L40:
            r11 = move-exception
            goto Lac
        L43:
            boolean r11 = r0.f171524w
            it3.d r9 = r0.u
            yhm.o.b(r12)
            goto L96
        L4b:
            yhm.o.b(r12)
            r0.u = r9
            r0.f171524w = r11
            r0.z = r5
            hs3.v r12 = r10.e
            boolean r2 = r12 instanceof hs3.u1
            if (r2 == 0) goto L67
            if (r12 == 0) goto L5f
            hs3.u1 r12 = (hs3.u1) r12
            goto L86
        L5f:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.SpinnerMetadata"
            r9.<init>(r10)
            throw r9
        L67:
            java.util.List r12 = r10.f
            if (r12 == 0) goto L85
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L71:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r12.next()
            boolean r5 = r2 instanceof hs3.u1
            if (r5 == 0) goto L71
            goto L81
        L80:
            r2 = r6
        L81:
            r12 = r2
            hs3.v r12 = (hs3.v) r12
            goto L86
        L85:
            r12 = r6
        L86:
            hs3.u1 r12 = (hs3.u1) r12
            if (r12 == 0) goto L92
            ii4.o r12 = r8.f171553p
            ii4.z r12 = (ii4.z) r12
            java.io.Serializable r10 = r12.c(r10, r0)
        L92:
            if (r10 != r1) goto L95
            goto Lc3
        L95:
            r12 = r10
        L96:
            r10 = r12
            it3.d r10 = (it3.d) r10
            r0.u = r6     // Catch: java.lang.Exception -> La8
            r0.v = r10     // Catch: java.lang.Exception -> La8
            r0.f171524w = r11     // Catch: java.lang.Exception -> La8
            r0.z = r4     // Catch: java.lang.Exception -> La8
            java.lang.Object r9 = r8.d3(r9, r10, r11, r0)     // Catch: java.lang.Exception -> La8
            if (r9 != r1) goto Lc4
            goto Lc3
        La8:
            r9 = move-exception
            r7 = r11
            r11 = r9
            r9 = r7
        Lac:
            zhm.h0 r12 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r6, r6, r11, r12)
            r0.u = r6
            r0.v = r6
            r0.f171524w = r9
            r0.z = r3
            java.lang.Object r9 = r8.e3(r10, r9, r0)
            if (r9 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.r0.c3(it3.d, it3.d, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0123, code lost:
    
        if (j54.v.r(r7, r1, null, r11, 2) == r4) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0158, code lost:
    
        if (kotlin.Unit.f186387a == r4) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(it3.d r18, it3.d r19, boolean r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.r0.d3(it3.d, it3.d, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(it3.d r6, boolean r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof j54.n0
            if (r0 == 0) goto L13
            r0 = r8
            j54.n0 r0 = (j54.n0) r0
            int r1 = r0.f171532w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171532w = r1
            goto L18
        L13:
            j54.n0 r0 = new j54.n0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171532w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r8 = new com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig
            r2 = 10
            r8.<init>(r7, r3, r2)
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r7 = r5.f171550l
            ft3.a1 r7 = r7.f67054b
            grl.r2 r2 = r7.f137797a
            java.lang.String r7 = r7.f137798b
            rz3.c r4 = r5.f171551m
            ufm.i r6 = r4.a(r6, r2, r7, r8)
            r0.f171532w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            com.revolut.retail.core.navigation.FinishCommand r6 = new com.revolut.retail.core.navigation.FinishCommand
            r7 = 7
            r0 = 0
            r6.<init>(r0, r0, r0, r7)
            com.revolut.retail.core.navigation.CompositeCommand r6 = com.revolut.retail.core.navigation.a.c(r6, r8)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r5.A2(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.r0.e3(it3.d, boolean, gim.c):java.lang.Object");
    }
}
