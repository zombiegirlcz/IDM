package com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lxd.d;
import nxd.c;
import oki.h;
import org.jetbrains.annotations.NotNull;
import wsg.n;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements lxd.b {

    @NotNull
    public static final d Companion = new d();
    public final AutoTopUpFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i61.b f88191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f88192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nxd.b f88193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f88194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u51.a f88195t;
    public final i u;

    public b(AutoTopUpFlowContract$InputData inputData, i61.b autoTopUpInteractor, n walletInteractor, nxd.b customOrderAmountRelay, c selectedAutoTopUpMethodRelay, u51.a topupMethodsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(autoTopUpInteractor, "autoTopUpInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(customOrderAmountRelay, "customOrderAmountRelay");
        Intrinsics.checkNotNullParameter(selectedAutoTopUpMethodRelay, "selectedAutoTopUpMethodRelay");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        this.o = inputData;
        this.f88191p = autoTopUpInteractor;
        this.f88192q = walletInteractor;
        this.f88193r = customOrderAmountRelay;
        this.f88194s = selectedAutoTopUpMethodRelay;
        this.f88195t = topupMethodsInteractor;
        this.u = d8l.d.a(this, new lp2.c(this, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof lxd.e
            if (r0 == 0) goto L13
            r0 = r11
            lxd.e r0 = (lxd.e) r0
            int r1 = r0.f200555w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200555w = r1
            goto L18
        L13:
            lxd.e r0 = new lxd.e
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200555w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L7e
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r11)
            u51.a r11 = r10.f88195t
            com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$InputData r2 = r10.o
            xi0.b r2 = r2.f88178a
            if (r2 == 0) goto L41
            java.lang.String r2 = r2.f306286a
            if (r2 != 0) goto L3f
            goto L41
        L3f:
            r5 = r2
            goto L44
        L41:
            java.lang.String r2 = ""
            goto L3f
        L44:
            yte.n r6 = yte.n.CURRENT
            r9 = 0
            r4 = r11
            e0f.r1 r4 = (e0f.r1) r4
            w4l.h r7 = w4l.h.f294642c
            r8 = 0
            wkm.l r11 = r4.j(r5, r6, r7, r8, r9)
            lxd.c r2 = new lxd.c
            r4 = 2
            r2.<init>(r10, r4)
            akg.n r10 = nim.a.v(r11, r2)
            lnk.o r11 = new lnk.o
            r2 = 25
            r11.<init>(r2)
            r2 = 0
            jhi.b r10 = mo3.a.g(r10, r2, r11, r3)
            klf.l1 r11 = new klf.l1
            r4 = 3
            r5 = 19
            r11.<init>(r4, r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r10 = rd0.e.e(r10, r2, r11)
            r0.f200555w = r3
            java.lang.Object r11 = vkm.q.z(r10, r0)
            if (r11 != r1) goto L7e
            return r1
        L7e:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r11, r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b.I2(com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b r4, xi0.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof lxd.f
            if (r0 == 0) goto L13
            r0 = r6
            lxd.f r0 = (lxd.f) r0
            int r1 = r0.f200556w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200556w = r1
            goto L18
        L13:
            lxd.f r0 = new lxd.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200556w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            i61.b r6 = r4.f88191p
            com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$InputData r4 = r4.o
            io3.l r4 = r4.f88179b
            efm.r r4 = r6.b(r5, r4, r3)
            lnk.o r5 = new lnk.o
            r6 = 26
            r5.<init>(r6)
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r5, r3)
            r0.f200556w = r3
            java.lang.Object r6 = nim.a.c(r4, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b.J2(com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b, xi0.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new lo.c(this, (Continuation) null, 10), new lxd.c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
