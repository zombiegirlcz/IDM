package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerSalesFiltersScreenContract$InputData f282820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282822c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282823g;

    public z0(q qVar, FreelancerSalesFiltersScreenContract$InputData freelancerSalesFiltersScreenContract$InputData) {
        this.f282821b = qVar;
        this.f282820a = freelancerSalesFiltersScreenContract$InputData;
        int i = 3;
        this.f282822c = e4m.b.b(new q0(qVar, this, 3, i));
        this.d = e4m.b.b(new q0(qVar, this, 2, i));
        this.e = e4m.b.b(new q0(qVar, this, 4, i));
        this.f = e4m.b.b(new q0(qVar, this, 1, i));
        this.f282823g = e4m.b.b(new q0(qVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
