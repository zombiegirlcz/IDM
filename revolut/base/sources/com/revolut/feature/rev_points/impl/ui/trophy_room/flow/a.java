package com.revolut.feature.rev_points.impl.ui.trophy_room.flow;

import ajk.f;
import com.revolut.feature.rev_points.impl.ui.trophy_room.flow.RevPointsTrophyRoomFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import q06.l;
import y0c.b;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f83917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f83918q;

    public a(f pricingPlanNavigationCommandsProvider, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = pricingPlanNavigationCommandsProvider;
        this.f83917p = deeplinkRouter;
        xwd.a aVar = new xwd.a(this, 10);
        this.f83918q = d.a(this, RevPointsTrophyRoomFlowContract$Step.Home.f83914a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83918q;
    }
}
