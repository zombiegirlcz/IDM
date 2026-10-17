package com.revolut.feature.rev_points.impl.ui.wrapped.flow;

import com.revolut.feature.rev_points.impl.ui.wrapped.flow.RevPointsWrappedFlowContract$Step;
import cp5.d;
import h1c.b;
import h1c.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import q06.l;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f83939p;

    public a(RevPointsWrappedFlowContract$InputData inputData, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = deeplinkRouter;
        this.f83939p = d.a(this, new RevPointsWrappedFlowContract$Step.Cards(inputData.f83935a, inputData.f83936b), f0.f322471a, new c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83939p;
    }
}
