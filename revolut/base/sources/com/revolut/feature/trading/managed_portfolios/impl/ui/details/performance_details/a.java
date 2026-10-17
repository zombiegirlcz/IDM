package com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details;

import ael.z;
import cli.y;
import cvi.i;
import cvi.j;
import d7f.f;
import d7f.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qmc.d;
import vdl.i0;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements g {
    public final qmc.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f91340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f91341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f91342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PerformanceDetailsScreenContract$InputData f91343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f91344t;
    public final y u;

    public a(qmc.h portfolioInfoProvider, d portfolioBalanceProvider, i0 performanceParametersRepository, z performanceCalculator, PerformanceDetailsScreenContract$InputData inputData, b stateMapper) {
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(portfolioBalanceProvider, "portfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(performanceParametersRepository, "performanceParametersRepository");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = portfolioInfoProvider;
        this.f91340p = portfolioBalanceProvider;
        this.f91341q = performanceParametersRepository;
        this.f91342r = performanceCalculator;
        this.f91343s = inputData;
        this.f91344t = new vii.b();
        this.u = mra.d.b(this, new f(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f91344t, new i(continuation, this, 12)), null, new j(this, continuation, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
