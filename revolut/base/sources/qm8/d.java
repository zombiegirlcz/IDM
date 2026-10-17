package qm8;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om8.f;
import q7b.j;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements c {
    public final JuniorRewardDetailsDialogScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bgc.e f247781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hj8.a f247782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f247783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sm8.a f247784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sm8.b f247785t;
    public final y u;
    public final vii.b v;

    public d(n stateMapper, JuniorRewardDetailsDialogScreenContract$InputData inputData, bgc.e rewardsInteractor, hj8.a juniorProfileInteractor, f juniorRewardsInteractor, sm8.a juniorPartnershipsShareDestinationProvider, sm8.b juniorPartnershipsShareDialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorRewardsInteractor, "juniorRewardsInteractor");
        Intrinsics.checkNotNullParameter(juniorPartnershipsShareDestinationProvider, "juniorPartnershipsShareDestinationProvider");
        Intrinsics.checkNotNullParameter(juniorPartnershipsShareDialogProvider, "juniorPartnershipsShareDialogProvider");
        this.o = inputData;
        this.f247781p = rewardsInteractor;
        this.f247782q = juniorProfileInteractor;
        this.f247783r = juniorRewardsInteractor;
        this.f247784s = juniorPartnershipsShareDestinationProvider;
        this.f247785t = juniorPartnershipsShareDialogProvider;
        this.u = mra.d.b(this, new b(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.v, new j(continuation, this, 17)), null, null, new qc3.c(this, continuation, 24), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
