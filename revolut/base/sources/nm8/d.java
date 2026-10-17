package nm8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import nk7.k;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorRewardsListScreenContract$InputData f217205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f217206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f217207c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public d(e eVar, ViewController viewController, JuniorRewardsListScreenContract$InputData juniorRewardsListScreenContract$InputData) {
        this.f217207c = eVar;
        this.f217205a = juniorRewardsListScreenContract$InputData;
        this.f217206b = viewController;
        int i = 9;
        this.d = e4m.b.b(new k(eVar, this, 1, i));
        this.e = e4m.b.b(new k(eVar, this, 2, i));
        this.f = e4m.b.b(new k(eVar, this, 0, i));
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
