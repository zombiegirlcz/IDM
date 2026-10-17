package com.revolut.feature.shared_separate_favourites.combined_watchlist.flow;

import com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.CombinedWatchlistHomeFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wde.f;
import wfd.b;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final CombinedWatchlistHomeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f86801p;

    public a(CombinedWatchlistHomeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f86801p = d.a(this, new CombinedWatchlistHomeFlowContract$Step.Home(inputData.f86797a.f86890b), f0.f322471a, new f(this, 3));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f86801p;
    }
}
