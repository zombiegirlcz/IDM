package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerAcquiringOrderDetailsScreenContract$InputData f282532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282534c;
    public final e4m.e d;

    public f(q qVar, h hVar, ViewController viewController, FreelancerAcquiringOrderDetailsScreenContract$InputData freelancerAcquiringOrderDetailsScreenContract$InputData) {
        this.f282532a = freelancerAcquiringOrderDetailsScreenContract$InputData;
        this.f282533b = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.f282534c = e4m.b.b(new ufg.k0(qVar, this, 1, i));
        this.d = e4m.b.b(new ufg.k0(qVar, this, 0, i));
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
