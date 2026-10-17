package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlanHubRewardsScreenContract$InputData f12673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12675c;
    public final e4m.e d;

    public t(o oVar, q qVar, CobrandedCardsPlanHubRewardsScreenContract$InputData cobrandedCardsPlanHubRewardsScreenContract$InputData) {
        this.f12674b = oVar;
        this.f12673a = cobrandedCardsPlanHubRewardsScreenContract$InputData;
        int i = 5;
        this.f12675c = e4m.b.b(new m(oVar, this, 1, i));
        this.d = e4m.b.b(new m(oVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
