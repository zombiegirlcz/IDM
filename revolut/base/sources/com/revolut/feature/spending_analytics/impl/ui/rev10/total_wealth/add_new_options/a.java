package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options;

import cli.n;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lrd.c;
import mra.d;
import oki.h;
import tsj.g;
import y91.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements c {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f87936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f87937q;

    public a(b accountsProductFeatureChecker, g customAssetsInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = accountsProductFeatureChecker;
        this.f87936p = customAssetsInteractor;
        this.f87937q = d.b(this, new lrd.b(true, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new lpl.c(this, null, 3), new yi5.b(26));
        l2(new lo.c(this, (Continuation) null, 4), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f87937q;
    }
}
