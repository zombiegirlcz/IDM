package rtj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.RewardsHubDirectRewardScreenContract$InputData;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardsHubDirectRewardScreenContract$InputData f257275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f257276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f257277c;
    public final e4m.e d;

    public e(g gVar, h hVar, ViewController viewController, RewardsHubDirectRewardScreenContract$InputData rewardsHubDirectRewardScreenContract$InputData) {
        this.f257275a = rewardsHubDirectRewardScreenContract$InputData;
        this.f257276b = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.f257277c = e4m.b.b(new o(gVar, this, 0, i));
        this.d = e4m.b.b(new o(gVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f257277c.get());
    }
}
