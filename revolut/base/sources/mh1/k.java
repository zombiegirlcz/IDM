package mh1;

import al4.q;
import jr6.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f205362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.d f205363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f205364c;
    public final she.g d;
    public final z5j.d e;

    public k(o freelancerNaviCommandPermissionWrapper, g6e.d subaccountInteractor, q creditCardProductInteractor, she.g productAccountDestinationResolver, z5j.d commodityAssetDetailsOrderFlowCommandProvider) {
        Intrinsics.checkNotNullParameter(freelancerNaviCommandPermissionWrapper, "freelancerNaviCommandPermissionWrapper");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(commodityAssetDetailsOrderFlowCommandProvider, "commodityAssetDetailsOrderFlowCommandProvider");
        this.f205362a = freelancerNaviCommandPermissionWrapper;
        this.f205363b = subaccountInteractor;
        this.f205364c = creditCardProductInteractor;
        this.d = productAccountDestinationResolver;
        this.e = commodityAssetDetailsOrderFlowCommandProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(j1j.d r12, gim.c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof mh1.g
            if (r0 == 0) goto L13
            r0 = r13
            mh1.g r0 = (mh1.g) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            mh1.g r0 = new mh1.g
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.String r12 = r0.v
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            goto La0
        L2e:
            r12 = move-exception
            goto La8
        L31:
            r12 = move-exception
            goto Lb8
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            int r12 = r0.f205355y
            int r2 = r0.f205354x
            int r4 = r0.f205353w
            mh1.k r6 = r0.u
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            goto L79
        L48:
            yhm.o.b(r13)
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            al4.q r13 = r11.f205364c     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            java.lang.String r12 = r12.f170617a     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            om4.y3 r13 = (om4.y3) r13     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            vkm.v1 r12 = r13.g(r12)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            m9d.j1 r13 = new m9d.j1     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r2 = 29
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            jhi.b r12 = mo3.a.g(r12, r5, r13, r4)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.u = r11     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r13 = 0
            r0.f205353w = r13     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f205354x = r13     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f205355y = r13     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.B = r4     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            java.lang.Object r12 = vkm.q.x(r12, r0)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            if (r12 != r1) goto L74
            goto L9c
        L74:
            r6 = r11
            r2 = r13
            r4 = r2
            r13 = r12
            r12 = r4
        L79:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            she.g r6 = r6.d     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r7 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            com.revolut.feature.tab.accounts.models.ProductId r8 = com.revolut.feature.tab.accounts.models.ProductId.CREDIT     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            com.revolut.feature.tab.accounts.models.ProductAccountId r9 = com.revolut.feature.credit.models.a.b(r13)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r7.<init>(r9, r8)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.u = r5     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.v = r13     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f205353w = r4     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f205354x = r2     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f205355y = r12     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.B = r3     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            zfe.f r12 = zfe.g.Companion     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            java.lang.Object r12 = r6.c(r7, r5, r0)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            if (r12 != r1) goto L9d
        L9c:
            return r1
        L9d:
            r10 = r13
            r13 = r12
            r12 = r10
        La0:
            com.revolut.kompot.bridge.navigation.KompotDestination r13 = (com.revolut.kompot.bridge.navigation.KompotDestination) r13     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination r0 = new com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.<init>(r12, r13, r3)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            return r0
        La8:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
            java.lang.Throwable r12 = yhm.m.a(r12)
            if (r12 == 0) goto Lb7
            hx7.e.n(r12)
        Lb7:
            return r5
        Lb8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mh1.k.a(j1j.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r2 == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        if (r2 == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f7, code lost:
    
        if (r2 == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
    
        if (r2 == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a1, code lost:
    
        if (r2 != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a3, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j1j.d r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh1.k.b(j1j.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(j1j.d r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mh1.i
            if (r0 == 0) goto L13
            r0 = r8
            mh1.i r0 = (mh1.i) r0
            int r1 = r0.f205359x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f205359x = r1
            goto L18
        L13:
            mh1.i r0 = new mh1.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f205359x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            j1j.d r7 = r0.u
            yhm.o.b(r8)
            goto L5a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            w4l.h r8 = w4l.h.f294642c
            g6e.d r2 = r6.f205363b
            s6e.z r2 = (s6e.z) r2
            h6e.f$a r5 = h6e.f.a.f149636a
            akg.n r8 = r2.w(r5, r8)
            zfd.e r8 = zi0.c.w(r8)
            mh1.e r2 = new mh1.e
            r5 = 0
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            r0.u = r7
            r0.f205359x = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L86
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L64:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.revolut.feature.subaccount.api.models.Subaccount r1 = (com.revolut.feature.subaccount.api.models.Subaccount) r1
            pcd.s r1 = r1.getF88959a()
            java.lang.String r1 = r1.f()
            java.lang.String r2 = r7.f170617a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L64
            goto L83
        L82:
            r0 = r4
        L83:
            com.revolut.feature.subaccount.api.models.Subaccount r0 = (com.revolut.feature.subaccount.api.models.Subaccount) r0
            goto L87
        L86:
            r0 = r4
        L87:
            if (r0 == 0) goto L95
            com.revolut.feature.subaccount.api.SubaccountAddMoneyDestination r7 = new com.revolut.feature.subaccount.api.SubaccountAddMoneyDestination
            pcd.s r8 = r0.getF88959a()
            java.lang.String r8 = r8.f234881a
            r7.<init>(r8)
            return r7
        L95:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mh1.k.c(j1j.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(j1j.d r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mh1.j
            if (r0 == 0) goto L13
            r0 = r8
            mh1.j r0 = (mh1.j) r0
            int r1 = r0.f205361x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f205361x = r1
            goto L18
        L13:
            mh1.j r0 = new mh1.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f205361x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            j1j.d r7 = r0.u
            yhm.o.b(r8)
            goto L58
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            w4l.h r8 = w4l.h.f294642c
            g6e.d r2 = r6.f205363b
            s6e.z r2 = (s6e.z) r2
            vkm.d r8 = r2.o(r8)
            zfd.e r8 = zi0.c.w(r8)
            mh1.e r2 = new mh1.e
            r5 = 1
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            r0.u = r7
            r0.f205361x = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L84
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L62:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.revolut.feature.subaccount.api.models.Subaccount r1 = (com.revolut.feature.subaccount.api.models.Subaccount) r1
            pcd.s r1 = r1.getF88959a()
            java.lang.String r1 = r1.f()
            java.lang.String r2 = r7.f170617a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L62
            goto L81
        L80:
            r0 = r4
        L81:
            com.revolut.feature.subaccount.api.models.Subaccount r0 = (com.revolut.feature.subaccount.api.models.Subaccount) r0
            goto L85
        L84:
            r0 = r4
        L85:
            if (r0 == 0) goto L93
            com.revolut.feature.subaccount.api.SubaccountAddMoneyDestination r7 = new com.revolut.feature.subaccount.api.SubaccountAddMoneyDestination
            pcd.s r8 = r0.getF88959a()
            java.lang.String r8 = r8.f234881a
            r7.<init>(r8)
            return r7
        L93:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mh1.k.d(j1j.d, gim.c):java.lang.Object");
    }
}
