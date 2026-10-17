package com.revolut.feature.travel.miles.impl.ui.flow.main;

import cli.g;
import cli.y;
import com.revolut.feature.travel.miles.api.TravelMilesApi$Toggles;
import com.revolut.feature.travel.miles.impl.ui.flow.main.TravelMilesMainFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import j82.q;
import jch.p;
import jgg.b;
import jgg.c;
import jgg.i;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import nyb.k;
import oki.h;
import rd0.e;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements c {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f94224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f94225q;

    public a(i stateMapper, k revPointsInteractor, vfg.h milesFeatureInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(milesFeatureInteractor, "milesFeatureInteractor");
        this.o = revPointsInteractor;
        FlowStep flowStep = ((d) milesFeatureInteractor.f288621a).c(TravelMilesApi$Toggles.LoyaltyAirMilesTransfers.f94080c) ? TravelMilesMainFlowContract$Step.HomeScreen.f94221a : TravelMilesMainFlowContract$Step.MainScreen.f94222a;
        this.f94224p = mra.d.b(this, new b(0), stateMapper, null, false, 12);
        this.f94225q = cp5.d.a(this, flowStep, f0.f322471a, new p(this, 14));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, e.b(this.o.c(false)), null, null, new q(this, null, 23), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f94224p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94225q;
    }
}
