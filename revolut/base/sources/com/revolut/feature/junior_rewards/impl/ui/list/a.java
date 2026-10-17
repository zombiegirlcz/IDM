package com.revolut.feature.junior_rewards.impl.ui.list;

import bgc.e;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import om8.c;
import om8.f;
import sm8.b;
import tm8.g;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements g {
    public final JuniorRewardsListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f77237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hj8.a f77238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f77239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sm8.a f77240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f77241t;
    public final c u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f77242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f77243x;

    public a(n stateMapper, JuniorRewardsListScreenContract$InputData inputData, e rewardsInteractor, hj8.a juniorProfileInteractor, f juniorRewardsInteractor, sm8.a juniorPartnershipsShareDestinationProvider, b juniorPartnershipsShareDialogProvider, c juniorPartnershipsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorRewardsInteractor, "juniorRewardsInteractor");
        Intrinsics.checkNotNullParameter(juniorPartnershipsShareDestinationProvider, "juniorPartnershipsShareDestinationProvider");
        Intrinsics.checkNotNullParameter(juniorPartnershipsShareDialogProvider, "juniorPartnershipsShareDialogProvider");
        Intrinsics.checkNotNullParameter(juniorPartnershipsAvailabilityInteractor, "juniorPartnershipsAvailabilityInteractor");
        this.o = inputData;
        this.f77237p = rewardsInteractor;
        this.f77238q = juniorProfileInteractor;
        this.f77239r = juniorRewardsInteractor;
        this.f77240s = juniorPartnershipsShareDestinationProvider;
        this.f77241t = juniorPartnershipsShareDialogProvider;
        this.u = juniorPartnershipsAvailabilityInteractor;
        this.v = hx7.e.a(this, new ta8.a(this, 21));
        this.f77242w = d.b(this, new tm8.f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f77243x = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f77243x, new tik.b(continuation, this, 2)), null, null, new t9h.b(this, continuation, 26), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f77242w;
    }
}
