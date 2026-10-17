package com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown;

import cli.g;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import yl6.b;
import z0f.a0;
import z2g.e;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements e {
    public final hyf.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f93110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93111q;

    public a(n stateMapper, TravelExperiencesPriceBreakdownScreenContract$InputData inputData, hyf.a experiencesFeatureInteractor, h1g.h stateHolder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(experiencesFeatureInteractor, "experiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        this.o = experiencesFeatureInteractor;
        this.f93110p = d.b(this, new z2g.d(stateHolder.a(), inputData.f93106a, inputData.f93107b, inputData.f93108c, false), stateMapper, null, false, 12);
        this.f93111q = hx7.e.a(this, new a0(12));
    }

    @Override // yji.l
    public final void I1() {
        l2(new b(this, null, 28), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93111q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f93110p;
    }
}
