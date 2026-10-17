package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreOrdersSeeAllContract$InputData f180534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f180535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f180536c;

    public n(j jVar, StoreOrdersSeeAllContract$InputData storeOrdersSeeAllContract$InputData) {
        this.f180534a = storeOrdersSeeAllContract$InputData;
        int i = 10;
        this.f180535b = e4m.b.b(new jqa.h(jVar, this, 1, i));
        this.f180536c = e4m.b.b(new jqa.h(jVar, this, 0, i));
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
