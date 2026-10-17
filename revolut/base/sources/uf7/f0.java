package uf7;

import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.IncentiveRewardDetailsControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 extends oki.h implements m {

    @NotNull
    public static final z Companion = new z();
    public final r10.q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dsh.h f279600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f279601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf7.a f279602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q06.l f279603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bil.a f279604t;
    public final j60.a u;
    public final IncentiveRewardDetailsControllerContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f279605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f279606x;

    public f0(cli.n stateMapper, r10.q incentiveRewardInteractor, dsh.h blockItemsProvider, g0 detailsDialogConfigurationFactory, sf7.a genericConfigurationFactory, q06.l deeplinkRouter, bil.a actionsHandler, j60.a bottomDialogController, IncentiveRewardDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(incentiveRewardInteractor, "incentiveRewardInteractor");
        Intrinsics.checkNotNullParameter(blockItemsProvider, "blockItemsProvider");
        Intrinsics.checkNotNullParameter(detailsDialogConfigurationFactory, "detailsDialogConfigurationFactory");
        Intrinsics.checkNotNullParameter(genericConfigurationFactory, "genericConfigurationFactory");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
        Intrinsics.checkNotNullParameter(bottomDialogController, "bottomDialogController");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = incentiveRewardInteractor;
        this.f279600p = blockItemsProvider;
        this.f279601q = detailsDialogConfigurationFactory;
        this.f279602r = genericConfigurationFactory;
        this.f279603s = deeplinkRouter;
        this.f279604t = actionsHandler;
        this.u = bottomDialogController;
        this.v = inputData;
        this.f279605w = mra.d.b(this, new k(0), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f279606x = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f279606x, new uec.d(continuation, this, 1)), null, null, new uf0.d(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f279605w;
    }
}
