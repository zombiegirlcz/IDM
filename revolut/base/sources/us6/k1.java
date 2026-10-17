package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.orders.OrderInitPageHistoryScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderInitPageHistoryScreenContract$InputData f282600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282602c;

    public k1(q qVar, OrderInitPageHistoryScreenContract$InputData orderInitPageHistoryScreenContract$InputData) {
        this.f282600a = orderInitPageHistoryScreenContract$InputData;
        int i = 8;
        this.f282601b = e4m.b.b(new q0(qVar, this, 1, i));
        this.f282602c = e4m.b.b(new q0(qVar, this, 0, i));
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
