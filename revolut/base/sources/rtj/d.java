package rtj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreenContract$InputData;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardsHubCollectionScreenContract$InputData f257272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f257273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f257274c;
    public final e4m.e d;
    public final e4m.e e;

    public d(g gVar, h hVar, ViewController viewController, RewardsHubCollectionScreenContract$InputData rewardsHubCollectionScreenContract$InputData) {
        this.f257273b = gVar;
        this.f257272a = rewardsHubCollectionScreenContract$InputData;
        this.f257274c = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.d = e4m.b.b(new o(gVar, this, 0, i));
        this.e = e4m.b.b(new o(gVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
