package com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rul.e;
import tsk.t;
import y1f.g;
import yki.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements y1f.b {
    public final TradeRevPointsAgentDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f91127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f91128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f91129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2c.e f91130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f91131t;

    public c(TradeRevPointsAgentDetailsFlowContract$InputData inputData, t accountsInteractor, g topUpDialogMapper, e revPointsSpareChangeInteractor, a2c.e spareChangeNavigationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(topUpDialogMapper, "topUpDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(spareChangeNavigationResolver, "spareChangeNavigationResolver");
        this.o = inputData;
        this.f91127p = accountsInteractor;
        this.f91128q = topUpDialogMapper;
        this.f91129r = revPointsSpareChangeInteractor;
        this.f91130s = spareChangeNavigationResolver;
        this.f91131t = d.a(this, new xwd.a(this, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c r4, com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData.Transfer r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.a
            if (r0 == 0) goto L13
            r0 = r6
            com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.a r0 = (com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.a) r0
            int r1 = r0.f91126x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91126x = r1
            goto L18
        L13:
            com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.a r0 = new com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f91126x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData$Transfer r5 = r0.u
            yhm.o.b(r6)
            goto L54
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            tsk.t r4 = r4.f91127p
            u2f.j r6 = r5.f91116b
            java.lang.String r2 = r5.f91115a
            vkm.d r4 = r4.o(r2, r6)
            y13.a r6 = new y13.a
            r2 = 5
            r6.<init>(r2)
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r6, r3)
            r0.u = r5
            r0.f91126x = r3
            java.lang.Object r6 = vkm.q.z(r4, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            od0.i r6 = (od0.i) r6
            if (r6 == 0) goto L6e
            boolean r4 = r6.d()
            if (r4 != r3) goto L6e
            com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$Step$Transfer r4 = new com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$Step$Transfer
            java.lang.String r0 = r5.f91115a
            java.lang.Object r6 = r6.c()
            com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount r6 = (com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount) r6
            java.lang.Integer r5 = r5.d
            r4.<init>(r0, r6, r5)
            return r4
        L6e:
            com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$Step$AccountRegistration r4 = new com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$Step$AccountRegistration
            java.lang.String r6 = r5.f91115a
            java.lang.Integer r5 = r5.d
            r4.<init>(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c.I2(com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c, com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData$Transfer, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91131t;
    }
}
