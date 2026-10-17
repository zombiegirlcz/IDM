package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements qji.a, soe.a, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxResidenciesListFlowContract$InputData f162875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f162876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f162877c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f162878g;

    public n(o oVar, TaxResidenciesListFlowContract$InputData taxResidenciesListFlowContract$InputData) {
        this.f162876b = oVar;
        this.f162875a = taxResidenciesListFlowContract$InputData;
        int i = 19;
        this.d = e4m.b.b(new i9e.l(oVar, this, 1, i));
        this.e = e4m.b.b(new i9e.l(oVar, this, 2, i));
        this.f = e4m.b.b(new i9e.l(oVar, this, 0, i));
        this.f162878g = e4m.b.b(new i9e.l(oVar, this, 3, i));
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f162876b, this.f162877c, 2);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // soe.a
    public final w j() {
        return new w(this.f162876b, this.f162877c, 0);
    }
}
