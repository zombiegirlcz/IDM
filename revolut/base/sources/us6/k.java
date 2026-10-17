package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerAcquiringPaymentDetailsScreenContract$InputData f282595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282597c;
    public final e4m.e d;
    public final e4m.e e;

    public k(q qVar, m mVar, ViewController viewController, FreelancerAcquiringPaymentDetailsScreenContract$InputData freelancerAcquiringPaymentDetailsScreenContract$InputData) {
        this.f282596b = qVar;
        this.f282595a = freelancerAcquiringPaymentDetailsScreenContract$InputData;
        this.f282597c = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.d = e4m.b.b(new ufg.k0(qVar, this, 1, i));
        this.e = e4m.b.b(new ufg.k0(qVar, this, 0, i));
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
