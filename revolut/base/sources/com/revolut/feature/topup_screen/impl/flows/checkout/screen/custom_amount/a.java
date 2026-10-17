package com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount;

import cli.g;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lo.c;
import lxe.f;
import lxe.i;
import mra.d;
import oki.h;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements f {
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f90770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CheckoutCustomAmountScreenContract$InputData f90771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f90772r;

    public a(n walletInteractor, w80.b amountFormatter, CheckoutCustomAmountScreenContract$InputData inputData, b stateMapper) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = walletInteractor;
        this.f90770p = amountFormatter;
        this.f90771q = inputData;
        this.f90772r = d.b(this, new lxe.d(inputData.f90763a, null), stateMapper, new i(), false, 8);
    }

    @Override // yji.l
    public final void I1() {
        l2(new c(this, (Continuation) null, 11), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable I2(dj0.d r5, com.revolut.core.model.account.AccountId r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof lxe.h
            if (r0 == 0) goto L13
            r0 = r7
            lxe.h r0 = (lxe.h) r0
            int r1 = r0.f200565x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200565x = r1
            goto L18
        L13:
            lxe.h r0 = new lxe.h
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200565x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dj0.d r5 = r0.u
            yhm.o.b(r7)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            wsg.n r7 = r4.o
            w4l.j r2 = w4l.j.f294644c
            efm.r r6 = r7.X(r6, r2)
            lnk.o r7 = new lnk.o
            r2 = 27
            r7.<init>(r2)
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r7, r3)
            r0.u = r5
            r0.f200565x = r3
            java.lang.Object r7 = nim.a.c(r6, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            java.lang.String r6 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            fo3.c r7 = (fo3.c) r7
            dj0.d r6 = i26.l.l(r7)
            long r0 = r6.f115082a
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L6a
            return r6
        L6a:
            dj0.d r5 = pyd.c.H(r6, r5)
            dj0.c r6 = dj0.d.Companion
            r6.getClass()
            dj0.d r6 = dj0.d.e
            java.lang.Comparable r5 = kotlin.ranges.f.c(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a.I2(dj0.d, com.revolut.core.model.account.AccountId, gim.c):java.lang.Comparable");
    }

    @Override // cli.z
    public final g getState() {
        return this.f90772r;
    }
}
