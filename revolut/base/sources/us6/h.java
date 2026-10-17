package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.FreelancerAcquiringOrderFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements xki.c, yu6.a, p07.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerAcquiringOrderFlowContract$InputData f282558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f282560c = this;
    public final e4m.e d = e4m.b.b(new ufh.e(this, 8));

    public h(q qVar, FreelancerAcquiringOrderFlowContract$InputData freelancerAcquiringOrderFlowContract$InputData) {
        this.f282559b = qVar;
        this.f282558a = freelancerAcquiringOrderFlowContract$InputData;
    }

    @Override // yu6.a
    public final p1 b() {
        return new p1(this.f282559b, this.f282560c, 1);
    }

    @Override // p07.a
    public final r1 c() {
        return new r1(this.f282559b, this.f282560c, 2);
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
