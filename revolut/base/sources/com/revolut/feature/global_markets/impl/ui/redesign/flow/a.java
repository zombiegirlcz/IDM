package com.revolut.feature.global_markets.impl.ui.redesign.flow;

import cli.y;
import com.revolut.feature.global_markets.domain.Market;
import com.revolut.feature.global_markets.impl.ui.redesign.flow.GlobalMarketsRedesignFlowContract$PagerItem;
import kotlin.jvm.internal.Intrinsics;
import m56.g;
import m87.c;
import md6.s;
import mra.d;
import oki.h;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements m87.b {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ali.b f74597p;

    public a(b stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        GlobalMarketsRedesignFlowContract$PagerItem.MarketItem marketItem = new GlobalMarketsRedesignFlowContract$PagerItem.MarketItem(Market.US);
        GlobalMarketsRedesignFlowContract$PagerItem.MarketItem marketItem2 = new GlobalMarketsRedesignFlowContract$PagerItem.MarketItem(Market.Europe);
        GlobalMarketsRedesignFlowContract$PagerItem.MarketItem marketItem3 = new GlobalMarketsRedesignFlowContract$PagerItem.MarketItem(Market.APAC);
        GlobalMarketsRedesignFlowContract$PagerItem.GlobalItem globalItem = GlobalMarketsRedesignFlowContract$PagerItem.GlobalItem.f74595a;
        this.o = d.b(this, new c(v.k(globalItem, marketItem, marketItem2, marketItem3), globalItem.getF94249a()), stateMapper, null, false, 12);
        this.f74597p = s.b(this, new g(13));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f74597p;
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.o;
    }
}
