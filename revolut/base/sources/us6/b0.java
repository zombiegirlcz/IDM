package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements xki.c, d17.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerNewSaleFlowContract$InputData f282455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f282457c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f282459h;

    public b0(q qVar, FreelancerNewSaleFlowContract$InputData freelancerNewSaleFlowContract$InputData) {
        this.f282456b = qVar;
        this.f282455a = freelancerNewSaleFlowContract$InputData;
        int i = 28;
        this.d = e4m.b.b(new ufg.k0(qVar, this, 1, i));
        this.e = e4m.b.b(new ufg.k0(qVar, this, 0, i));
        this.f = e4m.b.b(new ufg.k0(qVar, this, 2, i));
        this.f282458g = e4m.b.b(new ufg.k0(qVar, this, 4, i));
        this.f282459h = e4m.b.b(new ufg.k0(qVar, this, 3, i));
    }

    @Override // d17.a
    public final v1 b() {
        return new v1(this.f282456b, this.f282457c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
