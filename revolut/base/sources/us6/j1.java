package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderInitPageDetailsScreenContract$InputData f282589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282591c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j1(q qVar, ViewController viewController, OrderInitPageDetailsScreenContract$InputData orderInitPageDetailsScreenContract$InputData) {
        this.f282590b = qVar;
        this.f282589a = orderInitPageDetailsScreenContract$InputData;
        this.f282591c = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.d = e4m.b.b(new q0(qVar, this, 1, i));
        this.e = e4m.b.b(new q0(qVar, this, 2, i));
        this.f = e4m.b.b(new q0(qVar, this, 0, i));
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
