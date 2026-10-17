package o73;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.impl.kompot.subscriptions_list.SubscriptionsListControllerContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubscriptionsListControllerContract$InputData f222701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f222702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f222703c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l(e eVar, f fVar, SubscriptionsListControllerContract$InputData subscriptionsListControllerContract$InputData) {
        this.f222702b = eVar;
        this.f222701a = subscriptionsListControllerContract$InputData;
        int i = 8;
        this.f222703c = e4m.b.b(new o41.b(eVar, this, 0, i));
        this.d = e4m.b.b(new o41.b(eVar, this, 3, i));
        this.e = e4m.b.b(new o41.b(eVar, this, 2, i));
        this.f = e4m.b.b(new o41.b(eVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f222703c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
