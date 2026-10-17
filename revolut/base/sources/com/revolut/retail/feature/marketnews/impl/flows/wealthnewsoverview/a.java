package com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview;

import com.revolut.kompot.navigable.flow.scroller.ScrollerFlowStep;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlowContract$Step;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewTab;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreenContract$InputData;
import efm.r;
import eki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qr0.i;
import s0k.d;
import s0k.e;
import s0k.f;
import te0.w;
import vkm.j2;
import vkm.q;
import yji.l;
import yoj.c;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends g implements d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WealthNewsOverviewFlowContract$InputData f101853n;
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f101854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f101855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fki.b f101856r;

    public a(WealthNewsOverviewFlowContract$InputData inputData, i wealthNewsAssetTypesProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthNewsAssetTypesProvider, "wealthNewsAssetTypesProvider");
        this.f101853n = inputData;
        this.o = wealthNewsAssetTypesProvider;
        j2 j2VarC = q.c(new e(f0.f322471a, false, null));
        this.f101854p = j2VarC;
        this.f101855q = j2VarC;
        WealthNewsOverviewFlowContract$Step.TopStories topStories = new WealthNewsOverviewFlowContract$Step.TopStories(0);
        tzj.a aVar = inputData.f101847a;
        WealthNewsOverviewFlowContract$Step[] elements = {aVar != tzj.a.TOP_STORIES ? null : topStories, aVar != tzj.a.CRYPTO ? null : new WealthNewsOverviewFlowContract$Step.Crypto(0), aVar != tzj.a.COMMODITIES ? null : new WealthNewsOverviewFlowContract$Step.Commodities(0)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ScrollerFlowStep scrollerFlowStep = (ScrollerFlowStep) d0.d0(listL);
        String d = scrollerFlowStep != null ? scrollerFlowStep.getD() : null;
        if (d == null) {
            throw new IllegalArgumentException("Non empty list should be provided for steps");
        }
        this.f101856r = new fki.b(listL, d);
    }

    public static WealthNewsOverviewTab s2(tzj.a aVar) {
        int i = f.f258968a[aVar.ordinal()];
        if (i == 1) {
            return WealthNewsOverviewTab.TopStories.d;
        }
        if (i == 2) {
            return WealthNewsOverviewTab.Crypto.d;
        }
        if (i == 3) {
            return WealthNewsOverviewTab.Commodities.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        cpj.b bVar = (cpj.b) ((xoj.a) this.o.f248595b);
        r map = w.m(bVar.l(c.WEALTH_TRADING), bVar.l(c.CRYPTO), bVar.l(c.COMMODITIES)).map(new sx4.c(new szb.g(17), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.a1(this, rd0.e.b(map), null, null, new s0k.g(this, null), 3);
    }

    @Override // eki.g
    public final fki.b q2() {
        return this.f101856r;
    }

    @Override // eki.n
    public final com.revolut.kompot.navigable.a x(ScrollerFlowStep scrollerFlowStep) {
        WealthNewsOverviewFlowContract$Step step = (WealthNewsOverviewFlowContract$Step) scrollerFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        return new WealthAssetTypeNewsScreen(new WealthAssetTypeNewsScreenContract$InputData(step.f101848b, step.f101849c));
    }
}
