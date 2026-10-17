package com.revolut.feature.cash_topup.impl.ui.amount;

import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreenContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.amount.a;
import jki.g;
import jki.p;
import kl.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import olf.e;
import prl.k;
import q2e.i0;
import qb3.i;
import vkm.q;
import wsg.n;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f65617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nb3.b f65618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t1 f65619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f65620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CashTopUpAmountScreenContract$InputData.CreateBarcodeData f65621t;
    public final j60.a u;
    public final qb3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w39.b f65622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a.C0468a f65623x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n walletInteractor, nb3.b cashTopUpInteractor, t1 barcodeInteractor, w80.b amountFormatter, p stateMapper, CashTopUpAmountScreenContract$InputData.CreateBarcodeData inputData, j60.a bottomDialogExtension, qb3.a dialogMapper, w39.b locationInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(cashTopUpInteractor, "cashTopUpInteractor");
        Intrinsics.checkNotNullParameter(barcodeInteractor, "barcodeInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f65617p = walletInteractor;
        this.f65618q = cashTopUpInteractor;
        this.f65619r = barcodeInteractor;
        this.f65620s = amountFormatter;
        this.f65621t = inputData;
        this.u = bottomDialogExtension;
        this.v = dialogMapper;
        this.f65622w = locationInteractor;
        this.f65623x = a.C0468a.f65614a;
    }

    @Override // yji.l
    public final void I1() {
        l2(new b(this, null), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.H(new k(this, continuation, 29), new e(q.q(new njj.l(new e(q2(), 26), 16)), 27)), null, new i0(this, continuation, 25), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f65623x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (nim.a.b(r11, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y2(dj0.d r11, gim.c r12, java.lang.String r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof qb3.l
            if (r0 == 0) goto L13
            r0 = r12
            qb3.l r0 = (qb3.l) r0
            int r1 = r0.f244097y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244097y = r1
            goto L18
        L13:
            qb3.l r0 = new qb3.l
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f244095w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f244097y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            goto L74
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            java.lang.String r13 = r0.v
            dj0.d r11 = r0.u
            yhm.o.b(r12)
        L39:
            r5 = r13
            goto L55
        L3b:
            yhm.o.b(r12)
            w39.b r12 = r10.f65622w
            z39.b r12 = (z39.b) r12
            c49.d r12 = r12.f319221b
            ufm.n r12 = r12.e()
            r0.u = r11
            r0.v = r13
            r0.f244097y = r4
            java.lang.Object r12 = nim.a.b(r12, r0)
            if (r12 != r1) goto L39
            goto L73
        L55:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r12 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r12
            fb3.b r4 = new fb3.b
            double r6 = r12.f78066a
            double r8 = r12.f78067b
            r4.<init>(r5, r6, r8)
            kl.t1 r12 = r10.f65619r
            ufm.n r11 = r12.e(r11, r4)
            r12 = 0
            r0.u = r12
            r0.v = r12
            r0.f244097y = r3
            java.lang.Object r11 = nim.a.b(r11, r0)
            if (r11 != r1) goto L74
        L73:
            return r1
        L74:
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r12 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$JustShow r13 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$JustShow
            s49.a r0 = s49.a.SINGLE_TOP
            r13.<init>(r0)
            r12.<init>(r13)
            com.revolut.retail.core.navigation.FeatureCommand r13 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.cash_topup.api.declaration.CashTopUpBarcodeFeatureConfig r0 = com.revolut.feature.cash_topup.api.declaration.CashTopUpBarcodeFeatureConfig.f65578g
            r13.<init>(r0)
            com.revolut.retail.core.navigation.CompositeCommand r12 = com.revolut.retail.core.navigation.a.c(r12, r13)
            r11.<init>(r12)
            r10.C1(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.cash_topup.impl.ui.amount.c.y2(dj0.d, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0123, code lost:
    
        if (nim.a.b(r1, r2) == r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z2(dj0.d r24, java.lang.String r25, java.lang.String r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.cash_topup.impl.ui.amount.c.z2(dj0.d, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
