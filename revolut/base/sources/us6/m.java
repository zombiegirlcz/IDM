package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.flow.FreelancerAcquiringPaymentFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements xki.c, yu6.a, p07.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerAcquiringPaymentFlowContract$InputData f282622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f282624c = this;
    public final e4m.e d = e4m.b.b(new ufh.e(this, 10));

    public m(q qVar, FreelancerAcquiringPaymentFlowContract$InputData freelancerAcquiringPaymentFlowContract$InputData) {
        this.f282623b = qVar;
        this.f282622a = freelancerAcquiringPaymentFlowContract$InputData;
    }

    @Override // yu6.a
    public final p1 b() {
        return new p1(this.f282623b, this.f282624c, 0);
    }

    @Override // p07.a
    public final r1 c() {
        return new r1(this.f282623b, this.f282624c, 0);
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
