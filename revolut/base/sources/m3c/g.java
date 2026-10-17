package m3c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements xki.c, k4c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderHistoryFlowContract$InputData f202337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f202338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f202339c = this;
    public final e4m.e d = e4m.b.b(new ljl.n(this, 25));

    public g(j jVar, OrderHistoryFlowContract$InputData orderHistoryFlowContract$InputData) {
        this.f202338b = jVar;
        this.f202337a = orderHistoryFlowContract$InputData;
    }

    @Override // k4c.a
    public final k b() {
        return new k(this.f202338b, this.f202339c, 0);
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
