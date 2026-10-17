package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements btd.b {
    public final btd.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f88040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f88041q;

    public b(btd.a inputData, x deeplinkHandler, c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f88040p = deeplinkHandler;
        this.f88041q = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f88041q;
    }
}
