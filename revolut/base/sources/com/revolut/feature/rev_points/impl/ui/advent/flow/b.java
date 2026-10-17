package com.revolut.feature.rev_points.impl.ui.advent.flow;

import com.revolut.feature.rev_points.impl.ui.advent.flow.RevPointsAdventRewardsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import umd.n;
import vkm.q;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements uyb.b {
    public final RevPointsAdventRewardsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f83770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f83771q;

    public b(RevPointsAdventRewardsFlowContract$InputData inputData, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = inputData;
        this.f83770p = productArticleInteractor;
        n nVar = new n(this, 20);
        this.f83771q = d.a(this, RevPointsAdventRewardsFlowContract$Step.WrappedArticle.f83769a, f0.f322471a, nVar);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.g(((kka.h) this.f83770p).d), null, null, new a(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83771q;
    }
}
