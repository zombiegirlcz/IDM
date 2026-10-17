package kvb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status.RevPointsExclusiveStoreProductStatusScreenContract$InputData;
import java.util.Set;
import kr9.m;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsExclusiveStoreProductStatusScreenContract$InputData f190078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f190079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f190080c;

    public e(b bVar, RevPointsExclusiveStoreProductStatusScreenContract$InputData revPointsExclusiveStoreProductStatusScreenContract$InputData) {
        this.f190078a = revPointsExclusiveStoreProductStatusScreenContract$InputData;
        int i = 11;
        this.f190079b = e4m.b.b(new m(bVar, this, 1, i));
        this.f190080c = e4m.b.b(new m(bVar, this, 0, i));
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
