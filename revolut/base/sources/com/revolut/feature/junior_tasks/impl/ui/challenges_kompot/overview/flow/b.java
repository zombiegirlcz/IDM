package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow;

import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements zp8.a {
    public final ChallengesOverviewContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hp8.b f77396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bq8.a f77397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zp8.h f77398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fkg.a f77399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f77400t;

    public b(ChallengesOverviewContract$InputData inputData, hp8.b juniorTasksInteractor, bq8.a payForTasksExtension, zp8.h juniorTasksWithCoparentsProvider, fkg.a juniorTasksRewardsQuoteInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorTasksInteractor, "juniorTasksInteractor");
        Intrinsics.checkNotNullParameter(payForTasksExtension, "payForTasksExtension");
        Intrinsics.checkNotNullParameter(juniorTasksWithCoparentsProvider, "juniorTasksWithCoparentsProvider");
        Intrinsics.checkNotNullParameter(juniorTasksRewardsQuoteInteractor, "juniorTasksRewardsQuoteInteractor");
        this.o = inputData;
        this.f77396p = juniorTasksInteractor;
        this.f77397q = payForTasksExtension;
        this.f77398r = juniorTasksWithCoparentsProvider;
        this.f77399s = juniorTasksRewardsQuoteInteractor;
        zo2.h hVar = new zo2.h(this, 3);
        this.f77400t = d.a(this, ChallengesOverviewContract$Step.List.f77388a, f0.f322471a, hVar);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f77397q.b3(), null, null, new z3f.b(this, null, 22), 3);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (this.f77397q.d3(throwable)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77400t;
    }
}
