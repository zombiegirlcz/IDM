package kvb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreenContract$InputData;
import java.util.Set;
import kr9.m;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsExclusiveStoreProductCheckoutScreenContract$InputData f190073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f190074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f190075c;
    public final e4m.e d;

    public c(b bVar, RevPointsExclusiveStoreProductCheckoutScreenContract$InputData revPointsExclusiveStoreProductCheckoutScreenContract$InputData) {
        this.f190074b = bVar;
        this.f190073a = revPointsExclusiveStoreProductCheckoutScreenContract$InputData;
        int i = 10;
        this.f190075c = e4m.b.b(new m(bVar, this, 1, i));
        this.d = e4m.b.b(new m(bVar, this, 0, i));
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
