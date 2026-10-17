package com.revolut.feature.junior_transfer.impl.ui.add_money;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wsg.n;
import xif.k;
import xng.l;
import xq8.f;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements xq8.b {
    public final JuniorAddMoneyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.b f77431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f77432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hj8.a f77433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zq8.a f77434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f77435t;

    public c(JuniorAddMoneyFlowContract$InputData inputData, wsg.b newWalletsInteractor, n walletInteractor, hj8.a juniorProfileInteractor, zq8.a currencyInconsistencyDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(currencyInconsistencyDialogProvider, "currencyInconsistencyDialogProvider");
        this.o = inputData;
        this.f77431p = newWalletsInteractor;
        this.f77432q = walletInteractor;
        this.f77433r = juniorProfileInteractor;
        this.f77434s = currencyInconsistencyDialogProvider;
        this.f77435t = d.a(this, new k(this, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_transfer.impl.ui.add_money.c r6, java.lang.String r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof xq8.d
            if (r0 == 0) goto L13
            r0 = r8
            xq8.d r0 = (xq8.d) r0
            int r1 = r0.f308132y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308132y = r1
            goto L18
        L13:
            xq8.d r0 = new xq8.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f308130w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308132y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.junior_transfer.impl.ui.add_money.c r6 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r8)
            wsg.b r8 = r6.f77431p
            w4l.h r2 = w4l.h.f294642c
            akg.n r8 = r8.b(r2)
            zfd.e r8 = zi0.c.w(r8)
            xlb.l r2 = new xlb.l
            r5 = 20
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            r0.u = r7
            r0.v = r6
            r0.f308132y = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            java.util.List r8 = (java.util.List) r8
            r6.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r6 = r8.iterator()
        L66:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto La0
            java.lang.Object r8 = r6.next()
            r0 = r8
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.f186386b
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L87
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L87
            goto L66
        L87:
            java.util.Iterator r0 = r0.iterator()
        L8b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            io3.d r1 = (io3.d) r1
            java.lang.String r1 = r1.f163145a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r1 == 0) goto L8b
            goto La1
        La0:
            r8 = r4
        La1:
            kotlin.Pair r8 = (kotlin.Pair) r8
            if (r8 == 0) goto Lac
            java.lang.Object r6 = r8.f186385a
            fo3.c r6 = (fo3.c) r6
            java.lang.String r6 = r6.f136805h
            return r6
        Lac:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Can't find wallet for kids pocket"
            r6.<init>(r7)
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            rd0.d.a(r8, r4, r4, r6, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_transfer.impl.ui.add_money.c.I2(com.revolut.feature.junior_transfer.impl.ui.add_money.c, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.junior_transfer.impl.ui.add_money.c r16, java.lang.String r17, gim.c r18) {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof xq8.e
            if (r2 == 0) goto L17
            r2 = r1
            xq8.e r2 = (xq8.e) r2
            int r3 = r2.f308135y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f308135y = r3
            goto L1c
        L17:
            xq8.e r2 = new xq8.e
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f308133w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f308135y
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L40
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            java.util.List r0 = r2.v
            java.util.List r0 = (java.util.List) r0
            yhm.o.b(r1)
            goto L77
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            java.lang.String r4 = r2.u
            yhm.o.b(r1)
            goto L61
        L40:
            yhm.o.b(r1)
            wsg.n r7 = r0.f77432q
            io3.l r8 = io3.l.CURRENT
            io3.i r10 = io3.i.INTERNAL
            io3.k r9 = io3.k.ACTIVE
            r13 = 0
            r14 = 56
            r11 = 0
            r12 = 0
            efm.d0 r1 = osg.b.j(r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = r17
            r2.u = r4
            r2.f308135y = r6
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L61
            goto L73
        L61:
            java.util.List r1 = (java.util.List) r1
            r7 = 0
            r2.u = r7
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            r2.v = r7
            r2.f308135y = r5
            java.lang.Object r0 = r0.K2(r4, r2)
            if (r0 != r3) goto L74
        L73:
            return r3
        L74:
            r15 = r1
            r1 = r0
            r0 = r15
        L77:
            xi0.b r1 = (xi0.b) r1
            kotlin.jvm.internal.Intrinsics.h(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L8e
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L8e
        L8c:
            r6 = r3
            goto La8
        L8e:
            java.util.Iterator r0 = r0.iterator()
        L92:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r0.next()
            io3.d r2 = (io3.d) r2
            java.lang.String r2 = r2.f163147c
            java.lang.String r4 = r1.f306286a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r4)
            if (r2 == 0) goto L92
        La8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_transfer.impl.ui.add_money.c.J2(com.revolut.feature.junior_transfer.impl.ui.add_money.c, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xq8.c
            if (r0 == 0) goto L13
            r0 = r7
            xq8.c r0 = (xq8.c) r0
            int r1 = r0.f308129w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308129w = r1
            goto L18
        L13:
            xq8.c r0 = new xq8.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308129w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            wsg.n r7 = r5.f77432q
            r2 = 0
            efm.r r6 = r7.a0(r6, r2)
            xlb.l r7 = new xlb.l
            r2 = 21
            r7.<init>(r2)
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r7, r3)
            efm.d0 r6 = r6.firstOrError()
            xo8.i0 r7 = new xo8.i0
            r2 = 18
            r7.<init>(r2)
            xo8.u r2 = new xo8.u
            r4 = 7
            r2.<init>(r4, r7)
            r6.getClass()
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r0.f308129w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_transfer.impl.ui.add_money.c.K2(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 0), new l(this, 14));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77435t;
    }
}
