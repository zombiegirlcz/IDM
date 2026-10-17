package com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details;

import com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public TradeRevPointsAgentDetailsFlowContract$InputData.Transfer u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f91125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f91126x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f91125w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f91126x |= Integer.MIN_VALUE;
        return c.I2(this.f91125w, null, this);
    }
}
