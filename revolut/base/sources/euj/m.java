package euj;

import cli.y;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.RewardsHubDirectRewardScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends oki.h implements k {
    public final RewardsHubDirectRewardScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h60.d f129626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final stj.h f129627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f129628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f129629s;

    public m(n stateMapper, RewardsHubDirectRewardScreenContract$InputData inputData, h60.d animationControllerExtension, stj.h rewardsHubInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(animationControllerExtension, "animationControllerExtension");
        Intrinsics.checkNotNullParameter(rewardsHubInteractor, "rewardsHubInteractor");
        this.o = inputData;
        this.f129626p = animationControllerExtension;
        this.f129627q = rewardsHubInteractor;
        this.f129628r = new vii.b();
        this.f129629s = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        RewardsHubDirectRewardScreenContract$InputData rewardsHubDirectRewardScreenContract$InputData = this.o;
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f129628r, new eh9.j(continuation, this, new RewardsHubChallengeDetailsParams(rewardsHubDirectRewardScreenContract$InputData.f101587b, rewardsHubDirectRewardScreenContract$InputData.f101588c), 5)), null, null, new enb.f(this, continuation, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f129629s;
    }
}
