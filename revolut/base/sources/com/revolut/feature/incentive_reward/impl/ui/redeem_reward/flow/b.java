package com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow;

import d8l.d;
import eub.i;
import kotlin.jvm.internal.Intrinsics;
import nyb.k;
import oki.h;
import r10.q;
import zg7.c;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements zg7.b {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f74885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f74886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RedeemRewardFlowContract$InputData f74887r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.i f74888s;

    public b(i revPointsOptInInteractor, k revPointsInteractor, q incentiveRewardInteractor, RedeemRewardFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(incentiveRewardInteractor, "incentiveRewardInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = revPointsOptInInteractor;
        this.f74885p = revPointsInteractor;
        this.f74886q = incentiveRewardInteractor;
        this.f74887r = inputData;
        this.f74888s = d.a(this, new zba.a(this, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof zg7.e
            if (r0 == 0) goto L16
            r0 = r5
            zg7.e r0 = (zg7.e) r0
            int r1 = r0.f322088w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f322088w = r1
            goto L1b
        L16:
            zg7.e r0 = new zg7.e
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322088w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L55
            goto L44
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            nyb.k r4 = r4.f74885p     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L55
            efm.b r4 = r4.d()     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L55
            r0.f322088w = r3     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L55
            java.lang.Object r4 = nim.a.a(r4, r0)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L55
            if (r4 != r1) goto L44
            return r1
        L44:
            kotlin.Unit r4 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L55
            goto L52
        L47:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r4, r5)
        L52:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L55:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b.I2(com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26)).k(new c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74888s;
    }
}
